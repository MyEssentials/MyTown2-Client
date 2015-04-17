package mytown.client.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by AfterWind on 4/17/2015.
 * Handles the guis
 */
public class MyTownGuiHandler implements IGuiHandler {

    private static MyTownGuiHandler instance;
    public static MyTownGuiHandler getInstance() {
        if (instance == null)
            instance = new MyTownGuiHandler();
        return instance;
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == 0) {
            return new GuiTown(player);
        }
        return null;
    }
}
