package net.halalaboos.mcwrapper.api.item;

import net.halalaboos.mcwrapper.api.MCWrapper;
import net.halalaboos.mcwrapper.api.item.types.Bow;
import net.halalaboos.mcwrapper.api.item.types.Potion;

/**
 * Used to reference any of the (vanilla) Item types.
 * <p>The reason this is not an Enum is because this method of listing the Items allows developers
 * to quickly do things such as:</p>
 * <code>if (item == ItemTypes.AIR)</code>
 * <p>While with an Enum-based approach it would look more like:</p>
 * <code>if (item == ItemTypes.AIR.getItem())</code>
 * <p>This class isn't as clean as an Enum would be, but uses of this class are much cleaner as a result
 * of taking this approach.</p>
 */
public class ItemTypes {

	public static final Item AIR;
	public static final Item IRON_SHOVEL;
	public static final Item IRON_PICKAXE;
	public static final Item IRON_AXE;
	public static final Item FLINT_AND_STEEL;
	public static final Item APPLE;
	public static final Bow BOW;
	public static final Item ARROW;
	public static final Item SPECTRAL_ARROW;
	public static final Item TIPPED_ARROW;
	public static final Item COAL;
	public static final Item DIAMOND;
	public static final Item IRON_INGOT;
	public static final Item GOLD_INGOT;
	public static final Item IRON_SWORD;
	public static final Item WOODEN_SWORD;
	public static final Item WOODEN_SHOVEL;
	public static final Item WOODEN_PICKAXE;
	public static final Item WOODEN_AXE;
	public static final Item STONE_SWORD;
	public static final Item STONE_SHOVEL;
	public static final Item STONE_PICKAXE;
	public static final Item STONE_AXE;
	public static final Item DIAMOND_SWORD;
	public static final Item DIAMOND_SHOVEL;
	public static final Item DIAMOND_PICKAXE;
	public static final Item DIAMOND_AXE;
	public static final Item STICK;
	public static final Item BOWL;
	public static final Item MUSHROOM_STEW;
	public static final Item GOLDEN_SWORD;
	public static final Item GOLDEN_SHOVEL;
	public static final Item GOLDEN_PICKAXE;
	public static final Item GOLDEN_AXE;
	public static final Item STRING;
	public static final Item FEATHER;
	public static final Item GUNPOWDER;
	public static final Item WOODEN_HOE;
	public static final Item STONE_HOE;
	public static final Item IRON_HOE;
	public static final Item DIAMOND_HOE;
	public static final Item GOLDEN_HOE;
	public static final Item WHEAT_SEEDS;
	public static final Item WHEAT;
	public static final Item BREAD;
	public static final Item LEATHER_HELMET;
	public static final Item LEATHER_CHESTPLATE;
	public static final Item LEATHER_LEGGINGS;
	public static final Item LEATHER_BOOTS;
	public static final Item CHAINMAIL_HELMET;
	public static final Item CHAINMAIL_CHESTPLATE;
	public static final Item CHAINMAIL_LEGGINGS;
	public static final Item CHAINMAIL_BOOTS;
	public static final Item IRON_HELMET;
	public static final Item IRON_CHESTPLATE;
	public static final Item IRON_LEGGINGS;
	public static final Item IRON_BOOTS;
	public static final Item DIAMOND_HELMET;
	public static final Item DIAMOND_CHESTPLATE;
	public static final Item DIAMOND_LEGGINGS;
	public static final Item DIAMOND_BOOTS;
	public static final Item GOLDEN_HELMET;
	public static final Item GOLDEN_CHESTPLATE;
	public static final Item GOLDEN_LEGGINGS;
	public static final Item GOLDEN_BOOTS;
	public static final Item FLINT;
	public static final Item PORKCHOP;
	public static final Item COOKED_PORKCHOP;
	public static final Item PAINTING;
	public static final Item GOLDEN_APPLE;
	public static final Item SIGN;
	public static final Item OAK_DOOR;
	public static final Item SPRUCE_DOOR;
	public static final Item BIRCH_DOOR;
	public static final Item JUNGLE_DOOR;
	public static final Item ACACIA_DOOR;
	public static final Item DARK_OAK_DOOR;
	public static final Item BUCKET;
	public static final Item WATER_BUCKET;
	public static final Item LAVA_BUCKET;
	public static final Item MINECART;
	public static final Item SADDLE;
	public static final Item IRON_DOOR;
	public static final Item REDSTONE;
	public static final Item SNOWBALL;
	public static final Item BOAT;
	public static final Item SPRUCE_BOAT;
	public static final Item BIRCH_BOAT;
	public static final Item JUNGLE_BOAT;
	public static final Item ACACIA_BOAT;
	public static final Item DARK_OAK_BOAT;
	public static final Item LEATHER;
	public static final Item MILK_BUCKET;
	public static final Item BRICK;
	public static final Item CLAY_BALL;
	public static final Item REEDS;
	public static final Item PAPER;
	public static final Item BOOK;
	public static final Item SLIME_BALL;
	public static final Item CHEST_MINECART;
	public static final Item FURNACE_MINECART;
	public static final Item EGG;
	public static final Item COMPASS;
	public static final Item FISHING_ROD;
	public static final Item CLOCK;
	public static final Item GLOWSTONE_DUST;
	public static final Item FISH;
	public static final Item COOKED_FISH;
	public static final Item DYE;
	public static final Item BONE;
	public static final Item SUGAR;
	public static final Item CAKE;
	public static final Item BED;
	public static final Item REPEATER;
	public static final Item COOKIE;
	public static final Item FILLED_MAP;
	public static final Item SHEARS;
	public static final Item MELON;
	public static final Item PUMPKIN_SEEDS;
	public static final Item MELON_SEEDS;
	public static final Item BEEF;
	public static final Item COOKED_BEEF;
	public static final Item CHICKEN;
	public static final Item COOKED_CHICKEN;
	public static final Item MUTTON;
	public static final Item COOKED_MUTTON;
	public static final Item RABBIT;
	public static final Item COOKED_RABBIT;
	public static final Item RABBIT_STEW;
	public static final Item RABBIT_FOOT;
	public static final Item RABBIT_HIDE;
	public static final Item ROTTEN_FLESH;
	public static final Item ENDER_PEARL;
	public static final Item BLAZE_ROD;
	public static final Item GHAST_TEAR;
	public static final Item GOLD_NUGGET;
	public static final Item NETHER_WART;
	public static final Potion POTIONITEM;
	public static final Potion SPLASH_POTION;
	public static final Potion LINGERING_POTION;
	public static final Item GLASS_BOTTLE;
	public static final Item DRAGON_BREATH;
	public static final Item SPIDER_EYE;
	public static final Item FERMENTED_SPIDER_EYE;
	public static final Item BLAZE_POWDER;
	public static final Item MAGMA_CREAM;
	public static final Item BREWING_STAND;
	public static final Item CAULDRON;
	public static final Item ENDER_EYE;
	public static final Item SPECKLED_MELON;
	public static final Item SPAWN_EGG;
	public static final Item EXPERIENCE_BOTTLE;
	public static final Item FIRE_CHARGE;
	public static final Item WRITABLE_BOOK;
	public static final Item WRITTEN_BOOK;
	public static final Item EMERALD;
	public static final Item ITEM_FRAME;
	public static final Item FLOWER_POT;
	public static final Item CARROT;
	public static final Item POTATO;
	public static final Item BAKED_POTATO;
	public static final Item POISONOUS_POTATO;
	public static final Item MAP;
	public static final Item GOLDEN_CARROT;
	public static final Item SKULL;
	public static final Item CARROT_ON_A_STICK;
	public static final Item NETHER_STAR;
	public static final Item PUMPKIN_PIE;
	public static final Item FIREWORKS;
	public static final Item FIREWORK_CHARGE;
	public static final Item ENCHANTED_BOOK;
	public static final Item COMPARATOR;
	public static final Item NETHERBRICK;
	public static final Item QUARTZ;
	public static final Item TNT_MINECART;
	public static final Item HOPPER_MINECART;
	public static final Item ARMOR_STAND;
	public static final Item IRON_HORSE_ARMOR;
	public static final Item GOLDEN_HORSE_ARMOR;
	public static final Item DIAMOND_HORSE_ARMOR;
	public static final Item LEAD;
	public static final Item NAME_TAG;
	public static final Item COMMAND_BLOCK_MINECART;
	public static final Item RECORD_13;
	public static final Item RECORD_CAT;
	public static final Item RECORD_BLOCKS;
	public static final Item RECORD_CHIRP;
	public static final Item RECORD_FAR;
	public static final Item RECORD_MALL;
	public static final Item RECORD_MELLOHI;
	public static final Item RECORD_STAL;
	public static final Item RECORD_STRAD;
	public static final Item RECORD_WARD;
	public static final Item RECORD_11;
	public static final Item RECORD_WAIT;
	public static final Item PRISMARINE_SHARD;
	public static final Item PRISMARINE_CRYSTALS;
	public static final Item BANNER;
	public static final Item END_CRYSTAL;
	public static final Item SHIELD;
	public static final Item ELYTRA;
	public static final Item CHORUS_FRUIT;
	public static final Item CHORUS_FRUIT_POPPED;
	public static final Item BEETROOT_SEEDS;
	public static final Item BEETROOT;
	public static final Item BEETROOT_SOUP;
	public static final Item TOTEM;
	public static final Item SHULKER_SHELL;
	public static final Item IRON_NUGGET;

	private static Item getItem(String name) {
		return MCWrapper.getAdapter().getItemRegistry().getItem(name);
	}

	static {
		AIR = getItem("air");
		IRON_SHOVEL = getItem("iron_shovel");
		IRON_PICKAXE = getItem("iron_pickaxe");
		IRON_AXE = getItem("iron_axe");
		FLINT_AND_STEEL = getItem("flint_and_steel");
		APPLE = getItem("apple");
		BOW = (Bow) getItem("bow");
		ARROW = getItem("arrow");
		SPECTRAL_ARROW = getItem("spectral_arrow");
		TIPPED_ARROW = getItem("tipped_arrow");
		COAL = getItem("coal");
		DIAMOND = getItem("diamond");
		IRON_INGOT = getItem("iron_ingot");
		GOLD_INGOT = getItem("gold_ingot");
		IRON_SWORD = getItem("iron_sword");
		WOODEN_SWORD = getItem("wooden_sword");
		WOODEN_SHOVEL = getItem("wooden_shovel");
		WOODEN_PICKAXE = getItem("wooden_pickaxe");
		WOODEN_AXE = getItem("wooden_axe");
		STONE_SWORD = getItem("stone_sword");
		STONE_SHOVEL = getItem("stone_shovel");
		STONE_PICKAXE = getItem("stone_pickaxe");
		STONE_AXE = getItem("stone_axe");
		DIAMOND_SWORD = getItem("diamond_sword");
		DIAMOND_SHOVEL = getItem("diamond_shovel");
		DIAMOND_PICKAXE = getItem("diamond_pickaxe");
		DIAMOND_AXE = getItem("diamond_axe");
		STICK = getItem("stick");
		BOWL = getItem("bowl");
		MUSHROOM_STEW = getItem("mushroom_stew");
		GOLDEN_SWORD = getItem("golden_sword");
		GOLDEN_SHOVEL = getItem("golden_shovel");
		GOLDEN_PICKAXE = getItem("golden_pickaxe");
		GOLDEN_AXE = getItem("golden_axe");
		STRING = getItem("string");
		FEATHER = getItem("feather");
		GUNPOWDER = getItem("gunpowder");
		WOODEN_HOE = getItem("wooden_hoe");
		STONE_HOE = getItem("stone_hoe");
		IRON_HOE = getItem("iron_hoe");
		DIAMOND_HOE = getItem("diamond_hoe");
		GOLDEN_HOE = getItem("golden_hoe");
		WHEAT_SEEDS = getItem("wheat_seeds");
		WHEAT = getItem("wheat");
		BREAD = getItem("bread");
		LEATHER_HELMET = getItem("leather_helmet");
		LEATHER_CHESTPLATE = getItem("leather_chestplate");
		LEATHER_LEGGINGS = getItem("leather_leggings");
		LEATHER_BOOTS = getItem("leather_boots");
		CHAINMAIL_HELMET = getItem("chainmail_helmet");
		CHAINMAIL_CHESTPLATE = getItem("chainmail_chestplate");
		CHAINMAIL_LEGGINGS = getItem("chainmail_leggings");
		CHAINMAIL_BOOTS = getItem("chainmail_boots");
		IRON_HELMET = getItem("iron_helmet");
		IRON_CHESTPLATE = getItem("iron_chestplate");
		IRON_LEGGINGS = getItem("iron_leggings");
		IRON_BOOTS = getItem("iron_boots");
		DIAMOND_HELMET = getItem("diamond_helmet");
		DIAMOND_CHESTPLATE = getItem("diamond_chestplate");
		DIAMOND_LEGGINGS = getItem("diamond_leggings");
		DIAMOND_BOOTS = getItem("diamond_boots");
		GOLDEN_HELMET = getItem("golden_helmet");
		GOLDEN_CHESTPLATE = getItem("golden_chestplate");
		GOLDEN_LEGGINGS = getItem("golden_leggings");
		GOLDEN_BOOTS = getItem("golden_boots");
		FLINT = getItem("flint");
		PORKCHOP = getItem("porkchop");
		COOKED_PORKCHOP = getItem("cooked_porkchop");
		PAINTING = getItem("painting");
		GOLDEN_APPLE = getItem("golden_apple");
		SIGN = getItem("sign");
		OAK_DOOR = getItem("wooden_door");
		SPRUCE_DOOR = getItem("spruce_door");
		BIRCH_DOOR = getItem("birch_door");
		JUNGLE_DOOR = getItem("jungle_door");
		ACACIA_DOOR = getItem("acacia_door");
		DARK_OAK_DOOR = getItem("dark_oak_door");
		BUCKET = getItem("bucket");
		WATER_BUCKET = getItem("water_bucket");
		LAVA_BUCKET = getItem("lava_bucket");
		MINECART = getItem("minecart");
		SADDLE = getItem("saddle");
		IRON_DOOR = getItem("iron_door");
		REDSTONE = getItem("redstone");
		SNOWBALL = getItem("snowball");
		BOAT = getItem("boat");
		SPRUCE_BOAT = getItem("spruce_boat");
		BIRCH_BOAT = getItem("birch_boat");
		JUNGLE_BOAT = getItem("jungle_boat");
		ACACIA_BOAT = getItem("acacia_boat");
		DARK_OAK_BOAT = getItem("dark_oak_boat");
		LEATHER = getItem("leather");
		MILK_BUCKET = getItem("milk_bucket");
		BRICK = getItem("brick");
		CLAY_BALL = getItem("clay_ball");
		REEDS = getItem("reeds");
		PAPER = getItem("paper");
		BOOK = getItem("book");
		SLIME_BALL = getItem("slime_ball");
		CHEST_MINECART = getItem("chest_minecart");
		FURNACE_MINECART = getItem("furnace_minecart");
		EGG = getItem("egg");
		COMPASS = getItem("compass");
		FISHING_ROD = getItem("fishing_rod");
		CLOCK = getItem("clock");
		GLOWSTONE_DUST = getItem("glowstone_dust");
		FISH = getItem("fish");
		COOKED_FISH = getItem("cooked_fish");
		DYE = getItem("dye");
		BONE = getItem("bone");
		SUGAR = getItem("sugar");
		CAKE = getItem("cake");
		BED = getItem("bed");
		REPEATER = getItem("repeater");
		COOKIE = getItem("cookie");
		FILLED_MAP = getItem("filled_map");
		SHEARS = getItem("shears");
		MELON = getItem("melon");
		PUMPKIN_SEEDS = getItem("pumpkin_seeds");
		MELON_SEEDS = getItem("melon_seeds");
		BEEF = getItem("beef");
		COOKED_BEEF = getItem("cooked_beef");
		CHICKEN = getItem("chicken");
		COOKED_CHICKEN = getItem("cooked_chicken");
		MUTTON = getItem("mutton");
		COOKED_MUTTON = getItem("cooked_mutton");
		RABBIT = getItem("rabbit");
		COOKED_RABBIT = getItem("cooked_rabbit");
		RABBIT_STEW = getItem("rabbit_stew");
		RABBIT_FOOT = getItem("rabbit_foot");
		RABBIT_HIDE = getItem("rabbit_hide");
		ROTTEN_FLESH = getItem("rotten_flesh");
		ENDER_PEARL = getItem("ender_pearl");
		BLAZE_ROD = getItem("blaze_rod");
		GHAST_TEAR = getItem("ghast_tear");
		GOLD_NUGGET = getItem("gold_nugget");
		NETHER_WART = getItem("nether_wart");
		POTIONITEM = (Potion) getItem("potion");
		SPLASH_POTION = (Potion) getItem("splash_potion");
		LINGERING_POTION = (Potion) getItem("lingering_potion");
		GLASS_BOTTLE = getItem("glass_bottle");
		DRAGON_BREATH = getItem("dragon_breath");
		SPIDER_EYE = getItem("spider_eye");
		FERMENTED_SPIDER_EYE = getItem("fermented_spider_eye");
		BLAZE_POWDER = getItem("blaze_powder");
		MAGMA_CREAM = getItem("magma_cream");
		BREWING_STAND = getItem("brewing_stand");
		CAULDRON = getItem("cauldron");
		ENDER_EYE = getItem("ender_eye");
		SPECKLED_MELON = getItem("speckled_melon");
		SPAWN_EGG = getItem("spawn_egg");
		EXPERIENCE_BOTTLE = getItem("experience_bottle");
		FIRE_CHARGE = getItem("fire_charge");
		WRITABLE_BOOK = getItem("writable_book");
		WRITTEN_BOOK = getItem("written_book");
		EMERALD = getItem("emerald");
		ITEM_FRAME = getItem("item_frame");
		FLOWER_POT = getItem("flower_pot");
		CARROT = getItem("carrot");
		POTATO = getItem("potato");
		BAKED_POTATO = getItem("baked_potato");
		POISONOUS_POTATO = getItem("poisonous_potato");
		MAP = getItem("map");
		GOLDEN_CARROT = getItem("golden_carrot");
		SKULL = getItem("skull");
		CARROT_ON_A_STICK = getItem("carrot_on_a_stick");
		NETHER_STAR = getItem("nether_star");
		PUMPKIN_PIE = getItem("pumpkin_pie");
		FIREWORKS = getItem("fireworks");
		FIREWORK_CHARGE = getItem("firework_charge");
		ENCHANTED_BOOK = getItem("enchanted_book");
		COMPARATOR = getItem("comparator");
		NETHERBRICK = getItem("netherbrick");
		QUARTZ = getItem("quartz");
		TNT_MINECART = getItem("tnt_minecart");
		HOPPER_MINECART = getItem("hopper_minecart");
		ARMOR_STAND = getItem("armor_stand");
		IRON_HORSE_ARMOR = getItem("iron_horse_armor");
		GOLDEN_HORSE_ARMOR = getItem("golden_horse_armor");
		DIAMOND_HORSE_ARMOR = getItem("diamond_horse_armor");
		LEAD = getItem("lead");
		NAME_TAG = getItem("name_tag");
		COMMAND_BLOCK_MINECART = getItem("command_block_minecart");
		RECORD_13 = getItem("record_13");
		RECORD_CAT = getItem("record_cat");
		RECORD_BLOCKS = getItem("record_blocks");
		RECORD_CHIRP = getItem("record_chirp");
		RECORD_FAR = getItem("record_far");
		RECORD_MALL = getItem("record_mall");
		RECORD_MELLOHI = getItem("record_mellohi");
		RECORD_STAL = getItem("record_stal");
		RECORD_STRAD = getItem("record_strad");
		RECORD_WARD = getItem("record_ward");
		RECORD_11 = getItem("record_11");
		RECORD_WAIT = getItem("record_wait");
		PRISMARINE_SHARD = getItem("prismarine_shard");
		PRISMARINE_CRYSTALS = getItem("prismarine_crystals");
		BANNER = getItem("banner");
		END_CRYSTAL = getItem("end_crystal");
		SHIELD = getItem("shield");
		ELYTRA = getItem("elytra");
		CHORUS_FRUIT = getItem("chorus_fruit");
		CHORUS_FRUIT_POPPED = getItem("chorus_fruit_popped");
		BEETROOT_SEEDS = getItem("beetroot_seeds");
		BEETROOT = getItem("beetroot");
		BEETROOT_SOUP = getItem("beetroot_soup");
		TOTEM = getItem("totem_of_undying");
		SHULKER_SHELL = getItem("shulker_shell");
		IRON_NUGGET = getItem("iron_nugget");
	}
}