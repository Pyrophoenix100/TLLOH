package lastlayerofhell.items;
import lastlayerofhell.HellMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class RubyChestPlate extends Item 
{
	public RubyChestPlate()
	{
	super();
	this.setCreativeTab(CreativeTabs.tabCombat);
	setTextureName(HellMod.modid + ":" + "RubyChestPlate");
	setUnlocalizedName(HellMod.modid + "_" + "RubyChestPlate");
}
}
