package net.konagy.flash_rf_mod.item;

import net.konagy.flash_rf_mod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab FLASH_ITEM_TAB = new CreativeModeTab("flash_rf_mod_item_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TECHNETIUM_INGOT.get());
        }
    };

    public static final CreativeModeTab FLASH_BlOCK_TAB = new CreativeModeTab("flash_rf_mod_block_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.TECHNETIUM_BLOCK.get());
        }
    };

}
