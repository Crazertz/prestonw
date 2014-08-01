package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.camp.main.StringLibrary;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemManager{
 
    public static void mainRegistry(){
        initializeItem();
        registerItem();
    }
 
    public static Item salt;    
    public static Item customFood;
 
    public static void initializeItem() {
        customFood = new salt();
        customFood = new CustomFood(8, 0.6F, false).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("CustomFood").setTextureName(StringLibrary.MODID + ":coconut");
    }
 
    public static void registerItem(){
        GameRegistry.registerItem(customFood, customFood.getUnlocalizedName());
        GameRegistry.registerItem(customFood, customFood.getUnlocalizedName());
    }
}