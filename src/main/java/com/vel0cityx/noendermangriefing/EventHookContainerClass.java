package com.vel0cityx.noendermangriefing;

import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

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

            //Remove all tasks (since we don't have access to the ones that we want)
            enderman.tasks.taskEntries.clear();

            //Re-add the ones that we want
            enderman.tasks.addTask(0, new EntityAISwimming(enderman));
            enderman.tasks.addTask(2, new EntityAIAttackOnCollide(enderman, 1.0D, false));
            enderman.tasks.addTask(7, new EntityAIWander(enderman, 1.0D));
            enderman.tasks.addTask(8, new EntityAIWatchClosest(enderman, EntityPlayer.class, 8.0F));
            enderman.tasks.addTask(8, new EntityAILookIdle(enderman));
        }
    }
}