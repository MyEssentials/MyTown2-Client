package mytown.client.gui.button;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by AfterWind on 4/17/2015.
 *
 */
public class ButtonTown extends GuiButton {
    public ButtonTown(int id, int x, int y, String text) {
        super(id, x, y, text);

        //ResourceLocation imageTexture = new ResourceLocation()
    }

    @Override
    public void drawButton(Minecraft minecraft, int x, int y) {


        FontRenderer fontrenderer = minecraft.fontRenderer;
        minecraft.getTextureManager().bindTexture(buttonTextures);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.field_146123_n = x >= this.xPosition && y >= this.yPosition && x < this.xPosition + this.width && y < this.yPosition + this.height;
        int k = this.getHoverState(this.field_146123_n);
        GL11.glEnable(GL11.GL_BLEND);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        this.drawTexturedModalRect(this.xPosition, this.yPosition, 0, 46 + k * 20, this.width / 2, this.height);
        this.drawTexturedModalRect(this.xPosition + this.width / 2, this.yPosition, 200 - this.width / 2, 46 + k * 20, this.width / 2, this.height);
        this.mouseDragged(minecraft, x, y);
        int l = 14737632;

        if (packedFGColour != 0)
        {
            l = packedFGColour;
        }
        else if (!this.enabled)
        {
            l = 10526880;
        }
        else if (this.field_146123_n)
        {
            l = 16777120;
        }

        this.drawCenteredString(fontrenderer, this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, l);
    }
}
