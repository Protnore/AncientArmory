package com.protnore.ancientarmory.blocks;

import java.util.ArrayList;
import java.util.List;

import com.protnore.ancientarmory.objects.blocks.Item.BlockBase;
import com.protnore.ancientarmory.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Barrows_Brick extends BlockBase implements IHasModel

{
	public Barrows_Brick(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setResistance(10.0f);
		setBlockUnbreakable();
	}






}
