package net.ethan.tutorialmod.item;

import net.ethan.tutorialmod.TutorialMod;
import net.ethan.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DICK_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "dick"),
            FabricItemGroup.builder().displayName(Text.translatable("TheGoonCave"))
                    .icon(() -> new ItemStack(ModItems.DICK)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DICK);
                        entries.add(ModItems.COOKED_DICK);
                        entries.add(ModBlocks.COMPRESSED_DICK);
                        entries.add(ModBlocks.COMPRESSED_COOKED_DICK);
                    }).build());


    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Registering Item Groups for" + TutorialMod.MOD_ID);
    }
}
