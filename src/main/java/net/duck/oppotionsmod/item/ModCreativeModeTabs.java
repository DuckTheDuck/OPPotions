package net.duck.oppotionsmod.item;

import com.mojang.brigadier.LiteralMessage;
import net.duck.oppotionsmod.OpPotionsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OpPotionsMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> OPPOTIONSMOD_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("oppotionsmod_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ASH.get()))
                    .title(Component.translatable("creativetab.oppotionsmod.ash.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ASH.get());
                        output.accept(ModItems.COAL_POWDER.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
