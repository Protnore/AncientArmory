package com.protnore.ancientarmory.objects.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.1
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


  public class Verac_Armor extends ModelBiped {
	public final ModelRenderer LeftLeg1;
	public final ModelRenderer RightLeg3;
	public final ModelRenderer LeftLeg3;
	public final ModelRenderer RightLeg1;
	public final ModelRenderer RightLeg2;
	public final ModelRenderer LeftLeg2;
	public final ModelRenderer FrontStrap;
	public final ModelRenderer BackStrap;
	public final ModelRenderer TopStrap;
	public final ModelRenderer LeftHelmBuckle;
	public final ModelRenderer RightHelmBuckle;
	public final ModelRenderer PonytailBase;
	public final ModelRenderer PonytailMid;
	public final ModelRenderer RightHelmSpike;
	public final ModelRenderer LeftHelmSpike;
	public final ModelRenderer LeftLeg;
	public final ModelRenderer RightLeg;
	public final ModelRenderer RightBoot;
	public final ModelRenderer LeftBoot;
	public final ModelRenderer LeftArm;
	public final ModelRenderer StrapBase;
	public final ModelRenderer Helmet;
	public final ModelRenderer PonytailTip;

	public Verac_Armor() {

		textureWidth = 1024;
		textureHeight = 1024;

		LeftLeg1 = new ModelRenderer(this);
		LeftLeg1.setRotationPoint(0.0F, 15.0F, -4.0F);
		setRotationAngle(LeftLeg1, -0.3054F, 0.0F, 0.0F);
		LeftLeg1.cubeList.add(new ModelBox(LeftLeg1, 34, 27, -3.0F, -14.6946F, -3.5385F, 5, 3, 1, 0.0F, false));

		RightLeg3 = new ModelRenderer(this);
		RightLeg3.setRotationPoint(5.0F, 15.0F, -4.0F);
		setRotationAngle(RightLeg3, -0.3054F, 0.0F, 0.0F);
		RightLeg3.cubeList.add(new ModelBox(RightLeg3, 56, 13, -7.0F, -14.6946F, -3.5385F, 5, 3, 1, 0.0F, false));

		LeftLeg3 = new ModelRenderer(this);
		LeftLeg3.setRotationPoint(0.0F, 15.0F, 3.0F);
		setRotationAngle(LeftLeg3, 0.3054F, 0.0F, 0.0F);
		LeftLeg3.cubeList.add(new ModelBox(LeftLeg3, 51, 57, -3.0F, -14.3926F, 3.4985F, 5, 3, 1, 0.0F, false));

		RightLeg1 = new ModelRenderer(this);
		RightLeg1.setRotationPoint(5.0F, 15.0F, 3.0F);
		setRotationAngle(RightLeg1, 0.3054F, 0.0F, 0.0F);
		RightLeg1.cubeList.add(new ModelBox(RightLeg1, 59, 0, -7.0F, -14.3926F, 3.4985F, 5, 3, 1, 0.0F, false));

		RightLeg2 = new ModelRenderer(this);
		RightLeg2.setRotationPoint(6.0F, 15.0F, -3.0F);
		setRotationAngle(RightLeg2, 0.0F, 0.0F, -0.3054F);
		RightLeg2.cubeList.add(new ModelBox(RightLeg2, 30, 47, 0.636F, -15.296F, 0.0F, 1, 3, 6, 0.0F, false));

		LeftLeg2 = new ModelRenderer(this);
		LeftLeg2.setRotationPoint(-5.0F, 15.0F, -3.0F);
		setRotationAngle(LeftLeg2, 0.0F, 0.0F, 0.3054F);
		LeftLeg2.cubeList.add(new ModelBox(LeftLeg2, 8, 48, -2.581F, -14.991F, 0.0F, 1, 3, 6, 0.0F, false));

		FrontStrap = new ModelRenderer(this);
		FrontStrap.setRotationPoint(-4.0F, 11.0F, 2.0F);
		setRotationAngle(FrontStrap, 0.0F, 0.0F, 0.7854F);
		FrontStrap.cubeList.add(new ModelBox(FrontStrap, 0, 53, -1.0F, -13.4142F, -0.999F, 1, 12, 1, 0.0F, false));

		BackStrap = new ModelRenderer(this);
		BackStrap.setRotationPoint(-4.0F, 11.0F, -3.0F);
		setRotationAngle(BackStrap, 0.0F, 0.0F, 0.7854F);
		BackStrap.cubeList.add(new ModelBox(BackStrap, 4, 53, -1.0F, -13.4142F, 0.999F, 1, 12, 1, 0.0F, false));

		TopStrap = new ModelRenderer(this);
		TopStrap.setRotationPoint(-5.0F, 2.0F, 2.0F);
		setRotationAngle(TopStrap, 0.0F, 0.0F, 1.5708F);
		TopStrap.cubeList.add(new ModelBox(TopStrap, 55, 61, -1.0F, -10.0F, -0.999F, 1, 9, 1, 0.0F, false));
		TopStrap.cubeList.add(new ModelBox(TopStrap, 29, 38, -1.0F, -10.0F, -4.001F, 1, 9, 1, 0.0F, false));
		TopStrap.cubeList.add(new ModelBox(TopStrap, 59, 59, 6.999F, -2.0F, -4.0F, 1, 1, 4, 0.0F, false));

		LeftHelmBuckle = new ModelRenderer(this);
		LeftHelmBuckle.setRotationPoint(-5.0F, -1.0F, -2.0F);
		setRotationAngle(LeftHelmBuckle, 0.7854F, 0.0F, 0.0F);
		LeftHelmBuckle.cubeList.add(new ModelBox(LeftHelmBuckle, 12, 0, -0.75F, -0.8787F, 2.8284F, 1, 3, 3, 0.0F, false));

		RightHelmBuckle = new ModelRenderer(this);
		RightHelmBuckle.setRotationPoint(6.0F, -1.0F, -2.0F);
		setRotationAngle(RightHelmBuckle, 0.7854F, 0.0F, 0.0F);
		RightHelmBuckle.cubeList.add(new ModelBox(RightHelmBuckle, 60, 50, -1.25F, -0.8787F, 2.8284F, 1, 3, 3, 0.0F, false));

		PonytailBase = new ModelRenderer(this);
		PonytailBase.setRotationPoint(1.0F, -12.3963F, 4.0F);
		setRotationAngle(PonytailBase, -2.3562F, 0.0F, 0.0F);
		PonytailBase.cubeList.add(new ModelBox(PonytailBase, 22, 51, -1.44F, -1.5037F, -0.5F, 1, 1, 3, 0.0F, false));

		PonytailMid = new ModelRenderer(this);
		PonytailMid.setRotationPoint(2.0F, -24.0F, -4.0F);
		setRotationAngle(PonytailMid, -0.5672F, 0.0F, 0.0F);
		PonytailMid.cubeList.add(new ModelBox(PonytailMid, 50, 0, -3.0F, 3.7F, 13.3F, 2, 2, 5, 0.0F, false));

		RightHelmSpike = new ModelRenderer(this);
		RightHelmSpike.setRotationPoint(4.0F, -9.0F, 0.0F);
		setRotationAngle(RightHelmSpike, -0.3491F, 0.0F, 0.0F);
		RightHelmSpike.cubeList.add(new ModelBox(RightHelmSpike, 0, 20, -1.0F, -2.658F, -0.9397F, 1, 3, 1, 0.0F, false));

		LeftHelmSpike = new ModelRenderer(this);
		LeftHelmSpike.setRotationPoint(-3.0F, -9.0F, 0.0F);
		setRotationAngle(LeftHelmSpike, -0.3491F, 0.0F, 0.0F);
		LeftHelmSpike.cubeList.add(new ModelBox(LeftHelmSpike, 6, 20, -1.0F, -2.658F, -0.9397F, 1, 3, 1, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(0.0F, 13.0F, -2.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 42, 42, -3.855F, -10.214F, -1.0F, 1, 5, 6, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 21, 56, -3.0F, -10.22F, 4.86F, 5, 5, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 34, 34, 2.0F, -12.25F, -1.0F, 1, 7, 6, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 36, 0, -3.0F, -10.22F, -1.86F, 5, 5, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 50, 26, -2.0F, -13.25F, 0.0F, 4, 1, 4, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(5.0F, 18.0F, 3.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 50, 26, -7.0F, -18.25F, -5.0F, 4, 1, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 56, 7, -7.0F, -15.22F, -6.86F, 5, 5, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 42, 3, -2.14F, -15.23F, -6.0F, 1, 5, 6, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 36, 14, -8.0F, -17.25F, -6.0F, 1, 7, 6, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 33, 56, -7.0F, -15.22F, -0.14F, 5, 5, 1, 0.0F, false));

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(5.0F, 24.0F, -2.0F);
		RightBoot.cubeList.add(new ModelBox(RightBoot, 56, 43, -8.0F, -15.0F, 0.0F, 1, 3, 4, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 60, 22, -7.0F, -15.0F, 4.0F, 4, 3, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 44, 14, -7.0F, -15.0F, -1.0F, 4, 3, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 56, 31, -3.0F, -15.0F, 0.0F, 1, 3, 4, 0.0F, false));

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(0.0F, 24.0F, 2.0F);
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 45, 57, 2.0F, -15.0F, -4.0F, 1, 3, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 24, 62, -2.0F, -15.0F, -5.0F, 4, 3, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 8, 57, -3.0F, -15.0F, -4.0F, 1, 3, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 60, 38, -2.0F, -15.0F, 0.0F, 4, 3, 1, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(1.0F, -8.0F, 2.0F);
		setRotationAngle(LeftArm, 0.0F, 3.1416F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 50, 38, -2.0F, 7.0F, 4.0F, 4, 8, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 50, 14, -3.0F, 7.0F, 0.0F, 1, 8, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 20, 2.0F, 7.0F, 0.0F, 1, 8, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -2.0F, 7.0F, -1.0F, 4, 8, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 45, 53, -1.0F, 2.0F, -2.0F, 1, 6, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 34, 62, -3.0F, 4.0F, -2.0F, 2, 4, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 50, 50, -3.0F, 4.0F, -1.0F, 2, 1, 6, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 43, -4.0F, 4.0F, -1.0F, 1, 4, 6, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 43, -3.0F, 4.0F, 5.0F, 2, 4, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 20, 38, -1.0F, 2.0F, 5.0F, 1, 6, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 42, 27, -1.0F, 0.0F, -1.0F, 1, 5, 6, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 14, 60, -1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

		StrapBase = new ModelRenderer(this);
		StrapBase.setRotationPoint(4.0F, 10.0F, -2.0F);
		StrapBase.cubeList.add(new ModelBox(StrapBase, 60, 17, -8.001F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));
		StrapBase.cubeList.add(new ModelBox(StrapBase, 10, 20, -8.001F, -1.0F, -0.001F, 1, 1, 1, 0.0F, false));
		StrapBase.cubeList.add(new ModelBox(StrapBase, 12, 6, -8.001F, -9.0F, -0.001F, 1, 1, 1, 0.0F, false));
		StrapBase.cubeList.add(new ModelBox(StrapBase, 16, 6, -8.001F, -1.0F, 3.001F, 1, 1, 1, 0.0F, false));
		StrapBase.cubeList.add(new ModelBox(StrapBase, 12, 6, -8.001F, -9.0F, 3.001F, 1, 1, 1, 0.0F, false));

		Helmet = new ModelRenderer(this);
		Helmet.setRotationPoint(-1.0F, -5.0F, 9.0F);
		setRotationAngle(Helmet, 0.0F, 3.1416F, 0.0F);
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 32, -5.0F, -4.0F, 4.0F, 8, 10, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 24, 9, -5.0F, -4.0F, 13.0F, 8, 10, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 18, 32, -6.0F, -1.0F, 14.0F, 10, 5, 1, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 12, 12, 3.0F, -4.0F, 4.0F, 1, 10, 10, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 0, -6.0F, -4.0F, 4.0F, 1, 10, 10, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 20, 41, -6.5F, 0.0F, 8.0F, 1, 3, 7, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 11, 38, 3.5F, 0.0F, 8.0F, 1, 3, 7, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 12, 0, -5.0F, -4.0F, 5.0F, 8, 1, 8, 0.0F, false));
		Helmet.cubeList.add(new ModelBox(Helmet, 16, 51, -2.0F, -5.0F, 5.0F, 2, 1, 2, 0.0F, false));

		PonytailTip = new ModelRenderer(this);
		PonytailTip.setRotationPoint(1.0F, -5.0F, -9.0F);
		PonytailTip.cubeList.add(new ModelBox(PonytailTip, 38, 47, -1.5F, -5.6F, 17.1F, 1, 5, 1, 0.0F, false));
		
		this.bipedHead.addChild(Helmet);
	    this.bipedHead.addChild(LeftHelmBuckle);
	    this.bipedHead.addChild(RightHelmBuckle);
	    this.bipedHead.addChild(RightHelmSpike);
	    this.bipedHead.addChild(LeftHelmSpike);
	    this.bipedHead.addChild(PonytailBase);
	    this.bipedHead.addChild(PonytailMid);
	    this.bipedHead.addChild(PonytailTip);
        this.bipedBody.addChild(TopStrap);
        this.bipedBody.addChild(BackStrap);
        this.bipedBody.addChild(StrapBase);
        this.bipedBody.addChild(FrontStrap);
	    this.bipedLeftArm.addChild(LeftArm);
	    this.bipedLeftLeg.addChild(RightLeg);
	    this.bipedLeftLeg.addChild(RightLeg1);
	    this.bipedLeftLeg.addChild(RightLeg2);
	    this.bipedLeftLeg.addChild(RightLeg3);
	    this.bipedRightLeg.addChild(LeftLeg);
	    this.bipedRightLeg.addChild(LeftLeg1);
	    this.bipedRightLeg.addChild(LeftLeg2);
	    this.bipedRightLeg.addChild(LeftLeg3);
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