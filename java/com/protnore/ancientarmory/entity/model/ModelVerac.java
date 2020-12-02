package com.protnore.ancientarmory.entity.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class ModelVerac extends ModelBiped {
	private final ModelRenderer HeadBase;
	private final ModelRenderer PonytailTip;
	private final ModelRenderer Helmet;
	private final ModelRenderer LeftHelmSpike;
	private final ModelRenderer RightHelmSpike;
	private final ModelRenderer PonytailMid;
	private final ModelRenderer PonytailBase;
	private final ModelRenderer RightHelmBuckle;
	private final ModelRenderer LeftHelmBuckle;
	private final ModelRenderer BodyBase;
	private final ModelRenderer StrapBase;
	private final ModelRenderer TopStrap;
	private final ModelRenderer BackStrap;
	private final ModelRenderer FrontStrap;
	private final ModelRenderer LeftArmBase;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArmBase;
	private final ModelRenderer LeftLegBase;
	private final ModelRenderer LeftBoot;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer LeftLeg1;
	private final ModelRenderer LeftLeg2;
	private final ModelRenderer LeftLeg3;
	private final ModelRenderer RightLegBase;
	private final ModelRenderer RightBoot;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLeg3;
	private final ModelRenderer RightLeg1;
	private final ModelRenderer RightLeg2;

	public ModelVerac() {
		textureWidth = 128;
		textureHeight = 128;

		HeadBase = new ModelRenderer(this);
		HeadBase.setRotationPoint(0.0F, 0.0F, 0.0F);
		HeadBase.cubeList.add(new ModelBox(HeadBase, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		PonytailTip = new ModelRenderer(this);
		PonytailTip.setRotationPoint(1.0F, -5.0F, -9.0F);
		HeadBase.addChild(PonytailTip);
		PonytailTip.cubeList.add(new ModelBox(PonytailTip, 0, 36, -1.5F, -5.6F, 17.1F, 1, 5, 1, 0.0F, false));

		Helmet = new ModelRenderer(this);
		Helmet.setRotationPoint(-1.0F, -5.0F, 9.0F);
		HeadBase.addChild(Helmet);
		setRotationAngle(Helmet, 0.0F, 3.1416F, 0.0F);
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 54, -5.0F, -4.0F, 4.0F, 8, 10, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 52, 33, -5.0F, -4.0F, 13.0F, 8, 10, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 24, 0, -6.0F, -1.0F, 14.0F, 10, 5, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 16, 3.0F, -4.0F, 4.0F, 1, 10, 10, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 22, 22, -6.0F, -4.0F, 4.0F, 1, 10, 10, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 49, 49, -6.5F, 0.0F, 8.0F, 1, 3, 7, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 12, 16, 3.5F, 0.0F, 8.0F, 1, 3, 7, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 24, 8, -5.0F, -4.0F, 5.0F, 8, 1, 8, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 34, 29, -2.0F, -5.0F, 5.0F, 2, 1, 2, 0.0F, false));

		LeftHelmSpike = new ModelRenderer(this);
		LeftHelmSpike.setRotationPoint(4.0F, -9.0F, 0.0F);
		HeadBase.addChild(LeftHelmSpike);
		setRotationAngle(LeftHelmSpike, -0.3491F, 0.0F, 0.0F);
		LeftHelmSpike.cubeList.add(new ModelBox(LeftHelmSpike, 33, 17, -1.0F, -2.658F, -0.9397F, 1, 3, 1, 0.0F, false));

		RightHelmSpike = new ModelRenderer(this);
		RightHelmSpike.setRotationPoint(.0F, -9.0F, 0.0F);
		HeadBase.addChild(RightHelmSpike);
		setRotationAngle(RightHelmSpike, -0.3491F, 0.0F, 0.0F);
		RightHelmSpike.cubeList.add(new ModelBox(RightHelmSpike, 33, 17, -1.0F, -2.658F, -0.9397F, 1, 3, 1, 0.0F, false));

		PonytailMid = new ModelRenderer(this);
		PonytailMid.setRotationPoint(2.0F, -24.0F, -4.0F);
		HeadBase.addChild(PonytailMid);
		setRotationAngle(PonytailMid, -0.5672F, 0.0F, 0.0F);
		PonytailMid.cubeList.add(new ModelBox(PonytailMid, 57, 65, -3.0F, 3.7F, 13.3F, 2, 2, 5, 0.0F, false));

		PonytailBase = new ModelRenderer(this);
		PonytailBase.setRotationPoint(1.0F, -12.3963F, 4.0F);
		HeadBase.addChild(PonytailBase);
		setRotationAngle(PonytailBase, -2.3562F, 0.0F, 0.0F);
		PonytailBase.cubeList.add(new ModelBox(PonytailBase, 40, 17, -1.44F, -1.5037F, -0.5F, 1, 1, 3, 0.0F, false));

		RightHelmBuckle = new ModelRenderer(this);
		RightHelmBuckle.setRotationPoint(6.0F, -1.0F, -2.0F);
		HeadBase.addChild(RightHelmBuckle);
		setRotationAngle(RightHelmBuckle, 0.7854F, 0.0F, 0.0F);
		RightHelmBuckle.cubeList.add(new ModelBox(RightHelmBuckle, 0, 0, -1.25F, -0.8787F, 2.8284F, 1, 3, 3, 0.0F, false));

		LeftHelmBuckle = new ModelRenderer(this);
		LeftHelmBuckle.setRotationPoint(-5.0F, -1.0F, -2.0F);
		HeadBase.addChild(LeftHelmBuckle);
		setRotationAngle(LeftHelmBuckle, 0.7854F, 0.0F, 0.0F);
		LeftHelmBuckle.cubeList.add(new ModelBox(LeftHelmBuckle, 44, 33, -0.75F, -0.8787F, 2.8284F, 1, 3, 3, 0.0F, false));

		BodyBase = new ModelRenderer(this);
		BodyBase.setRotationPoint(0.0F, 7.0F, 0.0F);
		BodyBase.cubeList.add(new ModelBox(BodyBase, 0, 38, -4.0F, -7.0F, -2.0F, 8, 12, 4, 0.0F, false));

		StrapBase = new ModelRenderer(this);
		StrapBase.setRotationPoint(4.0F, 3.0F, -2.0F);
		BodyBase.addChild(StrapBase);
		StrapBase.cubeList.add(new ModelBox(StrapBase, 36, 61, -8.001F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));
		StrapBase.cubeList.add(new ModelBox(StrapBase, 42, 65, -8.001F, -1.0F, -0.001F, 1, 1, 1, 0.0F, false));
		StrapBase.cubeList.add(new ModelBox(StrapBase, 0, 2, -8.001F, -9.0F, -0.001F, 1, 1, 1, 0.0F, false));
		StrapBase.cubeList.add(new ModelBox(StrapBase, 39, 65, -8.001F, -1.0F, 3.001F, 1, 1, 1, 0.0F, false));
		StrapBase.cubeList.add(new ModelBox(StrapBase, 0, 2, -8.001F, -9.0F, 3.001F, 1, 1, 1, 0.0F, false));

		TopStrap = new ModelRenderer(this);
		TopStrap.setRotationPoint(-5.0F, -5.0F, 2.0F);
		BodyBase.addChild(TopStrap);
		setRotationAngle(TopStrap, 0.0F, 0.0F, 1.5708F);
		TopStrap.cubeList.add(new ModelBox(TopStrap, 28, 21, -1.0F, -10.0F, -0.999F, 1, 9, 1, 0.0F, false));
		TopStrap.cubeList.add(new ModelBox(TopStrap, 10, 72, -1.0F, -10.0F, -4.001F, 1, 9, 1, 0.0F, false));
		TopStrap.cubeList.add(new ModelBox(TopStrap, 0, 2, 6.999F, -2.0F, -4.0F, 1, 1, 4, 0.0F, false));

		BackStrap = new ModelRenderer(this);
		BackStrap.setRotationPoint(-4.0F, 4.0F, -3.0F);
		BodyBase.addChild(BackStrap);
		setRotationAngle(BackStrap, 0.0F, 0.0F, 0.7854F);
		BackStrap.cubeList.add(new ModelBox(BackStrap, 14, 72, -1.0F, -13.4142F, 0.999F, 1, 12, 1, 0.0F, false));

		FrontStrap = new ModelRenderer(this);
		FrontStrap.setRotationPoint(-4.0F, 4.0F, 2.0F);
		BodyBase.addChild(FrontStrap);
		setRotationAngle(FrontStrap, 0.0F, 0.0F, 0.7854F);
		FrontStrap.cubeList.add(new ModelBox(FrontStrap, 16, 72, -1.0F, -13.4142F, -0.999F, 1, 12, 1, 0.0F, false));

		LeftArmBase = new ModelRenderer(this);
		LeftArmBase.setRotationPoint(6.0F, 0.0F, 0.0F);
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 40, 40, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(0.0F, -6.0F, 2.0F);
		LeftArmBase.addChild(LeftArm);
		setRotationAngle(LeftArm, 0.0F, 3.1416F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 40, 70, -2.0F, 7.0F, 4.0F, 4, 8, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 65, -3.0F, 7.0F, 0.0F, 1, 8, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 34, 17, 2.0F, 7.0F, 0.0F, 1, 8, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 16, -2.0F, 7.0F, -1.0F, 4, 8, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 18, 54, -1.0F, 3.0F, -2.0F, 1, 6, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 12, 16, -3.0F, 5.0F, -2.0F, 2, 4, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 60, 21, -3.0F, 5.0F, -1.0F, 2, 1, 6, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 59, 55, -4.0F, 5.0F, -1.0F, 1, 4, 6, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 22, 26, -3.0F, 5.0F, 5.0F, 2, 4, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 60, 72, -1.0F, 3.0F, 5.0F, 1, 6, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 58, 10, -1.0F, 1.0F, -1.0F, 1, 5, 6, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 42, 56, -1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		RightArmBase = new ModelRenderer(this);
		RightArmBase.setRotationPoint(-6.0F, 0.0F, 0.0F);
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 44, 17, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		LeftLegBase = new ModelRenderer(this);
		LeftLegBase.setRotationPoint(-2.0F, 12.0F, 0.0F);
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 48, 0, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(2.0F, 12.0F, 2.0F);
		LeftLegBase.addChild(LeftBoot);
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 20, 70, 0.0F, -3.0F, -4.0F, 1, 3, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 70, 38, -4.0F, -3.0F, -5.0F, 4, 3, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 50, 70, -5.0F, -3.0F, -4.0F, 1, 3, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 72, 0, -4.0F, -3.0F, 0.0F, 4, 3, 1, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(2.0F, 1.0F, -2.0F);
		LeftLegBase.addChild(LeftLeg);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 48, 59, -5.855F, 1.786F, -1.0F, 1, 5, 6, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 69, 28, -5.0F, 1.78F, 4.86F, 5, 5, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 34, 56, 0.0F, -0.25F, -1.0F, 1, 7, 6, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 66, 9, -5.0F, 1.78F, -1.86F, 5, 5, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 82, -4.0F, -1.25F, 0.0F, 4, 1, 4, 0.0F, false));

		LeftLeg1 = new ModelRenderer(this);
		LeftLeg1.setRotationPoint(2.0F, 3.0F, -4.0F);
		LeftLegBase.addChild(LeftLeg1);
		setRotationAngle(LeftLeg1, -0.3054F, 0.0F, 0.0F);
		LeftLeg1.cubeList.add(new ModelBox(LeftLeg1, 70, 21, -5.0F, -3.25F, 0.07F, 5, 3, 1, 0.0F, false));

		LeftLeg2 = new ModelRenderer(this);
		LeftLeg2.setRotationPoint(-3.0F, 3.0F, -3.0F);
		LeftLegBase.addChild(LeftLeg2);
		setRotationAngle(LeftLeg2, 0.0F, 0.0F, 0.3054F);
		LeftLeg2.cubeList.add(new ModelBox(LeftLeg2, 26, 64, -0.88F, -2.945F, 0.0F, 1, 3, 6, 0.0F, false));

		LeftLeg3 = new ModelRenderer(this);
		LeftLeg3.setRotationPoint(2.0F, 3.0F, 3.0F);
		LeftLegBase.addChild(LeftLeg3);
		setRotationAngle(LeftLeg3, 0.3054F, 0.0F, 0.0F);
		LeftLeg3.cubeList.add(new ModelBox(LeftLeg3, 21, 17, -5.0F, -2.948F, -0.11F, 5, 3, 1, 0.0F, false));

		RightLegBase = new ModelRenderer(this);
		RightLegBase.setRotationPoint(2.0F, 12.0F, 0.0F);
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 24, 42, -6.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(3.0F, 12.0F, -2.0F);
		RightLegBase.addChild(RightBoot);
		RightBoot.cubeList.add(new ModelBox(RightBoot, 69, 61, -6.0F, -3.0F, 0.0F, 1, 3, 4, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 6, 65, -5.0F, -3.0F, 4.0F, 4, 3, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 60, 0, -5.0F, -3.0F, -1.0F, 4, 3, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 67, 68, -1.0F, -3.0F, 0.0F, 1, 3, 4, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(3.0F, 6.0F, 3.0F);
		RightLegBase.addChild(RightLeg);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 82, -5.0F, -6.25F, -5.0F, 4, 1, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 66, 44, -5.0F, -3.22F, -6.86F, 5, 5, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 58, 44, -0.14F, -3.23F, -6.0F, 1, 5, 6, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 18, 58, -6.0F, -5.25F, -6.0F, 1, 7, 6, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 67, 55, -5.0F, -3.22F, -0.14F, 5, 5, 1, 0.0F, false));

		RightLeg3 = new ModelRenderer(this);
		RightLeg3.setRotationPoint(3.0F, 3.0F, -4.0F);
		RightLegBase.addChild(RightLeg3);
		setRotationAngle(RightLeg3, -0.3054F, 0.0F, 0.0F);
		RightLeg3.cubeList.add(new ModelBox(RightLeg3, 70, 34, -5.0F, -3.25F, 0.07F, 5, 3, 1, 0.0F, false));

		RightLeg1 = new ModelRenderer(this);
		RightLeg1.setRotationPoint(3.0F, 3.0F, 3.0F);
		RightLegBase.addChild(RightLeg1);
		setRotationAngle(RightLeg1, 0.3054F, 0.0F, 0.0F);
		RightLeg1.cubeList.add(new ModelBox(RightLeg1, 26, 58, -5.0F, -2.948F, -0.11F, 5, 3, 1, 0.0F, false));

		RightLeg2 = new ModelRenderer(this);
		RightLeg2.setRotationPoint(4.0F, 3.0F, -3.0F);
		RightLegBase.addChild(RightLeg2);
		setRotationAngle(RightLeg2, 0.0F, 0.0F, -0.3054F);
		RightLeg2.cubeList.add(new ModelBox(RightLeg2, 64, 0, -1.065F, -3.25F, 0.0F, 1, 3, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		HeadBase.render(f5);
		BodyBase.render(f5);
		LeftArmBase.render(f5);
		RightArmBase.render(f5);
		LeftLegBase.render(f5);
		RightLegBase.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
    {
	this.LeftArmBase.rotateAngleX = MathHelper.cos(limbSwing * 1.4F) * 1.5F * limbSwingAmount;
	this.LeftLegBase.rotateAngleX = MathHelper.cos(limbSwing * 1.4F) * 1.5F * limbSwingAmount;
	this.RightArmBase.rotateAngleX = MathHelper.cos(limbSwing * 1.4F + (float)Math.PI) * 1.5F * limbSwingAmount;
	this.RightLegBase.rotateAngleX = MathHelper.cos(limbSwing * 1.4F + (float)Math.PI) * 1.5F * limbSwingAmount;
	this.HeadBase.rotateAngleY = netHeadYaw * 0.017453292F;
	this.HeadBase.rotateAngleX = headPitch * 0.017453292F;
    }
	@Override
	protected ModelRenderer getArmForSide(EnumHandSide side) 
	{
		return this.LeftArmBase;
	}
}