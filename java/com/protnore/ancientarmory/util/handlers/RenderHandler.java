package com.protnore.ancientarmory.util.handlers;

import com.protnore.ancientarmory.entity.EntityAhrim;
import com.protnore.ancientarmory.entity.EntityDharok;
import com.protnore.ancientarmory.entity.EntityGuthan;
import com.protnore.ancientarmory.entity.EntityKaril;
import com.protnore.ancientarmory.entity.EntityTorag;
import com.protnore.ancientarmory.entity.EntityVerac;
import com.protnore.ancientarmory.entity.render.RenderAhrim;
import com.protnore.ancientarmory.entity.render.RenderDharok;
import com.protnore.ancientarmory.entity.render.RenderGuthan;
import com.protnore.ancientarmory.entity.render.RenderKaril;
import com.protnore.ancientarmory.entity.render.RenderTorag;
import com.protnore.ancientarmory.entity.render.RenderVerac;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void RegisterEntityRenders()
	
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityDharok.class, new IRenderFactory<EntityDharok>()
		
		{
			@Override
			public Render<? super EntityDharok> createRenderFor(RenderManager manager)
			{
				return new RenderDharok(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGuthan.class, new IRenderFactory<EntityGuthan>()
		{
			@Override
			public Render<? super EntityGuthan> createRenderFor(RenderManager manager)
			{
				return new RenderGuthan(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityAhrim.class, new IRenderFactory<EntityAhrim>()
		{
			@Override
			public Render<? super EntityAhrim> createRenderFor(RenderManager manager)
			{
				return new RenderAhrim(manager);
			}
		});

		RenderingRegistry.registerEntityRenderingHandler(EntityTorag.class, new IRenderFactory<EntityTorag>()
		{
			@Override
			public Render<? super EntityTorag> createRenderFor(RenderManager manager)
			{
				return new RenderTorag(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityKaril.class, new IRenderFactory<EntityKaril>()
		{
			@Override
			public Render<? super EntityKaril> createRenderFor(RenderManager manager)
			{
				return new RenderKaril(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityVerac.class, new IRenderFactory<EntityVerac>()
		{
			@Override
			public Render<? super EntityVerac> createRenderFor(RenderManager manager)
			{
				return new RenderVerac(manager);
			}
		});
		
	}
}
