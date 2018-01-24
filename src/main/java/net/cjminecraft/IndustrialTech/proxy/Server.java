package net.cjminecraft.IndustrialTech.proxy;

import net.cjminecraft.IndustrialTech.base.ITItem;

public class Server extends Proxy {

    public void onPreInit() {
        super.onPreInit();
        ITItem.registerItems();
    }
}
