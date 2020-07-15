package test;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import test.asm.mm.PlowTargets;
import test.item.PlowItem;

public class Main implements ModInitializer {
    public static final String MOD_ID = "test";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.warn(PlowTargets.PLOW_TARGET.isAcceptableItem(new Item(new Item.Settings())) ? "Can enchant non-plow item." : "Cannot enchant non-plow item.");
        LOGGER.warn(PlowTargets.PLOW_TARGET.isAcceptableItem(new PlowItem(new Item.Settings())) ? "Can enchant plow item." : "Cannot enchant plow item.");
    }
}
