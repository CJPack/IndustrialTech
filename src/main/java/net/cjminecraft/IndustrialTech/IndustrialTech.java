package net.cjminecraft.IndustrialTech;

import net.cjminecraft.IndustrialTech.events.ITEvents;
import net.cjminecraft.IndustrialTech.proxy.Proxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static net.cjminecraft.IndustrialTech.IndustrialTech.*;

@Mod(modid = ID, name = NAME, version = VER, acceptedMinecraftVersions = MCVER)
public class IndustrialTech {

    public static final String ID = "industrialtech";
    public static final String NAME = "IndustrialTech";
    public static final String VER = "A-1";
    public static final String MCVER = "[1.10.2]";

    public static final String CLIENT = "net.cjminecraft.IndustrialTech.proxy.Client";
    public static final String SERVER = "net.cjminecraft.IndustrialTech.proxy.Server";

    @Mod.Instance
    public static IndustrialTech i;

    @SidedProxy(serverSide = SERVER, clientSide = CLIENT, modId = ID)
    public static Proxy p;

    @Mod.EventHandler
    public static void onPreInit(FMLPreInitializationEvent e){
        MinecraftForge.EVENT_BUS.register(new ITEvents());
    }

    @Mod.EventHandler
    public static void onInit(FMLInitializationEvent e){

    }

    @Mod.EventHandler
    public static void onPostInit(FMLPostInitializationEvent e){

    }



}

