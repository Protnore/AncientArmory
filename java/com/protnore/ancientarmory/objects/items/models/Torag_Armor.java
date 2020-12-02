package com.protnore.ancientarmory.objects.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.1
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public class Torag_Armor extends ModelBiped {
	
	public final ModelRenderer Helmet;
	public final ModelRenderer BottomRightFacePlate_r1;
	public final ModelRenderer BottomLeftFacePlate_r1;
	public final ModelRenderer TopRightFacePlate_r1;
	public final ModelRenderer TopLeftFacePlate_r1;
	public final ModelRenderer TopLeftFacePlate;
	public final ModelRenderer TopRightFacePlate;
	public final ModelRenderer BottomLeftFacePlate;
	public final ModelRenderer LeftTuskBase;
	public final ModelRenderer LeftTuskTip_r1;
	public final ModelRenderer LeftTuskTip;
	public final ModelRenderer BottomRightFacePlate;
	public final ModelRenderer RightTuskBase;
	public final ModelRenderer RightTuskTip_r1;
	public final ModelRenderer RightTuskTip;
	public final ModelRenderer LeftArm;
	public final ModelRenderer LeftArmSpike_r1;
	public final ModelRenderer LeftArmSpike;
	public final ModelRenderer RightArm;
	public final ModelRenderer Chest;
	public final ModelRenderer RightChestSpike_r1;
	public final ModelRenderer LeftChestSpike_r1;
	public final ModelRenderer LeftChestSpike;
	public final ModelRenderer RightChestSpike;
	public final ModelRenderer RightLeg;
	public final ModelRenderer RightKneeCap_r1;
	public final ModelRenderer RightKneeCap;
	public final ModelRenderer LeftLeg;
	public final ModelRenderer LeftKneeCap_r1;
	public final ModelRenderer LeftKneeCap;
	public final ModelRenderer RightBoot;
	public final ModelRenderer LeftBoot;

	public Torag_Armor() {

		textureWidth = 1024;
		textureHeight = 1024;

		Helmet = new ModelRenderer(this);
		Helmet.setRotationPoint(-5.0F, 1.0F, -4.0F);
		setRotationAngle(Helmet, 0.0F, 3.1416F, 0.0F);
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 11, -10.0F, -10.0F, -8.0F, 1, 9, 8, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 18, 16, -10.0F, -9.0F, 0.0F, 2, 9, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 0, -10.0F, -10.0F, -9.0F, 10, 1, 10, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 28, 11, -10.0F, -9.0F, -9.0F, 10, 9, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 18, 18, -1.0F, -9.0F, -8.0F, 1, 9, 8, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 20, 58, -2.0F, -9.0F, 0.0F, 2, 9, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 46, 40, -8.0F, -9.0F, 0.0F, 6, 3, 1, 0.0F, false));

		BottomRightFacePlate_r1 = new ModelRenderer(this);
		BottomRightFacePlate_r1.setRotationPoint(-4.0F, 0.0F, 0.0F);
		Helmet.addChild(BottomRightFacePlate_r1);
		setRotationAngle(BottomRightFacePlate_r1, 0.0F, 0.4363F, 0.0F);
		
		BottomLeftFacePlate_r1 = new ModelRenderer(this);
		BottomLeftFacePlate_r1.setRotationPoint(-5.0F, 0.0F, 0.0F);
		Helmet.addChild(BottomLeftFacePlate_r1);
		setRotationAngle(BottomLeftFacePlate_r1, 0.0F, -0.4363F, 0.0F);
		
		TopRightFacePlate_r1 = new ModelRenderer(this);
		TopRightFacePlate_r1.setRotationPoint(-5.0F, -6.0F, 2.0F);
		Helmet.addChild(TopRightFacePlate_r1);
		setRotationAngle(TopRightFacePlate_r1, 0.0F, 0.6109F, 0.0F);
		
		TopLeftFacePlate_r1 = new ModelRenderer(this);
		TopLeftFacePlate_r1.setRotationPoint(-5.0F, -6.0F, 2.0F);
		Helmet.addChild(TopLeftFacePlate_r1);
		setRotationAngle(TopLeftFacePlate_r1, 0.0F, -0.6109F, 0.0F);
		
		TopLeftFacePlate = new ModelRenderer(this);
		TopLeftFacePlate.setRotationPoint(-5.0F, -6.0F, 2.0F);
		Helmet.addChild(TopLeftFacePlate);
		setRotationAngle(TopLeftFacePlate, 0.0F, -0.6109F, 0.0F);
		TopLeftFacePlate.cubeList.add(new ModelBox(TopLeftFacePlate, 42, 34, -5.4264F, -4.0F, -1.1808F, 6, 4, 2, 0.0F, false));

		TopRightFacePlate = new ModelRenderer(this);
		TopRightFacePlate.setRotationPoint(-5.0F, -6.0F, 2.0F);
		Helmet.addChild(TopRightFacePlate);
		setRotationAngle(TopRightFacePlate, 0.0F, 0.6109F, 0.0F);
		TopRightFacePlate.cubeList.add(new ModelBox(TopRightFacePlate, 46, 46, -0.5736F, -4.0F, -1.1808F, 6, 4, 2, 0.0F, false));

		BottomLeftFacePlate = new ModelRenderer(this);
		BottomLeftFacePlate.setRotationPoint(-5.0F, 0.0F, 0.0F);
		Helmet.addChild(BottomLeftFacePlate);
		setRotationAngle(BottomLeftFacePlate, 0.0F, -0.4363F, 0.0F);
		BottomLeftFacePlate.cubeList.add(new ModelBox(BottomLeftFacePlate, 46, 52, -4.3F, -4.0F, 0.175F, 4, 4, 2, 0.0F, false));

		LeftTuskBase = new ModelRenderer(this);
		LeftTuskBase.setRotationPoint(0.0F, 0.0F, 0.0F);
		BottomLeftFacePlate.addChild(LeftTuskBase);
		LeftTuskBase.cubeList.add(new ModelBox(LeftTuskBase, 59, 49, -2.57F, -3.0F, 1.5039F, 2, 2, 3, 0.0F, false));

		LeftTuskTip_r1 = new ModelRenderer(this);
		LeftTuskTip_r1.setRotationPoint(-0.5774F, -1.7F, 4.6455F);
		LeftTuskBase.addChild(LeftTuskTip_r1);
		setRotationAngle(LeftTuskTip_r1, 0.5672F, 0.0F, 0.0F);
		
		LeftTuskTip = new ModelRenderer(this);
		LeftTuskTip.setRotationPoint(-0.5774F, -1.7F, 4.6455F);
		LeftTuskBase.addChild(LeftTuskTip);
		setRotationAngle(LeftTuskTip, 0.5672F, 0.0F, 0.0F);
		LeftTuskTip.cubeList.add(new ModelBox(LeftTuskTip, 64, 29, -1.4726F, -0.8F, -0.8955F, 1, 1, 3, 0.0F, false));

		BottomRightFacePlate = new ModelRenderer(this);
		BottomRightFacePlate.setRotationPoint(-4.0F, 0.0F, 0.0F);
		Helmet.addChild(BottomRightFacePlate);
		setRotationAngle(BottomRightFacePlate, 0.0F, 0.4363F, 0.0F);
		BottomRightFacePlate.cubeList.add(new ModelBox(BottomRightFacePlate, 55, 16, -0.6F, -4.0F, -0.245F, 4, 4, 2, 0.0F, false));

		RightTuskBase = new ModelRenderer(this);
		RightTuskBase.setRotationPoint(4.0F, 0.0F, 0.0F);
		BottomRightFacePlate.addChild(RightTuskBase);
		RightTuskBase.cubeList.add(new ModelBox(RightTuskBase, 61, 61, -4.3515F, -3.0F, 1.1F, 2, 2, 3, 0.0F, false));

		RightTuskTip_r1 = new ModelRenderer(this);
		RightTuskTip_r1.setRotationPoint(-3.6968F, -2.5F, 4.4576F);
		RightTuskBase.addChild(RightTuskTip_r1);
		setRotationAngle(RightTuskTip_r1, 0.5672F, 0.0F, 0.0F);
		
		RightTuskTip = new ModelRenderer(this);
		RightTuskTip.setRotationPoint(-3.6968F, -2.5F, 4.4576F);
		RightTuskBase.addChild(RightTuskTip);
		setRotationAngle(RightTuskTip, 0.5672F, 0.0F, 0.0F);
		RightTuskTip.cubeList.add(new ModelBox(RightTuskTip, 36, 62, -0.1532F, -0.25F, -1.5376F, 1, 1, 3, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-1.0F, 8.0F, 3.0F);
		setRotationAngle(LeftArm, 0.0F, 3.1416F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 57, -6.0F, -10.0F, 1.0F, 1, 3, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 59, 37, -5.0F, -10.0F, 5.0F, 5, 3, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 30, 0, -5.0F, -11.0F, 1.0F, 5, 1, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 54, 54, 0.0F, -5.0F, 1.0F, 1, 4, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 26, 56, -5.0F, -5.0F, 1.0F, 1, 4, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 64, -4.0F, -5.0F, 5.0F, 4, 4, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 10, 64, -4.0F, -5.0F, 0.0F, 4, 4, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 60, 4, -5.0F, -10.0F, 0.0F, 5, 3, 1, 0.0F, false));

		LeftArmSpike_r1 = new ModelRenderer(this);
		LeftArmSpike_r1.setRotationPoint(-2.0F, -10.0F, 2.0F);
		LeftArm.addChild(LeftArmSpike_r1);
		setRotationAngle(LeftArmSpike_r1, 0.0F, 0.0F, -0.48F);
		
		LeftArmSpike = new ModelRenderer(this);
		LeftArmSpike.setRotationPoint(-2.0F, -10.0F, 2.0F);
		LeftArm.addChild(LeftArmSpike);
		setRotationAngle(LeftArmSpike, 0.0F, 0.0F, -0.48F);
		LeftArmSpike.cubeList.add(new ModelBox(LeftArmSpike, 0, 11, -2.0F, -3.0F, 0.0F, 2, 3, 2, 0.0F, false));
		LeftArmSpike.cubeList.add(new ModelBox(LeftArmSpike, 0, 16, -1.4483F, -4.1907F, 0.5F, 1, 2, 1, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(0.0F, 7.0F, 2.0F);
		setRotationAngle(RightArm, 0.0F, 3.1416F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 56, 0, -1.0F, -9.0F, 4.0F, 5, 3, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 30, 5, -1.0F, -10.0F, 0.0F, 5, 1, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 52, 27, 4.0F, -9.0F, 0.0F, 1, 3, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 60, 41, -1.0F, -4.0F, 4.0F, 4, 4, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 30, 48, 3.0F, -4.0F, 0.0F, 1, 4, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 28, 21, -1.0F, -9.0F, -1.0F, 5, 3, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 60, 8, -1.0F, -4.0F, -1.0F, 4, 4, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 36, 52, -2.0F, -4.0F, 0.0F, 1, 4, 4, 0.0F, false));

		Chest = new ModelRenderer(this);
		Chest.setRotationPoint(-4.0F, 11.0F, -3.0F);
		setRotationAngle(Chest, 0.0F, 3.1416F, 0.0F);
		Chest.cubeList.add(new ModelBox(Chest, 18, 35, -8.0F, -11.0F, -1.0F, 8, 12, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 36, 36, -9.0F, -11.0F, -5.0F, 1, 12, 4, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 0, 28, -8.0F, -11.0F, -6.0F, 8, 12, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 0, 41, 0.0F, -11.0F, -5.0F, 1, 12, 4, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 10, 11, -8.0F, -4.0F, 0.0F, 8, 4, 1, 0.0F, false));

		RightChestSpike_r1 = new ModelRenderer(this);
		RightChestSpike_r1.setRotationPoint(-1.6968F, -2.5F, 1.4576F);
		Chest.addChild(RightChestSpike_r1);
		setRotationAngle(RightChestSpike_r1, 0.5672F, 0.6545F, 0.0F);
		
		LeftChestSpike_r1 = new ModelRenderer(this);
		LeftChestSpike_r1.setRotationPoint(-6.0F, -2.5F, 1.4576F);
		Chest.addChild(LeftChestSpike_r1);
		setRotationAngle(LeftChestSpike_r1, 0.5672F, -0.6545F, 0.0F);
		
		LeftChestSpike = new ModelRenderer(this);
		LeftChestSpike.setRotationPoint(-6.0F, -2.5F, 1.4576F);
		Chest.addChild(LeftChestSpike);
		setRotationAngle(LeftChestSpike, 0.5672F, -0.6545F, 0.0F);
		LeftChestSpike.cubeList.add(new ModelBox(LeftChestSpike, 6, 41, -1.0F, -0.25F, -1.5376F, 1, 1, 3, 0.0F, false));

		RightChestSpike = new ModelRenderer(this);
		RightChestSpike.setRotationPoint(-1.6968F, -2.5F, 1.4576F);
		Chest.addChild(RightChestSpike);
		setRotationAngle(RightChestSpike, 0.5672F, 0.6545F, 0.0F);
		RightChestSpike.cubeList.add(new ModelBox(RightChestSpike, 6, 57, -0.3032F, -0.25F, -1.5376F, 1, 1, 3, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-2.0F, 7.0F, 5.0F);
		setRotationAngle(RightLeg, 0.0F, 3.1416F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 36, 21, 0.0F, -7.0F, 3.0F, 1, 9, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 50, 6, -4.0F, -7.0F, 2.0F, 4, 9, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 10, 44, -5.0F, -7.0F, 3.0F, 1, 9, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 46, 21, -4.0F, -7.0F, 7.0F, 4, 9, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 44, 1, -4.0F, -7.1F, 3.0F, 4, 1, 4, 0.0F, false));

		RightKneeCap_r1 = new ModelRenderer(this);
		RightKneeCap_r1.setRotationPoint(0.0F, -2.0F, 7.0F);
		RightLeg.addChild(RightKneeCap_r1);
		setRotationAngle(RightKneeCap_r1, -0.7854F, 0.0F, 0.0F);
		
		RightKneeCap = new ModelRenderer(this);
		RightKneeCap.setRotationPoint(0.0F, -2.0F, 7.0F);
		RightLeg.addChild(RightKneeCap);
		setRotationAngle(RightKneeCap, -0.7854F, 0.0F, 0.0F);
		RightKneeCap.cubeList.add(new ModelBox(RightKneeCap, 36, 60, -4.0F, -1.25F, 0.16F, 4, 1, 1, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(2.0F, 7.0F, 8.0F);
		setRotationAngle(LeftLeg, 0.0F, 3.1416F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 0, 0.0F, -7.0F, 10.0F, 4, 9, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 36, 21, 4.0F, -7.0F, 6.0F, 1, 9, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 20, 48, 0.0F, -7.0F, 5.0F, 4, 9, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 10, 44, -1.0F, -7.0F, 6.0F, 1, 9, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 44, 1, 0.0F, -7.1F, 6.0F, 4, 1, 4, 0.0F, false));

		LeftKneeCap_r1 = new ModelRenderer(this);
		LeftKneeCap_r1.setRotationPoint(4.0F, -2.0F, 10.0F);
		LeftLeg.addChild(LeftKneeCap_r1);
		setRotationAngle(LeftKneeCap_r1, -0.7854F, 0.0F, 0.0F);
		
		LeftKneeCap = new ModelRenderer(this);
		LeftKneeCap.setRotationPoint(4.0F, -2.0F, 10.0F);
		LeftLeg.addChild(LeftKneeCap);
		setRotationAngle(LeftKneeCap, -0.7854F, 0.0F, 0.0F);
		LeftKneeCap.cubeList.add(new ModelBox(LeftKneeCap, 46, 44, -4.0F, -1.25F, 0.16F, 4, 1, 1, 0.0F, false));

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(2.1F, 12.0F, 2.0F);
		RightBoot.cubeList.add(new ModelBox(RightBoot, 51, 64, -4.1F, -3.0F, -5.0F, 4, 3, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 58, 30, -5.1F, -3.0F, -4.0F, 1, 3, 4, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 58, 22, -0.1F, -3.0F, -4.0F, 1, 3, 4, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 64, 22, -4.1F, -3.0F, 0.0F, 4, 3, 1, 0.0F, false));

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(3.0F, 12.0F, -2.0F);
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 26, 64, -5.0F, -3.0F, 4.0F, 4, 3, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 42, 58, -6.0F, -3.0F, 0.0F, 1, 3, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 60, 54, -5.0F, -3.0F, -1.0F, 4, 3, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 10, 57, -1.0F, -3.0F, 0.0F, 1, 3, 4, 0.0F, false));
		
		    this.bipedHead.addChild(Helmet);
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