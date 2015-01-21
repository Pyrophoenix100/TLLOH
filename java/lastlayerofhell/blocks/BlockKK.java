package lastlayerofhell.blocks;
import lastlayerofhell.HellMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockKK extends Block 
{
	public BlockKK()    
	 {              
		 super(Material.iron);              
		 this.setCreativeTab(HellMod.tabCustom); 
		 setBlockName(HellMod.modid + "_" + "KKBlock"); 
		 setBlockTextureName(HellMod.modid + ":" + "KKBlock");
		 setHardness(2F);
		 setResistance(5F);
		 setStepSound(Block.soundTypeStone);
		 
		 }
	
}
