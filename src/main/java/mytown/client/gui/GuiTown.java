package mytown.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

/**
 * Created by AfterWind on 4/17/2015.
 * This is the main GUI opened when pressing the binded key.
 */
public class GuiTown extends GuiScreen {

    @Override
    public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_) {

    }

    @SuppressWarnings("unchecked")
    @Override
    public void initGui() {
        buttonList.add(new GuiButton(1, 1, 1, "Yo"));
    }

    @Override
    protected void actionPerformed(GuiButton p_146284_1_) {

    }

    @Override
    public void updateScreen() {

    }
}
