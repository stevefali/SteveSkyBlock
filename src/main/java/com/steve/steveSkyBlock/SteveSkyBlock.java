package com.steve.steveSkyBlock;

import com.steve.steveSkyBlock.event.CobbleGenerationEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SteveSkyBlock extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new CobbleGenerationEvent(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
