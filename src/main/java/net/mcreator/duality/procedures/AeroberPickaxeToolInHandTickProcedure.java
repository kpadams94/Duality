package net.mcreator.duality.procedures;

import net.minecraftforge.eventbus.api.Event;

public class AeroberPickaxeToolInHandTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 60, 1, false, false));
	}
}
