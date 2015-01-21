package lastlayerofhell.items;

import lastlayerofhell.HellMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class KKArmor extends ItemArmor {
	public KKArmor(ArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
			super(par2EnumArmorMaterial, par3, par4);
			par2EnumArmorMaterial.getDamageReductionAmount(par4);
			this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
			this.maxStackSize = 1;
			this.setCreativeTab(CreativeTabs.tabCombat);
			}
			public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
			if (stack.getItem() == HellMod.KKHelmet
			|| stack.getItem() == HellMod.KKChestPlate
			|| stack.getItem() == HellMod.KKBoots) {
			return "kirbyandfriends:textures/armor/KK_1.png";
			}
			if (stack.getItem() == HellMod.KKLeggings) {
			return "kirbyandfriends:textures/armor/KK_2.png";
			} else 
			{
			return null;
			}
			}
			public void registerIcons(IIconRegister reg) { 
				if (this == HellMod.KKChestPlate) {
				this.itemIcon = reg.registerIcon("kirbyandfriends:KKChestPlate");
				}

				if (this == HellMod.KKLeggings) {
				this.itemIcon = reg.registerIcon("kirbyandfriends:KKLeggings"); 
				}

				if (this == HellMod.KKBoots) {
				this.itemIcon = reg.registerIcon("kirbyandfriends:KKBoots"); 
				}

				if (this == HellMod.KKHelmet) {
				this.itemIcon = reg.registerIcon("kirbyandfriends:KKHelmet"); 
				}
			}
			}
