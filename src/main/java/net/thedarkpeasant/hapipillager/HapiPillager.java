package net.thedarkpeasant.hapipillager;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(HapiPillager.MOD_ID)
public class HapiPillager {
    public static final String MOD_ID = "hapipillager";

    public HapiPillager() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}