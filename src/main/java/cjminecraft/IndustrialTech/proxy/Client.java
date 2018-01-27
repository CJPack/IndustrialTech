package cjminecraft.IndustrialTech.proxy;

import cjminecraft.IndustrialTech.base.ITItem;

public class Client extends Proxy {

    public void onPreInit() {
        super.onPreInit();
        ITItem.registerItems();
    }
}
