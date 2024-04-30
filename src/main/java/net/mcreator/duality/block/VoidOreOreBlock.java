
package net.mcreator.duality.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class VoidOreOreBlock extends Block {
	public VoidOreOreBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(4.5f, 6.9158093361f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}