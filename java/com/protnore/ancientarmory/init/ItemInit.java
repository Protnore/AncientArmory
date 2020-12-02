	package com.protnore.ancientarmory.init;

import java.util.ArrayList;
import java.util.List;

import com.protnore.ancientarmory.Main;
import com.protnore.ancientarmory.items.AhrimArmorBase;
import com.protnore.ancientarmory.items.ArmadylArmorBase;
import com.protnore.ancientarmory.items.BandosArmorBase;
import com.protnore.ancientarmory.items.DharokArmorBase;
import com.protnore.ancientarmory.items.DharokBootsBase;
import com.protnore.ancientarmory.items.DragonArmorBase;
import com.protnore.ancientarmory.items.GuthanArmorBase;
import com.protnore.ancientarmory.items.GuthanBootsBase;
import com.protnore.ancientarmory.items.KarilArmorBase;
import com.protnore.ancientarmory.items.ToragArmorBase;
import com.protnore.ancientarmory.items.VeracArmorBase;
import com.protnore.ancientarmory.objects.armor.ArmorBase;
import com.protnore.ancientarmory.objects.items.ItemBase;
import com.protnore.ancientarmory.objects.tools.CrystalBowTool;
import com.protnore.ancientarmory.objects.tools.DarkBowTool;
import com.protnore.ancientarmory.objects.tools.KarilTool;
import com.protnore.ancientarmory.objects.tools.ToolAxe;
import com.protnore.ancientarmory.objects.tools.ToolHammer;
import com.protnore.ancientarmory.objects.tools.ToolHoe;
import com.protnore.ancientarmory.objects.tools.ToolPickaxe;
import com.protnore.ancientarmory.objects.tools.ToolShovel;
import com.protnore.ancientarmory.objects.tools.ToolSword;
import com.protnore.ancientarmory.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial RUNE_TOOL = EnumHelper.addToolMaterial("rune_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ArmorMaterial RUNE_ARMOR = EnumHelper.addArmorMaterial("rune_armor", Reference.MODID + ":rune_armor", 33, new int[]{4, 7, 9, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ToolMaterial DRAGON_TOOL = EnumHelper.addToolMaterial("dragon_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ArmorMaterial DRAGON_ARMOR = EnumHelper.addArmorMaterial("dragon_armor", Reference.MODID + ":dragon_armor", 33, new int[]{4, 7, 9, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial BANDOS_ARMOR = EnumHelper.addArmorMaterial("bandos_armor", Reference.MODID + ":bandos_armor", 33, new int[]{4, 7, 9, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial ARMADYL_ARMOR = EnumHelper.addArmorMaterial("armadyl_armor", Reference.MODID + ":armadyl_armor", 33, new int[]{4, 7, 9, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial VERAC_ARMOR = EnumHelper.addArmorMaterial("verac_armor", Reference.MODID + ":verac_armor", 33, new int[]{4, 7, 9, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial AHRIM_ARMOR = EnumHelper.addArmorMaterial("ahrim_armor", Reference.MODID + ":ahrim_armor", 33, new int[]{4, 7, 9, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial DHAROK_ARMOR = EnumHelper.addArmorMaterial("dharok_armor", Reference.MODID + ":dharok_armor", 33, new int[]{4, 7, 9, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial GUTHAN_ARMOR = EnumHelper.addArmorMaterial("guthan_armor", Reference.MODID + ":guthan_armor", 33, new int[]{4, 7, 9, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial KARIL_ARMOR = EnumHelper.addArmorMaterial("karil_armor", Reference.MODID + ":karil_armor", 33, new int[]{4, 7, 9, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial TORAG_ARMOR = EnumHelper.addArmorMaterial("torag_armor", Reference.MODID + ":torag_armor", 33, new int[]{4, 7, 9, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ToolMaterial BANDOS_TOOL = EnumHelper.addToolMaterial("bandos_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial ARMADYL_TOOL = EnumHelper.addToolMaterial("armadyl_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial SARADOMIN_TOOL = EnumHelper.addToolMaterial("saradomin_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial ZAMORAK_TOOL = EnumHelper.addToolMaterial("zamorak_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial VERAC_TOOL = EnumHelper.addToolMaterial("verac_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial AHRIM_TOOL = EnumHelper.addToolMaterial("ahrim_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial DHAROK_TOOL = EnumHelper.addToolMaterial("dharok_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial GUTHAN_TOOL = EnumHelper.addToolMaterial("guthan_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial KARIL_TOOL = EnumHelper.addToolMaterial("karil_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial TORAG_TOOL = EnumHelper.addToolMaterial("torag_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial DARK_TOOL = EnumHelper.addToolMaterial("dark_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial CRYSTAL_TOOL = EnumHelper.addToolMaterial("crystal_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial ASH_TOOL = EnumHelper.addToolMaterial("ash_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial CORRUPT_TOOL = EnumHelper.addToolMaterial("corrupt_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial SHADOW_TOOL = EnumHelper.addToolMaterial("shadow_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial EDGE_TOOL = EnumHelper.addToolMaterial("edge_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial FROST_TOOL = EnumHelper.addToolMaterial("frost_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial GORE_TOOL = EnumHelper.addToolMaterial("gore_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial WODEN_TOOL = EnumHelper.addToolMaterial("woden_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial DAN_TOOL = EnumHelper.addToolMaterial("dan_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial SULFURON_TOOL = EnumHelper.addToolMaterial("sulfuron_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial SULFURAS_TOOL = EnumHelper.addToolMaterial("sulfuras_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial DOOM_TOOL = EnumHelper.addToolMaterial("doom_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial BLACK_TOOL = EnumHelper.addToolMaterial("black_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial TOKTZ_TOOL = EnumHelper.addToolMaterial("toktz_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial KET_TOOL = EnumHelper.addToolMaterial("ket_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial XIL_TOOL = EnumHelper.addToolMaterial("xil_tool", 4, 2568, 10.0F, 6.0F, 30);
	public static final ToolMaterial ANCHOR_TOOL = EnumHelper.addToolMaterial("anchor_tool", 4, 2568, 10.0F, 6.0F, 30);

	




	//Armors
	
	//Dragon Armor

	public static final Item DRAGON_CHAINBODY = new DragonArmorBase("dragon_chainbody", Main.ancientarmorytab, DRAGON_ARMOR, EntityEquipmentSlot.CHEST);
	public static final Item DRAGON_MED_HELM = new DragonArmorBase("dragon_med_helm", Main.ancientarmorytab, DRAGON_ARMOR, EntityEquipmentSlot.HEAD);
	public static final Item DRAGON_PLATELEGS = new DragonArmorBase("dragon_platelegs", Main.ancientarmorytab, DRAGON_ARMOR, EntityEquipmentSlot.LEGS);
	public static final Item DRAGON_BOOTS = new DragonArmorBase("dragon_boots", Main.ancientarmorytab, DRAGON_ARMOR, EntityEquipmentSlot.FEET);



	//God Armor
	
	
	
	//Bandos
	public static final Item BANDOS_HELMET = new BandosArmorBase("bandos_helm", Main.ancientarmorytab, BANDOS_ARMOR, EntityEquipmentSlot.HEAD);
	public static final Item BANDOS_CHESTPLATE = new BandosArmorBase("bandos_chestplate", Main.ancientarmorytab, BANDOS_ARMOR, EntityEquipmentSlot.CHEST);
	public static final Item BANDOS_TASSETS = new BandosArmorBase("bandos_tassets", Main.ancientarmorytab, BANDOS_ARMOR, EntityEquipmentSlot.LEGS);
	public static final Item BANDOS_BOOTS = new BandosArmorBase("bandos_boots", Main.ancientarmorytab, BANDOS_ARMOR, EntityEquipmentSlot.FEET);
	
	//Armadyl
	public static final Item ARMADYL_HELMET = new ArmadylArmorBase("armadyl_helmet", Main.ancientarmorytab, ARMADYL_ARMOR, EntityEquipmentSlot.HEAD);
	public static final Item ARMADYL_CHESTPLATE = new ArmadylArmorBase("armadyl_chestplate", Main.ancientarmorytab, ARMADYL_ARMOR, EntityEquipmentSlot.CHEST);
	public static final Item ARMADYL_CHAINSKIRT = new ArmadylArmorBase("armadyl_chainskirt", Main.ancientarmorytab, ARMADYL_ARMOR, EntityEquipmentSlot.LEGS);
	public static final Item ARMADYL_BOOTS = new ArmadylArmorBase("armadyl_boots", Main.ancientarmorytab, ARMADYL_ARMOR, EntityEquipmentSlot.FEET);
	
	
	
	//Barrows Armor
	
	
	
	//Verac
	public static final Item VERAC_HELMET = new VeracArmorBase("verac_helmet", Main.ancientarmorytab, VERAC_ARMOR, EntityEquipmentSlot.HEAD);
	public static final Item VERAC_BRASSARD = new VeracArmorBase("verac_brassard", Main.ancientarmorytab, VERAC_ARMOR, EntityEquipmentSlot.CHEST);
	public static final Item VERAC_PLATESKIRT = new VeracArmorBase("verac_plateskirt", Main.ancientarmorytab, VERAC_ARMOR, EntityEquipmentSlot.LEGS);
	public static final Item VERAC_BOOTS = new VeracArmorBase("verac_boots", Main.ancientarmorytab, VERAC_ARMOR, EntityEquipmentSlot.FEET);
	
	//Ahrim
	public static final Item AHRIM_HOOD = new AhrimArmorBase("ahrim_hood", Main.ancientarmorytab, AHRIM_ARMOR, EntityEquipmentSlot.HEAD);
	public static final Item AHRIM_CHEST = new AhrimArmorBase("ahrim_chest", Main.ancientarmorytab, AHRIM_ARMOR, EntityEquipmentSlot.CHEST);
	public static final Item AHRIM_ROBES = new AhrimArmorBase("ahrim_robes", Main.ancientarmorytab, AHRIM_ARMOR, EntityEquipmentSlot.LEGS);
	public static final Item AHRIM_BOOTS = new AhrimArmorBase("ahrim_boots", Main.ancientarmorytab, AHRIM_ARMOR, EntityEquipmentSlot.FEET);
	
	//Dharok
	public static final Item DHAROK_HELMET = new DharokArmorBase("dharok_helmet", Main.ancientarmorytab, DHAROK_ARMOR, EntityEquipmentSlot.HEAD);
	public static final Item DHAROK_CHESTPLATE = new DharokArmorBase("dharok_chestplate", Main.ancientarmorytab, DHAROK_ARMOR, EntityEquipmentSlot.CHEST);
	public static final Item DHAROK_PLATELEGS = new DharokArmorBase("dharok_platelegs", Main.ancientarmorytab, DHAROK_ARMOR, EntityEquipmentSlot.LEGS);
	public static final Item DHAROK_BOOTS = new DharokBootsBase("dharok_boots", Main.ancientarmorytab, DHAROK_ARMOR, EntityEquipmentSlot.FEET);
	
	//Guthan
	public static final Item GUTHAN_HELMET = new GuthanArmorBase("guthan_helmet", Main.ancientarmorytab, GUTHAN_ARMOR, EntityEquipmentSlot.HEAD);
	public static final Item GUTHAN_CHESTPLATE = new GuthanArmorBase("guthan_chestplate", Main.ancientarmorytab, GUTHAN_ARMOR, EntityEquipmentSlot.CHEST);
	public static final Item GUTHAN_CHAINSKIRT = new GuthanArmorBase("guthan_chainskirt", Main.ancientarmorytab, GUTHAN_ARMOR, EntityEquipmentSlot.LEGS);
	public static final Item GUTHAN_BOOTS = new GuthanBootsBase("guthan_boots", Main.ancientarmorytab, GUTHAN_ARMOR, EntityEquipmentSlot.FEET);
	
	//Karil
	public static final Item KARIL_HELMET = new KarilArmorBase("karil_helmet", Main.ancientarmorytab, KARIL_ARMOR, EntityEquipmentSlot.HEAD);
	public static final Item KARIL_CHESTPLATE = new KarilArmorBase("karil_chestplate", Main.ancientarmorytab, KARIL_ARMOR, EntityEquipmentSlot.CHEST);
	public static final Item KARIL_CHAINSKIRT = new KarilArmorBase("karil_chainskirt", Main.ancientarmorytab, KARIL_ARMOR, EntityEquipmentSlot.LEGS);
	public static final Item KARIL_BOOTS = new KarilArmorBase("karil_boots", Main.ancientarmorytab, KARIL_ARMOR, EntityEquipmentSlot.FEET);
	
	//Torag
	public static final Item TORAG_HELMET = new ToragArmorBase("torag_helmet", Main.ancientarmorytab, TORAG_ARMOR, EntityEquipmentSlot.HEAD);
	public static final Item TORAG_CHESTPLATE = new ToragArmorBase("torag_chestplate", Main.ancientarmorytab, TORAG_ARMOR, EntityEquipmentSlot.CHEST);
	public static final Item TORAG_PLATELEGS = new ToragArmorBase("torag_platelegs", Main.ancientarmorytab, TORAG_ARMOR, EntityEquipmentSlot.LEGS);
	public static final Item TORAG_BOOTS = new ToragArmorBase("torag_boots", Main.ancientarmorytab, TORAG_ARMOR, EntityEquipmentSlot.FEET);	
	
	
	
	//Basic Armor
	
	
	
	//Rune
	public static final Item RUNE_HELMET = new ArmorBase("rune_helmet", Main.ancientarmorytab, RUNE_ARMOR, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUNE_CHESTPLATE = new ArmorBase("rune_chestplate", Main.ancientarmorytab, RUNE_ARMOR, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUNE_LEGGINGS = new ArmorBase("rune_leggings", Main.ancientarmorytab, RUNE_ARMOR, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUNE_BOOTS = new ArmorBase("rune_boots", Main.ancientarmorytab, RUNE_ARMOR, 1, EntityEquipmentSlot.FEET);

		
		
		
	//Tools and Weapons
		
		
		
	//Godswords
	public static final Item BANDOS_GODSWORD = new ToolSword("bandos_godsword", BANDOS_TOOL);
	public static final Item ARMADYL_GODSWORD = new ToolSword("armadyl_godsword", ARMADYL_TOOL);
	public static final Item SARADOMIN_GODSWORD = new ToolSword("saradomin_godsword", SARADOMIN_TOOL);
	public static final Item ZAMORAK_GODSWORD = new ToolSword("zamorak_godsword", ZAMORAK_TOOL);
	
	//Dragon
	public static final Item DRAGON_SWORD = new ToolSword("dragon_sword", DRAGON_TOOL);
	public static final Item DRAGON_PICKAXE = new ToolPickaxe("dragon_pickaxe", DRAGON_TOOL);
	public static final Item DRAGON_SHOVEL = new ToolShovel("dragon_shovel", DRAGON_TOOL);
	public static final Item DRAGON_AXE = new ToolAxe("dragon_axe", DRAGON_TOOL);
	public static final Item DRAGON_HOE = new ToolHoe("dragon_hoe", DRAGON_TOOL);

    //Barrows

	public static final Item DHAROK_GREATAXE = new ToolAxe("dharok_greataxe", DHAROK_TOOL);
	public static final Item GUTHAN_WARSPEAR = new ToolSword("guthan_warspear", GUTHAN_TOOL);
	public static final Item AHRIM_STAFF = new ToolHoe("ahrim_staff", AHRIM_TOOL);
	public static final Item KARIL_CROSSBOW = new KarilTool("karil_crossbow", KARIL_TOOL);
	public static final Item TORAG_HAMMER = new ToolHammer("torag_hammer", TORAG_TOOL);
	public static final Item VERAC_FLAIL = new ToolHammer("verac_flail", VERAC_TOOL);
	
	//rune

	public static final Item RUNE_SWORD = new ToolSword("rune_sword", RUNE_TOOL);
	public static final Item RUNE_PICKAXE = new ToolPickaxe("rune_pickaxe", RUNE_TOOL);
	public static final Item RUNE_SHOVEL = new ToolShovel("rune_shovel", RUNE_TOOL);
	public static final Item RUNE_AXE = new ToolAxe("rune_axe", RUNE_TOOL);
	public static final Item RUNE_HOE = new ToolHoe("rune_hoe", RUNE_TOOL);

	//Misc Weaponry
	
	public static final Item DARK_BOW = new DarkBowTool("dark_bow", DARK_TOOL);
	public static final Item CRYSTAL_BOW = new CrystalBowTool("crystal_bow", CRYSTAL_TOOL);
	public static final Item ASHBRINGER = new ToolSword("ashbringer", ASH_TOOL);
	public static final Item CORRUPTED_ASHBRINGER = new ToolSword("corrupted_ashbringer", CORRUPT_TOOL);
	public static final Item SHADOWMOURNE = new ToolAxe("shadowmourne", SHADOW_TOOL);
	public static final Item SHADOWS_EDGE = new ToolAxe("shadows_edge", EDGE_TOOL);
	public static final Item FROSTMOURNE = new ToolSword("frostmourne", FROST_TOOL);
	public static final Item GOREHOWL = new ToolAxe("gorehowl", GORE_TOOL);
	public static final Item WODENS_BRAND = new ToolSword("wodens_brand", WODEN_TOOL);
	public static final Item DANS_ARM = new ToolHammer("dans_arm", DAN_TOOL);
	public static final Item SULFURON_HAMMER = new ToolHammer("sulfuron_hammer", SULFURON_TOOL);
	public static final Item SULFURAS_HAMMER = new ToolHammer("sulfuras_hammer", SULFURAS_TOOL);
	public static final Item DOOMHAMMER = new ToolHammer("doomhammer", DOOM_TOOL);
	public static final Item BLACKHAND = new ToolHammer("blackhand", BLACK_TOOL);
	public static final Item KET_MAUL = new ToolHammer("ket_maul", KET_TOOL);
	public static final Item XIL_SWORD = new ToolSword("xil_sword", XIL_TOOL);
	public static final Item BARRELCHEST_ANCHOR = new ToolHammer("barrelchest_anchor", ANCHOR_TOOL);



	
	//Items	
	
	
	
	public static final Item DRAGON_FRAGMENT = new ItemBase("dragon_fragment");
	public static final Item DRAGON_NUGGET = new ItemBase("dragon_nugget");
	public static final Item DRAGON_INGOT = new ItemBase("dragon_ingot");
	public static final Item GODSWORD_BLADE = new ItemBase("godsword_blade");
	public static final Item GODSWORD_SHARD_1 = new ItemBase("godsword_shard_1");
	public static final Item GODSWORD_SHARD_2 = new ItemBase("godsword_shard_2");
	public static final Item GODSWORD_SHARD_3 = new ItemBase("godsword_shard_3");
	public static final Item EYE_OF_SULFURAS = new ItemBase("eye_of_sulfuras");
	public static final Item SHADOWFROST_SHARD = new ItemBase("shadowfrost_shard");
	public static final Item HEARTHSTONE = new ItemBase("hearthstone");
	

	

}
