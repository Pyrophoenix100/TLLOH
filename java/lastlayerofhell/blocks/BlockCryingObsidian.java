package lastlayerofhell.blocks;
import lastlayerofhell.HellMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCryingObsidian extends Block 
{
	public BlockCryingObsidian()    
	 {              
		 super(Material.rock);           
		 setBlockName(HellMod.modid + "_" + "CryingObsidian"); 
		 setBlockTextureName(HellMod.modid + ":" + "CryingObsidian");
		 this.setCreativeTab(HellMod.tabCustom); 
		 setHardness(2F);
		 setResistance(5F);
		 setStepSound(Block.soundTypeStone);
		 
		 }
}