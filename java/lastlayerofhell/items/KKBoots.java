package lastlayerofhell.items;
import lastlayerofhell.HellMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class KKBoots extends Item 
{
	public KKBoots()
	{
	super();
	this.setCreativeTab(CreativeTabs.tabCombat);
	setUnlocalizedName(HellMod.modid + "_" + "KKBoots");
	setTextureName(HellMod.modid + ":" + "KKBoots");
}
}
