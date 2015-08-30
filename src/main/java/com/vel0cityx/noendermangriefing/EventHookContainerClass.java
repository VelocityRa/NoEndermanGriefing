package com.vel0cityx.noendermangriefing;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class EventHookContainerClass
{
    /**
     * The key is the @SubscribeEvent annotation and the cast of the Event you put in as argument.
     * The method name you pick does not matter. Method signature is public void, always.
     */
    @SubscribeEvent
    public void onEntityJoinWorld(EntityJoinWorldEvent event) {
        if (event.entity instanceof EntityEnderman) {
            EntityEnderman enderman = (EntityEnderman) event.entity;
            //This function sets the block that the enderman is supposed to be holding.
            //We set that to End Portal so it's invisible and can't be placed in the world
            //Kind of a workaround but in 1.7.10 the only alternative was to create a custom Enderman and
            //spawn him instead, which would be very time consuming.
            enderman.func_146081_a(Blocks.end_portal);
        }
    }
}
