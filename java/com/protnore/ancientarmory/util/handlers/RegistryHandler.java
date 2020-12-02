package com.protnore.ancientarmory.util.handlers;

import com.protnore.ancientarmory.init.BlockInit;
import com.protnore.ancientarmory.init.EntityInit;
import com.protnore.ancientarmory.init.ItemInit;
import com.protnore.ancientarmory.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) 
	{
		RenderHandler.RegisterEntityRenders();	
	}

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) 
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onItemRegister(ModelRegistryEvent event) 
	{
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
			((IHasModel)block).registerModels();
		    }
	    }

    }
	public static void preInitRegistries()
	{
	EntityInit.registerEntities();
	}
	public static void PostInitRegistries()	{}
}
