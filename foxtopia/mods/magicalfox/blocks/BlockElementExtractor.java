package foxtopia.mods.magicalfox.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockElementExtractor extends Block {

	public BlockElementExtractor(int id) {
		super(id, Material.iron);
		
		setCreativeTab(CreativeTabs.tabRedstone);
		setHardness(2F);
		setStepSound(Block.soundMetalFootstep);
		setUnlocalizedName(MachineInfo.ELEMENT_MACHINE_UNLOCALIZED_NAME);
	}
	
	@SideOnly(Side.CLIENT)
	private Icon topIcon;
	@SideOnly(Side.CLIENT)
	private Icon botIcon;
	@SideOnly(Side.CLIENT)
	private Icon sideIcon;	
			
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register) {
		topIcon = register.registerIcon(MachineInfo.TEXTURE_LOCATION + ":" + MachineInfo.ELEMENT_MACHINE_TOP);
		botIcon = register.registerIcon(MachineInfo.TEXTURE_LOCATION + ":" + MachineInfo.ELEMENT_MACHINE_BOT);
		sideIcon = register.registerIcon(MachineInfo.TEXTURE_LOCATION + ":" + MachineInfo.ELEMENT_MACHINE_SIDE);
	

}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta) {
		if (side == 0) {
			return botIcon;
		}else if(side == 1) {
			return  topIcon;
		}else{
		
			return sideIcon;
		}		
	}

	//@Override
	//public TileEntity createNewTileEntity(World world) {
		
	//	return new TileEntityExtractor();
	//}
	
	
	
}
