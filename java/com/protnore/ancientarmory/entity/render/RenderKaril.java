package com.protnore.ancientarmory.entity.render;

import com.protnore.ancientarmory.entity.EntityDharok;
import com.protnore.ancientarmory.entity.EntityGuthan;
import com.protnore.ancientarmory.entity.EntityKaril;
import com.protnore.ancientarmory.entity.model.ModelDharok;
import com.protnore.ancientarmory.entity.model.ModelGuthan;
import com.protnore.ancientarmory.entity.model.ModelKaril;
import com.protnore.ancientarmory.util.Reference;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderKaril extends RenderLiving<EntityKaril>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/karil.png");
	
	public RenderKaril(RenderManager manager) 
	{
		super(manager, new ModelKaril(), 0.5F);
		this.addLayer(new LayerHeldItem(this));

	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityKaril entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityKaril entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	@Override
	public void doRender(EntityKaril entity, double x, double y, double z, float entityYaw, float partialTicks) 
	{
		
	GlStateManager.pushMatrix();
	GlStateManager.enableAlpha();
	GlStateManager.enableBlend();
	GlStateManager.color(1.0F, 1.0F, 1.0F, 0.3F);

	super.doRender((EntityKaril) entity, x, y, z, partialTicks, partialTicks);

	GlStateManager.color(1.0F, 1.0F, 1.0F, 1F);
	GlStateManager.disableAlpha();
	GlStateManager.disableBlend();
	GlStateManager.popMatrix();
	}
}
