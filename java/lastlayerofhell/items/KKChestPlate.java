package lastlayerofhell.items;
import lastlayerofhell.HellMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class KKChestPlate extends Item 
{
	public KKChestPlate()
	{
	super();
	this.setCreativeTab(CreativeTabs.tabCombat);
}
@SideOnly(Side.CLIENT) 
public void registerIcons(IIconRegister par1IconRegister)
{
    this.itemIcon = par1IconRegister.registerIcon(HellMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
}
}
