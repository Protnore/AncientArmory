package com.protnore.ancientarmory.objects.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.1
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Bandos_Armor extends ModelBiped {
	
	public final ModelRenderer Helmet;
	public final ModelRenderer TopLeftHorn_r1;
	public final ModelRenderer MidLeftHorn_r1;
	public final ModelRenderer BaseLeftHorn_r1;
	public final ModelRenderer TopRightHorn_r1;
	public final ModelRenderer MidRightHorn_r1;
	public final ModelRenderer BaseRightHorn_r1;
	public final ModelRenderer BaseRightHorn;
	public final ModelRenderer MidRightHorn;
	public final ModelRenderer TopRightHorn;
	public final ModelRenderer BaseLeftHorn;
	public final ModelRenderer MidLeftHorn;
	public final ModelRenderer TopLeftHorn;
	public final ModelRenderer ChestPlate;
	public final ModelRenderer LeftArm;
	public final ModelRenderer BottomMidShoulderSpike_r1;
	public final ModelRenderer BottomFrontShoulderSpike_r1;
	public final ModelRenderer BottomBackShoulderSpike_r1;
	public final ModelRenderer TopBackShoulderSpike_r1;
	public final ModelRenderer TopFrontShoulderSpike_r1;
	public final ModelRenderer TopMidshoulderSpike_r1;
	public final ModelRenderer ShoulderBottomPlate_r1;
	public final ModelRenderer ShoulderMidPlate_r1;
	public final ModelRenderer ShoulderMidPlate;
	public final ModelRenderer ShoulderBottomPlate;
	public final ModelRenderer TopMidshoulderSpike;
	public final ModelRenderer TopFrontShoulderSpike;
	public final ModelRenderer TopBackShoulderSpike;
	public final ModelRenderer BottomBackShoulderSpike;
	public final ModelRenderer BottomFrontShoulderSpike;
	public final ModelRenderer BottomMidShoulderSpike;
	public final ModelRenderer TopShoulderPlate;
	public final ModelRenderer LeftGlove;
	public final ModelRenderer RightArm;
	public final ModelRenderer RightGlove;
	public final ModelRenderer LeftLeg;
	public final ModelRenderer RightLeg;
	public final ModelRenderer LeftBoot;
	public final ModelRenderer RightBoot;

	public Bandos_Armor() {

		textureWidth = 1024;
		textureHeight = 1024;

		Helmet = new ModelRenderer(this);
		Helmet.setRotationPoint(5.0F, -8.0F, -5.0F);
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 25, -1.0F, 0.0F, 1.0F, 1, 9, 8, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 30, 0, -10.0F, 0.0F, 9.0F, 10, 9, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 18, 31, -10.0F, 0.0F, 1.0F, 1, 9, 8, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 38, 44, -10.0F, 6.0F, 0.0F, 3, 3, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 6, 50, -3.0F, 6.0F, 0.0F, 3, 3, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 52, 12, -3.0F, 5.0F, 0.0F, 3, 1, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 54, 38, -10.0F, 5.0F, 0.0F, 4, 1, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 28, 31, -6.0F, 2.0F, 0.0F, 2, 3, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 6, 0, -10.0F, 2.0F, 0.0F, 1, 3, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 0, -1.0F, 2.0F, 0.0F, 1, 3, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 17, 11, -10.0F, 0.0F, 0.0F, 10, 2, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 0, -10.0F, -1.0F, 0.0F, 10, 1, 10, 0.0F, false));

		TopLeftHorn_r1 = new ModelRenderer(this);
		TopLeftHorn_r1.setRotationPoint(5.0F, -3.0F, -2.0F);
		Helmet.addChild(TopLeftHorn_r1);
		setRotationAngle(TopLeftHorn_r1, -0.48F, -0.6545F, 0.0F);

		MidLeftHorn_r1 = new ModelRenderer(this);
		MidLeftHorn_r1.setRotationPoint(-7.0F, -7.0F, 0.0F);
		Helmet.addChild(MidLeftHorn_r1);
		setRotationAngle(MidLeftHorn_r1, 0.0F, -0.6545F, 0.0F);
		
		BaseLeftHorn_r1 = new ModelRenderer(this);
		BaseLeftHorn_r1.setRotationPoint(-1.0F, 5.0F, 7.0F);
		Helmet.addChild(BaseLeftHorn_r1);
		setRotationAngle(BaseLeftHorn_r1, 2.8362F, -0.6545F, 0.0F);
		
		TopRightHorn_r1 = new ModelRenderer(this);
		TopRightHorn_r1.setRotationPoint(-14.0F, -4.0F, -3.0F);
		Helmet.addChild(TopRightHorn_r1);
		setRotationAngle(TopRightHorn_r1, -0.48F, 0.6545F, 0.0F);
		
		MidRightHorn_r1 = new ModelRenderer(this);
		MidRightHorn_r1.setRotationPoint(-13.0F, 2.0F, -3.0F);
		Helmet.addChild(MidRightHorn_r1);
		setRotationAngle(MidRightHorn_r1, 0.0F, 0.6545F, 0.0F);
		
		BaseRightHorn_r1 = new ModelRenderer(this);
		BaseRightHorn_r1.setRotationPoint(-6.0F, 3.0F, 6.0F);
		Helmet.addChild(BaseRightHorn_r1);
		setRotationAngle(BaseRightHorn_r1, 2.8362F, 0.6545F, 0.0F);
		
		BaseRightHorn = new ModelRenderer(this);
		BaseRightHorn.setRotationPoint(-6.0F, 3.0F, 6.0F);
		Helmet.addChild(BaseRightHorn);
		setRotationAngle(BaseRightHorn, 2.8362F, 0.6545F, 0.0F);
		BaseRightHorn.cubeList.add(new ModelBox(BaseRightHorn, 17, 17, -3.0F, -3.0F, 0.0F, 3, 3, 11, 0.0F, false));

		MidRightHorn = new ModelRenderer(this);
		MidRightHorn.setRotationPoint(-13.0F, 2.0F, -3.0F);
		Helmet.addChild(MidRightHorn);
		setRotationAngle(MidRightHorn, 0.0F, 0.6545F, 0.0F);
		MidRightHorn.cubeList.add(new ModelBox(MidRightHorn, 18, 31, -2.45F, -5.44F, 0.0F, 2, 6, 2, 0.0F, false));

		TopRightHorn = new ModelRenderer(this);
		TopRightHorn.setRotationPoint(-14.0F, -4.0F, -3.0F);
		Helmet.addChild(TopRightHorn);
		setRotationAngle(TopRightHorn, -0.48F, 0.6545F, 0.0F);
		TopRightHorn.cubeList.add(new ModelBox(TopRightHorn, 24, 62, -1.14F, -3.8F, 0.8F, 1, 4, 1, 0.0F, false));

		BaseLeftHorn = new ModelRenderer(this);
		BaseLeftHorn.setRotationPoint(-1.0F, 5.0F, 7.0F);
		Helmet.addChild(BaseLeftHorn);
		setRotationAngle(BaseLeftHorn, 2.8362F, -0.6545F, 0.0F);
		BaseLeftHorn.cubeList.add(new ModelBox(BaseLeftHorn, 0, 11, -3.0F, -1.0F, 0.0F, 3, 3, 11, 0.0F, false));

		MidLeftHorn = new ModelRenderer(this);
		MidLeftHorn.setRotationPoint(-7.0F, -7.0F, 0.0F);
		Helmet.addChild(MidLeftHorn);
		setRotationAngle(MidLeftHorn, 0.0F, -0.6545F, 0.0F);
		MidLeftHorn.cubeList.add(new ModelBox(MidLeftHorn, 0, 25, 6.5F, 3.645F, -8.89F, 2, 6, 2, 0.0F, false));

		TopLeftHorn = new ModelRenderer(this);
		TopLeftHorn.setRotationPoint(5.0F, -3.0F, -2.0F);
		Helmet.addChild(TopLeftHorn);
		setRotationAngle(TopLeftHorn, -0.48F, -0.6545F, 0.0F);
		TopLeftHorn.cubeList.add(new ModelBox(TopLeftHorn, 41, 61, -1.31F, -4.31F, -0.16F, 1, 4, 1, 0.0F, false));

		ChestPlate = new ModelRenderer(this);
		ChestPlate.setRotationPoint(3.0F, 12.0F, 2.0F);
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 50, 40, 0.0F, -13.0F, -4.0F, 1, 1, 4, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 8, 42, -1.0F, -12.0F, -5.0F, 1, 2, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 64, 20, 0.0F, -12.0F, -5.0F, 1, 1, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 17, 16, -2.0F, -12.0F, -5.0F, 1, 3, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 63, 16, -4.0F, -9.0F, 0.0F, 2, 1, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 6, 11, -5.0F, -12.0F, 0.0F, 1, 3, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 34, 23, -6.0F, -12.0F, 0.0F, 1, 2, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 10, 50, -6.0F, -13.0F, -4.0F, 1, 1, 4, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 0, 50, -7.0F, -13.0F, -4.0F, 1, 1, 4, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 38, 50, -1.0F, -13.0F, -4.0F, 1, 1, 4, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 63, 59, 0.0F, -12.0F, 0.0F, 1, 1, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 10, 27, -1.0F, -12.0F, 0.0F, 1, 2, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 0, 11, -2.0F, -12.0F, 0.0F, 1, 3, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 63, 51, -7.0F, -12.0F, 0.0F, 1, 1, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 23, 16, -5.0F, -12.0F, -5.0F, 1, 3, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 14, 42, -6.0F, -12.0F, -5.0F, 1, 2, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 64, 22, -7.0F, -12.0F, -5.0F, 1, 1, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 63, 26, -4.0F, -9.0F, -5.0F, 2, 1, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 64, 24, -2.0F, -8.0F, -5.0F, 1, 1, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 64, 33, -5.0F, -8.0F, -5.0F, 1, 1, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 15, 64, -5.0F, -8.0F, 0.0F, 1, 1, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 33, 64, -2.0F, -8.0F, 0.0F, 1, 1, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 34, 17, -7.0F, -6.0F, 0.0F, 8, 5, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 32, 44, 1.0F, -6.0F, -4.0F, 1, 5, 4, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 42, 28, -8.0F, -6.0F, -4.0F, 1, 5, 4, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 36, 38, -7.0F, -6.0F, -5.0F, 8, 5, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 44, 25, -6.0F, -7.0F, -5.0F, 6, 1, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 44, 23, -6.0F, -7.0F, 0.0F, 6, 1, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 14, 48, -6.0F, -1.0F, -5.0F, 6, 1, 1, 0.0F, false));
		ChestPlate.cubeList.add(new ModelBox(ChestPlate, 10, 25, -6.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-6.0F, 22.0F, 0.0F);
		
		BottomMidShoulderSpike_r1 = new ModelRenderer(this);
		BottomMidShoulderSpike_r1.setRotationPoint(9.0F, -23.0F, 0.0F);
		LeftArm.addChild(BottomMidShoulderSpike_r1);
		setRotationAngle(BottomMidShoulderSpike_r1, 0.0F, 0.0F, -2.618F);
		
		BottomFrontShoulderSpike_r1 = new ModelRenderer(this);
		BottomFrontShoulderSpike_r1.setRotationPoint(9.0F, -23.0F, -1.0F);
		LeftArm.addChild(BottomFrontShoulderSpike_r1);
		setRotationAngle(BottomFrontShoulderSpike_r1, 0.0F, -0.1309F, -2.4871F);
		
		BottomBackShoulderSpike_r1 = new ModelRenderer(this);
		BottomBackShoulderSpike_r1.setRotationPoint(9.0F, -23.0F, 1.0F);
		LeftArm.addChild(BottomBackShoulderSpike_r1);
		setRotationAngle(BottomBackShoulderSpike_r1, 0.0F, 0.1309F, -2.4871F);
		
		TopBackShoulderSpike_r1 = new ModelRenderer(this);
		TopBackShoulderSpike_r1.setRotationPoint(7.0F, -26.0F, 1.0F);
		LeftArm.addChild(TopBackShoulderSpike_r1);
		setRotationAngle(TopBackShoulderSpike_r1, 0.0F, 0.3491F, 2.9671F);
		
		TopFrontShoulderSpike_r1 = new ModelRenderer(this);
		TopFrontShoulderSpike_r1.setRotationPoint(7.0F, -26.0F, -1.0F);
		LeftArm.addChild(TopFrontShoulderSpike_r1);
		setRotationAngle(TopFrontShoulderSpike_r1, 0.0F, -0.3491F, 2.9671F);
		
		TopMidshoulderSpike_r1 = new ModelRenderer(this);
		TopMidshoulderSpike_r1.setRotationPoint(7.0F, -25.0F, 0.0F);
		LeftArm.addChild(TopMidshoulderSpike_r1);
		setRotationAngle(TopMidshoulderSpike_r1, 0.0F, 0.0F, 2.7925F);
		
		ShoulderBottomPlate_r1 = new ModelRenderer(this);
		ShoulderBottomPlate_r1.setRotationPoint(10.0F, -19.0F, -1.0F);
		LeftArm.addChild(ShoulderBottomPlate_r1);
		setRotationAngle(ShoulderBottomPlate_r1, 0.0F, 0.0F, 0.4363F);
		
		ShoulderMidPlate_r1 = new ModelRenderer(this);
		ShoulderMidPlate_r1.setRotationPoint(9.0F, -23.0F, -2.0F);
		LeftArm.addChild(ShoulderMidPlate_r1);
		setRotationAngle(ShoulderMidPlate_r1, 0.0F, 0.0F, 0.2182F);
		
		ShoulderMidPlate = new ModelRenderer(this);
		ShoulderMidPlate.setRotationPoint(9.0F, -23.0F, -2.0F);
		LeftArm.addChild(ShoulderMidPlate);
		setRotationAngle(ShoulderMidPlate, 0.0F, 0.0F, 0.2182F);
		ShoulderMidPlate.cubeList.add(new ModelBox(ShoulderMidPlate, 28, 31, -3.0F, -2.5F, -1.0F, 4, 1, 6, 0.0F, false));
		ShoulderMidPlate.cubeList.add(new ModelBox(ShoulderMidPlate, 57, 18, -2.0F, -1.5F, -1.0F, 3, 2, 1, 0.0F, false));
		ShoulderMidPlate.cubeList.add(new ModelBox(ShoulderMidPlate, 58, 6, -2.0F, -1.5F, 4.0F, 3, 2, 1, 0.0F, false));
		ShoulderMidPlate.cubeList.add(new ModelBox(ShoulderMidPlate, 46, 10, -1.0F, -2.0F, 0.0F, 1, 2, 4, 0.0F, false));

		ShoulderBottomPlate = new ModelRenderer(this);
		ShoulderBottomPlate.setRotationPoint(10.0F, -19.0F, -1.0F);
		LeftArm.addChild(ShoulderBottomPlate);
		setRotationAngle(ShoulderBottomPlate, 0.0F, 0.0F, 0.4363F);
		ShoulderBottomPlate.cubeList.add(new ModelBox(ShoulderBottomPlate, 34, 23, -3.4226F, -3.9063F, -1.0F, 3, 1, 4, 0.0F, false));
		ShoulderBottomPlate.cubeList.add(new ModelBox(ShoulderBottomPlate, 64, 64, -2.4226F, -2.9063F, -1.0F, 2, 2, 1, 0.0F, false));
		ShoulderBottomPlate.cubeList.add(new ModelBox(ShoulderBottomPlate, 64, 0, -2.4226F, -2.9063F, 2.0F, 2, 2, 1, 0.0F, false));
		ShoulderBottomPlate.cubeList.add(new ModelBox(ShoulderBottomPlate, 61, 9, -1.4226F, -2.9063F, 0.0F, 1, 2, 2, 0.0F, false));

		TopMidshoulderSpike = new ModelRenderer(this);
		TopMidshoulderSpike.setRotationPoint(7.0F, -25.0F, 0.0F);
		LeftArm.addChild(TopMidshoulderSpike);
		setRotationAngle(TopMidshoulderSpike, 0.0F, 0.0F, 2.7925F);
		TopMidshoulderSpike.cubeList.add(new ModelBox(TopMidshoulderSpike, 17, 14, -7.0F, 0.0F, -0.5F, 7, 1, 1, 0.0F, false));

		TopFrontShoulderSpike = new ModelRenderer(this);
		TopFrontShoulderSpike.setRotationPoint(7.0F, -26.0F, -1.0F);
		LeftArm.addChild(TopFrontShoulderSpike);
		setRotationAngle(TopFrontShoulderSpike, 0.0F, -0.3491F, 2.9671F);
		TopFrontShoulderSpike.cubeList.add(new ModelBox(TopFrontShoulderSpike, 51, 16, -5.0F, -1.0F, -1.5F, 5, 1, 1, 0.0F, false));

		TopBackShoulderSpike = new ModelRenderer(this);
		TopBackShoulderSpike.setRotationPoint(7.0F, -26.0F, 1.0F);
		LeftArm.addChild(TopBackShoulderSpike);
		setRotationAngle(TopBackShoulderSpike, 0.0F, 0.3491F, 2.9671F);
		TopBackShoulderSpike.cubeList.add(new ModelBox(TopBackShoulderSpike, 52, 2, -5.0F, -1.0F, 0.5F, 5, 1, 1, 0.0F, false));

		BottomBackShoulderSpike = new ModelRenderer(this);
		BottomBackShoulderSpike.setRotationPoint(9.0F, -23.0F, 1.0F);
		LeftArm.addChild(BottomBackShoulderSpike);
		setRotationAngle(BottomBackShoulderSpike, 0.0F, 0.1309F, -2.4871F);
		BottomBackShoulderSpike.cubeList.add(new ModelBox(BottomBackShoulderSpike, 52, 0, -4.3964F, 0.7934F, 0.0795F, 5, 1, 1, 0.0F, false));

		BottomFrontShoulderSpike = new ModelRenderer(this);
		BottomFrontShoulderSpike.setRotationPoint(9.0F, -23.0F, -1.0F);
		LeftArm.addChild(BottomFrontShoulderSpike);
		setRotationAngle(BottomFrontShoulderSpike, 0.0F, -0.1309F, -2.4871F);
		BottomFrontShoulderSpike.cubeList.add(new ModelBox(BottomFrontShoulderSpike, 52, 0, -4.3964F, 0.7934F, -1.0795F, 5, 1, 1, 0.0F, false));

		BottomMidShoulderSpike = new ModelRenderer(this);
		BottomMidShoulderSpike.setRotationPoint(9.0F, -23.0F, 0.0F);
		LeftArm.addChild(BottomMidShoulderSpike);
		setRotationAngle(BottomMidShoulderSpike, 0.0F, 0.0F, -2.618F);
		BottomMidShoulderSpike.cubeList.add(new ModelBox(BottomMidShoulderSpike, 48, 45, -4.5F, 0.866F, -0.5F, 5, 1, 1, 0.0F, false));

		TopShoulderPlate = new ModelRenderer(this);
		TopShoulderPlate.setRotationPoint(7.0F, -23.0F, -5.0F);
		LeftArm.addChild(TopShoulderPlate);
		TopShoulderPlate.cubeList.add(new ModelBox(TopShoulderPlate, 46, 12, -1.0F, -1.0F, 9.0F, 1, 1, 1, 0.0F, false));
		TopShoulderPlate.cubeList.add(new ModelBox(TopShoulderPlate, 46, 10, -1.0F, -3.0F, 9.0F, 1, 1, 1, 0.0F, false));
		TopShoulderPlate.cubeList.add(new ModelBox(TopShoulderPlate, 56, 40, -2.0F, -3.0F, 8.0F, 3, 3, 1, 0.0F, false));
		TopShoulderPlate.cubeList.add(new ModelBox(TopShoulderPlate, 0, 52, -1.0F, -5.0F, 7.0F, 1, 1, 1, 0.0F, false));
		TopShoulderPlate.cubeList.add(new ModelBox(TopShoulderPlate, 34, 10, -2.0F, -4.0F, 2.0F, 3, 1, 6, 0.0F, false));
		TopShoulderPlate.cubeList.add(new ModelBox(TopShoulderPlate, 22, 25, -1.0F, -5.0F, 4.0F, 1, 1, 2, 0.0F, false));
		TopShoulderPlate.cubeList.add(new ModelBox(TopShoulderPlate, 0, 50, -1.0F, -5.0F, 2.0F, 1, 1, 1, 0.0F, false));
		TopShoulderPlate.cubeList.add(new ModelBox(TopShoulderPlate, 0, 42, -1.0F, -3.0F, 2.0F, 1, 2, 6, 0.0F, false));
		TopShoulderPlate.cubeList.add(new ModelBox(TopShoulderPlate, 38, 57, -2.0F, -3.0F, 1.0F, 3, 3, 1, 0.0F, false));
		TopShoulderPlate.cubeList.add(new ModelBox(TopShoulderPlate, 48, 29, -1.0F, -3.0F, 0.0F, 1, 1, 1, 0.0F, false));
		TopShoulderPlate.cubeList.add(new ModelBox(TopShoulderPlate, 48, 27, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		LeftGlove = new ModelRenderer(this);
		LeftGlove.setRotationPoint(11.0F, -12.0F, -2.0F);
		LeftArm.addChild(LeftGlove);
		LeftGlove.cubeList.add(new ModelBox(LeftGlove, 8, 42, -7.0F, -3.0F, 0.0F, 1, 2, 4, 0.0F, false));
		LeftGlove.cubeList.add(new ModelBox(LeftGlove, 10, 55, -6.0F, -3.0F, -1.0F, 4, 2, 1, 0.0F, false));
		LeftGlove.cubeList.add(new ModelBox(LeftGlove, 0, 55, -6.0F, -3.0F, 4.0F, 4, 2, 1, 0.0F, false));
		LeftGlove.cubeList.add(new ModelBox(LeftGlove, 42, 44, -2.0F, -3.0F, 0.0F, 1, 2, 4, 0.0F, false));
		LeftGlove.cubeList.add(new ModelBox(LeftGlove, 49, 61, -2.0F, -5.0F, 1.0F, 1, 2, 2, 0.0F, false));
		LeftGlove.cubeList.add(new ModelBox(LeftGlove, 63, 29, -4.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F, false));
		LeftGlove.cubeList.add(new ModelBox(LeftGlove, 52, 18, -2.0F, -1.0F, 0.0F, 1, 2, 3, 0.0F, false));
		LeftGlove.cubeList.add(new ModelBox(LeftGlove, 32, 62, -1.0F, -1.0F, 2.0F, 1, 1, 1, 0.0F, false));
		LeftGlove.cubeList.add(new ModelBox(LeftGlove, 63, 49, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.0F, 22.0F, 0.0F);
		
		RightGlove = new ModelRenderer(this);
		RightGlove.setRotationPoint(-9.0F, -12.0F, 0.0F);
		RightArm.addChild(RightGlove);
		RightGlove.cubeList.add(new ModelBox(RightGlove, 17, 16, 5.0F, -3.0F, -2.0F, 1, 2, 4, 0.0F, false));
		RightGlove.cubeList.add(new ModelBox(RightGlove, 54, 47, 1.0F, -3.0F, 2.0F, 4, 2, 1, 0.0F, false));
		RightGlove.cubeList.add(new ModelBox(RightGlove, 59, 30, 0.0F, -5.0F, -1.0F, 1, 2, 2, 0.0F, false));
		RightGlove.cubeList.add(new ModelBox(RightGlove, 54, 27, 1.0F, -3.0F, -3.0F, 4, 2, 1, 0.0F, false));
		RightGlove.cubeList.add(new ModelBox(RightGlove, 10, 27, 0.0F, -3.0F, -2.0F, 1, 2, 4, 0.0F, false));
		RightGlove.cubeList.add(new ModelBox(RightGlove, 54, 64, 1.0F, -1.0F, -3.0F, 2, 2, 1, 0.0F, false));
		RightGlove.cubeList.add(new ModelBox(RightGlove, 63, 39, -1.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		RightGlove.cubeList.add(new ModelBox(RightGlove, 54, 32, 0.0F, -1.0F, -2.0F, 1, 2, 3, 0.0F, false));
		RightGlove.cubeList.add(new ModelBox(RightGlove, 55, 62, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(0.0F, 7.0F, -3.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 0, -3.0F, -7.0F, 1.0F, 1, 6, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 32, 54, -2.0F, -7.0F, 5.0F, 2, 7, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 8, 58, 0.0F, -7.0F, 5.0F, 1, 6, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 42, 1.0F, -7.0F, 5.0F, 1, 5, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 60, 60, 2.0F, -7.0F, 4.0F, 1, 5, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 20, 52, 2.0F, -7.0F, 2.0F, 1, 6, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 45, 60, 2.0F, -7.0F, 1.0F, 1, 5, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 16, 58, 1.0F, -7.0F, 0.0F, 1, 5, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 58, 0.0F, -7.0F, 0.0F, 1, 6, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 48, 53, -2.0F, -7.0F, 0.0F, 2, 7, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 76, 0, -2.0F, -7.1F, 1.0F, 4, 1, 4, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 7.0F, 2.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 11, 0.0F, -7.0F, -4.0F, 1, 6, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 54, 54, -2.0F, -7.0F, -5.0F, 2, 7, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 4, 58, -3.0F, -7.0F, -5.0F, 1, 6, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 20, 60, -4.0F, -7.0F, -5.0F, 1, 5, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 60, 21, -5.0F, -7.0F, -4.0F, 1, 5, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 52, 4, -5.0F, -7.0F, -3.0F, 1, 6, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 60, 52, -5.0F, -7.0F, -1.0F, 1, 5, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 37, 61, -4.0F, -7.0F, 0.0F, 1, 5, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 12, 58, -3.0F, -7.0F, 0.0F, 1, 6, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 26, 54, -2.0F, -7.0F, 0.0F, 2, 7, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 76, 0, -4.0F, -7.1F, -4.0F, 4, 1, 4, 0.0F, false));

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(1.0F, 11.0F, 2.0F);
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 60, 35, -4.0F, -1.0F, -3.0F, 1, 1, 2, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 24, 49, -4.0F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 38, 55, -3.0F, 0.0F, -5.0F, 4, 1, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 44, 50, -2.0F, -1.0F, -5.0F, 2, 1, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 44, 52, -2.0F, -2.0F, -5.0F, 1, 1, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 48, 48, 1.0F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 28, 62, 1.0F, -1.0F, -3.0F, 1, 1, 2, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 56, 4, -3.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 28, 35, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(2.0F, 12.0F, -3.0F);
		RightBoot.cubeList.add(new ModelBox(RightBoot, 60, 44, 0.0F, -2.0F, 2.0F, 1, 1, 2, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 48, 33, 0.0F, -1.0F, 1.0F, 1, 1, 4, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 54, 50, -4.0F, -1.0F, 5.0F, 4, 1, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 16, 52, -3.0F, -2.0F, 5.0F, 2, 1, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 62, 56, -5.0F, -2.0F, 2.0F, 1, 1, 2, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 48, 27, -5.0F, -1.0F, 1.0F, 1, 1, 4, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 58, 9, -2.0F, -3.0F, 0.0F, 1, 1, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 33, 14, -3.0F, -2.0F, 0.0F, 2, 1, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 56, 14, -4.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

		this.bipedHead.addChild(Helmet);
		this.bipedBody.addChild(ChestPlate);
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