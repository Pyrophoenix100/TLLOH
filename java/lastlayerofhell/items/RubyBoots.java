package lastlayerofhell.items;
import lastlayerofhell.HellMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class RubyBoots extends Item 
{
	public RubyBoots()
	{
	super();
	this.setCreativeTab(CreativeTabs.tabCombat);
	setTextureName(HellMod.modid + ":" + "RubyBoots");
	setUnlocalizedName(HellMod.modid + "_" + "RubyBoots");
}
}
