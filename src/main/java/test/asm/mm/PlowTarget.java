package test.asm.mm;

import net.minecraft.item.Item;
import test.asm.mixin.EnchantmentTargetMixin;
import test.item.PlowItem;

public abstract class PlowTarget extends EnchantmentTargetMixin {
    @Override
    public boolean isAcceptableItem(final Item item) {
        return item instanceof PlowItem;
    }
}
