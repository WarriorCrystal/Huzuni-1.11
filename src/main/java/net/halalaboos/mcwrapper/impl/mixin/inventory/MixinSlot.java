package net.halalaboos.mcwrapper.impl.mixin.inventory;

import net.halalaboos.mcwrapper.api.inventory.Slot;
import net.halalaboos.mcwrapper.api.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(net.minecraft.inventory.Slot.class)
public abstract class MixinSlot implements Slot {
	
	@Shadow @Final private int slotIndex;
	@Shadow public abstract net.minecraft.item.ItemStack getStack();
	@Shadow public abstract boolean getHasStack();

	@Override
	public int getIndex() {
		return slotIndex;
	}

	@Override
	public ItemStack getItem() {
		return ((ItemStack) (Object) getStack());
	}

	@Override
	public boolean hasItem() {
		return getHasStack();
	}
}
