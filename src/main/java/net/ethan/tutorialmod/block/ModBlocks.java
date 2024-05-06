package net.ethan.tutorialmod.block;

import net.ethan.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block COMPRESSED_DICK = registerBlock("compressed_dick",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIED_KELP_BLOCK).sounds(BlockSoundGroup.HONEY)));

    public static final Block COMPRESSED_COOKED_DICK = registerBlock("compressed_cooked_dick",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIED_KELP_BLOCK).sounds(BlockSoundGroup.HONEY)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

        public static void registerModBlocks() {
            TutorialMod.LOGGER.info("Registering ModBlocks for " + TutorialMod.MOD_ID);
        }
    }