package com.protnore.ancientarmory.objects.tools;

import com.protnore.ancientarmory.Main;
import com.protnore.ancientarmory.init.ItemInit;
import com.protnore.ancientarmory.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade implements IHasModel
{
	public ToolShovel(String name, ToolMaterial material)
	{
		super(material);
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
