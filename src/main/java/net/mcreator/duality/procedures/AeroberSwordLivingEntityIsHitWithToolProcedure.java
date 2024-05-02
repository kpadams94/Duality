package net.mcreator.duality.procedures;

import net.minecraftforge.eventbus.api.Event;

public class AeroberSwordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(0, 1, 0));
	}
}
