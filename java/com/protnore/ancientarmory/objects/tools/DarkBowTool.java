package com.protnore.ancientarmory.objects.tools;

import com.protnore.ancientarmory.Main;
import com.protnore.ancientarmory.init.ItemInit;
import com.protnore.ancientarmory.tabs.AncientArmoryTab;
import com.protnore.ancientarmory.util.IHasModel;

import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class DarkBowTool extends ItemBow implements IHasModel
{
	public DarkBowTool(String name, ToolMaterial darkTool)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ancientarmorytab);
		setMaxDamage(20);
		setMaxStackSize(1);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public int getItemEnchantability()
	{
		return 10;
	}
	
	@Override
	public void setDamage(ItemStack stack, int damage)
	
	{
		return;
	}
	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
		
	}	
}
