package com.steve.steveSkyBlock.event;

import com.steve.steveSkyBlock.utils.CobbleGenerator;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFormEvent;


public class CobbleGenerationEvent implements Listener {

    @EventHandler
    public void onCreateCobblestone(BlockFormEvent event) {
        if (event.getNewState().getType() == Material.COBBLESTONE) {

            event.getNewState().setType(CobbleGenerator.determineBlock());
        }
    }
}
