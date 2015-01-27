package lastlayerofhell.blocks;

import java.util.Random;

import lastlayerofhell.HellMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class MagmaBrick extends Block {

	public MagmaBrick() {
		super(Material.rock);
		this.setBlockName("MagmaBrick");
		this.setCreativeTab(HellMod.tabCustom);
		this.setBlockTextureName(HellMod.modid + ":MagmaBrick");
	}
	
	@SideOnly(Side.CLIENT)
    public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
    {
        

        for (int l = 0; l < 4; ++l)
        {
            double d0 = (double)((float)p_149734_2_ + p_149734_5_.nextFloat());
            double d1 = (double)((float)p_149734_3_ + p_149734_5_.nextFloat());
            double d2 = (double)((float)p_149734_4_ + p_149734_5_.nextFloat());
            double d3 = 0.0D;
            double d4 = 0.0D;
            double d5 = 0.0D;
            int i1 = p_149734_5_.nextInt(2) * 2 - 1;
            d3 = ((double)p_149734_5_.nextFloat() - 0.5D) * 0.5D;
            d4 = ((double)p_149734_5_.nextFloat() - 0.5D) * 0.5D;
            d5 = ((double)p_149734_5_.nextFloat() - 0.5D) * 0.5D;

            if (p_149734_1_.getBlock(p_149734_2_ - 1, p_149734_3_, p_149734_4_) != this && p_149734_1_.getBlock(p_149734_2_ + 1, p_149734_3_, p_149734_4_) != this)
            {
                d0 = (double)p_149734_2_ + 0.5D + 0.25D * (double)i1;
                d3 = (double)(p_149734_5_.nextFloat() * 2.0F * (float)i1);
            }
            else
            {
                d2 = (double)p_149734_4_ + 0.5D + 0.25D * (double)i1;
                d5 = (double)(p_149734_5_.nextFloat() * 2.0F * (float)i1);
            }

            p_149734_1_.spawnParticle("dripLava", d0, d1, d2, d3, d4, d5);
        }
    }

    public static int func_149999_b(int p_149999_0_)
    {
        return p_149999_0_ & 3;
    }
}
