package test.asm.mm;

import com.chocohead.mm.api.ClassTinkerers;
import net.fabricmc.loader.api.FabricLoader;

public class EarlyRiser implements Runnable {
    @Override
    public void run() {
        final String EnchantmentTargetName = FabricLoader.getInstance().getMappingResolver().mapClassName("intermediary", "net.minecraft.class_1886");

        ClassTinkerers.enumBuilder(EnchantmentTargetName, new Class[0]).addEnumSubclass("PLOW_TARGET", "test.asm.mm.PlowTarget").build();
    }
}
