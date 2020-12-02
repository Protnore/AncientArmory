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


public class ModelGuthan extends ModelBiped 
{
	private final ModelRenderer HeadBase;
	private final ModelRenderer HelmBottom;
	private final ModelRenderer cube_r1;
	private final ModelRenderer HelmTop;
	private final ModelRenderer cube_r2;
	private final ModelRenderer RightHorn;
	private final ModelRenderer RightHornTip;
	private final ModelRenderer LeftHorn;
	private final ModelRenderer LeftHornTip;
	private final ModelRenderer Helmet;
	private final ModelRenderer ChestBase;
	private final ModelRenderer ChestSpike;
	private final ModelRenderer Chest;
	private final ModelRenderer LeftArmBase;
	private final ModelRenderer LeftArmSpike;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArmBase;
	private final ModelRenderer RightArmSpike;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftLegBase;
	private final ModelRenderer LeftLeg1;
	private final ModelRenderer LeftLeg3;
	private final ModelRenderer LeftLeg2;
	private final ModelRenderer LeftBoot;
	private final ModelRenderer LeftLeg4;
	private final ModelRenderer RightLegBase;
	private final ModelRenderer RightLeg1;
	private final ModelRenderer RightLeg3;
	private final ModelRenderer RightLeg2;
	private final ModelRenderer RightBoot;
	private final ModelRenderer RightLeg4;

	public ModelGuthan() 
	{
		textureWidth = 1024;
		textureHeight = 1024;

		HeadBase = new ModelRenderer(this);
		HeadBase.setRotationPoint(0.0F, 0.0F, 0.0F);
		HeadBase.cubeList.add(new ModelBox(HeadBase, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		HelmBottom = new ModelRenderer(this);
		HelmBottom.setRotationPoint(0.0F, 0.0F, -1.0F);
		HeadBase.addChild(HelmBottom);
		setRotationAngle(HelmBottom, -0.1222F, 0.7854F, -0.0873F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0F, 0.0F, 0.0F);
		HelmBottom.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1309F, 3.1416F, 0.1309F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 28, -6.0F, -3.55F, -1.0F, 6, 4, 6, 0.0F, false));

		HelmTop = new ModelRenderer(this);
		HelmTop.setRotationPoint(0.0F, -5.0F, -1.0F);
		HeadBase.addChild(HelmTop);
		setRotationAngle(HelmTop, 0.1222F, 0.7636F, 0.0873F);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.0F, 0.0F, 0.0F);
		HelmTop.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1745F, 3.1416F, -0.1745F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 9, -6.5F, -3.15F, -0.5F, 6, 4, 6, 0.0F, false));

		RightHorn = new ModelRenderer(this);
		RightHorn.setRotationPoint(-4.0F, -7.0F, 2.0F);
		HeadBase.addChild(RightHorn);
		setRotationAngle(RightHorn, 1.789F, -0.5672F, -3.1416F);
		RightHorn.cubeList.add(new ModelBox(RightHorn, 0, 55, -2.0F, -10.0F, 0.0F, 2, 10, 2, 0.0F, false));

		RightHornTip = new ModelRenderer(this);
		RightHornTip.setRotationPoint(0.0F, 1.0822F, 4.8815F);
		RightHorn.addChild(RightHornTip);
		setRotationAngle(RightHornTip, 0.4363F, 0.0F, 0.0F);
		RightHornTip.cubeList.add(new ModelBox(RightHornTip, 34, 19, -1.53F, -15.1922F, 0.6685F, 1, 4, 1, 0.0F, false));

		LeftHorn = new ModelRenderer(this);
		LeftHorn.setRotationPoint(2.4F, -7.15F, 0.85F);
		HeadBase.addChild(LeftHorn);
		setRotationAngle(LeftHorn, 1.789F, 0.5672F, -3.1416F);
		LeftHorn.cubeList.add(new ModelBox(LeftHorn, 54, 32, -1.6F, -9.63F, 0.1F, 2, 10, 2, 0.0F, false));

		LeftHornTip = new ModelRenderer(this);
		LeftHornTip.setRotationPoint(-0.15F, -8.85F, 0.55F);
		LeftHorn.addChild(LeftHornTip);
		setRotationAngle(LeftHornTip, 0.4363F, 0.0F, 0.0F);
		LeftHornTip.cubeList.add(new ModelBox(LeftHornTip, 24, 9, -0.9F, -4.0F, 0.33F, 1, 4, 1, 0.0F, false));

		Helmet = new ModelRenderer(this);
		Helmet.setRotationPoint(-4.0F, -8.0F, 4.0F);
		HeadBase.addChild(Helmet);
		setRotationAngle(Helmet, 0.0F, 3.1416F, 0.0F);
		Helmet.cubeList.add(new ModelBox(Helmet, 35, 49, -8.0F, 5.0F, 8.0F, 8, 4, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 46, 27, -8.0F, -1.0F, 8.0F, 8, 4, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 12, 12, -9.0F, -1.0F, -1.0F, 1, 10, 10, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 36, 38, -8.0F, -1.0F, -1.0F, 8, 10, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 0, 0.0F, -1.0F, -1.0F, 1, 10, 10, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 12, 0, -8.0F, -1.0F, 0.0F, 8, 1, 8, 0.0F, false));

		ChestBase = new ModelRenderer(this);
		ChestBase.setRotationPoint(0.0F, 24.0F, 0.0F);
		ChestBase.cubeList.add(new ModelBox(ChestBase, 0, 0, -4.0F, -24.0F, -2.0F, 8, 12, 4, 0.0F, false));

		ChestSpike = new ModelRenderer(this);
		ChestSpike.setRotationPoint(4.0F, -20.0F, 3.0F);
		ChestBase.addChild(ChestSpike);
		setRotationAngle(ChestSpike, 0.7854F, 0.0F, 0.0F);
		ChestSpike.cubeList.add(new ModelBox(ChestSpike, 6, 2, -3.5F, -5.2426F, -4.2426F, 1, 1, 1, 0.0F, false));
		ChestSpike.cubeList.add(new ModelBox(ChestSpike, 6, 0, -7.5F, -5.2426F, -4.2426F, 1, 1, 1, 0.0F, false));
		ChestSpike.cubeList.add(new ModelBox(ChestSpike, 6, 20, -5.5F, -5.2426F, -4.2426F, 1, 1, 1, 0.0F, false));
		ChestSpike.cubeList.add(new ModelBox(ChestSpike, 0, 20, -1.5F, -5.2426F, -4.2426F, 1, 1, 1, 0.0F, false));

		Chest = new ModelRenderer(this);
		Chest.setRotationPoint(-4.0F, -12.0F, 2.0F);
		ChestBase.addChild(Chest);
		setRotationAngle(Chest, 0.0F, 3.1416F, 0.0F);
		Chest.cubeList.add(new ModelBox(Chest, 0, 32, -8.0F, -11.0F, -1.0F, 8, 11, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 0, 20, -9.0F, -8.0F, 0.0F, 1, 8, 4, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 36, 54, 0.0F, -8.0F, 0.0F, 1, 8, 4, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 18, 38, -8.0F, -11.0F, 4.0F, 8, 11, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 12, 0, -2.0F, -12.0F, -1.0F, 3, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 12, 2, -9.0F, -12.0F, -1.0F, 3, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 12, 6, -2.0F, -12.0F, 4.0F, 3, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 12, 4, -9.0F, -12.0F, 4.0F, 3, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 16, 50, -10.0F, -13.0F, 0.0F, 2, 1, 4, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 34, 23, 0.0F, -13.0F, 0.0F, 2, 1, 4, 0.0F, false));

		LeftArmBase = new ModelRenderer(this);
		LeftArmBase.setRotationPoint(4.0F, 0.0F, 0.0F);
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 0, 0, 0.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		LeftArmSpike = new ModelRenderer(this);
		LeftArmSpike.setRotationPoint(6.0F, 6.0F, -0.5F);
		LeftArmBase.addChild(LeftArmSpike);
		setRotationAngle(LeftArmSpike, 0.0F, 0.0F, 0.7854F);
		LeftArmSpike.cubeList.add(new ModelBox(LeftArmSpike, 0, 0, -1.7071F, -0.2929F, 0.0F, 1, 1, 1, 0.0F, false));
		LeftArmSpike.cubeList.add(new ModelBox(LeftArmSpike, 0, 0, -0.2929F, 1.1213F, 0.0F, 1, 1, 1, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(0.0F, 9.0F, -2.0F);
		LeftArmBase.addChild(LeftArm);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 62, 11, 0.0F, -5.0F, -1.0F, 4, 5, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 52, 11, 4.0F, -5.0F, 0.0F, 1, 5, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 18, 32, 0.0F, -5.0F, 4.0F, 4, 5, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -1.0F, -5.0F, 0.0F, 1, 5, 4, 0.0F, false));

		RightArmBase = new ModelRenderer(this);
		RightArmBase.setRotationPoint(-4.0F, 0.0F, 0.0F);
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 0, 0, -4.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		RightArmSpike = new ModelRenderer(this);
		RightArmSpike.setRotationPoint(13.0F, 8.0F, -0.5F);
		RightArmBase.addChild(RightArmSpike);
		setRotationAngle(RightArmSpike, 0.0F, 0.0F, 0.7854F);
		RightArmSpike.cubeList.add(new ModelBox(RightArmSpike, 0, 2, -13.7279F, 11.7279F, 0.0F, 1, 1, 1, 0.0F, false));
		RightArmSpike.cubeList.add(new ModelBox(RightArmSpike, 0, 2, -15.1421F, 10.3137F, 0.0F, 1, 1, 1, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(0.0F, 9.0F, -3.0F);
		RightArmBase.addChild(RightArm);
		RightArm.cubeList.add(new ModelBox(RightArm, 56, 44, 0.0F, -5.0F, 1.0F, 1, 5, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 62, 38, -4.0F, -5.0F, 5.0F, 4, 5, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 8, 58, -5.0F, -5.0F, 1.0F, 1, 5, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 62, 32, -4.0F, -5.0F, 0.0F, 4, 5, 1, 0.0F, false));

		LeftLegBase = new ModelRenderer(this);
		LeftLegBase.setRotationPoint(0.0F, 12.0F, 0.0F);
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 0, 0, -4.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		LeftLeg1 = new ModelRenderer(this);
		LeftLeg1.setRotationPoint(5.0F, 3.0F, -4.0F);
		LeftLegBase.addChild(LeftLeg1);
		setRotationAngle(LeftLeg1, -0.3054F, 0.0F, 0.0F);
		LeftLeg1.cubeList.add(new ModelBox(LeftLeg1, 64, 26, -5.0F, -3.25F, 0.07F, 5, 3, 1, 0.0F, false));

		LeftLeg3 = new ModelRenderer(this);
		LeftLeg3.setRotationPoint(5.0F, 3.0F, 3.0F);
		LeftLegBase.addChild(LeftLeg3);
		setRotationAngle(LeftLeg3, 0.3054F, 0.0F, 0.0F);
		LeftLeg3.cubeList.add(new ModelBox(LeftLeg3, 62, 44, -5.0F, -2.948F, -0.11F, 5, 3, 1, 0.0F, false));

		LeftLeg2 = new ModelRenderer(this);
		LeftLeg2.setRotationPoint(6.0F, 3.0F, -3.0F);
		LeftLegBase.addChild(LeftLeg2);
		setRotationAngle(LeftLeg2, 0.0F, 0.0F, -0.3054F);
		LeftLeg2.cubeList.add(new ModelBox(LeftLeg2, 22, 50, -1.065F, -3.25F, 0.0F, 1, 3, 6, 0.0F, false));

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(5.0F, 12.0F, -2.0F);
		LeftLegBase.addChild(LeftBoot);
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 46, 59, -6.0F, -3.0F, 0.0F, 1, 3, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 64, 57, -5.0F, -3.0F, 4.0F, 4, 3, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 8, 44, -5.0F, -3.0F, -1.0F, 4, 3, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 58, 58, -1.0F, -3.0F, 0.0F, 1, 3, 4, 0.0F, false));

		LeftLeg4 = new ModelRenderer(this);
		LeftLeg4.setRotationPoint(8.0F, -1.0F, -2.0F);
		LeftLegBase.addChild(LeftLeg4);
		LeftLeg4.cubeList.add(new ModelBox(LeftLeg4, 56, 20, -8.0F, 3.78F, 4.86F, 5, 5, 1, 0.0F, false));
		LeftLeg4.cubeList.add(new ModelBox(LeftLeg4, 0, 44, -3.14F, 3.77F, -1.0F, 1, 5, 6, 0.0F, false));
		LeftLeg4.cubeList.add(new ModelBox(LeftLeg4, 56, 5, -8.0F, 3.78F, -1.86F, 5, 5, 1, 0.0F, false));
		LeftLeg4.cubeList.add(new ModelBox(LeftLeg4, 42, 15, -9.0F, 2.75F, -1.0F, 1, 6, 6, 0.0F, false));
		LeftLeg4.cubeList.add(new ModelBox(LeftLeg4, 50, 0, -8.0F, 0.9F, 0.0F, 4, 1, 4, 0.0F, false));

		RightLegBase = new ModelRenderer(this);
		RightLegBase.setRotationPoint(0.0F, 12.0F, 0.0F);
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 0, 0, 0.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		RightLeg1 = new ModelRenderer(this);
		RightLeg1.setRotationPoint(0.0F, 3.0F, -4.0F);
		RightLegBase.addChild(RightLeg1);
		setRotationAngle(RightLeg1, -0.3054F, 0.0F, 0.0F);
		RightLeg1.cubeList.add(new ModelBox(RightLeg1, 62, 53, -5.0F, -3.25F, 0.07F, 5, 3, 1, 0.0F, false));

		RightLeg3 = new ModelRenderer(this);
		RightLeg3.setRotationPoint(0.0F, 3.0F, 3.0F);
		RightLegBase.addChild(RightLeg3);
		setRotationAngle(RightLeg3, 0.3054F, 0.0F, 0.0F);
		RightLeg3.cubeList.add(new ModelBox(RightLeg3, 62, 0, -5.0F, -2.948F, -0.11F, 5, 3, 1, 0.0F, false));

		RightLeg2 = new ModelRenderer(this);
		RightLeg2.setRotationPoint(-5.0F, 3.0F, -3.0F);
		RightLegBase.addChild(RightLeg2);
		setRotationAngle(RightLeg2, 0.0F, 0.0F, 0.3054F);
		RightLeg2.cubeList.add(new ModelBox(RightLeg2, 8, 49, -0.88F, -2.945F, 0.0F, 1, 3, 6, 0.0F, false));

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(-4.0F, 12.0F, -2.0F);
		RightLegBase.addChild(RightBoot);
		RightBoot.cubeList.add(new ModelBox(RightBoot, 58, 58, 4.0F, -3.0F, 0.0F, 1, 3, 4, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 18, 65, 0.0F, -3.0F, -1.0F, 4, 3, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 55, 65, 0.0F, -3.0F, 4.0F, 4, 3, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 46, 59, -1.0F, -3.0F, 0.0F, 1, 3, 4, 0.0F, false));

		RightLeg4 = new ModelRenderer(this);
		RightLeg4.setRotationPoint(1.0F, 8.0F, -3.0F);
		RightLegBase.addChild(RightLeg4);
		RightLeg4.cubeList.add(new ModelBox(RightLeg4, 36, 0, -6.0F, -5.22F, -0.86F, 5, 5, 1, 0.0F, false));
		RightLeg4.cubeList.add(new ModelBox(RightLeg4, 48, 48, -6.855F, -5.214F, 0.0F, 1, 5, 6, 0.0F, false));
		RightLeg4.cubeList.add(new ModelBox(RightLeg4, 18, 59, -6.0F, -5.22F, 5.86F, 5, 5, 1, 0.0F, false));
		RightLeg4.cubeList.add(new ModelBox(RightLeg4, 50, 0, -5.0F, -8.1F, 1.0F, 4, 1, 4, 0.0F, false));
		RightLeg4.cubeList.add(new ModelBox(RightLeg4, 42, 3, -1.0F, -6.25F, 0.0F, 1, 6, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		HeadBase.render(f5);
		ChestBase.render(f5);
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
		return this.RightArmBase;
	}
}