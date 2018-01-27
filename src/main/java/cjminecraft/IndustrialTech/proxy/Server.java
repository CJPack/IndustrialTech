package cjminecraft.IndustrialTech.proxy;

import cjminecraft.IndustrialTech.base.ITItem;

public class Server extends Proxy {

    public void onPreInit() {
        super.onPreInit();
        ITItem.registerItems();
    }
}
