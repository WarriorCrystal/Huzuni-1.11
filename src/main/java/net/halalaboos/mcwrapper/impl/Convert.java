package net.halalaboos.mcwrapper.impl;

import net.halalaboos.mcwrapper.api.entity.living.player.Hand;
import net.halalaboos.mcwrapper.api.item.ItemStack;
import net.halalaboos.mcwrapper.api.util.enums.ActionResult;
import net.halalaboos.mcwrapper.api.util.enums.DigAction;
import net.halalaboos.mcwrapper.api.util.enums.Face;
import net.halalaboos.mcwrapper.api.util.math.AABB;
import net.halalaboos.mcwrapper.api.util.math.Result;
import net.halalaboos.mcwrapper.api.util.math.Vector3d;
import net.halalaboos.mcwrapper.api.util.math.Vector3i;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.inventory.ClickType;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

/**
 * Utility for quickly converting MCWrapper data classes to the Minecraft ones, or vice-versa.
 * <p>This is only used for the Mixins.</p>
 */
public class Convert {

	/**
	 * Converts the Minecraft Bounding Box class to the MCWrapper one ({@link AABB}).
	 */
	public static AABB from(AxisAlignedBB bb) {
		return new AABB(bb.minX, bb.minY, bb.minZ, bb.maxX, bb.maxY, bb.maxZ);
	}

	public static AxisAlignedBB to(AABB bb) {
		return new AxisAlignedBB(bb.min.getX(), bb.min.getY(), bb.min.getZ(), bb.max.getX(), bb.max.getY(), bb.max.getZ());
	}

	public static Vector3i from(BlockPos pos) {
		return new Vector3i(pos.getX(), pos.getY(), pos.getZ());
	}

	public static BlockPos to(Vector3i pos) {
		return new BlockPos(pos.getX(), pos.getY(), pos.getZ());
	}

	public static PotionEffect to(net.halalaboos.mcwrapper.api.potion.PotionEffect effect) {
		return (PotionEffect)(Object)effect;
	}

	public static Potion to(net.halalaboos.mcwrapper.api.potion.Potion potion) {
		return Potion.getPotionById(potion.id());
	}

	public static EnumHand to(Hand hand) {
		return EnumHand.values()[hand.ordinal()];
	}

	public static CPacketPlayerDigging.Action to(DigAction action) {
		return CPacketPlayerDigging.Action.values()[action.ordinal()];
	}

	public static DigAction from(CPacketPlayerDigging.Action action) {
		return DigAction.values()[action.ordinal()];
	}

	public static Face from(EnumFacing facing) {
		return Face.values()[facing.ordinal()];
	}

	public static EnumFacing to(Face face) {
		return EnumFacing.values()[face.ordinal()];
	}

	public static Vec3d to(Vector3d vec) {
		return new Vec3d(vec.getX(), vec.getY(), vec.getZ());
	}

	public static Result from(RayTraceResult result) {
		return Result.values()[result.typeOfHit.ordinal()];
	}

	public static ActionResult from(EnumActionResult result) {
		return ActionResult.values()[result.ordinal()];
	}

	public static ClickType to(net.halalaboos.mcwrapper.api.util.enums.ClickType type) {
		return ClickType.values()[type.ordinal()];
	}

	public static Hand from(EnumHand hand) {
		return Hand.values()[hand.ordinal()];
	}

	public static ItemStack from(net.minecraft.item.ItemStack stack) {
		return (ItemStack)(Object)stack;
	}

	//Only used for some Mixins, don't use this for anything outside of the impl package!!
	public static EntityPlayerSP player() {
		return mc().player;
	}

	//Only used for some Mixins, don't use this for anything outside of the impl package!!
	public static WorldClient world() {
		return mc().world;
	}

	public static RayTraceResult mouseOver() {
		return mc().objectMouseOver;
	}

	private static Minecraft mc() {
		return Minecraft.getMinecraft();
	}

	public static net.minecraft.item.ItemStack to(ItemStack stack) {
		return (net.minecraft.item.ItemStack)(Object)stack;
	}

}
