package main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.lwjgl.Sys;

@Mod(modid = Main.MODID, version = Main.VERSION)

public class Main {
    public static final String MODID = "basemod";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent var1) {
        System.out.println("hello fren");
    }
}
