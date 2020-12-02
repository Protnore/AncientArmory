package com.protnore.ancientarmory.objects.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Guthan_Boots extends ModelBiped {

	public final ModelRenderer RightBoot;
	public final ModelRenderer LeftBoot;

	public Guthan_Boots() {
		
		textureWidth = 1024;
		textureHeight = 1024;

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(-2.0F, 20.0F, -2.0F);
		RightBoot.cubeList.add(new ModelBox(RightBoot, 58, 58, 4.0F, -11.0F, 0.0F, 1, 3, 4, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 18, 65, 0.0F, -11.0F, -1.0F, 4, 3, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 55, 65, 0.0F, -11.0F, 4.0F, 4, 3, 1, 0.0F, false));
		RightBoot.cubeList.add(new ModelBox(RightBoot, 46, 59, -1.0F, -11.0F, 0.0F, 1, 3, 4, 0.0F, false));

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(3.0F, 12.0F, -2.0F);
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 46, 59, -6.0F, -3.0F, 0.0F, 1, 3, 4, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 64, 57, -5.0F, -3.0F, 4.0F, 4, 3, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 8, 44, -5.0F, -3.0F, -1.0F, 4, 3, 1, 0.0F, false));
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 58, 58, -1.0F, -3.0F, 0.0F, 1, 3, 4, 0.0F, false));
		
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