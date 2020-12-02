package com.protnore.ancientarmory.entity;

import com.protnore.ancientarmory.entity.base.EntityBarrowsBase;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityKaril extends EntityBarrowsBase
{
	public EntityKaril(World worldIn) 
	{
		super(worldIn);
		setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.STONE_SWORD));
	}
	
	@Override
	protected void applyEntityAttributes() 
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}
	
	@Override
	public float getEyeHeight()
	{
		return 2.3F;
	}
	@Override
	protected ResourceLocation getLootTable() 
	{
		return getLootTable();
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) 
	{
		return super.getHurtSound(damageSourceIn);
	}
	@Override
	protected SoundEvent getAmbientSound() 
	{
		return super.getAmbientSound();
	}
	@Override
	protected SoundEvent getDeathSound() 
	{
		return super.getDeathSound();
	}
}