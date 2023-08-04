package net.konagy.flash_rf_mod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab FLASH_ITEM_TAB = new CreativeModeTab("flash_rf_mod_item_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TECHNETIUM_INGOT.get());
        }
    };

}
