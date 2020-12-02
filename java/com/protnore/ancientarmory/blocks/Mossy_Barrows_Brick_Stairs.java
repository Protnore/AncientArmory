package com.protnore.ancientarmory.blocks;

import java.util.ArrayList;
import java.util.List;

import com.protnore.ancientarmory.objects.blocks.Item.BlockBase;
import com.protnore.ancientarmory.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

public class Mossy_Barrows_Brick_Stairs extends BlockStairs
{
	public Mossy_Barrows_Brick_Stairs(String name, IBlockState modelState) 
	{
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.useNeighborBrightness = true;
		setSoundType(SoundType.STONE);
		setResistance(10.0f);
		setBlockUnbreakable();
	}
}
