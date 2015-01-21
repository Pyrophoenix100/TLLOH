package lastlayerofhell;
import lastlayerofhell.blocks.*;
import lastlayerofhell.entities.*;
import lastlayerofhell.items.*;
import lastlayerofhell.render.RenderEntityZombiePig;
import lastlayerofhell.render.RenderGhost;
import lastlayerofhell.render.RenderHerobrine;
import lastlayerofhell.render.RenderHuman;
import lastlayerofhell.render.RenderKillerKirby;
import lastlayerofhell.render.RenderNotch;
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
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.*;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid=HellMod.modid,name = "Last Layer of Hell",version = "0.4")

public class HellMod {
	@SidedProxy(clientSide="lastlayerofhell.ClientProxyClass", serverSide="lastlayerofhell.MyCommonProxy")
	public static MyCommonProxy proxy;
	public static final String modid = "lastlayerofhell"; 
    public static Block BlockCryingObsidian;
    public static Block Beam;
    public static Block BlockKK;
    public static Block BlockRuby;
	public static Item NotchHelmet;
	public static Item KKHelmet;
	public static Item KKChestPlate;
	public static Item KKLeggings;
	public static Item KKBoots;
	public static Item RubyHelmet;
	public static Item RubyChestPlate;
	public static Item RubyLeggings;
	public static Item RubyBoots;
	public static Item RottonPork;
	public static Item KKShard;
	public static Item Ruby;
	public static Item Ghoulflesh;
	public static int RubyID;
	public static Entity EntityPigman;
	public static Entity EntityHuman;
	public static Entity EntityKirby;
	public static Entity EntityZombieNew;
	public static Entity EntityZombiePig;
	public static Entity EntityKillerKirby;
	public static Entity EntityNotch;
	public static Entity EntityNewSnowman;
	public static Entity EntityRana;
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
	        return (HellMod.KKShard);
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
		  RenderingRegistry.registerEntityRenderingHandler(EntityNotch.class, new RenderNotch(new ModelBiped(), 0.3F));
		  RenderingRegistry.registerEntityRenderingHandler(EntityHuman.class, new RenderHuman(new ModelBiped(), 0.3F));
	      RenderingRegistry.registerEntityRenderingHandler(EntityGhost.class, new RenderGhost(new ModelBiped(), 0.4F));
		  RenderingRegistry.registerEntityRenderingHandler(EntityHerobrine.class, new RenderHerobrine(new ModelHerobrine(), 0.3F));
		  RenderingRegistry.registerEntityRenderingHandler(EntityZombieNew.class, new RenderZombieNew(new ModelBiped(), 0.18F));
		  RenderingRegistry.registerEntityRenderingHandler(EntityKillerKirby.class, new RenderKillerKirby(new ModelBiped(), 0.3F));
		  RenderingRegistry.registerEntityRenderingHandler(EntityZombiePig.class, new RenderEntityZombiePig(new ModelPig(), 0.3F));
		 // RenderingRegistry.registerEntityRenderingHandler(EntityNewSnowman.class, new RenderNewSnowman(new ModelNewSnowman(), 0.3F));
		  //RenderingRegistry.registerEntityRenderingHandler(EntityRana.class, new RenderRana(new ModelRana(), 0.3F));
		  //RenderingRegistry.registerEntityRenderingHandler(EntityLaser.class, new RenderLaser());
		 

	 }
	@EventHandler

	public void load(FMLInitializationEvent event)
	{
		int entityid= 0;
		
	
		
		KKHelmet = new KKArmor(KKArmor, 0, 0).setUnlocalizedName("KKHelmet");
		KKChestPlate = new KKArmor(KKArmor, 0, 1).setUnlocalizedName("KKChestPlate");
		KKLeggings = new KKArmor(KKArmor, 0, 2).setUnlocalizedName("KKLeggings");
		KKBoots = new KKArmor(KKArmor, 0, 3).setUnlocalizedName("KKBoots");
		RubyHelmet = new RubyArmor(RubyArmor, 0, 0).setUnlocalizedName("RubyHelmet");
		RubyChestPlate = new RubyArmor(RubyArmor, 0, 1).setUnlocalizedName("RubyChestPlate");
		RubyLeggings = new RubyArmor(RubyArmor, 0, 2).setUnlocalizedName("RubyLeggings");
		RubyBoots = new RubyArmor(RubyArmor, 0, 3).setUnlocalizedName("RubyBoots");
		BlockCryingObsidian = new BlockCryingObsidian().setBlockName("CryingObsidian"); 
		 Beam = new Beam().setBlockName("Beam"); 
		 BlockKK = new BlockKK().setBlockName("KKBlock"); 
		 BlockRuby= new BlockRuby().setBlockName("RubyBlock"); 
		 NotchHelmet = new NotchArmor(NotchArmor, 0, "NotchHelmet");
		 KKShard = new KKShard().setUnlocalizedName("KKshard");
		 Ruby = new Ruby();
		 Ghoulflesh = new Ghoulflesh();
		 //ItemLaser = new ItemLaserGun().setUnlocalizedName("Laser");
		 RottonPork = new RottonPork().setUnlocalizedName("RottonPork");
		 EntityRegistry.registerModEntity(lastlayerofhell.entities.EntityHuman.class, "Human", ++entityid, this, 43, 3, true);
		 EntityRegistry.registerModEntity(lastlayerofhell.entities.EntityNewSnowman.class, "Snowman", ++entityid, this, 45, 3, true);
		  EntityRegistry.registerModEntity(lastlayerofhell.entities.EntityKillerKirby.class, "KillerKirby", ++entityid, this, 50, 3, true);
		  EntityRegistry.registerModEntity(lastlayerofhell.entities.EntityZombiePig.class, "Zombie Pig", ++entityid, this, 50, 3, true);
		 
		 //EntityRegistry.registerModEntity(lastlayerofhell.entities.EntityRana.class, "Rana", ++entityid, this, 70, 3, true);
		  //EntityRegistry.registerModEntity(EntityLaser.class, "Laser", ++entityid, this, 64, 10, true);
		  EntityRegistry.registerModEntity(EntityGhost.class, "Ghost",++entityid, this, 10, 10, true);
		  EntityRegistry.registerModEntity(EntityHerobrine.class, "Herobrine", ++entityid, this,80, 3, true);
		  EntityRegistry.registerModEntity(EntityNotch.class, "Notch", ++entityid, this, 29, 3, true);
		  EntityRegistry.registerModEntity(EntityPigman.class, "Pigman",++entityid, this, 20, 3, true);
		  //EntityList.addMapping(EntityGiantZombie.class, "Giant", 53, 44975, 7969893);
	        EntityList.addMapping(EntityKillerKirby.class, "KillerKirby", 409, 44975, 7969893);
	       
	        EntityList.addMapping(EntityPigman.class, "Pigman", 400,15771042 , 14377823);
	        EntityList.addMapping(EntityZombiePig.class, "ZombiePig", 410, 15373203, 5009705);
	        //EntityList.addMapping(EntityRana.class, "Rana", 405, 15373203, 5009705);
	        EntityList.addMapping(EntityGhost.class, "Ghost", 406 , 12698049, 4802889);
	        EntityList.addMapping(EntityNotch.class, "Notch", 402, 15720061, 5653556);
	        EntityList.addMapping(EntityHuman.class, "Human", 403, 15720061, 5653556);
	        //EntityList.addMapping(EntityNewSnowman.class, "Snowman", 404, 2243405, 7375001);
	        
	        EntityList.addMapping(EntityHerobrine.class,"Herobrine", 408,1447446, 0);
	        //EntityList.addMapping(EntityDragon.class, "EnderDragon", 63,1447446, 0);
		EntityRegistry.addSpawn(lastlayerofhell.entities.EntityPigman.class, 15, PigmanSpawnRate, 4, EnumCreatureType.monster, BiomeGenBase.forest);
			EntityRegistry.addSpawn(lastlayerofhell.entities.EntityNotch.class, 20, NotchSpawnRate, 4, EnumCreatureType.ambient, BiomeGenBase.forest);
			EntityRegistry.addSpawn(lastlayerofhell.entities.EntityHuman.class, 18, HumanSpawnRate, 4, EnumCreatureType.monster, BiomeGenBase.forest);
			EntityRegistry.addSpawn(lastlayerofhell.entities.EntityGhost.class, 22, GhostSpawnRate, 4, EnumCreatureType.creature, BiomeGenBase.forest);
			EntityRegistry.addSpawn(lastlayerofhell.entities.EntityHerobrine.class, 22, HerobrineSpawnRate, 4, EnumCreatureType.monster,BiomeGenBase.hell);
			EntityRegistry.addSpawn(lastlayerofhell.entities.EntityZombiePig.class, 16, ZombiePigSpawnRate, 4, EnumCreatureType.monster,BiomeGenBase.hell);
			
			EntityRegistry.addSpawn(lastlayerofhell.entities.EntityKillerKirby.class, KillerKirbySpawnRate, 2, 4, EnumCreatureType.monster,BiomeGenBase.hell);
			
			
			EntityRegistry.addSpawn(lastlayerofhell.entities.EntityZombieNew.class, 22, NewZombieSpawnRate, 4, EnumCreatureType.monster,BiomeGenBase.hell);
			HellRecipes.addRecipes();
			 proxy.registerRenderers();
			GameRegistry.registerItem(Ruby, "Ruby"); 
			GameRegistry.registerItem(RottonPork, "RottonPork"); 
			//GameRegistry.registerItem(ItemLaser, "Laser");
			GameRegistry.registerItem(KKShard, "KKShard");
			GameRegistry.registerItem(NotchHelmet, "NotchHelmet");
			GameRegistry.registerItem(RubyHelmet, "RubyHelmet");
			GameRegistry.registerItem(RubyChestPlate, "RubyChestPlate");
			GameRegistry.registerItem(RubyLeggings, "RubyLeggings");
			GameRegistry.registerItem(RubyBoots, "RubyBoots");
			GameRegistry.registerItem(KKHelmet, "KKHelmet");
			GameRegistry.registerItem(KKChestPlate, "KKChestPlate");
			GameRegistry.registerItem(KKLeggings, "KKLeggings");
			GameRegistry.registerItem(KKBoots, "KKBoots");
			GameRegistry.registerItem(Ghoulflesh, "Ghoulflesh");
			GameRegistry.registerBlock(BlockCryingObsidian, modid + BlockCryingObsidian.getUnlocalizedName().substring(5)); 
			GameRegistry.registerBlock(Beam, modid + (Beam.getUnlocalizedName().substring(5)));
			GameRegistry.registerBlock(BlockRuby, modid + BlockRuby.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(BlockKK, modid + BlockKK.getUnlocalizedName().substring(5)); 
		
	}
	   @EventHandler
	    public void postInit(FMLPostInitializationEvent event)
	    {
	    }
}
	
	 