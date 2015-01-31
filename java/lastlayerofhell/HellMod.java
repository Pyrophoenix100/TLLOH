package lastlayerofhell;
import lastlayerofhell.blocks.Beam;
import lastlayerofhell.blocks.BlockCryingObsidian;
import lastlayerofhell.blocks.BlockRuby;
import lastlayerofhell.entities.EntityGhost;
import lastlayerofhell.entities.EntityPigman;
import lastlayerofhell.entities.EntityZombieNew;
import lastlayerofhell.entities.EntityZombiePig;
import lastlayerofhell.foods.Flaresoul;
import lastlayerofhell.foods.Ghoulflesh;
import lastlayerofhell.items.RottonPork;
import lastlayerofhell.items.Ruby;
import lastlayerofhell.items.RubyArmor;
import lastlayerofhell.render.RenderEntityZombiePig;
import lastlayerofhell.render.RenderGhost;
import lastlayerofhell.render.RenderPigman;
import lastlayerofhell.render.RenderZombieNew;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPig;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid=HellMod.modid,name = "The Last Layer of Hell Mod",version = "1.0")

public class HellMod {
	@SidedProxy(clientSide="lastlayerofhell.ClientProxyClass", serverSide="lastlayerofhell.MyCommonProxy")
	public static MyCommonProxy proxy;
	public static final String modid = "lastlayerofhell"; 
    public static Block BlockCryingObsidian;
    public static Block IceBrick;
    public static Block MagmaBrick;
    public static Block Beam;
    public static Block BlockRuby;
	public static Item RubyHelmet;
	public static Item RubyChestPlate;
	public static Item RubyLeggings;
	public static Item RubyBoots;
	public static Item RottonPork;
	public static Item Ruby;
	public static Item Ghoulflesh;
	public static Item Flaresoul; 
	public static int RubyID;
	public static Entity EntityPigman;
	public static Entity EntityZombieNew;
	public static Entity EntityZombiePig;
	public int NotchSpawnRate;
	public int KirbySpawnRate;
	public int HumanSpawnRate;
	public int GhostSpawnRate;
	public int HerobrineSpawnRate;
	public int ZombiePigSpawnRate;
	public int KillerKirbySpawnRate;
	public int NewZombieSpawnRate;
	public int SnowmanSpawnRate;
	public int PigmanSpawnRate;

	
	
	public static ArmorMaterial KKArmor = EnumHelper.addArmorMaterial("KKArmor", 8, new int[] { 3, 7, 6, 3 }, 30);
	public static ArmorMaterial NotchArmor = EnumHelper.addArmorMaterial("NotchArmor", 9, new int[] { 3, 7, 6, 3 }, 30);
	public static ArmorMaterial RubyArmor = EnumHelper.addArmorMaterial("RubyArmor", 10, new int[] { 3, 7, 6, 3 }, 30);
	public static CreativeTabs tabCustom = new CreativeTabs("Pigman") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return (HellMod.Flaresoul);
	    }
	};
	
	@EventHandler
	  public void preInit(FMLPreInitializationEvent event) {
		  Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		  
		  config.load();
	     NotchSpawnRate = config.get("Options", "Notch spawn rate", 20).getInt();
	     HumanSpawnRate = config.get("Options", "Human spawn rate", 20).getInt();
	     KillerKirbySpawnRate = config.get("Options", "Killer Kirby spawn rate", 20).getInt();
	     GhostSpawnRate = config.get("Options", "Ghost spawn rate", 20).getInt();
	    ZombiePigSpawnRate = config.get("Options", "Zombie Pig spawn rate", 20).getInt();
	    PigmanSpawnRate = config.get("Options", "Pigman spawn rate", 20).getInt();
	    HerobrineSpawnRate = config.get("Options", "Ghost spawn rate", 20).getInt();
	   // SnowmanSpawnRate = config.get("Options", "Snowman spawn rate", 20).getInt();
		  config.save();
		  RenderingRegistry.registerEntityRenderingHandler(EntityPigman.class, new RenderPigman(new ModelBiped(), 0.5F));
	      RenderingRegistry.registerEntityRenderingHandler(EntityGhost.class, new RenderGhost(new ModelBiped(), 0.4F));
		  RenderingRegistry.registerEntityRenderingHandler(EntityZombieNew.class, new RenderZombieNew(new ModelBiped(), 0.18F));
		  RenderingRegistry.registerEntityRenderingHandler(EntityZombiePig.class, new RenderEntityZombiePig(new ModelPig(), 0.3F));
		 // RenderingRegistry.registerEntityRenderingHandler(EntityNewSnowman.class, new RenderNewSnowman(new ModelNewSnowman(), 0.3F));
		  //RenderingRegistry.registerEntityRenderingHandler(EntityRana.class, new RenderRana(new ModelRana(), 0.3F));
		  //RenderingRegistry.registerEntityRenderingHandler(EntityLaser.class, new RenderLaser());
		 

	 }
	@EventHandler

	public void load(FMLInitializationEvent event)
	{
		int entityid= 0;
		
	
		
		RubyHelmet = new RubyArmor(RubyArmor, 0, 0).setUnlocalizedName("RubyHelmet");
		RubyChestPlate = new RubyArmor(RubyArmor, 0, 1).setUnlocalizedName("RubyChestPlate");
		RubyLeggings = new RubyArmor(RubyArmor, 0, 2).setUnlocalizedName("RubyLeggings");
		RubyBoots = new RubyArmor(RubyArmor, 0, 3).setUnlocalizedName("RubyBoots");
		BlockCryingObsidian = new BlockCryingObsidian().setBlockName("CryingObsidian"); 
		 Beam = new Beam().setBlockName("Beam");
		 IceBrick = new lastlayerofhell.blocks.IceBrick();
		 MagmaBrick = new lastlayerofhell.blocks.MagmaBrick();
		 BlockRuby= new BlockRuby().setBlockName("RubyBlock"); 
		 Ruby = new Ruby();
		 Flaresoul = new Flaresoul();
		 Ghoulflesh = new Ghoulflesh();
		 //ItemLaser = new ItemLaserGun().setUnlocalizedName("Laser");
		 RottonPork = new RottonPork().setUnlocalizedName("RottonPork");
		  EntityRegistry.registerModEntity(lastlayerofhell.entities.EntityZombiePig.class, "Zombie Pig", ++entityid, this, 50, 3, true);
		 
		 //EntityRegistry.registerModEntity(lastlayerofhell.entities.EntityRana.class, "Rana", ++entityid, this, 70, 3, true);
		  //EntityRegistry.registerModEntity(EntityLaser.class, "Laser", ++entityid, this, 64, 10, true);
		  EntityRegistry.registerModEntity(EntityGhost.class, "Ghost",++entityid, this, 10, 10, true);
		  EntityRegistry.registerModEntity(EntityPigman.class, "Pigman",++entityid, this, 20, 3, true);
		  //EntityList.addMapping(EntityGiantZombie.class, "Giant", 53, 44975, 7969893);
	       
	        EntityList.addMapping(EntityPigman.class, "Pigman", 400,15771042 , 14377823);
	        EntityList.addMapping(EntityZombiePig.class, "ZombiePig", 410, 15373203, 5009705);
	        //EntityList.addMapping(EntityRana.class, "Rana", 405, 15373203, 5009705);
	        EntityList.addMapping(EntityGhost.class, "Ghost", 406 , 12698049, 4802889);
	        //EntityList.addMapping(EntityNewSnowman.class, "Snowman", 404, 2243405, 7375001);
	        
	        //EntityList.addMapping(EntityDragon.class, "EnderDragon", 63,1447446, 0);
	        EntityRegistry.addSpawn(lastlayerofhell.entities.EntityPigman.class, 15, PigmanSpawnRate, 4, EnumCreatureType.monster, BiomeGenBase.forest);
			EntityRegistry.addSpawn(lastlayerofhell.entities.EntityGhost.class, 22, GhostSpawnRate, 4, EnumCreatureType.ambient, BiomeGenBase.forest);
			EntityRegistry.addSpawn(lastlayerofhell.entities.EntityZombiePig.class, 16, ZombiePigSpawnRate, 4, EnumCreatureType.monster,BiomeGenBase.hell);
			
			
			
			EntityRegistry.addSpawn(lastlayerofhell.entities.EntityZombieNew.class, 22, NewZombieSpawnRate, 4, EnumCreatureType.monster,BiomeGenBase.hell);
			HellRecipes.addRecipes();
			 proxy.registerRenderers();
			GameRegistry.registerItem(Ruby, "Ruby");
			GameRegistry.registerItem(Flaresoul, "Flaresoul"); 
			GameRegistry.registerItem(RottonPork, "RottonPork"); 
			//GameRegistry.registerItem(ItemLaser, "Laser");
			GameRegistry.registerItem(RubyHelmet, "RubyHelmet");
			GameRegistry.registerItem(RubyChestPlate, "RubyChestPlate");
			GameRegistry.registerItem(RubyLeggings, "RubyLeggings");
			GameRegistry.registerItem(RubyBoots, "RubyBoots");
			GameRegistry.registerItem(Ghoulflesh, "Ghoulflesh");
			GameRegistry.registerBlock(IceBrick, "IceBrick");
			GameRegistry.registerBlock(MagmaBrick, "MagmaBrick");
			GameRegistry.registerBlock(BlockCryingObsidian, modid + BlockCryingObsidian.getUnlocalizedName().substring(5)); 
			GameRegistry.registerBlock(Beam, modid + (Beam.getUnlocalizedName().substring(5)));
			GameRegistry.registerBlock(BlockRuby, modid + BlockRuby.getUnlocalizedName().substring(5));
			
		
	}
	   @EventHandler
	    public void postInit(FMLPostInitializationEvent event)
	    {
	    }
}
	
	 