package net.konagy.flash_rf_mod.item;

import net.konagy.flash_rf_mod.FlashRFMod;
import net.konagy.flash_rf_mod.item.custom.EightBallItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, FlashRFMod.MOD_ID);

        public static final RegistryObject<Item> TECHNETIUM_INGOT = ITEMS.register("technetium_ingot",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLASH_ITEM_TAB)));
        public static final RegistryObject<Item> RAW_TECHNETIUM = ITEMS.register("raw_technetium",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLASH_ITEM_TAB)));

        public static final RegistryObject<Item> WOLFRAM_INGOT = ITEMS.register("wolfram_ingot",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLASH_ITEM_TAB)));
        public static final RegistryObject<Item> RAW_WOLFRAM = ITEMS.register("raw_wolfram",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLASH_ITEM_TAB)));

        public static final RegistryObject<Item> RUTENIUM_INGOT = ITEMS.register("rutenium_ingot",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLASH_ITEM_TAB)));
        public static final RegistryObject<Item> RAW_RUTENIUM = ITEMS.register("raw_rutenium",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLASH_ITEM_TAB)));

        public static final RegistryObject<Item> TANTALUM_INGOT = ITEMS.register("tantalum_ingot",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLASH_ITEM_TAB)));
        public static final RegistryObject<Item> RAW_TANTALUM = ITEMS.register("raw_tantalum",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLASH_ITEM_TAB)));

        public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
                () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.FLASH_ITEM_TAB).stacksTo(1)));
        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }


}
