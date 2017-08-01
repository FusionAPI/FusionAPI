package org.cyberpwn.fusionapi.pack;

import org.bukkit.Material;

public enum MaterialFilter
{
	APPLE("apple", "apple", 0),
	ARMOR_STAND("armor_stand", "wooden_armorstand", 0),
	ARROW("arrow", "arrow", 0),
	BAKED_POTATO("baked_potato", "potato_baked", 0),
	BEETROOT("beetroot", "beetroot", 0),
	BEETROOT_SEEDS("beetroot_seeds", "beetroot_seeds", 0),
	BEETROOT_SOUP("beetroot_soup", "beetroot_soup", 0),
	BLAZE_POWDER("blaze_powder", "blaze_powder", 0),
	BLAZE_ROD("blaze_rod", "blaze_rod", 0),
	BONE("bone", "bone", 0),
	BOOK("book", "book_normal", 0),
	BOW("bow", "bow_standby", 384),
	BOWL("bowl", "bowl", 0),
	BREAD("bread", "bread", 0),
	BUCKET("bucket", "bucket_empty", 0),
	CAKE("cake", "cake", 0),
	CHAINMAIL_BOOTS("chainmail_boots", "chainmail_boots", 195),
	CHAINMAIL_CHESTPLATE("chainmail_chestplate", "chainmail_chestplate", 240),
	CHAINMAIL_HELMET("chainmail_helmet", "chainmail_helmet", 165),
	CHAINMAIL_LEGGINGS("chainmail_leggings", "chainmail_leggings", 225),
	CHORUS_FRUIT("chorus_fruit", "chorus_fruit", 0),
	CHORUS_FRUIT_POPPED("chorus_fruit_popped", "chorus_fruit_popped", 0),
	CLAY_BALL("clay_ball", "clay_ball", 0),
	COAL("coal", "coal", 0),
	COMPASS("compass", "compass_16", 0),
	COOKED_BEEF("cooked_beef", "beef_cooked", 0),
	COOKED_CHICKEN("cooked_chicken", "chicken_cooked", 0),
	COOKED_MUTTON("cooked_mutton", "mutton_cooked", 0),
	COOKED_RABBIT("cooked_rabbit", "rabbit_cooked", 0),
	COOKIE("cookie", "cookie", 0),
	DIAMOND("diamond", "diamond", 0),
	DIAMOND_AXE("diamond_axe", "diamond_axe", 1561),
	DIAMOND_BOOTS("diamond_boots", "diamond_boots", 429),
	DIAMOND_CHESTPLATE("diamond_chestplate", "diamond_chestplate", 528),
	DIAMOND_HELMET("diamond_helmet", "diamond_helmet", 363),
	DIAMOND_HOE("diamond_hoe", "diamond_hoe", 1561),
	DIAMOND_LEGGINGS("diamond_leggings", "diamond_leggings", 495),
	DIAMOND_PICKAXE("diamond_pickaxe", "diamond_pickaxe", 1561),
	DIAMOND_SWORD("diamond_sword", "diamond_sword", 1561),
	EGG("egg", "egg", 0),
	ELYTRA("elytra", "elytra", 431),
	EMERALD("emerald", "emerald", 0),
	ENCHANTED_BOOK("enchanted_book", "book_enchanted", 0),
	END_CRYSTAL("end_crystal", "end_crystal", 0),
	ENDER_PEARL("ender_pearl", "ender_pearl", 0),
	FEATHER("feather", "feather", 0),
	FERMENTED_SPIDER_EYE("fermented_spider_eye", "spider_eye_fermented", 0),
	FIREBALL("fire_charge", "fireball", 0),
	FIREWORK_CHARGE("firework_charge", "fireworks_charge", 0),
	FISHING_ROD("fishing_rod", "fishing_rod_uncast", 64),
	FLINT("flint", "flint", 0),
	FLINT_AND_STEEL("flint_and_steel", "flint_and_steel", 64),
	GHAST_TEAR("ghast_tear", "ghast_tear", 0),
	GLASS_BOTTLE("glass_bottle", "potion_bottle_empty", 0),
	GLOWSTONE_DUST("glowstone_dust", "glowstone_dust", 0),
	GOLD_AXE("golden_axe", "gold_axe", 32),
	GOLD_BOOTS("golden_boots", "gold_boots", 91),
	GOLD_CHESTPLATE("golden_chestplate", "gold_chestplate", 112),
	GOLD_HELMET("golden_helmet", "gold_helmet", 77),
	GOLD_HOE("golden_hoe", "gold_hoe", 32),
	GOLD_INGOT("gold_ingot", "gold_ingot", 0),
	GOLD_LEGGINGS("golden_leggings", "gold_leggings", 105),
	GOLD_NUGGET("gold_nugget", "gold_nugget", 0),
	GOLD_PICKAXE("golden_pickaxe", "gold_pickaxe", 32),
	GOLD_SWORD("golden_sword", "gold_sword", 32),
	GOLDEN_APPLE("golden_apple", "apple_golden", 0),
	GOLDEN_CARROT("golden_carrot", "carrot_golden", 0),
	HOPPER_MINECART("hopper_minecart", "minecart_hopper", 0),
	IRON_AXE("iron_axe", "iron_axe", 250),
	IRON_BOOTS("iron_boots", "iron_boots", 195),
	IRON_CHESTPLATE("iron_chestplate", "iron_chestplate", 240),
	IRON_DOOR("iron_door", "door_iron", 0),
	IRON_HELMET("iron_helmet", "iron_helmet", 165),
	IRON_HOE("iron_hoe", "iron_hoe", 250),
	IRON_INGOT("iron_ingot", "iron_ingot", 0),
	IRON_LEGGINGS("iron_leggings", "iron_leggings", 225),
	IRON_NUGGET("iron_nugget", "iron_nugget", 0),
	IRON_PICKAXE("iron_pickaxe", "iron_pickaxe", 250),
	IRON_SWORD("iron_sword", "iron_sword", 250),
	ITEM_FRAME("item_frame", "item_frame", 0),
	KNOWLEDGE_BOOK("knowledge_book", "knowledge_book", 0),
	LAVA_BUCKET("lava_bucket", "bucket_lava", 0),
	LEATHER("leather", "leather", 0),
	LEATHER_BOOTS("leather_boots", "leather_boots", 65),
	LEATHER_CHESTPLATE("leather_chestplate", "leather_chestplate", 80),
	LEATHER_HELMET("leather_helmet", "leather_helmet", 55),
	LEATHER_LEGGINGS("leather_leggings", "leather_leggings", 75),
	MAGMA_CREAM("magma_cream", "magma_cream", 0),
	MAP("map", "map_empty", 0),
	MELON("melon", "melon", 0),
	MELON_SEEDS("melon_seeds", "seeds_melon", 0),
	MILK_BUCKET("milk_bucket", "bucket_milk", 0),
	MINECART("minecart", "minecart_normal", 0),
	MUTTON("mutton", "mutton_raw", 0),
	NAME_TAG("name_tag", "name_tag", 0),
	NETHER_STAR("nether_star", "nether_star", 0),
	PAINTING("painting", "painting", 0),
	PAPER("paper", "paper", 0),
	POISONOUS_POTATO("poisonous_potato", "potato_poisonous", 0),
	PRISMARINE_CRYSTALS("prismarine_crystals", "prismarine_crystals", 0),
	PRISMARINE_SHARD("prismarine_shard", "prismarine_shard", 0),
	PUMPKIN_PIE("pumpkin_pie", "pumpkin_pie", 0),
	PUMPKIN_SEEDS("pumpkin_seeds", "seeds_pumpkin", 0),
	QUARTZ("quartz", "quartz", 0),
	RABBIT("rabbit", "rabbit_raw", 0),
	RABBIT_FOOT("rabbit_foot", "rabbit_foot", 0),
	RABBIT_HIDE("rabbit_hide", "rabbit_hide", 0),
	RABBIT_STEW("rabbit_stew", "rabbit_stew", 0),
	RECORD_11("record_11", "record_11", 0),
	REDSTONE("redstone", "redstone_dust", 0),
	ROTTEN_FLESH("rotten_flesh", "rotten_flesh", 0),
	SADDLE("saddle", "saddle", 0),
	SHEARS("shears", "shears", 238),
	SHULKER_SHELL("shulker_shell", "shulker_shell", 0),
	SIGN("sign", "sign", 0),
	SLIME_BALL("slime_ball", "slimeball", 0),
	SPECKLED_MELON("speckled_melon", "melon_speckled", 0),
	SPECTRAL_ARROW("spectral_arrow", "spectral_arrow", 0),
	SPIDER_EYE("spider_eye", "spider_eye", 0),
	STICK("stick", "stick", 0),
	STONE_AXE("stone_axe", "stone_axe", 131),
	STONE_HOE("stone_hoe", "stone_hoe", 131),
	STONE_PICKAXE("stone_pickaxe", "stone_pickaxe", 131),
	STONE_SWORD("stone_sword", "stone_sword", 131),
	STRING("string", "string", 0),
	SUGAR("sugar", "sugar", 0),
	TIPPED_ARROW("tipped_arrow", "tipped_arrow_head", 0),
	TOTEM("totem", "totem", 0),
	WATER_BUCKET("water_bucket", "bucket_water", 0),
	WHEAT("wheat", "wheat", 0),
	WOOD_AXE("wooden_axe", "wood_axe", 59),
	WOOD_HOE("wooden_hoe", "wood_hoe", 59),
	WOOD_PICKAXE("wooden_pickaxe", "wood_pickaxe", 59),
	WOOD_SWORD("wooden_sword", "wood_sword", 59),
	WRITTEN_BOOK("written_book", "book_written", 0);
	
	private String model;
	private String texture;
	private int sectors;
	
	private MaterialFilter(String model, String texture, int sectors)
	{
		this.model = model;
		this.texture = texture;
		this.sectors = sectors;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public String getTexture()
	{
		return texture;
	}
	
	public int getSectors()
	{
		return sectors;
	}
	
	public boolean canBeAllocated()
	{
		return getSectors() > 0;
	}
	
	public BasicModel getBaseModel()
	{
		return new BasicModel(getModel(), getTexture());
	}
	
	public static MaterialFilter getFilter(Material m)
	{
		return valueOf(m.toString());
	}
}
