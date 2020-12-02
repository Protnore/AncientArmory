package com.protnore.ancientarmory.items;
import com.protnore.ancientarmory.Main;
import com.protnore.ancientarmory.init.ItemInit;
import com.protnore.ancientarmory.objects.items.models.Verac_Armor;
import com.protnore.ancientarmory.util.IHasModel;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class VeracArmorBase extends ItemArmor implements IHasModel
{
	public VeracArmorBase(String name, CreativeTabs tab, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn)
	{
		
		super(materialIn, 1, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(1);
		
		ItemInit.ITEMS.add(this);
		
	}
	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
	}
	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) 
	{
		if(itemStack != itemStack.EMPTY) 
		{
			if(itemStack.getItem() instanceof ItemArmor) 
			{
			
				Verac_Armor model = new Verac_Armor ();

				model.Helmet.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				model.LeftHelmSpike.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				model.LeftHelmSpike.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				model.PonytailBase.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				model.PonytailMid.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				model.PonytailTip.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				model.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.TopStrap.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.FrontStrap.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.BackStrap.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.StrapBase.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.RightLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS;
				model.RightLeg1.showModel = armorSlot == EntityEquipmentSlot.LEGS;
				model.RightLeg2.showModel = armorSlot == EntityEquipmentSlot.LEGS;
				model.RightLeg3.showModel = armorSlot == EntityEquipmentSlot.LEGS;
				model.LeftLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS;
				model.LeftLeg1.showModel = armorSlot == EntityEquipmentSlot.LEGS;
				model.LeftLeg2.showModel = armorSlot == EntityEquipmentSlot.LEGS;
				model.LeftLeg3.showModel = armorSlot == EntityEquipmentSlot.LEGS;
				model.LeftBoot.showModel = armorSlot == EntityEquipmentSlot.FEET;
				model.RightBoot.showModel = armorSlot == EntityEquipmentSlot.FEET;
			
				model.isChild = _default.isChild;
				model.isRiding = _default.isRiding;
				model.isSneak = _default.isSneak;
				model.rightArmPose = _default.rightArmPose;
				model.leftArmPose = _default.leftArmPose;
				
				return model;
				
			}
		}
		return null;
    }
}