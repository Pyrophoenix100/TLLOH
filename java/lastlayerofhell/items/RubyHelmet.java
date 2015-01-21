package lastlayerofhell.items;
import lastlayerofhell.HellMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class RubyHelmet extends Item 
{
	public RubyHelmet()
	{
	super();
	this.setCreativeTab(CreativeTabs.tabCombat);
	setTextureName(HellMod.modid + ":" + "RubyHelmet");
	setUnlocalizedName(HellMod.modid + "_" + "RubyHelmet");
}
}
