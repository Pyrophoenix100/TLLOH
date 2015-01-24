package lastlayerofhell.foods;

import lastlayerofhell.HellMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Flaresoul extends ItemFood {
		public Flaresoul(){
			super(5, true);
			this.setCreativeTab(HellMod.tabCustom);
			this.setPotionEffect(12, 6, 100, 1.0f);
			this.setPotionEffect(16, 6, 100, 1.0f);
			this.setAlwaysEdible();
			this.setUnlocalizedName("Flaresoul");
			this.setTextureName(HellMod.modid + ":Flaresoul");
		}
}
