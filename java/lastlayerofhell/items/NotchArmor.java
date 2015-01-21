package lastlayerofhell.items;

import lastlayerofhell.HellMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class NotchArmor extends ItemArmor {
	public NotchArmor(ArmorMaterial par2EnumArmorMaterial,
			int par4, String name) {
			super(par2EnumArmorMaterial,0, par4);
			this.maxStackSize = 1;
			setUnlocalizedName(name);
			setTextureName(HellMod.modid + ":" + getUnlocalizedName().substring(5));
			this.setCreativeTab(CreativeTabs.tabCombat);
			}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
			if (stack.getItem()== HellMod.NotchHelmet) 
			{
			return "lastlayerofhell:textures/armor/NotchMask_1.png";
			}
			else {
			return null;
			}
			}
			public void registerIcons(IIconRegister reg) { 
				if (this == HellMod.NotchHelmet) {
				this.itemIcon = reg.registerIcon("lastlayerofhell:NotchHelmet"); 
				}


			}
			}
