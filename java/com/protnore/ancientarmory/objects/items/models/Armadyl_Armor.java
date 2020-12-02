package com.protnore.ancientarmory.objects.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.1
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Armadyl_Armor extends ModelBiped {
	
	public final ModelRenderer Helmet;
	public final ModelRenderer Beak567_r1;
	public final ModelRenderer Beak56_r1;
	public final ModelRenderer Beak67_r1;
	public final ModelRenderer beak65_r1;
	public final ModelRenderer Crest2_r1;
	public final ModelRenderer Crest1_r1;
	public final ModelRenderer Beak6_r1;
	public final ModelRenderer Beak5_r1;
	public final ModelRenderer Beak4_r1;
	public final ModelRenderer Beak3_r1;
	public final ModelRenderer Beak2_r1;
	public final ModelRenderer Beak1_r1;
	public final ModelRenderer Beak1;
	public final ModelRenderer Beak2;
	public final ModelRenderer Beak3;
	public final ModelRenderer Beak4;
	public final ModelRenderer Beak5;
	public final ModelRenderer Beak6;
	public final ModelRenderer Beak7;
	public final ModelRenderer Crest1;
	public final ModelRenderer Crest2;
	public final ModelRenderer beak65;
	public final ModelRenderer Beak67;
	public final ModelRenderer Beak56;
	public final ModelRenderer Beak567;
	public final ModelRenderer Chestplate;
	public final ModelRenderer LeftArm;
	public final ModelRenderer LeftShoulderTilt_r1;
	public final ModelRenderer LeftArm2;
	public final ModelRenderer LeftShoulderTilt;
	public final ModelRenderer RightArm;
	public final ModelRenderer RightShoulderTilt_r1;
	public final ModelRenderer RightArm1;
	public final ModelRenderer RightShoulderTilt;
	public final ModelRenderer LeftLeg;
	public final ModelRenderer TopLeftFrontDress_r1;
	public final ModelRenderer TopLeftBackDress_r1;
	public final ModelRenderer TopLeftLeftDress_r1;
	public final ModelRenderer BottomFrontLeftDress_r1;
	public final ModelRenderer BottomLeftLeftDress_r1;
	public final ModelRenderer BottomLeftBackDress_r1;
	public final ModelRenderer BottomLeftBackDress;
	public final ModelRenderer BottomLeftLeftDress;
	public final ModelRenderer BottomFrontLeftDress;
	public final ModelRenderer TopLeftLeftDress;
	public final ModelRenderer TopLeftBackDress;
	public final ModelRenderer TopLeftFrontDress;
	public final ModelRenderer MiscLeftLeg;
	public final ModelRenderer RightLeg;
	public final ModelRenderer TopFrontRightDress_r1;
	public final ModelRenderer TopRightBackDress_r1;
	public final ModelRenderer BottomFrontRightDress_r1;
	public final ModelRenderer TopRightRightDress_r1;
	public final ModelRenderer BottomRightBackDress_r1;
	public final ModelRenderer BottomRightRightDress_r1;
	public final ModelRenderer BottomRightRightDress;
	public final ModelRenderer BottomRightBackDress;
	public final ModelRenderer TopRightRightDress;
	public final ModelRenderer BottomFrontRightDress;
	public final ModelRenderer TopRightBackDress;
	public final ModelRenderer TopFrontRightDress;
	public final ModelRenderer MiscRightLeg;
	public final ModelRenderer LeftBoot;
	public final ModelRenderer LeftKneeCap_r1;
	public final ModelRenderer LeftKneeCap;
	public final ModelRenderer RightBoot;
	public final ModelRenderer RightKneeCap_r1;
	public final ModelRenderer RightKneeCap;

	public Armadyl_Armor() {
		
		textureWidth = 1024;
		textureHeight = 1024;

		Helmet = new ModelRenderer(this);
		Helmet.setRotationPoint(5.0F, -2.0F, 2.0F);
		Helmet.cubeList.add(new ModelBox(Helmet, 40, 64, -10.0F, -4.0F, -7.0F, 2, 4, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 42, -2.0F, -4.0F, -7.0F, 2, 4, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 34, 48, -8.0F, -1.0F, -7.0F, 1, 1, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 8, 47, -3.0F, -1.0F, -7.0F, 1, 1, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 64, 66, -3.0F, 0.0F, -7.0F, 2, 1, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 58, 66, -9.0F, 0.0F, -7.0F, 2, 1, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 33, 33, -10.0F, -6.0F, -7.0F, 10, 2, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 20, 39, -8.0F, -4.0F, -7.0F, 6, 1, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 0, -10.0F, -7.0F, -7.0F, 10, 1, 10, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 22, 22, -5.5F, -9.0F, -7.0F, 1, 2, 9, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 11, 16, -10.0F, -6.0F, -6.0F, 1, 5, 9, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 66, -10.0F, -1.0F, 1.0F, 1, 2, 2, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 8, 45, -10.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 30, 0, -9.0F, -6.0F, 2.0F, 8, 9, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 11, -1.0F, -6.0F, -6.0F, 1, 5, 9, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 48, 12, -1.0F, -1.0F, 1.0F, 1, 2, 2, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 28, 43, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 8, 40, -5.5F, -1.0F, -10.0F, 1, 1, 4, 0.0F, false));

		Beak567_r1 = new ModelRenderer(this);
		Beak567_r1.setRotationPoint(-4.0F, -1.0F, -12.0F);
		Helmet.addChild(Beak567_r1);
		setRotationAngle(Beak567_r1, -0.2112F, 0.48F, -0.4363F);
		
		Beak56_r1 = new ModelRenderer(this);
		Beak56_r1.setRotationPoint(-5.0F, -1.0F, -12.0F);
		Helmet.addChild(Beak56_r1);
		setRotationAngle(Beak56_r1, -0.2112F, -0.48F, 0.4363F);
		
		Beak67_r1 = new ModelRenderer(this);
		Beak67_r1.setRotationPoint(-4.0F, -2.0F, -11.0F);
		Helmet.addChild(Beak67_r1);
		setRotationAngle(Beak67_r1, 0.3613F, 0.3875F, 0.7854F);
		
		beak65_r1 = new ModelRenderer(this);
		beak65_r1.setRotationPoint(-5.0F, -2.0F, -12.0F);
		Helmet.addChild(beak65_r1);
		setRotationAngle(beak65_r1, -0.4171F, -0.3194F, 0.9599F);
		
		Crest2_r1 = new ModelRenderer(this);
		Crest2_r1.setRotationPoint(-5.0F, -7.0F, 2.0F);
		Helmet.addChild(Crest2_r1);
		setRotationAngle(Crest2_r1, 0.7854F, 0.0F, 0.0F);
		
		Crest1_r1 = new ModelRenderer(this);
		Crest1_r1.setRotationPoint(-5.0F, -3.0F, -8.0F);
		Helmet.addChild(Crest1_r1);
		setRotationAngle(Crest1_r1, -0.166F, 0.0F, 0.0F);
		
		Beak6_r1 = new ModelRenderer(this);
		Beak6_r1.setRotationPoint(-5.0F, 0.0F, -14.0F);
		Helmet.addChild(Beak6_r1);
		setRotationAngle(Beak6_r1, 0.0F, 0.5236F, 0.0F);
		
		Beak5_r1 = new ModelRenderer(this);
		Beak5_r1.setRotationPoint(-4.0F, 0.0F, -13.0F);
		Helmet.addChild(Beak5_r1);
		setRotationAngle(Beak5_r1, 0.0F, -0.5236F, 0.0F);
		
		Beak4_r1 = new ModelRenderer(this);
		Beak4_r1.setRotationPoint(-2.0F, 0.0F, -5.0F);
		Helmet.addChild(Beak4_r1);
		setRotationAngle(Beak4_r1, 0.0F, -1.3963F, 0.0F);
		
		Beak3_r1 = new ModelRenderer(this);
		Beak3_r1.setRotationPoint(-7.0F, 0.0F, -9.0F);
		Helmet.addChild(Beak3_r1);
		setRotationAngle(Beak3_r1, 0.0F, 1.3963F, 0.0F);
		
		Beak2_r1 = new ModelRenderer(this);
		Beak2_r1.setRotationPoint(-5.0F, 0.0F, -13.0F);
		Helmet.addChild(Beak2_r1);
		setRotationAngle(Beak2_r1, 0.5672F, 0.0F, 0.0F);
		
		Beak1_r1 = new ModelRenderer(this);
		Beak1_r1.setRotationPoint(-5.0F, -2.0F, -11.0F);
		Helmet.addChild(Beak1_r1);
		setRotationAngle(Beak1_r1, 0.2182F, 0.0F, 0.0F);
		
		Beak1 = new ModelRenderer(this);
		Beak1.setRotationPoint(-5.0F, -2.0F, -11.0F);
		Helmet.addChild(Beak1);
		setRotationAngle(Beak1, 0.2182F, 0.0F, 0.0F);
		Beak1.cubeList.add(new ModelBox(Beak1, 42, 27, -0.5F, -1.1F, 0.0F, 1, 1, 5, 0.0F, false));

		Beak2 = new ModelRenderer(this);
		Beak2.setRotationPoint(-5.0F, 0.0F, -13.0F);
		Helmet.addChild(Beak2);
		setRotationAngle(Beak2, 0.5672F, 0.0F, 0.0F);
		Beak2.cubeList.add(new ModelBox(Beak2, 15, 64, -0.5F, -1.65F, 0.139F, 1, 1, 3, 0.0F, false));

		Beak3 = new ModelRenderer(this);
		Beak3.setRotationPoint(-7.0F, 0.0F, -9.0F);
		Helmet.addChild(Beak3);
		setRotationAngle(Beak3, 0.0F, 1.3963F, 0.0F);
		Beak3.cubeList.add(new ModelBox(Beak3, 20, 41, -4.0F, -1.0F, -0.5F, 5, 1, 1, 0.0F, false));

		Beak4 = new ModelRenderer(this);
		Beak4.setRotationPoint(-2.0F, 0.0F, -5.0F);
		Helmet.addChild(Beak4);
		setRotationAngle(Beak4, 0.0F, -1.3963F, 0.0F);
		Beak4.cubeList.add(new ModelBox(Beak4, 0, 40, -5.13F, -1.0F, -0.2F, 5, 1, 1, 0.0F, false));

		Beak5 = new ModelRenderer(this);
		Beak5.setRotationPoint(-4.0F, 0.0F, -13.0F);
		Helmet.addChild(Beak5);
		setRotationAngle(Beak5, 0.0F, -0.5236F, 0.0F);
		Beak5.cubeList.add(new ModelBox(Beak5, 63, 23, -1.41F, -1.0F, 0.195F, 1, 1, 4, 0.0F, false));

		Beak6 = new ModelRenderer(this);
		Beak6.setRotationPoint(-5.0F, 0.0F, -14.0F);
		Helmet.addChild(Beak6);
		setRotationAngle(Beak6, 0.0F, 0.5236F, 0.0F);
		Beak6.cubeList.add(new ModelBox(Beak6, 30, 61, -0.96F, -1.0F, 0.542F, 1, 1, 4, 0.0F, false));

		Beak7 = new ModelRenderer(this);
		Beak7.setRotationPoint(-4.5F, 2.0F, -13.8F);
		Helmet.addChild(Beak7);
		Beak7.cubeList.add(new ModelBox(Beak7, 0, 0, -1.0F, -3.463F, 0.033F, 1, 3, 1, 0.0F, false));

		Crest1 = new ModelRenderer(this);
		Crest1.setRotationPoint(-5.0F, -3.0F, -8.0F);
		Helmet.addChild(Crest1);
		setRotationAngle(Crest1, -0.166F, 0.0F, 0.0F);
		Crest1.cubeList.add(new ModelBox(Crest1, 18, 30, -0.5F, -6.082F, -0.005F, 1, 6, 1, 0.0F, false));

		Crest2 = new ModelRenderer(this);
		Crest2.setRotationPoint(-5.0F, -7.0F, 2.0F);
		Helmet.addChild(Crest2);
		setRotationAngle(Crest2, 0.7854F, 0.0F, 0.0F);
		Crest2.cubeList.add(new ModelBox(Crest2, 42, 30, -0.5F, -1.414F, 0.415F, 1, 1, 1, 0.0F, false));

		beak65 = new ModelRenderer(this);
		beak65.setRotationPoint(-5.0F, -2.0F, -12.0F);
		Helmet.addChild(beak65);
		setRotationAngle(beak65, -0.4171F, -0.3194F, 0.9599F);
		beak65.cubeList.add(new ModelBox(beak65, 11, 16, -0.347F, -0.44F, -0.05F, 1, 1, 3, 0.0F, false));
		beak65.cubeList.add(new ModelBox(beak65, 33, 36, -0.347F, -0.44F, -0.15F, 1, 1, 1, 0.0F, false));
		beak65.cubeList.add(new ModelBox(beak65, 32, 39, -0.347F, -1.1F, 0.95F, 1, 1, 2, 0.0F, false));
		beak65.cubeList.add(new ModelBox(beak65, 25, 68, -0.347F, -1.66F, 1.95F, 1, 1, 1, 0.0F, false));

		Beak67 = new ModelRenderer(this);
		Beak67.setRotationPoint(-4.0F, -2.0F, -11.0F);
		Helmet.addChild(Beak67);
		setRotationAngle(Beak67, 0.3613F, 0.3875F, 0.7854F);
		Beak67.cubeList.add(new ModelBox(Beak67, 22, 21, -0.75F, -0.11F, -1.45F, 1, 1, 3, 0.0F, false));
		Beak67.cubeList.add(new ModelBox(Beak67, 16, 50, -1.5F, -0.11F, -0.45F, 1, 1, 2, 0.0F, false));
		Beak67.cubeList.add(new ModelBox(Beak67, 68, 16, -1.99F, -0.11F, 0.55F, 1, 1, 1, 0.0F, false));

		Beak56 = new ModelRenderer(this);
		Beak56.setRotationPoint(-5.0F, -1.0F, -12.0F);
		Helmet.addChild(Beak56);
		setRotationAngle(Beak56, -0.2112F, -0.48F, 0.4363F);
		Beak56.cubeList.add(new ModelBox(Beak56, 26, 52, -0.95F, -0.61F, -0.75F, 1, 1, 3, 0.0F, false));
		Beak56.cubeList.add(new ModelBox(Beak56, 5, 18, -0.95F, -0.613F, 1.953F, 1, 1, 1, 0.0F, false));

		Beak567 = new ModelRenderer(this);
		Beak567.setRotationPoint(-4.0F, -1.0F, -12.0F);
		Helmet.addChild(Beak567);
		setRotationAngle(Beak567, -0.2112F, 0.48F, -0.4363F);
		Beak567.cubeList.add(new ModelBox(Beak567, 7, 64, -0.87F, -0.94F, -1.22F, 1, 1, 3, 0.0F, false));
		Beak567.cubeList.add(new ModelBox(Beak567, 8, 42, -0.87F, -0.94F, 1.418F, 1, 1, 1, 0.0F, false));

		Chestplate = new ModelRenderer(this);
		Chestplate.setRotationPoint(4.0F, 12.0F, 2.0F);
		Chestplate.cubeList.add(new ModelBox(Chestplate, 34, 46, -9.0F, -8.0F, -4.0F, 1, 8, 4, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 48, 0, 0.0F, -8.0F, -4.0F, 1, 8, 4, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 63, 28, -3.0F, -11.0F, -5.0F, 2, 2, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 40, 40, -5.0F, -10.0F, -5.0F, 2, 1, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 60, 57, -7.0F, -11.0F, -5.0F, 2, 2, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 0, 30, -8.0F, -9.0F, -5.0F, 8, 9, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 33, 66, -8.0F, -12.0F, -5.0F, 2, 1, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 0, 47, -2.0F, -12.0F, -5.0F, 2, 1, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 20, 43, -1.0F, -13.0F, -5.0F, 2, 1, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 64, 43, -9.0F, -13.0F, -5.0F, 2, 1, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 26, 56, -10.0F, -13.0F, -4.0F, 2, 1, 4, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 55, 27, 0.0F, -13.0F, -4.0F, 2, 1, 4, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 58, 43, -1.0F, -13.0F, 0.0F, 2, 1, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 12, 64, -2.0F, -12.0F, 0.0F, 2, 1, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 33, 27, -7.0F, -11.0F, 0.0F, 6, 2, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 64, 12, -8.0F, -12.0F, 0.0F, 2, 1, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 64, 36, -9.0F, -13.0F, 0.0F, 2, 1, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 22, 11, -8.0F, -9.0F, 0.0F, 8, 9, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 0, 11, -5.0F, -9.5F, -5.25F, 2, 7, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 27, 21, -6.0F, -7.0F, -5.25F, 1, 2, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 29, 66, -5.5F, -8.0F, -5.25F, 1, 4, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 6, 0, -5.5F, -7.0F, -5.5F, 1, 2, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 40, 10, -5.0F, -8.0F, -5.5F, 2, 4, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 16, 16, -3.5F, -7.0F, -5.5F, 1, 2, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 33, 21, -3.5F, -8.0F, -5.25F, 1, 4, 1, 0.0F, false));
		Chestplate.cubeList.add(new ModelBox(Chestplate, 14, 40, -3.0F, -7.0F, -5.25F, 1, 2, 1, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-5.0F, 22.0F, 0.0F);
		
		LeftShoulderTilt_r1 = new ModelRenderer(this);
		LeftShoulderTilt_r1.setRotationPoint(5.0F, -21.0F, 0.0F);
		LeftArm.addChild(LeftShoulderTilt_r1);
		setRotationAngle(LeftShoulderTilt_r1, 0.0F, 2.3562F, -0.5672F);

		LeftArm2 = new ModelRenderer(this);
		LeftArm2.setRotationPoint(8.0F, -13.0F, -3.0F);
		LeftArm.addChild(LeftArm2);
		LeftArm2.cubeList.add(new ModelBox(LeftArm2, 20, 52, 0.0F, -11.0F, 1.0F, 1, 4, 4, 0.0F, false));
		LeftArm2.cubeList.add(new ModelBox(LeftArm2, 60, 19, -4.0F, -10.0F, 0.0F, 4, 3, 1, 0.0F, false));
		LeftArm2.cubeList.add(new ModelBox(LeftArm2, 60, 8, -4.0F, -10.0F, 5.0F, 4, 3, 1, 0.0F, false));
		LeftArm2.cubeList.add(new ModelBox(LeftArm2, 48, 62, -4.0F, -5.0F, 5.0F, 4, 5, 1, 0.0F, false));
		LeftArm2.cubeList.add(new ModelBox(LeftArm2, 54, 32, -5.0F, -10.0F, 1.0F, 1, 3, 4, 0.0F, false));
		LeftArm2.cubeList.add(new ModelBox(LeftArm2, 10, 49, -5.0F, -5.0F, 1.0F, 1, 5, 4, 0.0F, false));
		LeftArm2.cubeList.add(new ModelBox(LeftArm2, 44, 49, 0.0F, -5.0F, 1.0F, 1, 5, 4, 0.0F, false));
		LeftArm2.cubeList.add(new ModelBox(LeftArm2, 20, 61, -4.0F, -5.0F, 0.0F, 4, 5, 1, 0.0F, false));

		LeftShoulderTilt = new ModelRenderer(this);
		LeftShoulderTilt.setRotationPoint(5.0F, -21.0F, 0.0F);
		LeftArm.addChild(LeftShoulderTilt);
		setRotationAngle(LeftShoulderTilt, 0.0F, 2.3562F, -0.5672F);
		LeftShoulderTilt.cubeList.add(new ModelBox(LeftShoulderTilt, 18, 33, -5.0F, -0.95F, 0.0F, 5, 1, 5, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.0F, 22.0F, 0.0F);
		
		RightShoulderTilt_r1 = new ModelRenderer(this);
		RightShoulderTilt_r1.setRotationPoint(-5.0F, -21.0F, 0.0F);
		RightArm.addChild(RightShoulderTilt_r1);
		setRotationAngle(RightShoulderTilt_r1, 0.0F, -0.7854F, 0.5672F);
		
		RightArm1 = new ModelRenderer(this);
		RightArm1.setRotationPoint(-8.0F, -13.0F, -2.0F);
		RightArm.addChild(RightArm1);
		RightArm1.cubeList.add(new ModelBox(RightArm1, 60, 32, 0.0F, -10.0F, 4.0F, 4, 3, 1, 0.0F, false));
		RightArm1.cubeList.add(new ModelBox(RightArm1, 50, 54, -1.0F, -11.0F, 0.0F, 1, 4, 4, 0.0F, false));
		RightArm1.cubeList.add(new ModelBox(RightArm1, 60, 49, 0.0F, -10.0F, -1.0F, 4, 3, 1, 0.0F, false));
		RightArm1.cubeList.add(new ModelBox(RightArm1, 54, 8, 4.0F, -10.0F, 0.0F, 1, 3, 4, 0.0F, false));
		RightArm1.cubeList.add(new ModelBox(RightArm1, 0, 0, 4.0F, -5.0F, 0.0F, 1, 5, 4, 0.0F, false));
		RightArm1.cubeList.add(new ModelBox(RightArm1, 0, 60, 0.0F, -5.0F, -1.0F, 4, 5, 1, 0.0F, false));
		RightArm1.cubeList.add(new ModelBox(RightArm1, 60, 60, 0.0F, -5.0F, 4.0F, 4, 5, 1, 0.0F, false));
		RightArm1.cubeList.add(new ModelBox(RightArm1, 48, 36, -1.0F, -5.0F, 0.0F, 1, 5, 4, 0.0F, false));

		RightShoulderTilt = new ModelRenderer(this);
		RightShoulderTilt.setRotationPoint(-5.0F, -21.0F, 0.0F);
		RightArm.addChild(RightShoulderTilt);
		setRotationAngle(RightShoulderTilt, 0.0F, -0.7854F, 0.5672F);
		RightShoulderTilt.cubeList.add(new ModelBox(RightShoulderTilt, 33, 21, -5.0F, -0.95F, 0.0F, 5, 1, 5, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		
		TopLeftFrontDress_r1 = new ModelRenderer(this);
		TopLeftFrontDress_r1.setRotationPoint(5.0F, -9.0F, -4.0F);
		LeftLeg.addChild(TopLeftFrontDress_r1);
		setRotationAngle(TopLeftFrontDress_r1, -0.3491F, 0.0F, 0.0F);
		
		TopLeftBackDress_r1 = new ModelRenderer(this);
		TopLeftBackDress_r1.setRotationPoint(5.0F, -9.0F, 3.0F);
		LeftLeg.addChild(TopLeftBackDress_r1);
		setRotationAngle(TopLeftBackDress_r1, 0.3491F, 0.0F, 0.0F);
		
		TopLeftLeftDress_r1 = new ModelRenderer(this);
		TopLeftLeftDress_r1.setRotationPoint(6.0F, -9.0F, -3.0F);
		LeftLeg.addChild(TopLeftLeftDress_r1);
		setRotationAngle(TopLeftLeftDress_r1, 0.0F, 0.0F, -0.3491F);
		
		BottomFrontLeftDress_r1 = new ModelRenderer(this);
		BottomFrontLeftDress_r1.setRotationPoint(5.0F, -6.0F, -4.0F);
		LeftLeg.addChild(BottomFrontLeftDress_r1);
		setRotationAngle(BottomFrontLeftDress_r1, -0.3491F, 0.0F, 0.0F);
		
		BottomLeftLeftDress_r1 = new ModelRenderer(this);
		BottomLeftLeftDress_r1.setRotationPoint(6.0F, -6.0F, -3.0F);
		LeftLeg.addChild(BottomLeftLeftDress_r1);
		setRotationAngle(BottomLeftLeftDress_r1, 0.0F, 0.0F, -0.3491F);
		
		BottomLeftBackDress_r1 = new ModelRenderer(this);
		BottomLeftBackDress_r1.setRotationPoint(5.0F, -6.0F, 3.0F);
		LeftLeg.addChild(BottomLeftBackDress_r1);
		setRotationAngle(BottomLeftBackDress_r1, 0.3491F, 0.0F, 0.0F);
		
		BottomLeftBackDress = new ModelRenderer(this);
		BottomLeftBackDress.setRotationPoint(5.0F, -6.0F, 3.0F);
		LeftLeg.addChild(BottomLeftBackDress);
		setRotationAngle(BottomLeftBackDress, 0.3491F, 0.0F, 0.0F);
		BottomLeftBackDress.cubeList.add(new ModelBox(BottomLeftBackDress, 54, 0, -5.0F, -2.828F, 0.025F, 5, 3, 1, 0.0F, false));

		BottomLeftLeftDress = new ModelRenderer(this);
		BottomLeftLeftDress.setRotationPoint(6.0F, -6.0F, -3.0F);
		LeftLeg.addChild(BottomLeftLeftDress);
		setRotationAngle(BottomLeftLeftDress, 0.0F, 0.0F, -0.3491F);
		BottomLeftLeftDress.cubeList.add(new ModelBox(BottomLeftLeftDress, 40, 10, -0.91F, -3.164F, 0.0F, 1, 3, 6, 0.0F, false));

		BottomFrontLeftDress = new ModelRenderer(this);
		BottomFrontLeftDress.setRotationPoint(5.0F, -6.0F, -4.0F);
		LeftLeg.addChild(BottomFrontLeftDress);
		setRotationAngle(BottomFrontLeftDress, -0.3491F, 0.0F, 0.0F);
		BottomFrontLeftDress.cubeList.add(new ModelBox(BottomFrontLeftDress, 55, 23, -5.0F, -3.165F, -0.09F, 5, 3, 1, 0.0F, false));

		TopLeftLeftDress = new ModelRenderer(this);
		TopLeftLeftDress.setRotationPoint(6.0F, -9.0F, -3.0F);
		LeftLeg.addChild(TopLeftLeftDress);
		setRotationAngle(TopLeftLeftDress, 0.0F, 0.0F, -0.3491F);
		TopLeftLeftDress.cubeList.add(new ModelBox(TopLeftLeftDress, 20, 43, -0.91F, -3.164F, 0.0F, 1, 3, 6, 0.0F, false));

		TopLeftBackDress = new ModelRenderer(this);
		TopLeftBackDress.setRotationPoint(5.0F, -9.0F, 3.0F);
		LeftLeg.addChild(TopLeftBackDress);
		setRotationAngle(TopLeftBackDress, 0.3491F, 0.0F, 0.0F);
		TopLeftBackDress.cubeList.add(new ModelBox(TopLeftBackDress, 56, 53, -5.0F, -2.828F, 0.025F, 5, 3, 1, 0.0F, false));

		TopLeftFrontDress = new ModelRenderer(this);
		TopLeftFrontDress.setRotationPoint(5.0F, -9.0F, -4.0F);
		LeftLeg.addChild(TopLeftFrontDress);
		setRotationAngle(TopLeftFrontDress, -0.3491F, 0.0F, 0.0F);
		TopLeftFrontDress.cubeList.add(new ModelBox(TopLeftFrontDress, 58, 39, -5.0F, -3.165F, -0.09F, 5, 3, 1, 0.0F, false));

		MiscLeftLeg = new ModelRenderer(this);
		MiscLeftLeg.setRotationPoint(0.0F, -6.0F, -3.0F);
		LeftLeg.addChild(MiscLeftLeg);
		MiscLeftLeg.cubeList.add(new ModelBox(MiscLeftLeg, 12, 39, -1.0F, -4.0F, 0.0F, 1, 4, 6, 0.0F, false));
		MiscLeftLeg.cubeList.add(new ModelBox(MiscLeftLeg, 12, 39, -1.0F, -5.0F, 0.0F, 1, 1, 6, 0.0F, false));
		MiscLeftLeg.cubeList.add(new ModelBox(MiscLeftLeg, 0, 71, 0.0F, -6.1F, 1.0F, 4, 1, 4, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		
		TopFrontRightDress_r1 = new ModelRenderer(this);
		TopFrontRightDress_r1.setRotationPoint(0.0F, -9.0F, -4.0F);
		RightLeg.addChild(TopFrontRightDress_r1);
		setRotationAngle(TopFrontRightDress_r1, -0.3491F, 0.0F, 0.0F);
		
		TopRightBackDress_r1 = new ModelRenderer(this);
		TopRightBackDress_r1.setRotationPoint(0.0F, -9.0F, 3.0F);
		RightLeg.addChild(TopRightBackDress_r1);
		setRotationAngle(TopRightBackDress_r1, 0.3491F, 0.0F, 0.0F);
		
		BottomFrontRightDress_r1 = new ModelRenderer(this);
		BottomFrontRightDress_r1.setRotationPoint(0.0F, -6.0F, -4.0F);
		RightLeg.addChild(BottomFrontRightDress_r1);
		setRotationAngle(BottomFrontRightDress_r1, -0.3491F, 0.0F, 0.0F);
		
		TopRightRightDress_r1 = new ModelRenderer(this);
		TopRightRightDress_r1.setRotationPoint(-5.0F, -9.0F, -3.0F);
		RightLeg.addChild(TopRightRightDress_r1);
		setRotationAngle(TopRightRightDress_r1, 0.0F, 0.0F, 0.3491F);
		
		BottomRightBackDress_r1 = new ModelRenderer(this);
		BottomRightBackDress_r1.setRotationPoint(0.0F, -6.0F, 3.0F);
		RightLeg.addChild(BottomRightBackDress_r1);
		setRotationAngle(BottomRightBackDress_r1, 0.3491F, 0.0F, 0.0F);
		
		BottomRightRightDress_r1 = new ModelRenderer(this);
		BottomRightRightDress_r1.setRotationPoint(-5.0F, -6.0F, -3.0F);
		RightLeg.addChild(BottomRightRightDress_r1);
		setRotationAngle(BottomRightRightDress_r1, 0.0F, 0.0F, 0.3491F);
		
		BottomRightRightDress = new ModelRenderer(this);
		BottomRightRightDress.setRotationPoint(-5.0F, -6.0F, -3.0F);
		RightLeg.addChild(BottomRightRightDress);
		setRotationAngle(BottomRightRightDress, 0.0F, 0.0F, 0.3491F);
		BottomRightRightDress.cubeList.add(new ModelBox(BottomRightRightDress, 40, 40, -1.027F, -2.821F, 0.0F, 1, 3, 6, 0.0F, false));

		BottomRightBackDress = new ModelRenderer(this);
		BottomRightBackDress.setRotationPoint(0.0F, -6.0F, 3.0F);
		RightLeg.addChild(BottomRightBackDress);
		setRotationAngle(BottomRightBackDress, 0.3491F, 0.0F, 0.0F);
		BottomRightBackDress.cubeList.add(new ModelBox(BottomRightBackDress, 40, 36, -5.0F, -2.828F, 0.025F, 5, 3, 1, 0.0F, false));

		TopRightRightDress = new ModelRenderer(this);
		TopRightRightDress.setRotationPoint(-5.0F, -9.0F, -3.0F);
		RightLeg.addChild(TopRightRightDress);
		setRotationAngle(TopRightRightDress, 0.0F, 0.0F, 0.3491F);
		TopRightRightDress.cubeList.add(new ModelBox(TopRightRightDress, 0, 43, -1.027F, -2.821F, 0.0F, 1, 3, 6, 0.0F, false));

		BottomFrontRightDress = new ModelRenderer(this);
		BottomFrontRightDress.setRotationPoint(0.0F, -6.0F, -4.0F);
		RightLeg.addChild(BottomFrontRightDress);
		setRotationAngle(BottomFrontRightDress, -0.3491F, 0.0F, 0.0F);
		BottomFrontRightDress.cubeList.add(new ModelBox(BottomFrontRightDress, 56, 15, -5.0F, -3.165F, -0.09F, 5, 3, 1, 0.0F, false));

		TopRightBackDress = new ModelRenderer(this);
		TopRightBackDress.setRotationPoint(0.0F, -9.0F, 3.0F);
		RightLeg.addChild(TopRightBackDress);
		setRotationAngle(TopRightBackDress, 0.3491F, 0.0F, 0.0F);
		TopRightBackDress.cubeList.add(new ModelBox(TopRightBackDress, 56, 45, -5.0F, -2.828F, 0.025F, 5, 3, 1, 0.0F, false));

		TopFrontRightDress = new ModelRenderer(this);
		TopFrontRightDress.setRotationPoint(0.0F, -9.0F, -4.0F);
		RightLeg.addChild(TopFrontRightDress);
		setRotationAngle(TopFrontRightDress, -0.3491F, 0.0F, 0.0F);
		TopFrontRightDress.cubeList.add(new ModelBox(TopFrontRightDress, 58, 4, -5.0F, -3.165F, -0.09F, 5, 3, 1, 0.0F, false));

		MiscRightLeg = new ModelRenderer(this);
		MiscRightLeg.setRotationPoint(0.0F, -6.0F, -3.0F);
		RightLeg.addChild(MiscRightLeg);
		MiscRightLeg.cubeList.add(new ModelBox(MiscRightLeg, 32, 36, 0.0F, -4.0F, 0.0F, 1, 4, 6, 0.0F, false));
		MiscRightLeg.cubeList.add(new ModelBox(MiscRightLeg, 32, 36, 0.0F, -5.0F, 0.0F, 1, 1, 6, 0.0F, false));
		MiscRightLeg.cubeList.add(new ModelBox(MiscRightLeg, 0, 71, -4.0F, -6.1F, 1.0F, 4, 1, 4, 0.0F, false));

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(2.0F, 12.0F, -3.0F);
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 50, 45, 0.0F, -4.0F, 1.0F, 1, 4, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 0, 25, -4.0F, -4.0F, 5.0F, 4, 4, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 50, 15, -5.0F, -4.0F, 1.0F, 1, 4, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 10, 58, -4.0F, -5.0F, 0.0F, 4, 5, 1, 0.0F, false));

		LeftKneeCap_r1 = new ModelRenderer(this);
		LeftKneeCap_r1.setRotationPoint(0.0F, -3.0F, 1.0F);
		LeftBoot.addChild(LeftKneeCap_r1);
		setRotationAngle(LeftKneeCap_r1, 0.7854F, 0.0F, 0.0F);
		
		LeftKneeCap = new ModelRenderer(this);
		LeftKneeCap.setRotationPoint(0.0F, -3.0F, 1.0F);
		LeftBoot.addChild(LeftKneeCap);
		setRotationAngle(LeftKneeCap, 0.7854F, 0.0F, 0.0F);
		LeftKneeCap.cubeList.add(new ModelBox(LeftKneeCap, 40, 19, -4.0F, -1.5F, -0.5F, 4, 1, 1, 0.0F, false));

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(-2.0F, 12.0F, -2.0F);
		RightBoot.cubeList.add(new ModelBox(RightBoot, 38, 58, 0.0F, -5.0F, -1.0F, 4, 5, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 49, 23, 4.0F, -4.0F, 0.0F, 1, 4, 4, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 11, 11, 0.0F, -4.0F, 4.0F, 4, 4, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 0, 52, -1.0F, -4.0F, 0.0F, 1, 4, 4, 0.0F, false));

		RightKneeCap_r1 = new ModelRenderer(this);
		RightKneeCap_r1.setRotationPoint(4.0F, -3.0F, 0.0F);
		RightBoot.addChild(RightKneeCap_r1);
		setRotationAngle(RightKneeCap_r1, 0.7854F, 0.0F, 0.0F);
		
		RightKneeCap = new ModelRenderer(this);
		RightKneeCap.setRotationPoint(4.0F, -3.0F, 0.0F);
		RightBoot.addChild(RightKneeCap);
		setRotationAngle(RightKneeCap, 0.7854F, 0.0F, 0.0F);
		RightKneeCap.cubeList.add(new ModelBox(RightKneeCap, 28, 46, -4.0F, -1.5F, -0.5F, 4, 1, 1, 0.0F, false));
		
		this.bipedHead.addChild(Helmet);
		this.bipedBody.addChild(Chestplate);
		this.bipedRightArm.addChild(RightArm);
		this.bipedLeftArm.addChild(LeftArm);
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