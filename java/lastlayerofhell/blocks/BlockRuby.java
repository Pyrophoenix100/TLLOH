package lastlayerofhell.blocks;
import lastlayerofhell.HellMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRuby extends Block 
{
	public BlockRuby()    
	 {              
		 super(Material.iron);              
		 this.setCreativeTab(HellMod.tabCustom); 
		 setBlockName(HellMod.modid + "_" + "RubyBlock"); 
		 setBlockTextureName(HellMod.modid + ":" + "RubyBlock");
		 setHardness(2F);
		 setResistance(5F);
		 setStepSound(Block.soundTypeStone);
		 
		 }
}
