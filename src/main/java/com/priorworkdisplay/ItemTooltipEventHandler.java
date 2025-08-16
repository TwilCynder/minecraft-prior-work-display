package com.testmod;

import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ItemTooltipEventHandler {

    private static int[] repairCostLevels = {1, 3, 7, 15, 31};

    private static int getRepairCostLevel(int repairCost){
        int i = 0;
        for (; i < repairCostLevels.length; i++){
            if (repairCostLevels[i] > repairCost) break;
        }

        return i;
    }

    @SubscribeEvent
    public void getItemTooltip(ItemTooltipEvent ev){
        if (ev != null){
            ItemStack itemStack = ev.getItemStack();
            NBTTagCompound tag = itemStack.getTagCompound();
            //System.out.println(itemStack.getItem().getUnlocalizedName() + " | " + tag);
            if (tag != null){
                if (tag.hasKey("RepairCost")){
                    int repairCost = tag.getInteger("RepairCost");
                    //System.out.println(" -- -- Repair Cost : " + repairCost);
                    if (repairCost > 0){
                        int repairCostLevel = getRepairCostLevel(repairCost);
                        //System.out.println("-- -- Repair Cost Level : " + repairCostLevel);
                        ev.getToolTip().add("Reforged " + repairCostLevel + " times (" + repairCost + ")");
                    }
                }
                //System.out.println(" -- Found a tag");
                

            }
            
        }

    }
}
