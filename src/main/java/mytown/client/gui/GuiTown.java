package mytown.client.gui;

import mytown.client.gui.button.ButtonTown;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by AfterWind on 4/17/2015.
 * This is the main GUI opened when pressing the binded key.
 */
public class GuiTown extends GuiScreen {

    private EntityPlayer player;

    public GuiTown(EntityPlayer player) {
        this.player = player;
    }

    @Override
    public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_) {
        super.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void initGui() {
        super.initGui();
        buttonList.add(new ButtonTown(1, 1, 1, "Yo"));
    }

    @Override
    protected void actionPerformed(GuiButton p_146284_1_) {
        super.actionPerformed(p_146284_1_);
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
    }
}
