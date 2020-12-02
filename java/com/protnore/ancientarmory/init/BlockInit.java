package com.protnore.ancientarmory.init;

import java.util.ArrayList;
import java.util.List;

import com.protnore.ancientarmory.Main;
import com.protnore.ancientarmory.blocks.Carved_Barrows_Brick;
import com.protnore.ancientarmory.blocks.Cracked_Barrows_Brick;
import com.protnore.ancientarmory.blocks.Dragon_Ore;
import com.protnore.ancientarmory.blocks.Mossy_Barrows_Brick;
import com.protnore.ancientarmory.blocks.Packed_Barrows_Dirt;
import com.protnore.ancientarmory.blocks.Rune_Ore;
import com.protnore.ancientarmory.objects.blocks.Item.BlockBase;
import com.protnore.ancientarmory.objects.blocks.Item.BlockStairsBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block DRAGON_ORE = new Dragon_Ore("dragon_ore", Material.ROCK);
	public static final Block RUNE_ORE = new Rune_Ore("rune_ore", Material.ROCK);
	public static final Block BARROWS_BRICK = new Cracked_Barrows_Brick("barrows_brick", Material.ROCK);
	public static final Block PACKED_BARROWS_DIRT = new Packed_Barrows_Dirt("packed_barrows_dirt", Material.GROUND);
	public static final Block CRACKED_BARROWS_BRICK = new Cracked_Barrows_Brick("cracked_barrows_brick", Material.ROCK);
	public static final Block CARVED_BARROWS_BRICK = new Carved_Barrows_Brick("carved_barrows_brick", Material.ROCK);
	public static final Block MOSSY_BARROWS_BRICK = new Mossy_Barrows_Brick("mossy_barrows_brick", Material.ROCK);
	public static final Block BARROWS_BRICK_STAIRS = new BlockStairsBase("barrows_brick_stairs", BlockInit.BARROWS_BRICK.getDefaultState(), Main.ancientarmorytab, 100, 100, null);
	public static final Block CRACKED_BARROWS_BRICK_STAIRS = new BlockStairsBase("cracked_barrows_brick_stairs", BlockInit.CRACKED_BARROWS_BRICK.getDefaultState(), Main.ancientarmorytab, 100, 100, null);
	public static final Block MOSSY_BARROWS_BRICK_STAIRS = new BlockStairsBase("mossy_barrows_brick_stairs", BlockInit.MOSSY_BARROWS_BRICK.getDefaultState(), Main.ancientarmorytab, 100, 100, null);
}






