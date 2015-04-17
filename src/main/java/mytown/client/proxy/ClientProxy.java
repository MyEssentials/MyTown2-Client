package mytown.client.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

/**
 * Created by AfterWind on 4/17/2015.
 *
 */
public class ClientProxy {

    public static KeyBinding[] keyBindings;

    public void init() {

        // declare an array of key bindings
        keyBindings = new KeyBinding[1];

        // instantiate the key bindings
        keyBindings[0] = new KeyBinding("mytown.key.gui", Keyboard.KEY_M, "mytown.key");

        // register all the key bindings
        for (KeyBinding keyBinding : keyBindings) {
            ClientRegistry.registerKeyBinding(keyBinding);
        }
    }

}
