package foxtopia.mods.magicalfox.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.block.Block;

public class Machines {

	
public static Block elementmachine;
	
	public static void init() {
		elementmachine = new BlockElementExtractor(MachineInfo.ELEMENT_MACHINE_ID);
		GameRegistry.registerBlock(elementmachine, MachineInfo.ELEMENT_MACHINE_KEY);
	}
	
	public static void addNames() {
		LanguageRegistry.addName(elementmachine, MachineInfo.ELEMENT_MACHINE_NAME);
		
	}
	
	//public static void registerTileEntities(){
	//	GameRegistry.registerTileEntity(TileEntityExtractor.class, MachineInfo.EXTRACTOR_TE_KEY);
	//}
	
	
}
