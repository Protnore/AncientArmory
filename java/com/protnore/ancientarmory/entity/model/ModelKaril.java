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


public class ModelKaril extends ModelBiped {
	private final ModelRenderer HeadBase;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer BodyBase;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone4;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer LeftArmBase;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer bone23;
	private final ModelRenderer RightArmBase;
	private final ModelRenderer bone15;
	private final ModelRenderer bone22;
	private final ModelRenderer bone14;
	private final ModelRenderer LeftLegBase;
	private final ModelRenderer bone16;
	private final ModelRenderer bone18;
	private final ModelRenderer bone21;
	private final ModelRenderer RightLegBase;
	private final ModelRenderer bone20;
	private final ModelRenderer bone17;
	private final ModelRenderer bone19;

	public ModelKaril() {
		textureWidth = 128;
		textureHeight = 128;

		HeadBase = new ModelRenderer(this);
		HeadBase.setRotationPoint(0.0F, -1.0F, 0.0F);
		HeadBase.cubeList.add(new ModelBox(HeadBase, 36, 36, 4.0F, -7.5F, -5.0F, 1, 4, 10, 0.0F, false));
		HeadBase.cubeList.add(new ModelBox(HeadBase, 0, 16, -4.0F, -8.0F, -4.0F, 8, 1, 8, 0.0F, false));
		HeadBase.cubeList.add(new ModelBox(HeadBase, 68, 68, -4.0F, -7.5F, 4.0F, 8, 4, 1, 0.0F, false));
		HeadBase.cubeList.add(new ModelBox(HeadBase, 36, 0, -5.0F, -7.5F, -5.0F, 1, 4, 10, 0.0F, false));
		HeadBase.cubeList.add(new ModelBox(HeadBase, 68, 12, -4.0F, -7.5F, -5.0F, 8, 4, 1, 0.0F, false));
		HeadBase.cubeList.add(new ModelBox(HeadBase, 0, 0, -4.0F, -7.0F, -4.0F, 8, 8, 8, 0.0F, false));
		HeadBase.cubeList.add(new ModelBox(HeadBase, 24, 0, -4.5F, -2.0F, -4.5F, 9, 4, 1, 0.0F, false));
		HeadBase.cubeList.add(new ModelBox(HeadBase, 48, 33, -5.0F, -3.0F, -4.0F, 1, 4, 8, 0.0F, false));
		HeadBase.cubeList.add(new ModelBox(HeadBase, 8, 49, 4.0F, -3.0F, -4.0F, 1, 4, 8, 0.0F, false));
		HeadBase.cubeList.add(new ModelBox(HeadBase, 58, 34, -4.0F, -3.0F, 4.0F, 8, 5, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -4.0F, 4.0F);
		HeadBase.addChild(bone);
		setRotationAngle(bone, 0.2182F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 58, 27, -4.0F, 0.5F, -0.1F, 8, 6, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(5.0F, -4.0F, 0.0F);
		HeadBase.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.2182F);
		bone2.cubeList.add(new ModelBox(bone2, 24, 6, -1.1F, 0.5F, -5.0F, 1, 5, 10, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-5.0F, -4.0F, 0.0F);
		HeadBase.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.2182F);
		bone3.cubeList.add(new ModelBox(bone3, 24, 24, 0.1F, 0.5F, -5.0F, 1, 5, 10, 0.0F, false));

		BodyBase = new ModelRenderer(this);
		BodyBase.setRotationPoint(0.0F, 6.0F, 0.0F);
		BodyBase.cubeList.add(new ModelBox(BodyBase, 0, 25, -4.0F, -6.0F, -2.0F, 8, 12, 4, 0.0F, false));
		BodyBase.cubeList.add(new ModelBox(BodyBase, 26, 55, -4.5F, -5.0F, -2.0F, 1, 11, 4, 0.0F, false));
		BodyBase.cubeList.add(new ModelBox(BodyBase, 0, 57, 3.5F, -5.0F, -2.0F, 1, 11, 4, 0.0F, false));
		BodyBase.cubeList.add(new ModelBox(BodyBase, 52, 52, -4.0F, -5.0F, -3.0F, 8, 11, 1, 0.0F, false));
		BodyBase.cubeList.add(new ModelBox(BodyBase, 58, 0, -4.0F, -5.0F, 2.0F, 8, 11, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(3.0F, -3.0F, -3.0F);
		BodyBase.addChild(bone5);
		setRotationAngle(bone5, -0.7854F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 4, 22, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(3.0F, 2.0F, 3.0F);
		BodyBase.addChild(bone6);
		setRotationAngle(bone6, -0.7854F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 0, 22, -1.0F, 3.7426F, -4.7426F, 1, 1, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(3.0F, 5.0F, -3.0F);
		BodyBase.addChild(bone7);
		setRotationAngle(bone7, -0.7854F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 4, 20, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-2.0F, 2.0F, 3.0F);
		BodyBase.addChild(bone8);
		setRotationAngle(bone8, -0.7854F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 0, 20, -1.0F, 3.7426F, -4.7426F, 1, 1, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-2.0F, 5.0F, -3.0F);
		BodyBase.addChild(bone9);
		setRotationAngle(bone9, -0.7854F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 4, 18, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-2.0F, -3.0F, -3.0F);
		BodyBase.addChild(bone4);
		setRotationAngle(bone4, -0.7854F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 24, 5, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.5F, -1.0F, -3.0F);
		BodyBase.addChild(bone10);
		setRotationAngle(bone10, -0.7854F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 0, 18, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.5F, -3.0F, 2.0F);
		BodyBase.addChild(bone11);
		setRotationAngle(bone11, -0.7854F, 0.0F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 4, 16, -1.0F, -1.5F, 0.0F, 1, 1, 1, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(3.0F, -2.0F, 2.0F);
		BodyBase.addChild(bone12);
		setRotationAngle(bone12, -0.7854F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 0, 16, -1.0F, -1.0F, 0.5F, 1, 1, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-2.0F, -2.0F, 2.0F);
		BodyBase.addChild(bone13);
		setRotationAngle(bone13, -0.7854F, 0.0F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 0, 6, -1.0F, -1.0F, 0.5F, 1, 1, 1, 0.0F, false));

		LeftArmBase = new ModelRenderer(this);
		LeftArmBase.setRotationPoint(-6.0F, 0.0F, 0.0F);
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 20, 39, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 28, 75, -2.0F, 1.0F, -2.5F, 4, 10, 1, 0.0F, false));
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 58, 12, 1.5F, 0.0F, -2.0F, 1, 11, 4, 0.0F, false));
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 10, 61, -2.5F, 0.0F, -2.0F, 1, 11, 4, 0.0F, false));
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 68, 73, -2.0F, 1.0F, 1.5F, 4, 10, 1, 0.0F, false));
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 36, 14, -3.0F, 0.0F, 2.0F, 5, 1, 1, 0.0F, false));
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 54, 46, -3.0F, -1.0F, -2.0F, 5, 1, 4, 0.0F, false));
		LeftArmBase.cubeList.add(new ModelBox(LeftArmBase, 24, 21, -3.0F, 0.0F, -3.0F, 5, 1, 1, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-1.0F, -1.0F, -0.5F);
		LeftArmBase.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.0F, -0.7854F);
		bone24.cubeList.add(new ModelBox(bone24, 0, 2, -0.7292F, -0.7292F, 0.0F, 1, 1, 1, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-1.0F, 0.0F, 2.0F);
		LeftArmBase.addChild(bone25);
		setRotationAngle(bone25, 0.0F, 0.0F, -0.7854F);
		bone25.cubeList.add(new ModelBox(bone25, 0, 0, -0.7292F, -0.7292F, -0.1F, 1, 1, 1, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-1.0F, 0.0F, -3.0F);
		LeftArmBase.addChild(bone23);
		setRotationAngle(bone23, 0.0F, 0.0F, -0.7854F);
		bone23.cubeList.add(new ModelBox(bone23, 3, 3, -0.7292F, -0.7292F, 0.1F, 1, 1, 1, 0.0F, false));

		RightArmBase = new ModelRenderer(this);
		RightArmBase.setRotationPoint(6.0F, 0.0F, 0.0F);
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 42, 17, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 12, 41, -2.0F, 0.0F, 2.0F, 5, 1, 1, 0.0F, false));
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 62, 41, -2.0F, -1.0F, -2.0F, 5, 1, 4, 0.0F, false));
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 48, 14, -2.0F, 0.0F, -3.0F, 5, 1, 1, 0.0F, false));
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 38, 75, -2.0F, 1.0F, 1.5F, 4, 10, 1, 0.0F, false));
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 58, 64, 1.5F, 0.0F, -2.0F, 1, 11, 4, 0.0F, false));
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 76, 0, -2.0F, 1.0F, -2.5F, 4, 10, 1, 0.0F, false));
		RightArmBase.cubeList.add(new ModelBox(RightArmBase, 48, 64, -2.5F, 0.0F, -2.0F, 1, 11, 4, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(2.0F, 0.0F, 2.0F);
		RightArmBase.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, -0.7854F);
		bone15.cubeList.add(new ModelBox(bone15, 0, 4, -1.0F, -1.0F, -0.1F, 1, 1, 1, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(2.0F, 0.0F, -3.0F);
		RightArmBase.addChild(bone22);
		setRotationAngle(bone22, 0.0F, 0.0F, -0.7854F);
		bone22.cubeList.add(new ModelBox(bone22, 3, 1, -1.0F, -1.0F, 0.1F, 1, 1, 1, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(2.0F, -1.0F, -0.5F);
		RightArmBase.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, -0.7854F);
		bone14.cubeList.add(new ModelBox(bone14, 3, 5, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		LeftLegBase = new ModelRenderer(this);
		LeftLegBase.setRotationPoint(-2.0F, 12.0F, 0.0F);
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 36, 50, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 76, 40, -3.0F, 2.78F, -3.86F, 5, 3, 1, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 68, 17, -3.855F, 2.786F, -3.0F, 1, 3, 6, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 78, 73, -3.0F, 2.78F, 2.86F, 5, 3, 1, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 78, 46, -2.0F, 4.0F, 1.5F, 4, 5, 1, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 24, 25, -2.5F, 4.0F, -2.0F, 1, 5, 4, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 76, 17, -2.0F, 4.0F, -2.5F, 4, 5, 1, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 82, 33, -2.0F, 9.0F, -3.0F, 4, 3, 1, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 76, 33, -3.0F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 12, 83, -2.0F, 9.0F, 2.0F, 4, 3, 1, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 76, 26, 2.0F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 0, 41, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 14, 70, 2.0F, 2.75F, -3.0F, 1, 3, 6, 0.0F, false));
		LeftLegBase.cubeList.add(new ModelBox(LeftLegBase, 48, 0, 0.5F, 4.0F, -2.0F, 1, 5, 4, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(2.0F, 3.0F, -4.0F);
		LeftLegBase.addChild(bone16);
		setRotationAngle(bone16, -0.3054F, 0.0F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 0, 81, -5.0F, -3.25F, 0.07F, 5, 3, 1, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(2.0F, 3.0F, 3.0F);
		LeftLegBase.addChild(bone18);
		setRotationAngle(bone18, 0.3054F, 0.0F, 0.0F);
		bone18.cubeList.add(new ModelBox(bone18, 14, 79, -5.0F, -2.948F, -0.11F, 5, 3, 1, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-3.0F, 3.0F, -3.0F);
		LeftLegBase.addChild(bone21);
		setRotationAngle(bone21, 0.0F, 0.0F, 0.3054F);
		bone21.cubeList.add(new ModelBox(bone21, 64, 58, -0.88F, -2.945F, 0.0F, 1, 3, 6, 0.0F, false));

		RightLegBase = new ModelRenderer(this);
		RightLegBase.setRotationPoint(2.0F, 12.0F, 0.0F);
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 24, 25, -2.5F, 4.0F, -2.0F, 1, 5, 4, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 38, 66, -2.0F, 4.0F, 1.5F, 4, 5, 1, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 48, 0, 1.5F, 4.0F, -2.0F, 1, 5, 4, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 78, 78, -2.0F, 4.0F, -2.5F, 4, 5, 1, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 36, 5, -2.0F, 9.0F, -3.0F, 4, 3, 1, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 72, 55, -3.0F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 36, 39, 2.0F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 16, 61, -2.0F, 9.0F, 2.0F, 4, 3, 1, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 78, 62, -2.0F, 2.78F, 2.86F, 5, 3, 1, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 30, 66, 2.86F, 2.77F, -3.0F, 1, 3, 6, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 78, 55, -2.0F, 2.78F, -3.86F, 5, 3, 1, 0.0F, false));
		RightLegBase.cubeList.add(new ModelBox(RightLegBase, 70, 46, -3.0F, 2.75F, -3.0F, 1, 3, 6, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(4.0F, 3.0F, -3.0F);
		RightLegBase.addChild(bone20);
		setRotationAngle(bone20, 0.0F, 0.0F, -0.3054F);
		bone20.cubeList.add(new ModelBox(bone20, 0, 72, -1.065F, -3.25F, 0.0F, 1, 3, 6, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(3.0F, 3.0F, -4.0F);
		RightLegBase.addChild(bone17);
		setRotationAngle(bone17, -0.3054F, 0.0F, 0.0F);
		bone17.cubeList.add(new ModelBox(bone17, 82, 23, -5.0F, -3.25F, 0.07F, 5, 3, 1, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(3.0F, 3.0F, 3.0F);
		RightLegBase.addChild(bone19);
		setRotationAngle(bone19, 0.3054F, 0.0F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 48, 79, -5.0F, -2.948F, -0.11F, 5, 3, 1, 0.0F, false));
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