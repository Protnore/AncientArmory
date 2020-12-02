package com.protnore.ancientarmory.items;

import com.protnore.ancientarmory.Main;
import com.protnore.ancientarmory.init.ItemInit;
import com.protnore.ancientarmory.objects.items.models.Dharok_Armor;
import com.protnore.ancientarmory.objects.items.models.Dharok_Boots;
import com.protnore.ancientarmory.util.IHasModel;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class DharokBootsBase extends ItemArmor implements IHasModel
{
	public DharokBootsBase(String name, CreativeTabs tab, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn)
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
				
			    Dharok_Boots model = new Dharok_Boots ();
		
				model.LeftBoot.showModel = armorSlot == (EntityEquipmentSlot.FEET);
				model.RightBoot.showModel = armorSlot == (EntityEquipmentSlot.FEET);
				
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