package net.halalaboos.huzuni.mod.combat;

import net.halalaboos.huzuni.api.mod.BasicMod;
import net.halalaboos.huzuni.api.mod.Category;
import net.halalaboos.huzuni.api.node.impl.Toggleable;
import net.halalaboos.huzuni.api.node.impl.Value;
import net.halalaboos.huzuni.api.task.LookTask;
import net.halalaboos.huzuni.api.util.MinecraftUtils;
import net.halalaboos.mcwrapper.api.entity.living.Living;
import net.halalaboos.mcwrapper.api.entity.living.player.Hand;
import net.halalaboos.mcwrapper.api.event.player.PreMotionUpdateEvent;
import net.halalaboos.mcwrapper.api.item.Item;
import net.halalaboos.mcwrapper.api.item.types.*;
import net.halalaboos.mcwrapper.api.item.types.Throwable;

import static net.halalaboos.mcwrapper.api.MCWrapper.getPlayer;

/**
 * Stl's bow aimbot.
 * */
public class Bowaimbot extends BasicMod {
		
	private final LookTask lookTask = new LookTask(this);
	
	private Living target = null;
	
	public final Toggleable silent  = new Toggleable("Silent", "Makes the aimbot invisible client-side"),
			players = new Toggleable("Players", "Attack players"), 
			mobs = new Toggleable("Mobs", "Attack mobs"), 
			animals = new Toggleable("Animals", "Attack animals"),
			invisible = new Toggleable("Invisible", "Attack invisible entities"),
			checkAge = new Toggleable("Check age", "Check the age of the entity before attacking");
	
	public final Value reach = new Value("Reach", " blocks", 0F, 128F, 256F, 2F, "Aimbot reach distance");
	
	public Bowaimbot() {
		super("Bow aimbot", "Aims to hit each entity with the bow");
		setAuthor("Stl_Missouri");
		this.setCategory(Category.COMBAT);
		players.setEnabled(true);
		invisible.setEnabled(true);
		silent.setEnabled(true);
		addChildren(reach, silent, players, mobs, animals, invisible, checkAge);
		huzuni.lookManager.registerTaskHolder(this);

		subscribe(PreMotionUpdateEvent.class, event -> {
			if (!isUsingBow()) {
				huzuni.lookManager.withdrawTask(lookTask);
				return;
			}
			target = MinecraftUtils.getClosestEntity(reach.getValue(), 2.5F, invisible.isEnabled(),
					mobs.isEnabled(), animals.isEnabled(), players.isEnabled(), checkAge.isEnabled());
			if (target == null)
				return;

			int use = getPlayer().getHeldItem(Hand.MAIN).get().getMaxUseTicks() - getPlayer().getItemUseTicks();
			float progress = use / 20.0F;
			progress = (progress * progress + progress * 2.0F) / 3.0F;
			if (progress >= 1.0F)
				progress = 1.0F;
			double v = progress * 3.0F;
			// Static MC gravity
			double g = 0.05F;
			setAngles(v, g);
		});
	}

	@Override
	protected void onDisable() {
		huzuni.lookManager.withdrawTask(lookTask);
	}
	
	/**
     * @return True if the player is using a bow.
     * */
	private boolean isUsingBow() {
		if (getPlayer().getHeldItem(Hand.MAIN).isPresent()) {
			if (getPlayer().isUsingItem()) {
				Item item = getPlayer().getHeldItem(Hand.MAIN).get().getItemType();
				if (!(item instanceof Throwable))
					return false;
				if (item instanceof Bow) {
					return true;
				}
			}
        }
		return false;
	}
	
	private void setAngles(double v, double g) {
        double pitch = -Math.toDegrees(getLaunchAngle(this.target, v, g));
        if(Double.isNaN(pitch))
            return;
        double difX = this.target.getX() - getPlayer().getX(), difZ = this.target.getZ() - getPlayer().getZ();
        float yaw = (float) (Math.atan2(difZ, difX) * 180 / Math.PI) - 90;
        lookTask.setRotations(yaw, (float) pitch);
        lookTask.setReset(silent.isEnabled());
        huzuni.lookManager.requestTask(this, lookTask);
	}

    /**
     * Gets launch angle required to hit a target with the specified velocity and gravity
     *
     * @param targetEntity Target entity
     * @param v            Projectile velocity
     * @param g            World gravity
     * @return
     */
    private float getLaunchAngle(Living targetEntity, double v, double g) {
        double yDif = ((targetEntity.getY() + (targetEntity.getEyeHeight() / 2)) - (getPlayer().getY() + getPlayer().getEyeHeight()));
        double xDif = (targetEntity.getX() - getPlayer().getX());
        double zDif = (targetEntity.getZ() - getPlayer().getZ());

        /**
         * Pythagorean theorem to merge x/z
         *           /|
         *          / |
         * xCoord  /  | zDif
         *        /   |
         *       /    |
         *      /_____|
         * (player) xDif
         */
        double xCoord = Math.sqrt((xDif * xDif) + (zDif * zDif));

        return theta(v, g, xCoord, yDif);
    }

    /**
     * Calculates launch angle to hit a specified point based on supplied parameters
     *
     * @param v Projectile velocity
     * @param g World gravity
     * @param x x-coordinate
     * @param y y-coordinate
     * @return angle of launch required to hit point x,y
     * <p/>
     * Whoa there! You just supplied us with a method to hit a 2D point, but Minecraft is a 3D game!
     * <p/>
     * Yeah. Unfortunately this is 100x easier to do than write a method to find the 3D point,
     * so we can just merge the x/z axis of Minecraft into one (using the pythagorean theorem).
     * Have a look at getLaunchAngle to see how that's done
     */
    private float theta(double v, double g, double x, double y) {
        double yv = 2 * y * (v * v);
        double gx = g * (x * x);
        double g2 = g * (gx + yv);
        double insqrt = (v * v * v * v) - g2;
        double sqrt = Math.sqrt(insqrt);

        double numerator = (v * v) + sqrt;
        double numerator2 = (v * v) - sqrt;

        double atan1 = Math.atan2(numerator, g * x);
        double atan2 = Math.atan2(numerator2, g * x);

        /**
         * Ever heard of a quadratic equation? We're gonna have to have two different results
         * here, duh! It's probably best to launch at the smaller angle because that will
         * decrease the total flight time, thus leaving less room for error. If you're just
         * trying to impress your friends you could probably fire it at the maximum angle, but
         * for the sake of simplicity, we'll use the smaller one here.
         */
        return (float) Math.min(atan1, atan2);
    }
    
}
