package lastlayerofhell.render;

import lastlayerofhell.HellMod;
import lastlayerofhell.entities.ModelHerobrine;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderHerobrine extends RenderLiving {
	 private static final ResourceLocation Texture = new ResourceLocation(HellMod.modid + ":textures/entities/Herobrine.png");
	   
	    public RenderHerobrine(ModelHerobrine par1ModelBase, float par2)
	    {
	    	  super(par1ModelBase,par2);
	        
	    }
	 protected ResourceLocation getEntityTexture(Entity par1Entity) {
	 return Texture;
		 
	}
		 
	}
