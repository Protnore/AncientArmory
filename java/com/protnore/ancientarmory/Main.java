package com.protnore.ancientarmory;

import com.protnore.ancientarmory.world.ModWorldGen;
import com.protnore.ancientarmory.proxy.CommonProxy;
import com.protnore.ancientarmory.tabs.AncientArmoryTab;
import com.protnore.ancientarmory.util.Reference;
import com.protnore.ancientarmory.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class Main 
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;

	{
	GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	
	public static final CreativeTabs ancientarmorytab = new AncientArmoryTab("ancientarmorytab");

	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {}
	@EventHandler
	 public static void PreInit(FMLPreInitializationEvent event)
	 {
	  RegistryHandler.preInitRegistries();
	 }
	@EventHandler
	public static void init(FMLInitializationEvent event) {}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
}
