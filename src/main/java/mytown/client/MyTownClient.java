package mytown.client;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import mytown.client.gui.MyTownGuiHandler;
import mytown.client.handlers.InputHandler;
import mytown.client.proxy.ClientProxy;
import org.apache.logging.log4j.Logger;

/**
 * Created by AfterWind on 4/17/2015.
 * Main class for the MyTown2-Client mod.
 */
@Mod(modid = "MyTown2-Client", name = "MyTown2-Client", version = "0.0.1a", acceptableRemoteVersions = "*")
public class MyTownClient {

    public static Logger log;

    @SidedProxy(clientSide="mytown.client.proxy.ClientProxy")
    public static ClientProxy clientProxy;

    @Mod.Instance
    public static MyTownClient instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent ev) {
        log = ev.getModLog();
        FMLCommonHandler.instance().bus().register(InputHandler.getInstance());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent ev) {
        clientProxy.init();

        NetworkRegistry.INSTANCE.registerGuiHandler(this, MyTownGuiHandler.getInstance());
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent ev) {}
}
