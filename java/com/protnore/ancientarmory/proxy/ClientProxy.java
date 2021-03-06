package com.protnore.ancientarmory.proxy;

import com.protnore.ancientarmory.util.Reference;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy 
{
	@Override
	public void registerModel(Item item, int metadata) 
	{
		ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(item.getRegistryName(), "inventory"));	
	}
	
	//@Override
	//public void registerVariantRenderer(Item item, int meta, String filename, String id)
	{
		//ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, filename), id));
	}
}
