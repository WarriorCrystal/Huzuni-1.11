package net.halalaboos.mcwrapper.api.item;

public interface ItemStack {

	/**
	 * @return The amount of items in the stack.
	 */
	int getSize();

	int getMaxSize();

	/**
	 * @return The item that the stack consists of.
	 */
	Item getItemType();

	/**
	 * @return The name of the ItemStack.
	 */
	String getName();

	int getMaxUseTicks();

	boolean empty();

	//TEMP
	void renderInGui(int x, int y);

	//TEMP
	void render3D(int x, int y);
}
