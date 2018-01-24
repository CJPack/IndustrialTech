package net.cjminecraft.IndustrialTech.proxy;

import net.cjminecraft.IndustrialTech.base.ITItem;

public class Client extends Proxy {

    public void onPreInit() {
        super.onPreInit();
        ITItem.registerItems();
    }
}
