package fr.expandcraft.expandmodcore.common;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class Itemexpandiumarmors extends ItemArmor {

	public Itemexpandiumarmors(ArmorMaterial material, int type) {
		super(material, 0, type);

		
	}
	
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(slot == 2)
        {
            return "expandmodcore:textures/models/armor/expandium_layer_2.png";
        }
        return "expandmodcore:textures/models/armor/expandium_layer_1.png";
        
    }

}