package com.camp.item;
import com.camp.lib.StringLibrary;

import net.minecraft.creativetab.CreativeTabs;
import ;
public class CustomItem extends pair
{
	public CustomItem()
	{
		this.setTextureName(StringLibrary.MODID + ":pair");
		this.setUnlocalizedName(":pair");
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setMaxDamage(1);
	    this.setMaxStackSize(32);
	}	
}
