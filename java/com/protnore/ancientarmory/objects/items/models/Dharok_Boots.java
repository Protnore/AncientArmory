package com.protnore.ancientarmory.objects.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.1
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Dharok_Boots extends ModelBiped {
	
	public final ModelRenderer RightBoot;
	public final ModelRenderer LeftBoot;

	public Dharok_Boots() {
		
		textureWidth = 1024;
		textureHeight = 1024;

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(2.1F, 12.0F, -3.0F);
		RightBoot.cubeList.add(new ModelBox(RightBoot, 0, 57, -0.1F, -3.0F, 1.0F, 1, 3, 4, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 62, 19, -4.1F, -3.0F, 5.0F, 4, 3, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 10, 57, -5.1F, -3.0F, 1.0F, 1, 3, 4, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 62, 9, -4.1F, -3.0F, 0.0F, 4, 3, 1, 0.0F, false));

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(2.0F, 12.0F, 2.0F);
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 56, 26, -5.0F, -3.0F, -4.0F, 1, 3, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 36, 60, -4.0F, -3.0F, -5.0F, 4, 3, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 56, 19, 0.0F, -3.0F, -4.0F, 1, 3, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 61, 62, -4.0F, -3.0F, 0.0F, 4, 3, 1, 0.0F, false));
		
		this.bipedLeftLeg.addChild(LeftBoot);
		this.bipedRightLeg.addChild(RightBoot);

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