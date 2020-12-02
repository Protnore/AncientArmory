package com.protnore.ancientarmory.items;

import com.protnore.ancientarmory.Main;
import com.protnore.ancientarmory.init.ItemInit;
import com.protnore.ancientarmory.objects.items.models.Karil_Armor;
import com.protnore.ancientarmory.objects.items.models.Verac_Armor;
import com.protnore.ancientarmory.util.IHasModel;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class KarilArmorBase extends ItemArmor implements IHasModel
{
	public KarilArmorBase(String name, CreativeTabs tab, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn)
	{
		
		super(materialIn, 1, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(1);
		
		ItemInit.ITEMS.add(this);
		
	}
	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
	}
	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) 
	{
		if(itemStack != itemStack.EMPTY) 
		{
			if(itemStack.getItem() instanceof ItemArmor) 
			{
			
				Karil_Armor model = new Karil_Armor ();

				model.Helmet.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				model.LeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.RightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.Chest.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.ChestSpikes.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.BackSpikes.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.RightLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS;
				model.LeftLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS;
				model.LeftBoot.showModel = armorSlot == EntityEquipmentSlot.FEET;
				model.RightBoot.showModel = armorSlot == EntityEquipmentSlot.FEET;
			
				model.isChild = _default.isChild;
				model.isRiding = _default.isRiding;
				model.isSneak = _default.isSneak;
				model.rightArmPose = _default.rightArmPose;
				model.leftArmPose = _default.leftArmPose;
				
				return model;
				
			}
		}
		return null;
    }
}