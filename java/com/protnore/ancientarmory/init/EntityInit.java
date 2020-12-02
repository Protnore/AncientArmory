package com.protnore.ancientarmory.init;

import com.protnore.ancientarmory.Main;
import com.protnore.ancientarmory.entity.EntityAhrim;
import com.protnore.ancientarmory.entity.EntityDharok;
import com.protnore.ancientarmory.entity.EntityGuthan;
import com.protnore.ancientarmory.entity.EntityKaril;
import com.protnore.ancientarmory.entity.EntityTorag;
import com.protnore.ancientarmory.entity.EntityVerac;
import com.protnore.ancientarmory.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void registerEntities()
	{
		registerEntity("dharok", EntityDharok.class, Reference.ENTITY_DHAROK, 50, 4405543, 2637358);
		registerEntity("guthan", EntityGuthan.class, Reference.ENTITY_GUTHAN, 50, 4405543, 2637358);
		registerEntity("ahrim", EntityAhrim.class, Reference.ENTITY_AHRIM, 50, 4405543, 2637358);
		registerEntity("karil", EntityKaril.class, Reference.ENTITY_KARIL, 50, 4405543, 2637358);
		registerEntity("torag", EntityTorag.class, Reference.ENTITY_TORAG, 50, 4405543, 2637358);
		registerEntity("verac", EntityVerac.class, Reference.ENTITY_VERAC, 50, 4405543, 2637358);


	}

	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
