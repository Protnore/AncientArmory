package com.protnore.ancientarmory.entity.render;

import com.protnore.ancientarmory.entity.EntityGuthan;
import com.protnore.ancientarmory.entity.EntityVerac;
import com.protnore.ancientarmory.entity.model.ModelGuthan;
import com.protnore.ancientarmory.entity.model.ModelVerac;
import com.protnore.ancientarmory.util.Reference;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderVerac extends RenderLiving<EntityVerac>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/verac.png");
	
	public RenderVerac(RenderManager manager) 
	{
		super(manager, new ModelVerac(), 0.5F);
		this.addLayer(new LayerHeldItem(this));

	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityVerac entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityVerac entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	@Override
	public void doRender(EntityVerac entity, double x, double y, double z, float entityYaw, float partialTicks) 
	{
		
	GlStateManager.pushMatrix();
	GlStateManager.enableAlpha();
	GlStateManager.enableBlend();
	GlStateManager.color(1.0F, 1.0F, 1.0F, 0.3F);

	super.doRender((EntityVerac) entity, x, y, z, partialTicks, partialTicks);

	GlStateManager.color(1.0F, 1.0F, 1.0F, 1F);
	GlStateManager.disableAlpha();
	GlStateManager.disableBlend();
	GlStateManager.popMatrix();
	}
}
