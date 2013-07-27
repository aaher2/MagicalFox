package foxtopia.mods.magicalfox.config;

import java.io.File;

import foxtopia.mods.magicalfox.blocks.MachineInfo;
import foxtopia.mods.magicalfox.items.ElementInfo;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {



	public static void init(File file){

		Configuration config = new Configuration(file);

		config.load();

		//machines
		MachineInfo.ELEMENT_MACHINE_ID = config.getBlock(MachineInfo.ELEMENT_MACHINE_KEY, MachineInfo.ELEMENT_MACHINE_DEFAULT).getInt();

		
		//element
		ElementInfo.ELEMENT_ID = config.getItem(ElementInfo.ELEMENT_KEY, ElementInfo.ELEMENT_DEFAULT).getInt() - 256;

		config.save();

	
	
}
}