package com.vel0cityx.noendermangriefing;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = NoEndermanGriefing.MODID, name = NoEndermanGriefing.MODNAME,version = NoEndermanGriefing.VERSION)
public class NoEndermanGriefing
{
    public static final String MODID = "noendermangriefing";
    public static final String MODNAME = "No Enderman Griefing";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new EventHookContainerClass());
    }
}