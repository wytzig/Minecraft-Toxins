package net.mcreator.test.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.test.network.TestModVariables;
import net.mcreator.test.init.TestModItems;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class ToxinwasteeffectProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double previousRecipe = 0;
		double fireHeight = 0;
		if ((entity.level.dimension()) == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("test:toxinwaste")))) {
			if (!((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
					.getItem() == TestModItems.ANTITOXIC_ARMOR_BOOTS.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
							.getItem() == TestModItems.ANTITOXIC_ARMOR_LEGGINGS.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
							.getItem() == TestModItems.ANTITOXIC_ARMOR_CHESTPLATE.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
							.getItem() == TestModItems.ANTITOXIC_ARMOR_HELMET.get())) {
				entity.hurt(DamageSource.GENERIC, 1);
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 8));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 60, 8));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 20, -3));
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 20, 1));
			}
			if ((entity.getCapability(TestModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new TestModVariables.PlayerVariables())).Timertoxindamage == 180) {
				{
					ItemStack _ist = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				{
					ItemStack _ist = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				{
					ItemStack _ist = (entity instanceof LivingEntity _entGetArmor
							? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST)
							: ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				{
					ItemStack _ist = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				{
					double _setval = 0;
					entity.getCapability(TestModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Timertoxindamage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = (entity.getCapability(TestModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new TestModVariables.PlayerVariables())).Timertoxindamage + 1;
					entity.getCapability(TestModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Timertoxindamage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
