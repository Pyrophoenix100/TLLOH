package lastlayerofhell.items;
import lastlayerofhell.HellMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class RubyLeggings extends Item 
{
	public RubyLeggings()
	{
	super();
	this.setCreativeTab(CreativeTabs.tabCombat);
	setTextureName(HellMod.modid + ":" + "RubyLeggings");
	setUnlocalizedName(HellMod.modid + "_" + "RubyLeggings");
}
}
