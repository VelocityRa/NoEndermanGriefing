package com.vel0cityx.noendermangriefing;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = NoEndermanGriefing.MODID, name = NoEndermanGriefing.MODNAME,version = NoEndermanGriefing.VERSION)
public class NoEndermanGriefing
{
    public static final String MODID = "noendermangriefing";
    public static final String MODNAME = "No Enderman Griefing";
    public static final String VERSION = "1.0";
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new EventHookContainerClass());
    }
}
