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
            enderman.func_146081_a(Blocks.end_portal);
        }
    }
}
