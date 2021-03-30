package com.johnson.listener;

import com.johnson.MkiiEconomy;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;

public class MyListener implements Listener {

    protected MkiiEconomy plugin;
    public MyListener(MkiiEconomy instance){
        this.plugin = instance;
        this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
    }

    public void unregisterListener(){
        HandlerList.unregisterAll(this);
    }
}
