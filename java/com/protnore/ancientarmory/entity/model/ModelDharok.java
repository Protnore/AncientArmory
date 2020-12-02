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


public class ModelDharok extends ModelBiped 
{
	private final ModelRenderer HeadBase;
	private final ModelRenderer Helmet;
	private final ModelRenderer BodyBase;
	private final ModelRenderer ChestTopSpike;
	private final ModelRenderer ChestBottomSpike;
	private final ModelRenderer Chest;
	private final ModelRenderer Chest_r1;
	private final ModelRenderer LeftArmBase;
	private final ModelRenderer LeftArmTopSpike;
	private final ModelRenderer LeftArmBottomSpike;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArmBase;
	private final ModelRenderer RightArmTopSpike1;
	private final ModelRenderer RightArmTopSpike2;
	private final ModelRenderer RightArmBottomSpike1;
	private final ModelRenderer RightArmBottomSpike2;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftLegBase;
	private final ModelRenderer LeftKneeCap;
	private final ModelRenderer LeftKneeCapTip;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer LeftBoot;
	private final ModelRenderer RightLegBase;
	private final ModelRenderer RightKneeCap;
	private final ModelRenderer RightKneeCapTip;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightBoot;

	public ModelDharok() {
		textureWidth = 1024;
		textureHeight = 1024;

		HeadBase = new ModelRenderer(this);
		HeadBase.setRotationPoint(0.0F, 0.0F, 0.0F);
		HeadBase.cubeList.add(new ModelBox(HeadBase, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		Helmet = new ModelRenderer(this);
		Helmet.setRotationPoint(-1.0F, -9.0F, -4.0F);
		HeadBase.addChild(Helmet);
		setRotationAngle(Helmet, 0.0F, 3.1416F, 0.0F);
		Helmet.cubeList.add(new ModelBox(Helmet, 20, 58, 2.0F, 1.0F, 0.0F, 2, 9, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 46, 40, -4.0F, 6.0F, 0.0F, 2, 4, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 11, 0.0F, 6.0F, 0.0F, 2, 4, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 30, 5, -4.0F, 1.0F, 0.0F, 6, 3, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 24, 16, -1.5F, 4.0F, 0.0F, 1, 1, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 18, 16, -6.0F, 1.0F, 0.0F, 2, 9, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 11, -6.0F, 1.0F, -8.0F, 1, 9, 8, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 28, 11, -6.0F, 1.0F, -9.0F, 10, 9, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 18, 18, 3.0F, 1.0F, -8.0F, 1, 9, 8, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 0, -6.0F, 0.0F, -9.0F, 10, 1, 10, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 42, 0, -1.5F, -2.0F, -4.5F, 1, 2, 1, 0.0F, false));

		BodyBase = new ModelRenderer(this);
		BodyBase.setRotationPoint(0.0F, 24.0F, 0.0F);
		BodyBase.cubeList.add(new ModelBox(BodyBase, 0, 0, -4.0F, -24.0F, -2.0F, 8, 12, 4, 0.0F, false));

		ChestTopSpike = new ModelRenderer(this);
		ChestTopSpike.setRotationPoint(0.0F, -17.0F, -5.0F);
		BodyBase.addChild(ChestTopSpike);
		setRotationAngle(ChestTopSpike, -0.5236F, 0.0F, 0.0F);
		ChestTopSpike.cubeList.add(new ModelBox(ChestTopSpike, 42, 8, -0.5F, -1.0F, 0.5F, 1, 1, 2, 0.0F, false));

		ChestBottomSpike = new ModelRenderer(this);
		ChestBottomSpike.setRotationPoint(0.0F, -14.0F, -5.0F);
		BodyBase.addChild(ChestBottomSpike);
		setRotationAngle(ChestBottomSpike, 0.5236F, 0.0F, 0.0F);
		ChestBottomSpike.cubeList.add(new ModelBox(ChestBottomSpike, 44, 62, -0.5F, 0.0F, 0.5F, 1, 1, 2, 0.0F, false));

		Chest = new ModelRenderer(this);
		Chest.setRotationPoint(-12.0F, -12.0F, -6.0F);
		BodyBase.addChild(Chest);
		setRotationAngle(Chest, 0.0F, 3.1416F, 0.0F);
		

		Chest_r1 = new ModelRenderer(this);
		Chest_r1.setRotationPoint(-4.0F, 12.0F, -2.0F);
		Chest.addChild(Chest_r1);
		setRotationAngle(Chest_r1, 0.0F, 3.1416F, 0.0F);
		Chest_r1.cubeList.add(new ModelBox(Chest_r1, 36, 36, 3.0F, -24.0F, 2.0F, 1, 12, 4, 0.0F, false));
		Chest_r1.cubeList.add(new ModelBox(Chest_r1, 0, 28, 4.0F, -24.0F, 1.0F, 8, 12, 1, 0.0F, false));
		Chest_r1.cubeList.add(new ModelBox(Chest_r1, 0, 41, 12.0F, -24.0F, 2.0F, 1, 12, 4, 0.0F, false));
		Chest_r1.cubeList.add(new ModelBox(Chest_r1, 18, 35, 4.0F, -24.0F, 6.0F, 8, 12, 1, 0.0F, false));

		LeftArmBase = new ModelRenderer(this);
		LeftArmBase.setRotationPoint(4.0F, 1.0F, 0.0F);
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 0, 0, 0.0F, -1.0F, -2.0F, 4, 12, 4, 0.0F, false));

		LeftArmTopSpike = new ModelRenderer(this);
		LeftArmTopSpike.setRotationPoint(7.0F, 6.0F, -0.5F);
		LeftArmBase.addChild(LeftArmTopSpike);
		setRotationAngle(LeftArmTopSpike, 0.0F, 0.0F, -0.7854F);
		LeftArmTopSpike.cubeList.add(new ModelBox(LeftArmTopSpike, 58, 38, -1.3858F, -2.6642F, 0.0F, 2, 1, 1, 0.0F, false));

		LeftArmBottomSpike = new ModelRenderer(this);
		LeftArmBottomSpike.setRotationPoint(7.0F, 8.0F, -0.5F);
		LeftArmBase.addChild(LeftArmBottomSpike);
		setRotationAngle(LeftArmBottomSpike, 0.0F, 0.0F, 0.7854F);
		LeftArmBottomSpike.cubeList.add(new ModelBox(LeftArmBottomSpike, 62, 26, -2.8F, 0.25F, 0.0F, 2, 1, 1, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(4.0F, 2.0F, 1.0F);
		LeftArmBase.addChild(LeftArm);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 52, 36, 0.0F, 2.0F, -3.0F, 1, 4, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 58, 33, -4.0F, 2.0F, 1.0F, 4, 4, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 52, 55, -5.0F, 2.0F, -3.0F, 1, 4, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 58, 54, -4.0F, 2.0F, -4.0F, 4, 4, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 56, 0, -4.0F, -3.0F, -4.0F, 5, 3, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 30, 0, -3.0F, -4.0F, -3.0F, 4, 1, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 28, 21, -4.0F, -3.0F, 1.0F, 5, 3, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 26, 56, 1.0F, -3.0F, -3.0F, 1, 3, 4, 0.0F, false));

		RightArmBase = new ModelRenderer(this);
		RightArmBase.setRotationPoint(-4.0F, 0.0F, 0.0F);
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 0, 0, -4.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		RightArmTopSpike1 = new ModelRenderer(this);
		RightArmTopSpike1.setRotationPoint(-3.0F, -1.0F, -2.0F);
		RightArmBase.addChild(RightArmTopSpike1);
		setRotationAngle(RightArmTopSpike1, 0.0F, 0.0F, -0.7854F);
		RightArmTopSpike1.cubeList.add(new ModelBox(RightArmTopSpike1, 24, 11, -2.0F, -4.0F, 0.25F, 1, 3, 1, 0.0F, false));

		RightArmTopSpike2 = new ModelRenderer(this);
		RightArmTopSpike2.setRotationPoint(-3.0F, -1.0F, 1.0F);
		RightArmBase.addChild(RightArmTopSpike2);
		setRotationAngle(RightArmTopSpike2, 0.0F, 0.0F, -0.7854F);
		RightArmTopSpike2.cubeList.add(new ModelBox(RightArmTopSpike2, 10, 11, -2.0F, -4.0F, -0.25F, 1, 3, 1, 0.0F, false));

		RightArmBottomSpike1 = new ModelRenderer(this);
		RightArmBottomSpike1.setRotationPoint(-5.0F, 0.5F, -3.0F);
		RightArmBase.addChild(RightArmBottomSpike1);
		setRotationAngle(RightArmBottomSpike1, 0.0F, -0.7854F, 0.0F);
		RightArmBottomSpike1.cubeList.add(new ModelBox(RightArmBottomSpike1, 6, 43, -2.0F, -1.0F, 0.25F, 3, 1, 1, 0.0F, false));

		RightArmBottomSpike2 = new ModelRenderer(this);
		RightArmBottomSpike2.setRotationPoint(-5.0F, 0.5F, 3.0F);
		RightArmBase.addChild(RightArmBottomSpike2);
		setRotationAngle(RightArmBottomSpike2, 0.0F, 0.7854F, 0.0F);
		RightArmBottomSpike2.cubeList.add(new ModelBox(RightArmBottomSpike2, 52, 19, -2.0F, -1.0F, -1.25F, 3, 1, 1, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-3.0F, 9.0F, -2.0F);
		RightArmBase.addChild(RightArm);
		RightArm.cubeList.add(new ModelBox(RightArm, 52, 44, -2.0F, -10.0F, 4.0F, 5, 4, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 10, 11, -2.0F, -11.0F, 0.0F, 5, 1, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 52, 14, -2.0F, -10.0F, -1.0F, 5, 4, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 36, 52, 3.0F, -4.0F, 0.0F, 1, 4, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 56, 49, -1.0F, -4.0F, -1.0F, 4, 4, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 58, 4, -1.0F, -4.0F, 4.0F, 4, 4, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 52, 6, -2.0F, -4.0F, 0.0F, 1, 4, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 30, 48, -3.0F, -10.0F, 0.0F, 1, 4, 4, 0.0F, false));

		LeftLegBase = new ModelRenderer(this);
		LeftLegBase.setRotationPoint(2.0F, 12.0F, 0.0F);
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 0, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		LeftKneeCap = new ModelRenderer(this);
		LeftKneeCap.setRotationPoint(-4.0F, 4.6F, -1.55F);
		LeftLegBase.addChild(LeftKneeCap);
		setRotationAngle(LeftKneeCap, 0.7854F, 0.0F, 0.0F);
		LeftKneeCap.cubeList.add(new ModelBox(LeftKneeCap, 6, 41, 2.0003F, -1.6F, -1.45F, 4, 1, 1, 0.0F, false));
		LeftKneeCap.cubeList.add(new ModelBox(LeftKneeCap, 10, 16, 2.5F, -2.6F, -1.45F, 3, 1, 1, 0.0F, false));
		LeftKneeCap.cubeList.add(new ModelBox(LeftKneeCap, 46, 59, 3.0F, -1.5858F, -0.7429F, 2, 2, 1, 0.0F, false));
		LeftKneeCap.cubeList.add(new ModelBox(LeftKneeCap, 0, 41, 3.5F, -3.0F, -2.1571F, 1, 2, 1, 0.0F, false));
		LeftKneeCap.cubeList.add(new ModelBox(LeftKneeCap, 0, 41, 3.5F, -3.7071F, -1.45F, 1, 2, 1, 0.0F, false));

		LeftKneeCapTip = new ModelRenderer(this);
		LeftKneeCapTip.setRotationPoint(1.0F, 2.0F, -11.0F);
		LeftLegBase.addChild(LeftKneeCapTip);
		LeftKneeCapTip.cubeList.add(new ModelBox(LeftKneeCapTip, 36, 36, -1.5F, 0.0F, 5.803F, 1, 2, 1, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 9.0F, -2.0F);
		LeftLegBase.addChild(LeftLeg);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 46, 30, 0.0F, -9.0F, -1.0F, 4, 9, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 36, 21, 4.0F, -9.0F, 0.0F, 1, 9, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 0, 0.0F, -9.0F, 4.0F, 4, 9, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 46, 17, -1.0F, -9.0F, 0.0F, 1, 9, 4, 0.0F, false));

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(2.0F, 12.0F, 2.0F);
		LeftLegBase.addChild(LeftBoot);
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 56, 26, -5.0F, -3.0F, -4.0F, 1, 3, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 36, 60, -4.0F, -3.0F, -5.0F, 4, 3, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 56, 19, 0.0F, -3.0F, -4.0F, 1, 3, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 61, 62, -4.0F, -3.0F, 0.0F, 4, 3, 1, 0.0F, false));

		RightLegBase = new ModelRenderer(this);
		RightLegBase.setRotationPoint(-2.0F, 12.0F, 0.0F);
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 0, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		RightKneeCap = new ModelRenderer(this);
		RightKneeCap.setRotationPoint(0.0F, 3.6F, -1.55F);
		RightLegBase.addChild(RightKneeCap);
		setRotationAngle(RightKneeCap, 0.7854F, 0.0F, 0.0F);
		RightKneeCap.cubeList.add(new ModelBox(RightKneeCap, 35, 34, -2.003F, -0.8929F, -2.1571F, 4, 1, 1, 0.0F, false));
		RightKneeCap.cubeList.add(new ModelBox(RightKneeCap, 0, 16, -1.5F, -1.8929F, -2.1571F, 3, 1, 1, 0.0F, false));
		RightKneeCap.cubeList.add(new ModelBox(RightKneeCap, 6, 57, -1.0F, -0.8787F, -1.45F, 2, 2, 1, 0.0F, false));
		RightKneeCap.cubeList.add(new ModelBox(RightKneeCap, 30, 0, -0.5F, -3.0F, -2.1571F, 1, 2, 1, 0.0F, false));
		RightKneeCap.cubeList.add(new ModelBox(RightKneeCap, 30, 0, -0.5F, -2.3F, -2.8642F, 1, 2, 1, 0.0F, false));

		RightKneeCapTip = new ModelRenderer(this);
		RightKneeCapTip.setRotationPoint(1.0F, 2.0F, -11.0F);
		RightLegBase.addChild(RightKneeCapTip);
		RightKneeCapTip.cubeList.add(new ModelBox(RightKneeCapTip, 36, 36, -1.5F, 0.0F, 5.803F, 1, 2, 1, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 7.0F, -5.0F);
		RightLegBase.addChild(RightLeg);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 46, 46, 0.0F, -7.0F, 3.0F, 1, 9, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 20, 48, -4.0F, -7.0F, 2.0F, 4, 9, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 10, 44, -5.0F, -7.0F, 3.0F, 1, 9, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 46, 0, -4.0F, -7.0F, 7.0F, 4, 9, 1, 0.0F, false));

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(2.1F, 12.0F, -3.0F);
		RightLegBase.addChild(RightBoot);
		RightBoot.cubeList.add(new ModelBox(RightBoot, 0, 57, -0.1F, -3.0F, 1.0F, 1, 3, 4, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 62, 19, -4.1F, -3.0F, 5.0F, 4, 3, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 10, 57, -5.1F, -3.0F, 1.0F, 1, 3, 4, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 62, 9, -4.1F, -3.0F, 0.0F, 4, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		HeadBase.render(f5);
		BodyBase.render(f5);
		LeftArmBase.render(f5);
		RightArmBase.render(f5);
		LeftLegBase.render(f5);
		RightLegBase.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z)
	{
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
		return this.RightArmBase;
	}
}