package com.protnore.ancientarmory.objects.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.1
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Dragon_Armor extends ModelBiped {
	
	public final ModelRenderer Helmet;
	public final ModelRenderer LeftHelmSpike_r1;
	public final ModelRenderer RightHelmSpike_r1;
	public final ModelRenderer RightHelmSpike;
	public final ModelRenderer LeftHelmSpike;
	public final ModelRenderer Chainmail;
	public final ModelRenderer LeftArm;
	public final ModelRenderer LeftShoulderSpike_r1;
	public final ModelRenderer LeftShoulderSpike;
	public final ModelRenderer RightArm;
	public final ModelRenderer RightShoulderSpike_r1;
	public final ModelRenderer RightShoulderSpike;
	public final ModelRenderer LeftLeg;
	public final ModelRenderer RightLeg;
	public final ModelRenderer LeftBoot;
	public final ModelRenderer LeftBootSpike_r1;
	public final ModelRenderer LeftBootSpike;
	public final ModelRenderer RightBoot;
	public final ModelRenderer RightBootSpike_r1;
	public final ModelRenderer RightBootSpike;

	public Dragon_Armor() {
		
		textureWidth = 1024;
		textureHeight = 1024;

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

		LeftHelmSpike_r1 = new ModelRenderer(this);
		LeftHelmSpike_r1.setRotationPoint(5.0F, -31.0F, -1.0F);
		Helmet.addChild(LeftHelmSpike_r1);
		setRotationAngle(LeftHelmSpike_r1, 0.0F, 0.0F, 0.6545F);
		
		RightHelmSpike_r1 = new ModelRenderer(this);
		RightHelmSpike_r1.setRotationPoint(-5.0F, -31.0F, -1.0F);
		Helmet.addChild(RightHelmSpike_r1);
		setRotationAngle(RightHelmSpike_r1, 0.0F, 0.0F, -0.6545F);
		
		RightHelmSpike = new ModelRenderer(this);
		RightHelmSpike.setRotationPoint(-5.0F, -31.0F, -1.0F);
		Helmet.addChild(RightHelmSpike);
		setRotationAngle(RightHelmSpike, 0.0F, 0.0F, -0.6545F);
		RightHelmSpike.cubeList.add(new ModelBox(RightHelmSpike, 56, 0, 0.0F, -4.0F, 0.0F, 2, 4, 2, 0.0F, false));
		RightHelmSpike.cubeList.add(new ModelBox(RightHelmSpike, 36, 34, 0.5F, -6.0F, 0.5F, 1, 4, 1, 0.0F, false));

		LeftHelmSpike = new ModelRenderer(this);
		LeftHelmSpike.setRotationPoint(5.0F, -31.0F, -1.0F);
		Helmet.addChild(LeftHelmSpike);
		setRotationAngle(LeftHelmSpike, 0.0F, 0.0F, 0.6545F);
		LeftHelmSpike.cubeList.add(new ModelBox(LeftHelmSpike, 0, 11, -2.0F, -4.0F, 0.0F, 2, 4, 2, 0.0F, false));
		LeftHelmSpike.cubeList.add(new ModelBox(LeftHelmSpike, 10, 41, -1.5F, -6.0F, 0.5F, 1, 4, 1, 0.0F, false));

		Chainmail = new ModelRenderer(this);
		Chainmail.setRotationPoint(0.0F, 24.0F, 0.0F);
		Chainmail.cubeList.add(new ModelBox(Chainmail, 0, 28, -4.0F, -24.0F, -3.0F, 8, 12, 1, 0.0F, false));
		Chainmail.cubeList.add(new ModelBox(Chainmail, 18, 35, -4.0F, -24.0F, 2.0F, 8, 12, 1, 0.0F, false));
		Chainmail.cubeList.add(new ModelBox(Chainmail, 0, 41, 4.0F, -21.0F, -2.0F, 1, 9, 4, 0.0F, false));
		Chainmail.cubeList.add(new ModelBox(Chainmail, 36, 36, -5.0F, -21.0F, -2.0F, 1, 9, 4, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(0.0F, 24.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 28, 21, -1.0F, -26.0F, -3.0F, 4, 3, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 52, 17, -1.0F, -26.0F, 2.0F, 4, 3, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 30, 0, -1.0F, -27.0F, -2.0F, 4, 1, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 30, 48, 3.0F, -26.0F, -2.0F, 1, 3, 4, 0.0F, false));

		LeftShoulderSpike_r1 = new ModelRenderer(this);
		LeftShoulderSpike_r1.setRotationPoint(7.0F, -25.0F, -0.5F);
		LeftArm.addChild(LeftShoulderSpike_r1);
		setRotationAngle(LeftShoulderSpike_r1, 0.0F, 0.0F, 0.48F);
		
		LeftShoulderSpike = new ModelRenderer(this);
		LeftShoulderSpike.setRotationPoint(7.0F, -25.0F, -0.5F);
		LeftArm.addChild(LeftShoulderSpike);
		setRotationAngle(LeftShoulderSpike, 0.0F, 0.0F, 0.48F);
		LeftShoulderSpike.cubeList.add(new ModelBox(LeftShoulderSpike, 0, 41, -6.4086F, -0.9653F, 0.0F, 1, 2, 1, 0.0F, false));
		LeftShoulderSpike.cubeList.add(new ModelBox(LeftShoulderSpike, 46, 41, -6.9086F, 0.3047F, -0.5F, 2, 3, 2, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.0F, 22.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 56, 10, -8.0F, -24.0F, -3.0F, 4, 3, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 50, 10, -9.0F, -24.0F, -2.0F, 1, 3, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 56, 6, -8.0F, -24.0F, 2.0F, 4, 3, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 10, 11, -8.0F, -25.0F, -2.0F, 4, 1, 4, 0.0F, false));

		RightShoulderSpike_r1 = new ModelRenderer(this);
		RightShoulderSpike_r1.setRotationPoint(-6.0F, -24.0F, -1.0F);
		RightArm.addChild(RightShoulderSpike_r1);
		setRotationAngle(RightShoulderSpike_r1, 0.0F, 0.0F, -0.48F);
		
		RightShoulderSpike = new ModelRenderer(this);
		RightShoulderSpike.setRotationPoint(-6.0F, -24.0F, -1.0F);
		RightArm.addChild(RightShoulderSpike);
		setRotationAngle(RightShoulderSpike, 0.0F, 0.0F, -0.48F);
		RightShoulderSpike.cubeList.add(new ModelBox(RightShoulderSpike, 0, 57, -1.0F, -1.645F, 0.0F, 2, 3, 2, 0.0F, false));
		RightShoulderSpike.cubeList.add(new ModelBox(RightShoulderSpike, 14, 41, -0.5F, -2.8419F, 0.5F, 1, 2, 1, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 66, 0, 0.0F, -12.1F, -2.0F, 4, 1, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 36, 21, 4.0F, -12.0F, -2.0F, 1, 9, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 0, 0.0F, -12.0F, 2.0F, 4, 9, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 46, 30, 0.0F, -12.0F, -3.0F, 4, 9, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 46, 17, -1.0F, -12.0F, -2.0F, 1, 9, 4, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 46, 46, 0.0F, -12.0F, -2.0F, 1, 9, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 20, 48, -4.0F, -12.0F, -3.0F, 4, 9, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 10, 44, -5.0F, -12.0F, -2.0F, 1, 9, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 46, 0, -4.0F, -12.0F, 2.0F, 4, 9, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 66, 0, -4.0F, -12.1F, -2.0F, 4, 1, 4, 0.0F, false));

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(-2.0F, 12.0F, 0.0F);
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 36, 52, 4.0F, -3.0F, -2.0F, 1, 3, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 56, 21, 0.0F, -3.0F, -3.0F, 4, 3, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 52, 36, -1.0F, -3.0F, -2.0F, 1, 3, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 56, 25, 0.0F, -3.0F, 2.0F, 4, 3, 1, 0.0F, false));

		LeftBootSpike_r1 = new ModelRenderer(this);
		LeftBootSpike_r1.setRotationPoint(2.5F, -1.8F, -4.5F);
		LeftBoot.addChild(LeftBootSpike_r1);
		setRotationAngle(LeftBootSpike_r1, -0.48F, 0.0F, 0.0F);
		
		LeftBootSpike = new ModelRenderer(this);
		LeftBootSpike.setRotationPoint(2.5F, -1.8F, -4.5F);
		LeftBoot.addChild(LeftBootSpike);
		setRotationAngle(LeftBootSpike, -0.48F, 0.0F, 0.0F);
		LeftBootSpike.cubeList.add(new ModelBox(LeftBootSpike, 10, 16, -1.0F, -0.86F, 0.43F, 1, 1, 2, 0.0F, false));

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(2.0F, 12.0F, 0.0F);
		RightBoot.cubeList.add(new ModelBox(RightBoot, 52, 43, 0.0F, -3.0F, -2.0F, 1, 3, 4, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 56, 29, -4.0F, -3.0F, -3.0F, 4, 3, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 26, 55, -5.0F, -3.0F, -2.0F, 1, 3, 4, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 56, 50, -4.0F, -3.0F, 2.0F, 4, 3, 1, 0.0F, false));

		RightBootSpike_r1 = new ModelRenderer(this);
		RightBootSpike_r1.setRotationPoint(-1.9F, -1.0F, -5.0F);
		RightBoot.addChild(RightBootSpike_r1);
		setRotationAngle(RightBootSpike_r1, -0.48F, 0.0F, 0.0F);
		
		RightBootSpike = new ModelRenderer(this);
		RightBootSpike.setRotationPoint(-1.9F, -1.0F, -5.0F);
		RightBoot.addChild(RightBootSpike);
		setRotationAngle(RightBootSpike, -0.48F, 0.0F, 0.0F);
		RightBootSpike.cubeList.add(new ModelBox(RightBootSpike, 22, 11, -0.6F, -1.8F, 0.5F, 1, 1, 2, 0.0F, false));
	
		this.bipedHead.addChild(Helmet);
		this.bipedBody.addChild(Chainmail);
		this.bipedLeftArm.addChild(LeftArm);
		this.bipedRightArm.addChild(RightArm);
		this.bipedRightLeg.addChild(RightLeg);
		this.bipedLeftLeg.addChild(LeftLeg);
		this.bipedRightLeg.addChild(RightBoot);
		this.bipedLeftLeg.addChild(LeftBoot);
		
}
@Override
public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
super.render(entity, f, f1, f2, f3, f4, f5);
}
public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}