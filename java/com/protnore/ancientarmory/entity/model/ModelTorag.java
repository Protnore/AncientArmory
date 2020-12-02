package com.protnore.ancientarmory.entity.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class ModelTorag extends ModelBiped {
	private final ModelRenderer HeadBase;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone2;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone;
	private final ModelRenderer bone5;
	private final ModelRenderer bone8;
	private final ModelRenderer BodyBase;
	private final ModelRenderer bone14;
	private final ModelRenderer bone13;
	private final ModelRenderer LeftArmBase;
	private final ModelRenderer bone9;
	private final ModelRenderer RightArmBase;
	private final ModelRenderer RightLegBase;
	private final ModelRenderer bone11;
	private final ModelRenderer LeftLegBase;
	private final ModelRenderer bone12;

	public ModelTorag() {
		textureWidth = 1024;
		textureHeight = 1024;

		HeadBase = new ModelRenderer(this);
		HeadBase.setRotationPoint(0.0F, 0.0F, 0.0F);
		HeadBase.cubeList.add(new ModelBox(HeadBase, 0, 11, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));
		HeadBase.cubeList.add(new ModelBox(HeadBase, 0, 73, -5.0F, -8.0F, -5.0F, 2, 9, 1, 0.0F, false));
		HeadBase.cubeList.add(new ModelBox(HeadBase, 0, 0, -5.0F, -9.0F, -5.0F, 10, 1, 10, 0.0F, false));
		HeadBase.cubeList.add(new ModelBox(HeadBase, 36, 73, 3.0F, -8.0F, -5.0F, 2, 9, 1, 0.0F, false));
		HeadBase.cubeList.add(new ModelBox(HeadBase, 0, 27, 4.0F, -8.0F, -4.0F, 1, 9, 8, 0.0F, false));
		HeadBase.cubeList.add(new ModelBox(HeadBase, 30, 0, -5.0F, -8.0F, 4.0F, 10, 9, 1, 0.0F, false));
		HeadBase.cubeList.add(new ModelBox(HeadBase, 24, 24, -5.0F, -8.0F, -4.0F, 1, 9, 8, 0.0F, false));
		HeadBase.cubeList.add(new ModelBox(HeadBase, 64, 36, -3.0F, -8.0F, -5.0F, 6, 3, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -5.0F, -7.0F);
		HeadBase.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.6109F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 52, 0, -5.78F, -4.0F, -0.41F, 6, 4, 2, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -5.0F, -7.0F);
		HeadBase.addChild(bone4);
		setRotationAngle(bone4, 0.0F, -0.6109F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 54, 41, -0.31F, -4.0F, -0.345F, 6, 4, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 1.0F, -6.0F);
		HeadBase.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 2.5307F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 36, 67, -4.8736F, -4.0F, -0.6442F, 4, 4, 2, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 42, 33, -3.1436F, -3.0F, 0.6848F, 2, 2, 3, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.5774F, -1.7F, 4.6455F);
		bone6.addChild(bone7);
		setRotationAngle(bone7, 0.5672F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 6, 44, -2.0462F, -1.2401F, -1.5864F, 1, 1, 3, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.0F, 1.0F, -5.0F);
		HeadBase.addChild(bone);
		setRotationAngle(bone, 0.0F, -2.5307F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 68, 10, -0.6F, -4.0F, -0.245F, 4, 4, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(4.0F, 0.0F, 0.0F);
		bone.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 42, 73, -4.3515F, -3.0F, 1.1F, 2, 2, 3, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.6968F, -2.5F, 4.4576F);
		bone5.addChild(bone8);
		setRotationAngle(bone8, 0.5672F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 0, 31, -0.1532F, -0.25F, -1.5376F, 1, 1, 3, 0.0F, false));

		BodyBase = new ModelRenderer(this);
		BodyBase.setRotationPoint(0.0F, 24.0F, 0.0F);
		BodyBase.cubeList.add(new ModelBox(BodyBase, 0, 27, -4.0F, -24.0F, -2.0F, 8, 12, 4, 0.0F, false));
		BodyBase.cubeList.add(new ModelBox(BodyBase, 10, 27, -4.0F, -17.0F, 3.0F, 8, 4, 1, 0.0F, false));
		BodyBase.cubeList.add(new ModelBox(BodyBase, 0, 44, -5.0F, -24.0F, -2.0F, 1, 12, 4, 0.0F, false));
		BodyBase.cubeList.add(new ModelBox(BodyBase, 50, 23, -4.0F, -24.0F, 2.0F, 8, 12, 1, 0.0F, false));
		BodyBase.cubeList.add(new ModelBox(BodyBase, 50, 10, -4.0F, -24.0F, -3.0F, 8, 12, 1, 0.0F, false));
		BodyBase.cubeList.add(new ModelBox(BodyBase, 30, 50, 4.0F, -24.0F, -2.0F, 1, 12, 4, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-2.0F, -15.5F, 4.4576F);
		BodyBase.addChild(bone14);
		setRotationAngle(bone14, 0.5672F, -0.6545F, 0.0F);
		bone14.cubeList.add(new ModelBox(bone14, 0, 27, -1.0F, -0.25F, -1.5376F, 1, 1, 3, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(2.3032F, -15.5F, 4.4576F);
		BodyBase.addChild(bone13);
		setRotationAngle(bone13, 0.5672F, 0.6545F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 30, 11, -0.3032F, -0.25F, -1.5376F, 1, 1, 3, 0.0F, false));

		LeftArmBase = new ModelRenderer(this);
		LeftArmBase.setRotationPoint(6.0F, 0.0F, 0.0F);
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 14, 41, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 64, 2, -3.0F, 5.0F, -2.0F, 1, 4, 4, 0.0F, false));
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 74, 4, -2.0F, 5.0F, 2.0F, 4, 4, 1, 0.0F, false));
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 24, 11, 2.0F, 5.0F, -2.0F, 1, 4, 4, 0.0F, false));
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 72, 64, -2.0F, 5.0F, -3.0F, 4, 4, 1, 0.0F, false));
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 26, 41, -2.0F, 0.0F, -3.0F, 5, 3, 1, 0.0F, false));
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 68, 24, 3.0F, 0.0F, -2.0F, 1, 3, 4, 0.0F, false));
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 50, 36, -2.0F, -1.0F, -2.0F, 5, 1, 4, 0.0F, false));
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 52, 6, -2.0F, 0.0F, 2.0F, 5, 3, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(1.0F, 1.0F, -1.0F);
		LeftArmBase.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, 0.48F);
		bone9.cubeList.add(new ModelBox(bone9, 0, 11, -2.0F, -3.0F, 0.0F, 2, 3, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 16, -1.4483F, -4.1907F, 0.5F, 1, 2, 1, 0.0F, false));

		RightArmBase = new ModelRenderer(this);
		RightArmBase.setRotationPoint(-6.0F, 0.0F, 0.0F);
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 50, 50, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 68, 31, -3.0F, 0.0F, 2.0F, 5, 3, 1, 0.0F, false));
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 68, 57, -4.0F, 0.0F, -2.0F, 1, 3, 4, 0.0F, false));
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 34, 27, -3.0F, -1.0F, -2.0F, 4, 1, 4, 0.0F, false));
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 70, 0, -3.0F, 0.0F, -3.0F, 5, 3, 1, 0.0F, false));
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 58, 75, -2.0F, 5.0F, -3.0F, 4, 4, 1, 0.0F, false));
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 68, 16, -3.0F, 5.0F, -2.0F, 1, 4, 4, 0.0F, false));
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 74, 69, -2.0F, 5.0F, 2.0F, 4, 4, 1, 0.0F, false));
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 0, 65, 2.0F, 5.0F, -2.0F, 1, 4, 4, 0.0F, false));

		RightLegBase = new ModelRenderer(this);
		RightLegBase.setRotationPoint(-2.0F, 12.0F, 0.0F);
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 16, 57, 2.0F, 0.0F, -2.0F, 1, 9, 4, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 74, 57, -2.0F, 9.0F, -3.0F, 4, 3, 1, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 68, 71, -3.0F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 6, 76, -2.0F, 9.0F, 2.0F, 4, 3, 1, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 70, 40, 2.0F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 66, 47, -2.0F, 0.0F, -3.0F, 4, 9, 1, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 26, 66, -2.0F, 0.0F, 2.0F, 4, 9, 1, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 6, 56, -3.0F, 0.0F, -2.0F, 1, 9, 4, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 34, 11, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(2.0F, 5.0F, -11.0F);
		RightLegBase.addChild(bone11);
		setRotationAngle(bone11, -0.7854F, 0.0F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 54, 47, -4.0F, -6.1997F, 5.1097F, 4, 1, 1, 0.0F, false));

		LeftLegBase = new ModelRenderer(this);
		LeftLegBase.setRotationPoint(2.0F, 12.0F, 0.0F);
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 38, 38, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 49, 66, -2.0F, 0.0F, -3.0F, 4, 9, 1, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 62, 62, -3.0F, 0.0F, -2.0F, 1, 9, 4, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 0, 0, -2.0F, 0.0F, 2.0F, 4, 9, 1, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 40, 54, 2.0F, 0.0F, -2.0F, 1, 9, 4, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 74, 24, -2.0F, 9.0F, 2.0F, 4, 3, 1, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 6, 69, 2.0F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 74, 16, -2.0F, 9.0F, -3.0F, 4, 3, 1, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 16, 70, -3.0F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(2.0F, 5.0F, -10.0F);
		LeftLegBase.addChild(bone12);
		setRotationAngle(bone12, -0.7854F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 10, 32, -4.0F, -5.4926F, 4.4026F, 4, 1, 1, 0.0F, false));
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
		return this.RightArmBase;
	}
}