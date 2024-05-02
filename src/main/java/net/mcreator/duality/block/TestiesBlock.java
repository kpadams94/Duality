
package net.mcreator.duality.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class TestiesBlock extends Block {
	public TestiesBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}