package lastlayerofhell.items;

import lastlayerofhell.HellMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class RubyArmor extends ItemArmor {
	public RubyArmor(ArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
			super(par2EnumArmorMaterial, par3, par4);
			par2EnumArmorMaterial.getDamageReductionAmount(par4);
			this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
			this.maxStackSize = 1;
			this.setCreativeTab(CreativeTabs.tabCombat);
			}
			public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
			if (stack.getItem() == HellMod.RubyHelmet
			|| stack.getItem() == HellMod.RubyChestPlate
			|| stack.getItem() == HellMod.RubyBoots) {
			return "lastlayerofhell:textures/armor/RubyArmor_1.png";
			}
			if (stack.getItem() == HellMod.RubyLeggings) {
			return "lastlayerofhell:textures/armor/RubyArmor_2.png";
			} else 
			{
			return null;
			}
			}
			public void registerIcons(IIconRegister reg) { 
				if (this == HellMod.RubyChestPlate) {
				this.itemIcon = reg.registerIcon("lastlayerofhell:RubyChestPlate");
				}

				if (this == HellMod.RubyLeggings) {
				this.itemIcon = reg.registerIcon("lastlayerofhell:RubyLeggings"); 
				}

				if (this == HellMod.RubyBoots) {
				this.itemIcon = reg.registerIcon("lastlayerofhell:RubyBoots"); 
				}

				if (this == HellMod.RubyHelmet) {
				this.itemIcon = reg.registerIcon("lastlayerofhell:RubyHelmet"); 
				}
			}
			}

