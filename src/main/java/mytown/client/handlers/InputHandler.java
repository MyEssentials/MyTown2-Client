package mytown.client.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mytown.client.MyTownClient;
import mytown.client.proxy.ClientProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

/**
 * Created by AfterWind on 4/17/2015.
 * Handles the inputs received from the player.
 */
public class InputHandler {

    private static InputHandler instance;
    public static InputHandler getInstance() {
        if(instance == null)
            instance = new InputHandler();
        return instance;
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void keyInput(InputEvent.KeyInputEvent ev) {
        // DEBUG
        KeyBinding[] keyBindings = ClientProxy.keyBindings;
        if (keyBindings[0].isPressed()) {
            MyTownClient.log.info("Key binding = " + keyBindings[0].getKeyDescription());
            Minecraft.getMinecraft().thePlayer.openGui(MyTownClient.instance, 0, Minecraft.getMinecraft().thePlayer.worldObj, (int) Math.floor(Minecraft.getMinecraft().thePlayer.posX), (int) Math.floor(Minecraft.getMinecraft().thePlayer.posY), (int) Math.floor(Minecraft.getMinecraft().thePlayer.posZ));
        }
    }


}
