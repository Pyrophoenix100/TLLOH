package lastlayerofhell.entities;

import lastlayerofhell.HellMod;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityGhost extends EntityMob {

	public EntityGhost(World par1World) {
		super(par1World);

		this.getNavigator().setAvoidsWater(true);
		this.getNavigator().tryMoveToEntityLiving(attackingPlayer, 0.0d);
		this.getNavigator().setEnterDoors(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityZombie.class,
				8F, 0.3F, 0.35F));
		this.tasks.addTask(2, new EntityAIMoveIndoors(this));
		this.tasks.addTask(3, new EntityAIRestrictOpenDoor(this));
		this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 0.3F));
		this.tasks.addTask(9, new EntityAIWatchClosest2(this,
				EntityPlayer.class, 3F, 1.0F));
		this.tasks.addTask(9, new EntityAIWatchClosest2(this,
				EntityVillager.class, 5F, 0.02F));
		this.tasks.addTask(9, new EntityAIWander(this, 0.3F));
		this.tasks.addTask(10, new EntityAIWatchClosest(this,
				EntityLiving.class, 8F));
	}

	{

		this.getEntityAttribute(SharedMonsterAttributes.maxHealth)
				.setBaseValue(20.0D);
	}

	protected boolean isAIEnabled() {
		return true;
	}

	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        int j = this.rand.nextInt(3 + p_70628_2_) + 1;

        for (int k = 0; k < j; ++k)
        {
            this.entityDropItem(new ItemStack(HellMod.Flaresoul, 1, 0), 0.0F);
        }
    }

	protected String getHurtSound() {
		return "random.hurt";
	}

	protected String getDeathSound() {
		return "damage.hurtflesh";
	}

	public EntityGhost createChild(EntityAnimal par1EntityAnimal) {
		return new EntityGhost(worldObj);
	}
}
