package lastlayerofhell.items;

import lastlayerofhell.HellMod;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class Ghoulflesh extends ItemFood {

	public Ghoulflesh() {
			super(1, true);
			this.setPotionEffect(19, 1, 100, 1.0f);
			this.setCreativeTab(HellMod.tabCustom);
			this.setTextureName(HellMod.modid + ":Ghoul_Flesh");
			this.setAlwaysEdible();
			this.setUnlocalizedName("Ghoulflesh");
	}

}
