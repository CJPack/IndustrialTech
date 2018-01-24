package net.cjminecraft.IndustrialTech.base;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

import static net.cjminecraft.IndustrialTech.IndustrialTech.ID;

public abstract class ITItem extends Item {

    public static CreativeTabs tab = new CreativeTabs("it_items") {
        public Item getTabIconItem() {
            return Items.DIAMOND;
        }
    };

    public static List<ITItem> items = new ArrayList<>();

    private String name;

    public ITItem(String name) {
        this.name = name;
        this.setUnlocalizedName(name);
        this.setRegistryName(new ResourceLocation(ID, name));
        this.setCreativeTab(tab);
        items.add(this);
    }

    public static void registerItems(boolean isClient) {
        items.forEach(i -> {
            GameRegistry.register(i);
            if (isClient)
                ModelLoader.setCustomModelResourceLocation(i, 0, new ModelResourceLocation(i.getRegistryName(), "inventory"));
            i.registerItem();
        });
    }


    public abstract void registerItem();

}
