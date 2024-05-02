
package net.mcreator.duality.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class Molten_BarsOreBlock extends Block {
	public Molten_BarsOreBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.NETHERRACK).strength(3f, 5.785155024f).lightLevel(s -> 6).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true)
				.emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 4;
		else
			return super.canHarvestBlock(state, world, pos, player);
	}
}