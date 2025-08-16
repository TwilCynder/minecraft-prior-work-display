package com.testmod;

import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ItemTooltipEventHandler {

    @SubscribeEvent
    public void getItemTooltip(ItemTooltipEvent ev){
        if (ev != null){
            System.out.println("TEST TOOLTIP EVNT");
            System.out.println(ev.getToolTip());
            ev.getToolTip().add("Le test");
        } else {
            System.out.println("NULL TOOLTIP EVNT");
        }

    }
}
