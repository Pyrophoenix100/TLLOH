package lastlayerofhell.entities;

import lastlayerofhell.HellMod;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;




public class EntityNotch extends EntityAnimal
{

            public EntityNotch(World par1World)
            {
                super(par1World);
                this.getNavigator().equals(true);
                this.tasks.addTask(0, new EntityAISwimming(this));
                this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityZombie.class, 8F, 0.3F, 0.35F));
                this.tasks.addTask(3, new EntityAIAttackOnCollide(this,EntityHerobrine.class, 1.0D, true)); 
                this.tasks.addTask(2, new EntityAIMoveIndoors(this));
                this.tasks.addTask(3, new EntityAIRestrictOpenDoor(this));
                this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
                this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 0.3F));
                this.tasks.addTask(9, new EntityAIWatchClosest2(this, EntityPlayer.class, 3F, 1.0F));
                this.tasks.addTask(9, new EntityAIWatchClosest2(this, EntityVillager.class, 5F, 0.02F));
                this.tasks.addTask(9, new EntityAIWander(this, 0.3F));
                this.tasks.addTask(10, new EntityAIWatchClosest(this,EntityHerobrine.class, 8F));
                this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this,EntityHerobrine.class, 0, true));
            }
            {
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(140.0D);
            }
            protected boolean IsAIEnabled()
            {
             return true;
            }

            protected String getLivingSound()
            {
              return "random.hurt";
            }

            protected String getDeathSound()
            {
              return "damage.hurtflesh";
            }

            protected Item getDropItemId()
            {
               return HellMod.NotchHelmet;
            }

            public EntityNotch createChild(EntityAgeable par1EntityAgeable)
            {
                return null;
            }
}
