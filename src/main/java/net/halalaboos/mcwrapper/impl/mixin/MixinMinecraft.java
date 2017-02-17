package net.halalaboos.mcwrapper.impl.mixin;

import net.halalaboos.mcwrapper.api.MCWrapper;
import net.halalaboos.mcwrapper.api.MinecraftClient;
import net.halalaboos.mcwrapper.api.world.World;
import net.halalaboos.mcwrapper.impl.OnePointElevenAdapter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.util.Timer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(net.minecraft.client.Minecraft.class)
public abstract class MixinMinecraft implements MinecraftClient {

	@Shadow public abstract Minecraft getMinecraft();
	@Shadow private int rightClickDelayTimer;
	@Shadow public abstract float getRenderPartialTicks();
	@Shadow @Final private Timer timer;

	@Inject(method = "run()V", at = @At(value = "INVOKE",
			target = "Lnet/minecraft/client/Minecraft;init()V",
			shift = At.Shift.AFTER))
	public void initWrapper(CallbackInfo ci) {
		MCWrapper.setAdapter(new OnePointElevenAdapter(getMinecraft()));
	}

	@Inject(method = "loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V",
			at = @At(value = "INVOKE",
					target = "Lnet/minecraft/client/multiplayer/WorldClient;spawnEntity(Lnet/minecraft/entity/Entity;)Z",
					shift = At.Shift.AFTER))
	public void setWorld(WorldClient world, String loadingMessage, CallbackInfo ci) {
		MCWrapper.setWorld(((World) world));
	}

	@Override
	public int getRightClickDelayTimer() {
		return rightClickDelayTimer;
	}

	@Override
	public void setRightClickDelayTimer(int rightClickDelayTimer) {
		this.rightClickDelayTimer = rightClickDelayTimer;
	}

	@Override
	public float getDelta() {
		return getRenderPartialTicks();
	}

	@Override
	public float getTimerSpeed() {
		return timer.timerSpeed;
	}

	@Override
	public void setTimerSpeed(float timerSpeed) {
		timer.timerSpeed = timerSpeed;
	}
}
