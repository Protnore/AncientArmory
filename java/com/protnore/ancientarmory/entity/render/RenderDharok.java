package com.protnore.ancientarmory.entity.render;

import com.protnore.ancientarmory.entity.EntityDharok;
import com.protnore.ancientarmory.entity.model.ModelDharok;
import com.protnore.ancientarmory.util.Reference;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderDharok extends RenderLiving<EntityDharok>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/dharok.png");
	
	public RenderDharok(RenderManager manager) 
	{
		super(manager, new ModelDharok(), 0.5F);
		this.addLayer(new LayerHeldItem(this));
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityDharok entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityDharok entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	//partial visibility code
		@Override
		public void doRender(EntityDharok entity, double x, double y, double z, float entityYaw, float partialTicks) 
		{
			
		GlStateManager.pushMatrix();
		GlStateManager.enableAlpha();
		GlStateManager.enableBlend();
		GlStateManager.color(1.0F, 1.0F, 1.0F, 0.3F);

		super.doRender((EntityDharok) entity, x, y, z, partialTicks, partialTicks);

		GlStateManager.color(1.0F, 1.0F, 1.0F, 1F);
		GlStateManager.disableAlpha();
		GlStateManager.disableBlend();
		GlStateManager.popMatrix();
		}
}
