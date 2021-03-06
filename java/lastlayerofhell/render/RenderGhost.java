package lastlayerofhell.render;

import lastlayerofhell.HellMod;
import lastlayerofhell.entities.EntityGhost;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderGhost extends RenderBiped {

	public static ResourceLocation texture = new ResourceLocation(HellMod.modid + ":" + "textures/entities/Ghost.png");
	 
	public RenderGhost(ModelBiped var1, float shadow)
	{
	super(var1, shadow);
	}
	
	public void renderGhost(EntityGhost var1, double var2, double var4, double var6, float var8, float var9)
	{
	super.doRender(var1, var2, var4, var6, var8, var9);
	}

	public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
	{
	this.renderGhost((EntityGhost)var1, var2, var4, var6, var8, var9);
	}

	public void doEntityGhost(Entity var1, double var2, double var4, double var6, float var8, float var9)
	{
	this.renderGhost((EntityGhost)var1, var2, var4, var6, var8, var9);
	}
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
	return texture;
	}
}