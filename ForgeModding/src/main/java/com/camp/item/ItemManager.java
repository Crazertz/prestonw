package com.camp.item;
 
import net.minecraft.item.Item;

import com.camp.main.*;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
 
public class ItemManager {
     
    public static void mainRegistry() {
        initializeItem();
        registerItem();
    }
     
    public static Item customItem;
          
    public static void initializeItem() {
        customItem = new CustomItem();
    }
              
    public static void registerItem() {
         GameRegistry.registerItem(customItem, customItem.getUnlocalizedName());
    }
         
}