package lastlayerofhell.items;
import lastlayerofhell.HellMod;
import net.minecraft.item.Item;
public class Ruby extends Item 
{
	public Ruby()
	{
	super();
	setTextureName(HellMod.modid + ":" + "Ruby");
	setUnlocalizedName(HellMod.modid + "_" + "Ruby");
	this.setCreativeTab(HellMod.tabCustom);
}
}

