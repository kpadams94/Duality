
package net.mcreator.duality.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class VoidOreBlockBlock extends Block {
	public VoidOreBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}