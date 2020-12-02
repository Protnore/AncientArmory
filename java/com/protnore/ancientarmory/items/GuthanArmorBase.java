package com.protnore.ancientarmory.items;

import com.protnore.ancientarmory.Main;
import com.protnore.ancientarmory.init.ItemInit;
import com.protnore.ancientarmory.objects.items.models.Dharok_Armor;
import com.protnore.ancientarmory.objects.items.models.Guthan_Armor;
import com.protnore.ancientarmory.util.IHasModel;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class GuthanArmorBase extends ItemArmor implements IHasModel
{
	public GuthanArmorBase(String name, CreativeTabs tab, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn)
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
		if(itemStack!= ItemStack.EMPTY) 
		{
			if(itemStack.getItem() instanceof ItemArmor) 
			{
				
		    	Guthan_Armor model = new Guthan_Armor ();
		
				model.Helmet.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				model.Chest.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.ChestSpike.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.LeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.RightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.LeftArmSpike.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.RightArmSpike.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.LeftLeg1.showModel = (armorSlot == EntityEquipmentSlot.LEGS);
				model.LeftLeg2.showModel = (armorSlot == EntityEquipmentSlot.LEGS);
				model.LeftLeg3.showModel = (armorSlot == EntityEquipmentSlot.LEGS);
				model.LeftLeg4.showModel = (armorSlot == EntityEquipmentSlot.LEGS);
				model.LeftLeg1.showModel = (armorSlot == EntityEquipmentSlot.LEGS);
				model.LeftLeg2.showModel = (armorSlot == EntityEquipmentSlot.LEGS);
				model.LeftLeg3.showModel = (armorSlot == EntityEquipmentSlot.LEGS);
				model.LeftLeg4.showModel = (armorSlot == EntityEquipmentSlot.LEGS);

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