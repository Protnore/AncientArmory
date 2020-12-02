package com.protnore.ancientarmory.objects.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.1
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Dharok_Armor extends ModelBiped {
	
public final ModelRenderer Helmet;
public final ModelRenderer RightArmTopSpike1;
public final ModelRenderer RightArmTopSpike2;
public final ModelRenderer RightArmBottomSpike1;
public final ModelRenderer RightArmBottomSpike2;
public final ModelRenderer LeftArmTopSpike;
public final ModelRenderer LeftArmBottomSpike;
public final ModelRenderer LeftKneeCap;
public final ModelRenderer RightKneeCap;
public final ModelRenderer ChestTopSpike;
public final ModelRenderer ChestBottomSpike;
public final ModelRenderer LeftLeg;
public final ModelRenderer RightLeg;
public final ModelRenderer LeftArm;
public final ModelRenderer RightArm;
public final ModelRenderer Chest;
public final ModelRenderer LeftKneeCapTip;
public final ModelRenderer RightKneeCapTip;

public Dharok_Armor() {

		textureWidth = 1024;
		textureHeight = 1024;

		RightArmTopSpike1 = new ModelRenderer(this);
		RightArmTopSpike1.setRotationPoint(-7.0F, -1.0F, -2.0F);
		setRotationAngle(RightArmTopSpike1, 0.0F, 0.0F, -0.7854F);
		RightArmTopSpike1.cubeList.add(new ModelBox(RightArmTopSpike1, 24, 11, 2.9497F, -1.8787F, 0.25F, 1, 3, 1, 0.0F, false));

		RightArmTopSpike2 = new ModelRenderer(this);
		RightArmTopSpike2.setRotationPoint(-7.0F, -1.0F, 1.0F);
		setRotationAngle(RightArmTopSpike2, 0.0F, 0.0F, -0.7854F);
		RightArmTopSpike2.cubeList.add(new ModelBox(RightArmTopSpike2, 10, 11, 2.9497F, -1.8787F, -0.25F, 1, 3, 1, 0.0F, false));

		RightArmBottomSpike1 = new ModelRenderer(this);
		RightArmBottomSpike1.setRotationPoint(-9.0F, 0.5F, -3.0F);
		setRotationAngle(RightArmBottomSpike1, 0.0F, -0.7854F, 0.0F);
		RightArmBottomSpike1.cubeList.add(new ModelBox(RightArmBottomSpike1, 6, 43, 1.5355F, -3.0F, -3.2855F, 3, 1, 1, 0.0F, false));

		RightArmBottomSpike2 = new ModelRenderer(this);
		RightArmBottomSpike2.setRotationPoint(-9.0F, 0.5F, 3.0F);
		setRotationAngle(RightArmBottomSpike2, 0.0F, 0.7854F, 0.0F);
		RightArmBottomSpike2.cubeList.add(new ModelBox(RightArmBottomSpike2, 52, 19, 1.5355F, -3.0F, 2.2855F, 3, 1, 1, 0.0F, false));

		ChestTopSpike = new ModelRenderer(this);
		ChestTopSpike.setRotationPoint(0.0F, 7.0F, -5.0F);
		setRotationAngle(ChestTopSpike, -0.5236F, 0.0F, 0.0F);
		ChestTopSpike.cubeList.add(new ModelBox(ChestTopSpike, 42, 8, -0.5F, -1.0F, 0.5F, 1, 1, 2, 0.0F, false));

		ChestBottomSpike = new ModelRenderer(this);
		ChestBottomSpike.setRotationPoint(0.0F, 10.0F, -5.0F);
		setRotationAngle(ChestBottomSpike, 0.5236F, 0.0F, 0.0F);
		ChestBottomSpike.cubeList.add(new ModelBox(ChestBottomSpike, 44, 62, -0.5F, 0.0F, 0.5F, 1, 1, 2, 0.0F, false));

		LeftArmTopSpike = new ModelRenderer(this);
		LeftArmTopSpike.setRotationPoint(12.0F, 6.0F, -0.5F);
		setRotationAngle(LeftArmTopSpike, 0.0F, 0.0F, -0.7854F);
		LeftArmTopSpike.cubeList.add(new ModelBox(LeftArmTopSpike, 58, 38, -4.9213F, -7.614F, 0.0F, 2, 1, 1, 0.0F, false));

		LeftArmBottomSpike = new ModelRenderer(this);
		LeftArmBottomSpike.setRotationPoint(12.0F, 8.0F, -0.5F);
		setRotationAngle(LeftArmBottomSpike, 0.0F, 0.0F, 0.7854F);
		LeftArmBottomSpike.cubeList.add(new ModelBox(LeftArmBottomSpike, 62, 26, -7.7497F, 3.7855F, 0.0F, 2, 1, 1, 0.0F, false));

		RightKneeCap = new ModelRenderer(this);
		RightKneeCap.setRotationPoint(0.0F, 5.0F, -4.0F);
		setRotationAngle(RightKneeCap, -0.7854F, 3.1416F, 0.0F);
		RightKneeCap.cubeList.add(new ModelBox(RightKneeCap, 35, 34, -2.0003F, -0.2929F, -1.7071F, 4, 1, 1, 0.0F, false));
		RightKneeCap.cubeList.add(new ModelBox(RightKneeCap, 0, 16, -1.5F, -1.2929F, -1.7071F, 3, 1, 1, 0.0F, false));
		RightKneeCap.cubeList.add(new ModelBox(RightKneeCap, 6, 57, -1.0F, -0.2787F, -1.0F, 2, 2, 1, 0.0F, false));
		RightKneeCap.cubeList.add(new ModelBox(RightKneeCap, 30, 0, -0.5F, -2.4F, -1.7071F, 1, 2, 1, 0.0F, false));
		RightKneeCap.cubeList.add(new ModelBox(RightKneeCap, 30, 0, -0.5F, -1.7F, -2.4142F, 1, 2, 1, 0.0F, false));

		LeftKneeCap = new ModelRenderer(this);
		LeftKneeCap.setRotationPoint(0.0F, 5.0F, -3.0F);
		setRotationAngle(LeftKneeCap, -0.7854F, 3.1416F, 0.0F);
		LeftKneeCap.cubeList.add(new ModelBox(LeftKneeCap, 6, 41, -1.9997F, -1.0F, -1.0F, 4, 1, 1, 0.0F, false));
		LeftKneeCap.cubeList.add(new ModelBox(LeftKneeCap, 10, 16, -1.5F, -2.0F, -1.0F, 3, 1, 1, 0.0F, false));
		LeftKneeCap.cubeList.add(new ModelBox(LeftKneeCap, 46, 59, -1.0F, -0.9858F, -0.2929F, 2, 2, 1, 0.0F, false));
		LeftKneeCap.cubeList.add(new ModelBox(LeftKneeCap, 0, 41, -0.5F, -2.4F, -1.7071F, 1, 2, 1, 0.0F, false));
		LeftKneeCap.cubeList.add(new ModelBox(LeftKneeCap, 0, 41, -0.5F, -3.1071F, -1.0F, 1, 2, 1, 0.0F, false));

		Chest = new ModelRenderer(this);
		Chest.setRotationPoint(-4.0F, 12.0F, -2.0F);
		Chest.cubeList.add(new ModelBox(Chest, 18, 35, 0.0F, -12.0F, 4.0F, 8, 12, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 0, 41, 8.0F, -12.0F, 0.0F, 1, 12, 4, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 0, 28, 0.0F, -12.0F, -1.0F, 8, 12, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 36, 36, -1.0F, -12.0F, 0.0F, 1, 12, 4, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-2.0F, 7.0F, -2.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 52, 44, -2.0F, -10.0F, 4.0F, 5, 4, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 10, 11, -2.0F, -11.0F, 0.0F, 5, 1, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 52, 14, -2.0F, -10.0F, -1.0F, 5, 4, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 36, 52, 3.0F, -4.0F, 0.0F, 1, 4, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 56, 49, -1.0F, -4.0F, -1.0F, 4, 4, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 58, 4, -1.0F, -4.0F, 4.0F, 4, 4, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 52, 6, -2.0F, -4.0F, 0.0F, 1, 4, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 30, 48, -3.0F, -10.0F, 0.0F, 1, 4, 4, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(3.0F, 1.0F, 1.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 52, 36, 0.0F, 2.0F, -3.0F, 1, 4, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 58, 33, -4.0F, 2.0F, 1.0F, 4, 4, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 52, 55, -5.0F, 2.0F, -3.0F, 1, 4, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 58, 54, -4.0F, 2.0F, -4.0F, 4, 4, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 56, 0, -4.0F, -3.0F, -4.0F, 5, 3, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 30, 0, -4.0F, -4.0F, -3.0F, 5, 1, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 28, 21, -4.0F, -3.0F, 1.0F, 5, 3, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 26, 56, 1.0F, -3.0F, -3.0F, 1, 3, 4, 0.0F, false));

		RightKneeCapTip = new ModelRenderer(this);
		RightKneeCapTip.setRotationPoint(-1.0F, 2.0F, -11.0F);
		RightKneeCapTip.cubeList.add(new ModelBox(RightKneeCapTip, 36, 36, 0.5F, -1.196F, 5.803F, 1, 2, 1, 0.0F, false));

		LeftKneeCapTip = new ModelRenderer(this);
		LeftKneeCapTip.setRotationPoint(3.0F, 2.0F, -11.0F);
		LeftKneeCapTip.cubeList.add(new ModelBox(LeftKneeCapTip, 36, 36, -3.5F, -1.196F, 5.803F, 1, 2, 1, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, -10.0F, -2.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 46, 30, 0.0F, 10.0F, -1.0F, 4, 9, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 36, 21, 4.0F, 10.0F, 0.0F, 1, 9, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 71, 0, 0.0F, 9.9F, 0.0F, 4, 1, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 0, 0.0F, 10.0F, 4.0F, 4, 9, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 46, 17, -1.0F, 10.0F, 0.0F, 1, 9, 4, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, -12.0F, -5.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 46, 46, 0.0F, 12.0F, 3.0F, 1, 9, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 20, 48, -4.0F, 12.0F, 2.0F, 4, 9, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 10, 44, -5.0F, 12.0F, 3.0F, 1, 9, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 46, 0, -4.0F, 12.0F, 7.0F, 4, 9, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 71, 0, -4.0F, 11.9F, 3.0F, 4, 1, 4, 0.0F, false));

		Helmet = new ModelRenderer(this);
		Helmet.setRotationPoint(-1.0F, -9.0F, -4.0F);
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
		
        this.bipedHead.addChild(Helmet);
	    this.bipedBody.addChild(Chest);
	    this.bipedBody.addChild(ChestTopSpike);
	    this.bipedBody.addChild(ChestBottomSpike);	
	    this.bipedLeftArm.addChild(LeftArm);
	    this.bipedLeftArm.addChild(LeftArmTopSpike);
	    this.bipedLeftArm.addChild(LeftArmBottomSpike);	
	    this.bipedRightArm.addChild(RightArm);
	    this.bipedRightArm.addChild(RightArmTopSpike1);
	    this.bipedRightArm.addChild(RightArmTopSpike2);	
	    this.bipedRightArm.addChild(RightArmBottomSpike1);
	    this.bipedRightArm.addChild(RightArmBottomSpike2);
	    this.bipedLeftLeg.addChild(LeftLeg);
	    this.bipedLeftLeg.addChild(LeftKneeCap);
	    this.bipedLeftLeg.addChild(LeftKneeCapTip);
	    this.bipedRightLeg.addChild(RightLeg);
	    this.bipedRightLeg.addChild(RightKneeCap);
	    this.bipedRightLeg.addChild(RightKneeCapTip);

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