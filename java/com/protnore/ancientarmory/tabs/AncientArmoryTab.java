package com.protnore.ancientarmory.tabs;

import com.protnore.ancientarmory.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class AncientArmoryTab extends CreativeTabs 
{
	public AncientArmoryTab(String label) { super("ancientarmorytab");
	this.setBackgroundImageName("ancientarmory.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.GODSWORD_BLADE);}
}


