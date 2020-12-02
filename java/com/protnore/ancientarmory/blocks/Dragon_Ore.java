package com.protnore.ancientarmory.blocks;

import java.util.Random;

import com.protnore.ancientarmory.init.ItemInit;
import com.protnore.ancientarmory.objects.blocks.Item.BlockBase;
import com.protnore.ancientarmory.util.IHasModel;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class Dragon_Ore extends BlockBase implements IHasModel
{
	public Dragon_Ore(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(35.0f);
		setResistance(1200.0f);
		setHarvestLevel("pickaxe", 3);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
	return ItemInit.DRAGON_FRAGMENT;
	}
}
