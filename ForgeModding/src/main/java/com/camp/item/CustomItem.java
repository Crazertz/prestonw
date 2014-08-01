package com.camp.item;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.camp.main.StringLibrary;
 
public class CustomItem extends Item
{
	public CustomItem() 
    {
    	this.setUnlocalizedName("CustomItem");
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setMaxDamage(1);
        this.setMaxStackSize(16);
        this.setTextureName(StringLibrary.MODID + ":custom_food");
    } 
 
}