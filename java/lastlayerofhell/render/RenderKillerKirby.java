package lastlayerofhell.render;

import lastlayerofhell.HellMod;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderKillerKirby extends RenderLiving {

    private static final ResourceLocation Skin = new ResourceLocation(HellMod.modid + ":textures/entities/KillerKirby.png");  
	   
    public RenderKillerKirby(ModelBiped par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
        
    }
    
protected ResourceLocation getEntityTexture(Entity par1Entity) {
	 return Skin;
	 
}
	 
}