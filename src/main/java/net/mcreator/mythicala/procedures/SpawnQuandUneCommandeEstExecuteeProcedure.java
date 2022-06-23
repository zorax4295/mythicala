package net.mcreator.mythicala.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class SpawnQuandUneCommandeEstExecuteeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(0.5, 96, 32.5);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(0.5, 96, 32.5, _ent.getYRot(), _ent.getXRot());
		}
	}
}
