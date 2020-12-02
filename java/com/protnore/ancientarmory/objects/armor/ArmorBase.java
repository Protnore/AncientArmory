package com.protnore.ancientarmory.objects.armor;

import com.protnore.ancientarmory.Main;
import com.protnore.ancientarmory.init.ItemInit;
import com.protnore.ancientarmory.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel
{
	public ArmorBase(String name, CreativeTabs ancientarmorytab, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		    super(materialIn, renderIndexIn, equipmentSlotIn);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.ancientarmorytab);
			
			ItemInit.ITEMS.add(this);	
		}
	
		@Override
		public void registerModels() 
		{
			Main.proxy.registerModel(this, 0);
		}
}
