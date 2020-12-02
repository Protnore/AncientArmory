package com.protnore.ancientarmory.objects.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.1
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Karil_Armor extends ModelBiped {
	
	public final ModelRenderer RightArm;
	public final ModelRenderer RightArmSpike3_r1;
	public final ModelRenderer RightArmSpike2_r1;
	public final ModelRenderer RightArmSpike1;
	public final ModelRenderer RightArmSpike2;
	public final ModelRenderer RightArmSpike3;
	public final ModelRenderer LeftArm;
	public final ModelRenderer LeftArmSpike3_r1;
	public final ModelRenderer LeftArmSpike2_r1;
	public final ModelRenderer LeftArmSpike1;
	public final ModelRenderer LeftArmSpike2;
	public final ModelRenderer LeftArmSpike3;
	public final ModelRenderer Helmet;
	public final ModelRenderer Helmet3_r1;
	public final ModelRenderer Helmet2_r1;
	public final ModelRenderer Helmet1_r1;
	public final ModelRenderer Helmet1;
	public final ModelRenderer Helmet2;
	public final ModelRenderer Helmet3;
	public final ModelRenderer ChestSpikes;
	public final ModelRenderer ChestSpike7_r1;
	public final ModelRenderer ChestSpike5_r1;
	public final ModelRenderer ChestSpike3_r1;
	public final ModelRenderer ChestSpike2_r1;
	public final ModelRenderer ChestSpike1;
	public final ModelRenderer ChestSpike2;
	public final ModelRenderer ChestSpike3;
	public final ModelRenderer ChestSpike4;
	public final ModelRenderer ChestSpike5;
	public final ModelRenderer ChestSpike6;
	public final ModelRenderer ChestSpike7;
	public final ModelRenderer BackSpikes;
	public final ModelRenderer BackSpike3_r1;
	public final ModelRenderer BackSpike2_r1;
	public final ModelRenderer BackSpike1;
	public final ModelRenderer BackSpike2;
	public final ModelRenderer BackSpike3;
	public final ModelRenderer Chest;
	public final ModelRenderer RightLeg;
	public final ModelRenderer RightLeg2_r1;
	public final ModelRenderer RightLeg3_r1;
	public final ModelRenderer RightLeg1_r1;
	public final ModelRenderer RightLeg1;
	public final ModelRenderer RightLeg3;
	public final ModelRenderer RightLeg2;
	public final ModelRenderer LeftLeg;
	public final ModelRenderer LeftLeg3_r1;
	public final ModelRenderer LeftLeg2_r1;
	public final ModelRenderer LeftLeg1_r1;
	public final ModelRenderer LeftLeg1;
	public final ModelRenderer LeftLeg2;
	public final ModelRenderer LeftLeg3;
	public final ModelRenderer RightBoot;
	public final ModelRenderer LeftBoot;

	public Karil_Armor() {

		textureWidth = 1024;
		textureHeight = 1024;

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(2.0F, -1.0F, -3.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 52, 0, -5.0F, -2.0F, 1.0F, 5, 1, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 52, 5, -5.0F, -1.0F, 5.0F, 5, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 40, 61, -4.0F, 0.0F, 4.5F, 4, 10, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 46, 46, -4.5F, -1.0F, 1.0F, 1, 11, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 21, 65, -4.0F, 0.0F, 0.5F, 4, 10, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 44, 12, -5.0F, -1.0F, 0.0F, 5, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 20, 42, -0.5F, -1.0F, 1.0F, 1, 11, 4, 0.0F, false));

		RightArmSpike3_r1 = new ModelRenderer(this);
		RightArmSpike3_r1.setRotationPoint(-3.0F, -1.0F, 5.0F);
		RightArm.addChild(RightArmSpike3_r1);
		setRotationAngle(RightArmSpike3_r1, 0.0F, 0.0F, -0.7854F);

		RightArmSpike2_r1 = new ModelRenderer(this);
		RightArmSpike2_r1.setRotationPoint(-3.0F, -2.0F, 2.5F);
		RightArm.addChild(RightArmSpike2_r1);
		setRotationAngle(RightArmSpike2_r1, 0.0F, 0.0F, -0.7854F);
	
		RightArmSpike1 = new ModelRenderer(this);
		RightArmSpike1.setRotationPoint(-3.0F, -1.0F, 0.0F);
		RightArm.addChild(RightArmSpike1);
		setRotationAngle(RightArmSpike1, 0.0F, 0.0F, -0.7854F);
		RightArmSpike1.cubeList.add(new ModelBox(RightArmSpike1, 3, 3, -0.7292F, -0.7292F, 0.1F, 1, 1, 1, 0.0F, false));

		RightArmSpike2 = new ModelRenderer(this);
		RightArmSpike2.setRotationPoint(-3.0F, -2.0F, 2.5F);
		RightArm.addChild(RightArmSpike2);
		setRotationAngle(RightArmSpike2, 0.0F, 0.0F, -0.7854F);
		RightArmSpike2.cubeList.add(new ModelBox(RightArmSpike2, 0, 2, -0.7292F, -0.7292F, 0.0F, 1, 1, 1, 0.0F, false));

		RightArmSpike3 = new ModelRenderer(this);
		RightArmSpike3.setRotationPoint(-3.0F, -1.0F, 5.0F);
		RightArm.addChild(RightArmSpike3);
		setRotationAngle(RightArmSpike3, 0.0F, 0.0F, -0.7854F);
		RightArmSpike3.cubeList.add(new ModelBox(RightArmSpike3, 0, 0, -0.7292F, -0.7292F, -0.1F, 1, 1, 1, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(3.0F, -1.0F, -3.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 48, 22, -5.5F, -1.0F, 1.0F, 1, 11, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 66, -5.0F, 0.0F, 4.5F, 4, 10, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 30, 50, -1.5F, -1.0F, 1.0F, 1, 11, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 10, 66, -5.0F, 0.0F, 0.5F, 4, 10, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 52, 48, -5.0F, -1.0F, 5.0F, 5, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 52, 12, -5.0F, -2.0F, 1.0F, 5, 1, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 66, 52, -5.0F, -1.0F, 0.0F, 5, 1, 1, 0.0F, false));

		LeftArmSpike3_r1 = new ModelRenderer(this);
		LeftArmSpike3_r1.setRotationPoint(-1.0F, -1.0F, 0.0F);
		LeftArm.addChild(LeftArmSpike3_r1);
		setRotationAngle(LeftArmSpike3_r1, 0.0F, 0.0F, -0.7854F);
		
		LeftArmSpike2_r1 = new ModelRenderer(this);
		LeftArmSpike2_r1.setRotationPoint(-1.0F, -2.0F, 2.5F);
		LeftArm.addChild(LeftArmSpike2_r1);
		setRotationAngle(LeftArmSpike2_r1, 0.0F, 0.0F, -0.7854F);
		
		LeftArmSpike1 = new ModelRenderer(this);
		LeftArmSpike1.setRotationPoint(-1.0F, -1.0F, 5.0F);
		LeftArm.addChild(LeftArmSpike1);
		setRotationAngle(LeftArmSpike1, 0.0F, 0.0F, -0.7854F);
		LeftArmSpike1.cubeList.add(new ModelBox(LeftArmSpike1, 0, 4, -1.0F, -1.0F, -0.1F, 1, 1, 1, 0.0F, false));

		LeftArmSpike2 = new ModelRenderer(this);
		LeftArmSpike2.setRotationPoint(-1.0F, -2.0F, 2.5F);
		LeftArm.addChild(LeftArmSpike2);
		setRotationAngle(LeftArmSpike2, 0.0F, 0.0F, -0.7854F);
		LeftArmSpike2.cubeList.add(new ModelBox(LeftArmSpike2, 3, 5, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		LeftArmSpike3 = new ModelRenderer(this);
		LeftArmSpike3.setRotationPoint(-1.0F, -1.0F, 0.0F);
		LeftArm.addChild(LeftArmSpike3);
		setRotationAngle(LeftArmSpike3, 0.0F, 0.0F, -0.7854F);
		LeftArmSpike3.cubeList.add(new ModelBox(LeftArmSpike3, 3, 1, -1.0F, -1.0F, 0.1F, 1, 1, 1, 0.0F, false));

		Helmet = new ModelRenderer(this);
		Helmet.setRotationPoint(4.0F, 0.0F, 4.0F);
		setRotationAngle(Helmet, -3.1416F, 0.0F, 3.1416F);
		Helmet.cubeList.add(new ModelBox(Helmet, 52, 43, 0.0F, -8.5F, -1.0F, 8, 4, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 22, 0, 8.0F, -8.5F, -1.0F, 1, 4, 10, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 0, 0.0F, -9.0F, 0.0F, 8, 1, 8, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 24, -1.0F, -8.5F, -1.0F, 1, 4, 10, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 52, 17, 0.0F, -9.0F, 8.0F, 8, 4, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 44, 7, -0.5F, -3.0F, 7.5F, 9, 4, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 14, 30, 8.0F, -4.0F, 0.0F, 1, 4, 8, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 50, 37, 0.0F, -4.0F, -1.0F, 8, 5, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 26, 26, -1.0F, -4.0F, 0.0F, 1, 4, 8, 0.0F, false));

		Helmet3_r1 = new ModelRenderer(this);
		Helmet3_r1.setRotationPoint(9.0F, -5.0F, 4.0F);
		Helmet.addChild(Helmet3_r1);
		setRotationAngle(Helmet3_r1, 0.0F, 0.0F, -0.2182F);
		
		Helmet2_r1 = new ModelRenderer(this);
		Helmet2_r1.setRotationPoint(4.0F, -5.0F, -1.0F);
		Helmet.addChild(Helmet2_r1);
		setRotationAngle(Helmet2_r1, -0.2182F, 0.0F, 0.0F);
		
		Helmet1_r1 = new ModelRenderer(this);
		Helmet1_r1.setRotationPoint(-1.0F, -5.0F, 4.0F);
		Helmet.addChild(Helmet1_r1);
		setRotationAngle(Helmet1_r1, 0.0F, 0.0F, 0.2182F);
		
		Helmet1 = new ModelRenderer(this);
		Helmet1.setRotationPoint(-1.0F, -5.0F, 4.0F);
		Helmet.addChild(Helmet1);
		setRotationAngle(Helmet1, 0.0F, 0.0F, 0.2182F);
		Helmet1.cubeList.add(new ModelBox(Helmet1, 0, 9, 0.1F, 0.5F, -5.0F, 1, 5, 10, 0.0F, false));

		Helmet2 = new ModelRenderer(this);
		Helmet2.setRotationPoint(4.0F, -5.0F, -1.0F);
		Helmet.addChild(Helmet2);
		setRotationAngle(Helmet2, -0.2182F, 0.0F, 0.0F);
		Helmet2.cubeList.add(new ModelBox(Helmet2, 34, 0, -4.0F, 0.5F, 0.1F, 8, 6, 1, 0.0F, false));

		Helmet3 = new ModelRenderer(this);
		Helmet3.setRotationPoint(9.0F, -5.0F, 4.0F);
		Helmet.addChild(Helmet3);
		setRotationAngle(Helmet3, 0.0F, 0.0F, -0.2182F);
		Helmet3.cubeList.add(new ModelBox(Helmet3, 12, 14, -1.1F, 0.5F, -5.0F, 1, 5, 10, 0.0F, false));

		ChestSpikes = new ModelRenderer(this);
		ChestSpikes.setRotationPoint(0.0F, 24.0F, 0.0F);
		
		ChestSpike7_r1 = new ModelRenderer(this);
		ChestSpike7_r1.setRotationPoint(-2.0F, -13.0F, 3.0F);
		ChestSpikes.addChild(ChestSpike7_r1);
		setRotationAngle(ChestSpike7_r1, -0.7854F, 0.0F, 0.0F);
		
		ChestSpike5_r1 = new ModelRenderer(this);
		ChestSpike5_r1.setRotationPoint(-2.0F, -16.0F, 3.0F);
		ChestSpikes.addChild(ChestSpike5_r1);
		setRotationAngle(ChestSpike5_r1, -0.7854F, 0.0F, 0.0F);
		
		ChestSpike3_r1 = new ModelRenderer(this);
		ChestSpike3_r1.setRotationPoint(0.5F, -19.0F, 3.0F);
		ChestSpikes.addChild(ChestSpike3_r1);
		setRotationAngle(ChestSpike3_r1, -0.7854F, 0.0F, 0.0F);
		
		ChestSpike2_r1 = new ModelRenderer(this);
		ChestSpike2_r1.setRotationPoint(-2.0F, -21.0F, 3.0F);
		ChestSpikes.addChild(ChestSpike2_r1);
		setRotationAngle(ChestSpike2_r1, -0.7854F, 0.0F, 0.0F);
		
		ChestSpike1 = new ModelRenderer(this);
		ChestSpike1.setRotationPoint(3.0F, -21.0F, 3.0F);
		ChestSpikes.addChild(ChestSpike1);
		setRotationAngle(ChestSpike1, -0.7854F, 0.0F, 0.0F);
		ChestSpike1.cubeList.add(new ModelBox(ChestSpike1, 18, 11, -1.0F, 3.7426F, -4.7426F, 1, 1, 1, 0.0F, false));

		ChestSpike2 = new ModelRenderer(this);
		ChestSpike2.setRotationPoint(-2.0F, -21.0F, 3.0F);
		ChestSpikes.addChild(ChestSpike2);
		setRotationAngle(ChestSpike2, -0.7854F, 0.0F, 0.0F);
		ChestSpike2.cubeList.add(new ModelBox(ChestSpike2, 0, 24, -1.0F, 3.7426F, -4.7426F, 1, 1, 1, 0.0F, false));

		ChestSpike3 = new ModelRenderer(this);
		ChestSpike3.setRotationPoint(0.5F, -19.0F, 3.0F);
		ChestSpikes.addChild(ChestSpike3);
		setRotationAngle(ChestSpike3, -0.7854F, 0.0F, 0.0F);
		ChestSpike3.cubeList.add(new ModelBox(ChestSpike3, 0, 11, -1.0F, 3.7426F, -4.7426F, 1, 1, 1, 0.0F, false));

		ChestSpike4 = new ModelRenderer(this);
		ChestSpike4.setRotationPoint(3.0F, -16.0F, 3.0F);
		ChestSpikes.addChild(ChestSpike4);
		setRotationAngle(ChestSpike4, -0.7854F, 0.0F, 0.0F);
		ChestSpike4.cubeList.add(new ModelBox(ChestSpike4, 18, 9, -1.0F, 3.7426F, -4.7426F, 1, 1, 1, 0.0F, false));

		ChestSpike5 = new ModelRenderer(this);
		ChestSpike5.setRotationPoint(-2.0F, -16.0F, 3.0F);
		ChestSpikes.addChild(ChestSpike5);
		setRotationAngle(ChestSpike5, -0.7854F, 0.0F, 0.0F);
		ChestSpike5.cubeList.add(new ModelBox(ChestSpike5, 12, 9, -1.0F, 3.7426F, -4.7426F, 1, 1, 1, 0.0F, false));

		ChestSpike6 = new ModelRenderer(this);
		ChestSpike6.setRotationPoint(3.0F, -13.0F, 3.0F);
		ChestSpikes.addChild(ChestSpike6);
		setRotationAngle(ChestSpike6, -0.7854F, 0.0F, 0.0F);
		ChestSpike6.cubeList.add(new ModelBox(ChestSpike6, 12, 11, -1.0F, 3.7426F, -4.7426F, 1, 1, 1, 0.0F, false));

		ChestSpike7 = new ModelRenderer(this);
		ChestSpike7.setRotationPoint(-2.0F, -13.0F, 3.0F);
		ChestSpikes.addChild(ChestSpike7);
		setRotationAngle(ChestSpike7, -0.7854F, 0.0F, 0.0F);
		ChestSpike7.cubeList.add(new ModelBox(ChestSpike7, 6, 11, -1.0F, 3.7426F, -4.7426F, 1, 1, 1, 0.0F, false));

		BackSpikes = new ModelRenderer(this);
		BackSpikes.setRotationPoint(0.0F, 24.0F, 0.0F);
		
		BackSpike3_r1 = new ModelRenderer(this);
		BackSpike3_r1.setRotationPoint(-2.0F, -20.0F, -4.0F);
		BackSpikes.addChild(BackSpike3_r1);
		setRotationAngle(BackSpike3_r1, -0.7854F, 0.0F, 0.0F);
		
		BackSpike2_r1 = new ModelRenderer(this);
		BackSpike2_r1.setRotationPoint(0.5F, -21.0F, -4.0F);
		BackSpikes.addChild(BackSpike2_r1);
		setRotationAngle(BackSpike2_r1, -0.7854F, 0.0F, 0.0F);
		
		BackSpike1 = new ModelRenderer(this);
		BackSpike1.setRotationPoint(3.0F, -20.0F, -4.0F);
		BackSpikes.addChild(BackSpike1);
		setRotationAngle(BackSpike1, -0.7854F, 0.0F, 0.0F);
		BackSpike1.cubeList.add(new ModelBox(BackSpike1, 0, 9, -1.0F, -5.2426F, 4.7426F, 1, 1, 1, 0.0F, false));

		BackSpike2 = new ModelRenderer(this);
		BackSpike2.setRotationPoint(0.5F, -21.0F, -4.0F);
		BackSpikes.addChild(BackSpike2);
		setRotationAngle(BackSpike2, -0.7854F, 0.0F, 0.0F);
		BackSpike2.cubeList.add(new ModelBox(BackSpike2, 6, 9, -1.0F, -5.7426F, 4.2426F, 1, 1, 1, 0.0F, false));

		BackSpike3 = new ModelRenderer(this);
		BackSpike3.setRotationPoint(-2.0F, -20.0F, -4.0F);
		BackSpikes.addChild(BackSpike3);
		setRotationAngle(BackSpike3, -0.7854F, 0.0F, 0.0F);
		BackSpike3.cubeList.add(new ModelBox(BackSpike3, 0, 6, -1.0F, -5.2426F, 4.7426F, 1, 1, 1, 0.0F, false));

		Chest = new ModelRenderer(this);
		Chest.setRotationPoint(-5.0F, 12.0F, 2.0F);
		setRotationAngle(Chest, 0.0F, 3.1416F, 0.0F);
		Chest.cubeList.add(new ModelBox(Chest, 32, 38, -9.0F, -11.0F, 4.0F, 8, 11, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 0, 38, -9.5F, -11.0F, 0.0F, 1, 11, 4, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 34, 14, -9.0F, -11.0F, -1.0F, 8, 11, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 10, 42, -1.5F, -11.0F, 0.0F, 1, 11, 4, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(3.0F, 6.0F, -3.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 66, 57, -6.0F, -3.22F, 5.86F, 5, 3, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 8, 57, -6.855F, -3.214F, 0.0F, 1, 3, 6, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 66, 0, -6.0F, -3.22F, -0.86F, 5, 3, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 58, 58, -1.0F, -5.0F, 0.0F, 1, 3, 6, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 58, 58, -1.0F, -6.0F, 0.0F, 1, 1, 6, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 83, 0, -5.0F, -6.1F, 1.0F, 4, 1, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 12, 9, -1.0F, -2.0F, 1.0F, 1, 5, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 9, -5.5F, -2.0F, 1.0F, 1, 5, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 58, 31, -5.0F, -2.0F, 0.5F, 4, 5, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 66, 22, -5.0F, -2.0F, 4.5F, 4, 5, 1, 0.0F, false));

		RightLeg2_r1 = new ModelRenderer(this);
		RightLeg2_r1.setRotationPoint(-6.0F, -3.0F, 0.0F);
		RightLeg.addChild(RightLeg2_r1);
		setRotationAngle(RightLeg2_r1, 0.0F, 0.0F, 0.3054F);
		
		RightLeg3_r1 = new ModelRenderer(this);
		RightLeg3_r1.setRotationPoint(-1.0F, -3.0F, 6.0F);
		RightLeg.addChild(RightLeg3_r1);
		setRotationAngle(RightLeg3_r1, 0.3054F, 0.0F, 0.0F);
		
		RightLeg1_r1 = new ModelRenderer(this);
		RightLeg1_r1.setRotationPoint(-1.0F, -3.0F, -1.0F);
		RightLeg.addChild(RightLeg1_r1);
		setRotationAngle(RightLeg1_r1, -0.3054F, 0.0F, 0.0F);
		
		RightLeg1 = new ModelRenderer(this);
		RightLeg1.setRotationPoint(-1.0F, -3.0F, -1.0F);
		RightLeg.addChild(RightLeg1);
		setRotationAngle(RightLeg1, -0.3054F, 0.0F, 0.0F);
		RightLeg1.cubeList.add(new ModelBox(RightLeg1, 68, 35, -5.0F, -3.25F, 0.07F, 5, 3, 1, 0.0F, false));

		RightLeg3 = new ModelRenderer(this);
		RightLeg3.setRotationPoint(-1.0F, -3.0F, 6.0F);
		RightLeg.addChild(RightLeg3);
		setRotationAngle(RightLeg3, 0.3054F, 0.0F, 0.0F);
		RightLeg3.cubeList.add(new ModelBox(RightLeg3, 60, 67, -5.0F, -2.948F, -0.11F, 5, 3, 1, 0.0F, false));

		RightLeg2 = new ModelRenderer(this);
		RightLeg2.setRotationPoint(-6.0F, -3.0F, 0.0F);
		RightLeg.addChild(RightLeg2);
		setRotationAngle(RightLeg2, 0.0F, 0.0F, 0.3054F);
		RightLeg2.cubeList.add(new ModelBox(RightLeg2, 0, 53, -0.88F, -2.945F, 0.0F, 1, 3, 6, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(3.0F, 4.0F, 3.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 83, 0, -5.0F, -4.1F, -5.0F, 4, 1, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 58, 58, -6.0F, -4.0F, -6.0F, 1, 1, 6, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 58, 58, -6.0F, -3.0F, -6.0F, 1, 3, 6, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 66, 11, -5.0F, -1.22F, -6.86F, 5, 3, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 50, 55, -0.14F, -1.23F, -6.0F, 1, 3, 6, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 66, 48, -5.0F, -1.22F, -0.14F, 5, 3, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 16, 57, -5.0F, 0.0F, -1.5F, 4, 5, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 12, 9, -1.5F, 0.0F, -5.0F, 1, 5, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 64, 5, -5.0F, 0.0F, -5.5F, 4, 5, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 9, -6.0F, 0.0F, -5.0F, 1, 5, 4, 0.0F, false));

		LeftLeg3_r1 = new ModelRenderer(this);
		LeftLeg3_r1.setRotationPoint(0.0F, -1.0F, 0.0F);
		LeftLeg.addChild(LeftLeg3_r1);
		setRotationAngle(LeftLeg3_r1, 0.3054F, 0.0F, 0.0F);
		
		LeftLeg2_r1 = new ModelRenderer(this);
		LeftLeg2_r1.setRotationPoint(1.0F, -1.0F, -6.0F);
		LeftLeg.addChild(LeftLeg2_r1);
		setRotationAngle(LeftLeg2_r1, 0.0F, 0.0F, -0.3054F);
		
		LeftLeg1_r1 = new ModelRenderer(this);
		LeftLeg1_r1.setRotationPoint(0.0F, -1.0F, -7.0F);
		LeftLeg.addChild(LeftLeg1_r1);
		setRotationAngle(LeftLeg1_r1, -0.3054F, 0.0F, 0.0F);
		
		LeftLeg1 = new ModelRenderer(this);
		LeftLeg1.setRotationPoint(0.0F, -1.0F, -7.0F);
		LeftLeg.addChild(LeftLeg1);
		setRotationAngle(LeftLeg1, -0.3054F, 0.0F, 0.0F);
		LeftLeg1.cubeList.add(new ModelBox(LeftLeg1, 68, 39, -5.0F, -3.25F, 0.07F, 5, 3, 1, 0.0F, false));

		LeftLeg2 = new ModelRenderer(this);
		LeftLeg2.setRotationPoint(1.0F, -1.0F, -6.0F);
		LeftLeg.addChild(LeftLeg2);
		setRotationAngle(LeftLeg2, 0.0F, 0.0F, -0.3054F);
		LeftLeg2.cubeList.add(new ModelBox(LeftLeg2, 58, 48, -1.065F, -3.25F, 0.0F, 1, 3, 6, 0.0F, false));

		LeftLeg3 = new ModelRenderer(this);
		LeftLeg3.setRotationPoint(0.0F, -1.0F, 0.0F);
		LeftLeg.addChild(LeftLeg3);
		setRotationAngle(LeftLeg3, 0.3054F, 0.0F, 0.0F);
		LeftLeg3.cubeList.add(new ModelBox(LeftLeg3, 68, 31, -5.0F, -2.948F, -0.11F, 5, 3, 1, 0.0F, false));

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(2.1F, 12.0F, -3.0F);
		RightBoot.cubeList.add(new ModelBox(RightBoot, 54, 22, -4.1F, -3.0F, 5.0F, 4, 3, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 36, 26, -0.1F, -3.0F, 1.0F, 1, 3, 4, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 50, 64, -5.1F, -3.0F, 1.0F, 1, 3, 4, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 36, 50, -4.1F, -3.0F, 0.0F, 4, 3, 1, 0.0F, false));

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(3.0F, 12.0F, -2.0F);
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 24, 29, -5.0F, -3.0F, 4.0F, 4, 3, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 24, 14, -6.0F, -3.0F, 0.0F, 1, 3, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 12, 29, -5.0F, -3.0F, -1.0F, 4, 3, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 0, 24, -1.0F, -3.0F, 0.0F, 1, 3, 4, 0.0F, false));
		
		    this.bipedHead.addChild(Helmet);
		    this.bipedBody.addChild(Chest);
		    this.bipedBody.addChild(ChestSpikes);
		    this.bipedBody.addChild(BackSpikes);
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