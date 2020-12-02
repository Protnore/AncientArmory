package com.protnore.ancientarmory.objects.items.models;
// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Dragon_Helmet extends ModelBiped 

{
	
	private final ModelRenderer Player;
	private final ModelRenderer RightHelmetSpike;
	private final ModelRenderer LeftHelmetSpike;
	private final ModelRenderer Helmet;

	public Dragon_Helmet() 
	
	{
		
		textureWidth = 128;
		textureHeight = 128;

		Player = new ModelRenderer(this);
		Player.setRotationPoint(0.0F, 24.0F, -2.0F);
		Player.cubeList.add(new ModelBox(Player, 0, 112, -4.0F, -32.0F, -2.0F, 8, 8, 8, 0.0F, false));
		Player.cubeList.add(new ModelBox(Player, 0, 112, -4.0F, -24.0F, 0.0F, 8, 12, 4, 0.0F, false));
		Player.cubeList.add(new ModelBox(Player, 0, 112, 4.0F, -24.0F, 0.0F, 4, 12, 4, 0.0F, false));
		Player.cubeList.add(new ModelBox(Player, 0, 112, 0.0F, -12.0F, 0.0F, 4, 12, 4, 0.0F, false));
		Player.cubeList.add(new ModelBox(Player, 0, 112, -8.0F, -24.0F, 0.0F, 4, 12, 4, 0.0F, false));
		Player.cubeList.add(new ModelBox(Player, 0, 112, -4.0F, -12.0F, 0.0F, 4, 12, 4, 0.0F, false));

		RightHelmetSpike = new ModelRenderer(this);
		RightHelmetSpike.setRotationPoint(-5.0F, -7.0F, -1.0F);
		setRotationAngle(RightHelmetSpike, 0.0F, 0.0F, -0.6545F);
		RightHelmetSpike.cubeList.add(new ModelBox(RightHelmetSpike, 56, 0, 0.0F, -4.0F, 0.0F, 2, 4, 2, 0.0F, false));
		RightHelmetSpike.cubeList.add(new ModelBox(RightHelmetSpike, 36, 34, 0.5F, -6.0F, 0.5F, 1, 4, 1, 0.0F, false));

		LeftHelmetSpike = new ModelRenderer(this);
		LeftHelmetSpike.setRotationPoint(5.0F, -7.0F, -1.0F);
		setRotationAngle(LeftHelmetSpike, 0.0F, 0.0F, 0.6545F);
		LeftHelmetSpike.cubeList.add(new ModelBox(LeftHelmetSpike, 0, 11, -2.0F, -4.0F, 0.0F, 2, 4, 2, 0.0F, false));
		LeftHelmetSpike.cubeList.add(new ModelBox(LeftHelmetSpike, 10, 41, -1.5F, -6.0F, 0.5F, 1, 4, 1, 0.0F, false));

		Helmet = new ModelRenderer(this);
		Helmet.setRotationPoint(0.0F, 24.0F, 0.0F);
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 0, -5.0F, -33.0F, -5.0F, 10, 1, 10, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 28, 11, -5.0F, -32.0F, 4.0F, 10, 9, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 18, 18, 4.0F, -32.0F, -4.0F, 1, 9, 8, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 56, 56, 3.0F, -32.0F, -5.0F, 2, 9, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 18, 16, -5.0F, -32.0F, -5.0F, 2, 9, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 8, 57, -3.0F, -27.0F, -5.0F, 1, 4, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 42, 34, 2.0F, -27.0F, -5.0F, 1, 4, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 30, 0, 1.0F, -26.0F, -5.0F, 1, 3, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 10, 11, -2.0F, -26.0F, -5.0F, 1, 3, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 30, 5, -3.0F, -32.0F, -5.0F, 6, 3, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 6, 41, -0.5F, -29.0F, -5.0F, 1, 2, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 11, -5.0F, -32.0F, -4.0F, 1, 9, 8, 0.0F, false));
		
		
		this.bipedHead.addChild(Helmet);
		this.bipedHead.addChild(RightHelmetSpike);
		this.bipedHead.addChild(LeftHelmetSpike);

		
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
	
	{
		
		super.render(entity, f, f1, f2, f3, f4, f5);
		
	}
	
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z)
	
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}