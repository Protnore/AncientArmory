package com.protnore.ancientarmory.objects.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.1
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Ahrim_Armor extends ModelBiped {
	
	public final ModelRenderer Hood;
	public final ModelRenderer Hood4_r1;
	public final ModelRenderer Hood3_r1;
	public final ModelRenderer Hood2_r1;
	public final ModelRenderer Hood1_r1;
	public final ModelRenderer Hood1;
	public final ModelRenderer Hood2;
	public final ModelRenderer Hood3;
	public final ModelRenderer Hood4;
	public final ModelRenderer Chest;
	public final ModelRenderer LeftArm;
	public final ModelRenderer RightArm;
	public final ModelRenderer LeftLeg;
	public final ModelRenderer LeftLeg6_r1;
	public final ModelRenderer LeftLeg5_r1;
	public final ModelRenderer LeftLeg4_r1;
	public final ModelRenderer LeftLeg3_r1;
	public final ModelRenderer LeftLeg2_r1;
	public final ModelRenderer LeftLeg1_r1;
	public final ModelRenderer InnerLeftLeg;
	public final ModelRenderer LeftLeg1;
	public final ModelRenderer LeftLeg2;
	public final ModelRenderer LeftLeg3;
	public final ModelRenderer LeftLeg4;
	public final ModelRenderer LeftLeg5;
	public final ModelRenderer LeftLeg6;
	public final ModelRenderer LeftLeg7;
	public final ModelRenderer LeftLeg8;
	public final ModelRenderer LeftLeg9;
	public final ModelRenderer LeftLeg10;
	public final ModelRenderer LeftLeg11;
	public final ModelRenderer RightLeg;
	public final ModelRenderer RightLeg6_r1;
	public final ModelRenderer RightLeg5_r1;
	public final ModelRenderer RightLeg4_r1;
	public final ModelRenderer RightLeg3_r1;
	public final ModelRenderer RightLeg2_r1;
	public final ModelRenderer RightLeg1_r1;
	public final ModelRenderer InnerRightLeg;
	public final ModelRenderer RightLeg1;
	public final ModelRenderer RightLeg2;
	public final ModelRenderer RightLeg3;
	public final ModelRenderer RightLeg4;
	public final ModelRenderer RightLeg5;
	public final ModelRenderer RightLeg6;
	public final ModelRenderer RightLeg7;
	public final ModelRenderer RightLeg8;
	public final ModelRenderer RightLeg9;
	public final ModelRenderer RightLeg10;
	public final ModelRenderer RightLeg11;
	public final ModelRenderer LeftBoot;
	public final ModelRenderer RightBoot;

	public Ahrim_Armor() {

		textureWidth = 1024;
		textureHeight = 1024;

		Hood = new ModelRenderer(this);
		Hood.setRotationPoint(0.0F, 24.0F, 0.0F);

		Hood4_r1 = new ModelRenderer(this);
		Hood4_r1.setRotationPoint(4.0F, -25.0F, 3.0F);
		Hood.addChild(Hood4_r1);
		setRotationAngle(Hood4_r1, -0.3054F, 0.0F, 0.0F);
		
		Hood3_r1 = new ModelRenderer(this);
		Hood3_r1.setRotationPoint(3.0F, -26.0F, 2.0F);
		Hood.addChild(Hood3_r1);
		setRotationAngle(Hood3_r1, -0.6109F, 0.0F, 0.0F);

		Hood2_r1 = new ModelRenderer(this);
		Hood2_r1.setRotationPoint(4.0F, -25.0F, 4.0F);
		Hood.addChild(Hood2_r1);
		setRotationAngle(Hood2_r1, -0.1309F, 0.0F, 0.0F);

		Hood1_r1 = new ModelRenderer(this);
		Hood1_r1.setRotationPoint(0.0F, -25.0F, 0.0F);
		Hood.addChild(Hood1_r1);
		setRotationAngle(Hood1_r1, 0.0F, 3.1416F, 0.0F);

		Hood1 = new ModelRenderer(this);
		Hood1.setRotationPoint(0.0F, -25.0F, 0.0F);
		Hood.addChild(Hood1);
		setRotationAngle(Hood1, 0.0F, 3.1416F, 0.0F);
		Hood1.cubeList.add(new ModelBox(Hood1, 28, 25, -4.0F, -7.0F, 5.0F, 8, 1, 1, 0.0F, false));
		Hood1.cubeList.add(new ModelBox(Hood1, 16, 9, -4.0F, -6.0F, 5.0F, 1, 3, 1, 0.0F, false));
		Hood1.cubeList.add(new ModelBox(Hood1, 10, 9, 3.0F, -6.0F, 5.0F, 1, 3, 1, 0.0F, false));
		Hood1.cubeList.add(new ModelBox(Hood1, 0, 24, 4.0F, -7.0F, 4.0F, 1, 6, 1, 0.0F, false));
		Hood1.cubeList.add(new ModelBox(Hood1, 46, 0, -4.0F, -8.0F, 3.0F, 8, 1, 2, 0.0F, false));
		Hood1.cubeList.add(new ModelBox(Hood1, 4, 24, -5.0F, -7.0F, 4.0F, 1, 6, 1, 0.0F, false));
		Hood1.cubeList.add(new ModelBox(Hood1, 0, 9, -5.0F, -7.0F, -5.0F, 1, 7, 8, 0.0F, false));
		Hood1.cubeList.add(new ModelBox(Hood1, 10, 54, -5.0F, -8.0F, 3.0F, 1, 8, 1, 0.0F, false));
		Hood1.cubeList.add(new ModelBox(Hood1, 0, 24, -5.0F, 0.0F, -4.0F, 1, 1, 8, 0.0F, false));
		Hood1.cubeList.add(new ModelBox(Hood1, 28, 23, -5.0F, 0.0F, -5.0F, 10, 1, 1, 0.0F, false));
		Hood1.cubeList.add(new ModelBox(Hood1, 0, 0, -5.0F, -8.0F, -5.0F, 10, 1, 8, 0.0F, false));
		Hood1.cubeList.add(new ModelBox(Hood1, 24, 48, 4.0F, -8.0F, 3.0F, 1, 8, 1, 0.0F, false));
		Hood1.cubeList.add(new ModelBox(Hood1, 30, 14, 4.0F, 0.0F, -4.0F, 1, 1, 8, 0.0F, false));
		Hood1.cubeList.add(new ModelBox(Hood1, 10, 16, 4.0F, -7.0F, -5.0F, 1, 7, 8, 0.0F, false));

		Hood2 = new ModelRenderer(this);
		Hood2.setRotationPoint(4.0F, -25.0F, 4.0F);
		Hood.addChild(Hood2);
		setRotationAngle(Hood2, -0.1309F, 0.0F, 0.0F);
		Hood2.cubeList.add(new ModelBox(Hood2, 40, 13, -8.0F, -7.1F, 0.0F, 8, 7, 1, 0.0F, false));

		Hood3 = new ModelRenderer(this);
		Hood3.setRotationPoint(3.0F, -26.0F, 2.0F);
		Hood.addChild(Hood3);
		setRotationAngle(Hood3, -0.6109F, 0.0F, 0.0F);
		Hood3.cubeList.add(new ModelBox(Hood3, 56, 19, -5.5F, -6.5F, 1.0692F, 5, 6, 2, 0.0F, false));

		Hood4 = new ModelRenderer(this);
		Hood4.setRotationPoint(4.0F, -25.0F, 3.0F);
		Hood.addChild(Hood4);
		setRotationAngle(Hood4, -0.3054F, 0.0F, 0.0F);
		Hood4.cubeList.add(new ModelBox(Hood4, 0, 33, -7.5F, -7.0F, 0.07F, 7, 7, 2, 0.0F, false));

		Chest = new ModelRenderer(this);
		Chest.setRotationPoint(4.0F, 12.0F, -3.0F);
		Chest.cubeList.add(new ModelBox(Chest, 14, 48, -0.5F, -11.0F, 1.0F, 1, 11, 4, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 46, 21, -8.5F, -11.0F, 1.0F, 1, 11, 4, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 28, 28, -8.0F, -12.0F, 4.5F, 8, 12, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 20, 9, -8.0F, -12.0F, 0.5F, 8, 12, 1, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(3.0F, -2.0F, -2.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 54, -4.5F, 0.0F, 0.0F, 1, 11, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 24, 59, -4.0F, 0.0F, 3.5F, 4, 11, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 28, 44, -0.5F, 0.0F, 0.0F, 1, 11, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 60, 60, -4.0F, 0.0F, -0.5F, 4, 11, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 58, 12, -4.0F, -0.5F, 0.0F, 4, 1, 4, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(1.0F, -2.0F, -2.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 50, 50, -0.5F, 0.0F, 0.0F, 1, 11, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 60, 47, -4.0F, 0.0F, 3.5F, 4, 11, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 38, 52, -4.5F, 0.0F, 0.0F, 1, 11, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 10, 63, -4.0F, 0.0F, -0.5F, 4, 11, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 60, 3, -4.0F, -0.5F, 0.0F, 4, 1, 4, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 28, 0, 0.0F, -12.1F, -2.0F, 4, 1, 4, 0.0F, false));

		LeftLeg6_r1 = new ModelRenderer(this);
		LeftLeg6_r1.setRotationPoint(5.0F, -9.0F, -4.0F);
		LeftLeg.addChild(LeftLeg6_r1);
		setRotationAngle(LeftLeg6_r1, -0.3054F, 0.0F, 0.0F);
		
		LeftLeg5_r1 = new ModelRenderer(this);
		LeftLeg5_r1.setRotationPoint(5.0F, -9.0F, 3.0F);
		LeftLeg.addChild(LeftLeg5_r1);
		setRotationAngle(LeftLeg5_r1, 0.3054F, 0.0F, 0.0F);
		
		LeftLeg4_r1 = new ModelRenderer(this);
		LeftLeg4_r1.setRotationPoint(6.0F, -9.0F, -3.0F);
		LeftLeg.addChild(LeftLeg4_r1);
		setRotationAngle(LeftLeg4_r1, 0.0F, 0.0F, -0.3054F);
		
		LeftLeg3_r1 = new ModelRenderer(this);
		LeftLeg3_r1.setRotationPoint(0.0F, -3.0F, 3.0F);
		LeftLeg.addChild(LeftLeg3_r1);
		setRotationAngle(LeftLeg3_r1, 0.48F, 0.0F, 0.0F);
		
		LeftLeg2_r1 = new ModelRenderer(this);
		LeftLeg2_r1.setRotationPoint(7.0F, -3.0F, -4.0F);
		LeftLeg.addChild(LeftLeg2_r1);
		setRotationAngle(LeftLeg2_r1, 0.0F, 0.0F, -0.48F);
		
		LeftLeg1_r1 = new ModelRenderer(this);
		LeftLeg1_r1.setRotationPoint(0.0F, -3.0F, -4.0F);
		LeftLeg.addChild(LeftLeg1_r1);
		setRotationAngle(LeftLeg1_r1, -0.48F, 0.0F, 0.0F);
		
		InnerLeftLeg = new ModelRenderer(this);
		InnerLeftLeg.setRotationPoint(1.0F, -2.0F, -3.0F);
		LeftLeg.addChild(InnerLeftLeg);
		InnerLeftLeg.cubeList.add(new ModelBox(InnerLeftLeg, 18, 35, -2.0F, -7.25F, 0.0F, 1, 7, 6, 0.0F, false));

		LeftLeg1 = new ModelRenderer(this);
		LeftLeg1.setRotationPoint(0.0F, -3.0F, -4.0F);
		LeftLeg.addChild(LeftLeg1);
		setRotationAngle(LeftLeg1, -0.48F, 0.0F, 0.0F);
		LeftLeg1.cubeList.add(new ModelBox(LeftLeg1, 64, 42, 0.0F, -0.363F, -0.03F, 5, 2, 1, 0.0F, false));

		LeftLeg2 = new ModelRenderer(this);
		LeftLeg2.setRotationPoint(7.0F, -3.0F, -4.0F);
		LeftLeg.addChild(LeftLeg2);
		setRotationAngle(LeftLeg2, 0.0F, 0.0F, -0.48F);
		LeftLeg2.cubeList.add(new ModelBox(LeftLeg2, 56, 39, -1.853F, -0.825F, 1.0F, 1, 2, 6, 0.0F, false));

		LeftLeg3 = new ModelRenderer(this);
		LeftLeg3.setRotationPoint(0.0F, -3.0F, 3.0F);
		LeftLeg.addChild(LeftLeg3);
		setRotationAngle(LeftLeg3, 0.48F, 0.0F, 0.0F);
		LeftLeg3.cubeList.add(new ModelBox(LeftLeg3, 46, 3, 0.0F, 0.1F, -0.078F, 5, 2, 1, 0.0F, false));

		LeftLeg4 = new ModelRenderer(this);
		LeftLeg4.setRotationPoint(6.0F, -9.0F, -3.0F);
		LeftLeg.addChild(LeftLeg4);
		setRotationAngle(LeftLeg4, 0.0F, 0.0F, -0.3054F);
		LeftLeg4.cubeList.add(new ModelBox(LeftLeg4, 52, 3, -1.065F, -3.25F, 0.0F, 1, 3, 6, 0.0F, false));

		LeftLeg5 = new ModelRenderer(this);
		LeftLeg5.setRotationPoint(5.0F, -9.0F, 3.0F);
		LeftLeg.addChild(LeftLeg5);
		setRotationAngle(LeftLeg5, 0.3054F, 0.0F, 0.0F);
		LeftLeg5.cubeList.add(new ModelBox(LeftLeg5, 66, 8, -5.0F, -2.948F, -0.11F, 5, 3, 1, 0.0F, false));

		LeftLeg6 = new ModelRenderer(this);
		LeftLeg6.setRotationPoint(5.0F, -9.0F, -4.0F);
		LeftLeg.addChild(LeftLeg6);
		setRotationAngle(LeftLeg6, -0.3054F, 0.0F, 0.0F);
		LeftLeg6.cubeList.add(new ModelBox(LeftLeg6, 70, 12, -5.0F, -3.25F, 0.07F, 5, 3, 1, 0.0F, false));

		LeftLeg7 = new ModelRenderer(this);
		LeftLeg7.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(LeftLeg7);
		LeftLeg7.cubeList.add(new ModelBox(LeftLeg7, 64, 35, 0.0F, -9.219F, -3.858F, 5, 6, 1, 0.0F, false));

		LeftLeg8 = new ModelRenderer(this);
		LeftLeg8.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(LeftLeg8);
		LeftLeg8.cubeList.add(new ModelBox(LeftLeg8, 40, 40, 4.863F, -9.22F, -3.0F, 1, 6, 6, 0.0F, false));

		LeftLeg9 = new ModelRenderer(this);
		LeftLeg9.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(LeftLeg9);
		LeftLeg9.cubeList.add(new ModelBox(LeftLeg9, 34, 67, 0.0F, -9.218F, 2.864F, 5, 6, 1, 0.0F, false));

		LeftLeg10 = new ModelRenderer(this);
		LeftLeg10.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(LeftLeg10);
		LeftLeg10.cubeList.add(new ModelBox(LeftLeg10, 0, 0, 4.75F, -8.35F, -3.75F, 1, 7, 1, 0.0F, false));

		LeftLeg11 = new ModelRenderer(this);
		LeftLeg11.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(LeftLeg11);
		LeftLeg11.cubeList.add(new ModelBox(LeftLeg11, 4, 0, 4.75F, -8.35F, 2.75F, 1, 7, 1, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 28, 0, -4.0F, -12.1F, -2.0F, 4, 1, 4, 0.0F, false));

		RightLeg6_r1 = new ModelRenderer(this);
		RightLeg6_r1.setRotationPoint(0.0F, -9.0F, -4.0F);
		RightLeg.addChild(RightLeg6_r1);
		setRotationAngle(RightLeg6_r1, -0.3054F, 0.0F, 0.0F);
		
		RightLeg5_r1 = new ModelRenderer(this);
		RightLeg5_r1.setRotationPoint(0.0F, -9.0F, 3.0F);
		RightLeg.addChild(RightLeg5_r1);
		setRotationAngle(RightLeg5_r1, 0.3054F, 0.0F, 0.0F);
		
		RightLeg4_r1 = new ModelRenderer(this);
		RightLeg4_r1.setRotationPoint(-5.0F, -9.0F, -3.0F);
		RightLeg.addChild(RightLeg4_r1);
		setRotationAngle(RightLeg4_r1, 0.0F, 0.0F, 0.3054F);
		
		RightLeg3_r1 = new ModelRenderer(this);
		RightLeg3_r1.setRotationPoint(0.0F, -3.0F, 3.0F);
		RightLeg.addChild(RightLeg3_r1);
		setRotationAngle(RightLeg3_r1, 0.48F, 0.0F, 0.0F);
		
		RightLeg2_r1 = new ModelRenderer(this);
		RightLeg2_r1.setRotationPoint(-5.0F, -2.0F, -4.0F);
		RightLeg.addChild(RightLeg2_r1);
		setRotationAngle(RightLeg2_r1, 0.0F, 0.0F, 0.48F);
		
		RightLeg1_r1 = new ModelRenderer(this);
		RightLeg1_r1.setRotationPoint(0.0F, -3.0F, -4.0F);
		RightLeg.addChild(RightLeg1_r1);
		setRotationAngle(RightLeg1_r1, -0.48F, 0.0F, 0.0F);
		
		InnerRightLeg = new ModelRenderer(this);
		InnerRightLeg.setRotationPoint(0.0F, -2.0F, -3.0F);
		RightLeg.addChild(InnerRightLeg);
		InnerRightLeg.cubeList.add(new ModelBox(InnerRightLeg, 38, 0, 0.0F, -7.25F, 0.0F, 1, 7, 6, 0.0F, false));

		RightLeg1 = new ModelRenderer(this);
		RightLeg1.setRotationPoint(0.0F, -3.0F, -4.0F);
		RightLeg.addChild(RightLeg1);
		setRotationAngle(RightLeg1, -0.48F, 0.0F, 0.0F);
		RightLeg1.cubeList.add(new ModelBox(RightLeg1, 66, 0, -5.0F, -0.363F, -0.03F, 5, 2, 1, 0.0F, false));

		RightLeg2 = new ModelRenderer(this);
		RightLeg2.setRotationPoint(-5.0F, -2.0F, -4.0F);
		RightLeg.addChild(RightLeg2);
		setRotationAngle(RightLeg2, 0.0F, 0.0F, 0.48F);
		RightLeg2.cubeList.add(new ModelBox(RightLeg2, 56, 27, -1.377F, -0.79F, 1.0F, 1, 2, 6, 0.0F, false));

		RightLeg3 = new ModelRenderer(this);
		RightLeg3.setRotationPoint(0.0F, -3.0F, 3.0F);
		RightLeg.addChild(RightLeg3);
		setRotationAngle(RightLeg3, 0.48F, 0.0F, 0.0F);
		RightLeg3.cubeList.add(new ModelBox(RightLeg3, 69, 58, -5.0F, 0.1F, -0.078F, 5, 2, 1, 0.0F, false));

		RightLeg4 = new ModelRenderer(this);
		RightLeg4.setRotationPoint(-5.0F, -9.0F, -3.0F);
		RightLeg.addChild(RightLeg4);
		setRotationAngle(RightLeg4, 0.0F, 0.0F, 0.3054F);
		RightLeg4.cubeList.add(new ModelBox(RightLeg4, 48, 36, -0.88F, -2.945F, 0.0F, 1, 3, 6, 0.0F, false));

		RightLeg5 = new ModelRenderer(this);
		RightLeg5.setRotationPoint(0.0F, -9.0F, 3.0F);
		RightLeg.addChild(RightLeg5);
		setRotationAngle(RightLeg5, 0.3054F, 0.0F, 0.0F);
		RightLeg5.cubeList.add(new ModelBox(RightLeg5, 34, 41, -5.0F, -2.948F, -0.11F, 5, 3, 1, 0.0F, false));

		RightLeg6 = new ModelRenderer(this);
		RightLeg6.setRotationPoint(0.0F, -9.0F, -4.0F);
		RightLeg.addChild(RightLeg6);
		setRotationAngle(RightLeg6, -0.3054F, 0.0F, 0.0F);
		RightLeg6.cubeList.add(new ModelBox(RightLeg6, 68, 17, -5.0F, -3.25F, 0.07F, 5, 3, 1, 0.0F, false));

		RightLeg7 = new ModelRenderer(this);
		RightLeg7.setRotationPoint(-5.0F, -5.0F, -3.0F);
		RightLeg.addChild(RightLeg7);
		RightLeg7.cubeList.add(new ModelBox(RightLeg7, 0, 42, -0.855F, -4.214F, 0.0F, 1, 6, 6, 0.0F, false));

		RightLeg8 = new ModelRenderer(this);
		RightLeg8.setRotationPoint(-5.0F, -5.0F, -3.0F);
		RightLeg.addChild(RightLeg8);
		RightLeg8.cubeList.add(new ModelBox(RightLeg8, 69, 26, 0.0F, -4.218F, 5.864F, 5, 6, 1, 0.0F, false));

		RightLeg9 = new ModelRenderer(this);
		RightLeg9.setRotationPoint(-5.0F, -5.0F, -3.0F);
		RightLeg.addChild(RightLeg9);
		RightLeg9.cubeList.add(new ModelBox(RightLeg9, 48, 65, 0.0F, -4.219F, -0.858F, 5, 6, 1, 0.0F, false));

		RightLeg10 = new ModelRenderer(this);
		RightLeg10.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightLeg.addChild(RightLeg10);
		RightLeg10.cubeList.add(new ModelBox(RightLeg10, 4, 9, -5.75F, -8.35F, -3.75F, 1, 7, 1, 0.0F, false));

		RightLeg11 = new ModelRenderer(this);
		RightLeg11.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightLeg.addChild(RightLeg11);
		RightLeg11.cubeList.add(new ModelBox(RightLeg11, 0, 9, -5.75F, -8.35F, 2.75F, 1, 7, 1, 0.0F, false));

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(2.0F, 12.0F, -3.0F);
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 10, 9, 0.0F, -3.0F, 1.0F, 1, 3, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 8, 42, -4.0F, -3.0F, 5.0F, 4, 3, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 66, 68, -5.0F, -3.0F, 1.0F, 1, 3, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 18, 31, -4.0F, -3.0F, 0.0F, 4, 3, 1, 0.0F, false));

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(-1.9F, 12.0F, -2.0F);
		RightBoot.cubeList.add(new ModelBox(RightBoot, 0, 69, 3.9F, -3.0F, 0.0F, 1, 3, 4, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 70, 21, -0.1F, -3.0F, -1.0F, 4, 3, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 70, 45, -0.1F, -3.0F, 4.0F, 4, 3, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 42, 70, -1.1F, -3.0F, 0.0F, 1, 3, 4, 0.0F, false));

		this.bipedHead.addChild(Hood);
	    this.bipedBody.addChild(Chest);
	    this.bipedLeftArm.addChild(LeftArm);
	    this.bipedRightArm.addChild(RightArm);
	    this.bipedLeftLeg.addChild(LeftLeg);
	    this.bipedRightLeg.addChild(RightLeg);
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