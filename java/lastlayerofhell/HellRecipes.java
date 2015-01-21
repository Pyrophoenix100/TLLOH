package lastlayerofhell;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class HellRecipes 
{
	public static void addRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(HellMod.KKHelmet,1), new Object[]
				{
		        	"KKK",
		        	"K K",
		        	'K',HellMod.KKShard });
		GameRegistry.addRecipe(new ItemStack(HellMod.KKChestPlate,1), new Object[]
				{
		        	"K K",
		        	"KKK",
		        	"KKK",
		        	'K',HellMod.KKShard });
		GameRegistry.addRecipe(new ItemStack(HellMod.KKLeggings,1), new Object[]
				{
		        	"KKK",
		        	"K K",
		        	"K K",
		        	'K',HellMod.KKShard });
		GameRegistry.addRecipe(new ItemStack(HellMod.KKBoots,1), new Object[]
				{
		        	"K K",
		        	"K K",
		        	'K',HellMod.KKShard });
		GameRegistry.addRecipe(new ItemStack(HellMod.BlockCryingObsidian), new Object[]{

            "XXX",
            "XZX",
            "XXX",
            'X', Blocks.obsidian, 'Z', new ItemStack(Items.dye, 1, 15)
     });
		GameRegistry.addRecipe(new ItemStack(HellMod.Beam,1), new Object[]
				{
		        	"KK",
		        	"KK",
		        	'K',Items.iron_ingot });
		GameRegistry.addShapelessRecipe(new ItemStack(HellMod.Ruby), new Object[]{

            new ItemStack(Items.emerald), new ItemStack(Items.dye, 1, 1)
     });

	GameRegistry.addRecipe(new ItemStack(HellMod.BlockRuby,1),new Object[]
	{
	"RRR",
	"RRR",
	"RRR",
	'R', HellMod.Ruby});
	GameRegistry.addRecipe(new ItemStack (HellMod.BlockKK,1),new Object[]
	{
	"KKK",
	"KKK",
	"KKK",
	'K', HellMod.KKShard});
	GameRegistry.addRecipe(new ItemStack(HellMod.RubyHelmet,1),new Object[]
	{
	"RRR",
	"R R",
	'R' , HellMod.Ruby});
	GameRegistry.addRecipe(new ItemStack(HellMod.RubyChestPlate,1), new Object[]
	{
	"R R",
	"RRR",
	"RRR",
	'R', HellMod.Ruby});
	GameRegistry.addRecipe(new ItemStack(HellMod.RubyLeggings,1), new Object[]
	{
	"RRR", 
	"R R",
	"R R",
	'R', HellMod.Ruby});
	GameRegistry.addRecipe( new ItemStack(HellMod.RubyBoots,1), new Object[]{
	"R R",
	"R R",
	'R', HellMod.Ruby});

}
}
