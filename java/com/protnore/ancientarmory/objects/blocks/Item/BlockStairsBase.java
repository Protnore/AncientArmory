package com.protnore.ancientarmory.objects.blocks.Item;

import com.protnore.ancientarmory.Main;
import com.protnore.ancientarmory.init.BlockInit;
import com.protnore.ancientarmory.init.ItemInit;
import com.protnore.ancientarmory.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockStairsBase extends BlockStairs implements IHasModel
{

	public BlockStairsBase(String name, IBlockState modelState, CreativeTabs tab, float Hardness, float Resistance, SoundType Sound) 
	{
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.useNeighborBrightness = true;
		setSoundType(SoundType.STONE);
		setBlockUnbreakable();
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		
	}
}
