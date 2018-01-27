package cjminecraft.IndustrialTech.base;

import cjminecraft.IndustrialTech.IndustrialTech;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

public class ITItem extends Item {

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
        this.setRegistryName(new ResourceLocation(IndustrialTech.ID, name));
        this.setCreativeTab(tab);
        items.add(this);
    }

    public static void registerItems(boolean isClient) {
        items.forEach(i -> i.registerItem(isClient));
    }


    public void registerItem(boolean isClient){
        GameRegistry.register(this);
        if (isClient)
            ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
