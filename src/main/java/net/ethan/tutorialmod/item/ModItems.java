package net.ethan.tutorialmod.item;

import net.ethan.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.datafixer.fix.StatusEffectDurationFix;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.HungerConstants;
import net.minecraft.entity.player.HungerManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static Object FoodComponent;
    public static final Item DICK = registerItem("dick", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).saturationModifier(6).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,5000, 20),20).build())));
    public static final Item COOKEDDICK = registerItem("cookeddick", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(20).saturationModifier(20).build())));

    private static void addItemsToFoodandDrink(FabricItemGroupEntries entries){
        entries.add(DICK);
        entries.add(COOKEDDICK);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering Mod Items for" + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodandDrink);
    }


}
