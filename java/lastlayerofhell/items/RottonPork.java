package lastlayerofhell.items;
import lastlayerofhell.HellMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class RottonPork extends ItemFood 
{
	 	public RottonPork()
	 	{
	 	super(2, true);
	 	this.setCreativeTab(CreativeTabs.tabFood);
	 	}
	 @SideOnly(Side.CLIENT) 
	 public void registerIcons(IIconRegister par1IconRegister)
	 {
	     this.itemIcon = par1IconRegister.registerIcon(HellMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
}
	  public void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	        super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
	        if (!par2World.isRemote)
	        { 
	            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.hunger.id, 400, 60));
	        }
}
}
