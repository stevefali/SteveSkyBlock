package com.steve.steveSkyBlock.event;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFormEvent;


public class TestEvents implements Listener {

    @EventHandler
    public void onCreateCobblestone(BlockFormEvent event) {
        if (event.getNewState().getType() == Material.COBBLESTONE) {

            // Attempt to form a gold block instead of cobblestone
            event.getNewState().setType(Material.GOLD_BLOCK);
        }
    }
}
