package net.konagy.flash_rf_mod.block;

import net.konagy.flash_rf_mod.FlashRFMod;
import net.konagy.flash_rf_mod.block.custom.JumpyBlock;
import net.konagy.flash_rf_mod.item.ModCreativeModeTab;
import net.konagy.flash_rf_mod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks  {
    public static final DeferredRegister<Block> BLOKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FlashRFMod.MOD_ID);

    public static final RegistryObject<Block> TECHNETIUM_BLOCK = registerBlock("technetium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.FLASH_BlOCK_TAB);

    public static final RegistryObject<Block> TECHNETIUM_ORE= registerBlock("technetium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops(),
                    UniformInt.of(5, 10)), ModCreativeModeTab.FLASH_BlOCK_TAB);

    public static final RegistryObject<Block> WOLFRAM_BLOCK = registerBlock("wolfram_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.FLASH_BlOCK_TAB);

    public static final RegistryObject<Block> WOLFRAM_ORE= registerBlock("wolfram_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops(),
                    UniformInt.of(5, 10)), ModCreativeModeTab.FLASH_BlOCK_TAB);

    public static final RegistryObject<Block> RUTENIUM_BLOCK = registerBlock("rutenium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.FLASH_BlOCK_TAB);

    public static final RegistryObject<Block> RUTENIUM_ORE= registerBlock("rutenium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops(),
                    UniformInt.of(5, 10)), ModCreativeModeTab.FLASH_BlOCK_TAB);

    public static final RegistryObject<Block> TANTALUM_BLOCK = registerBlock("tantalum_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.FLASH_BlOCK_TAB);

    public static final RegistryObject<Block> TANTALUM_ORE= registerBlock("tantalum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops(),
                    UniformInt.of(5, 10)), ModCreativeModeTab.FLASH_BlOCK_TAB);

    public static final RegistryObject<Block> JUMPY_BLOCK= registerBlock("jumpy_block",
            () -> new JumpyBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.FLASH_BlOCK_TAB);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
                   return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOKS.register(eventBus);
    }
}
