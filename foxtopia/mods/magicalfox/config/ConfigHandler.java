package foxtopia.mods.magicalfox.config;

import java.io.File;

import foxtopia.mods.magicalfox.blocks.MachineInfo;
import foxtopia.mods.magicalfox.elements.ElementInfo;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {



	public static void init(File file){

		Configuration config = new Configuration(file);

		config.load();

		//machines
		MachineInfo.ELEMENT_MACHINE_ID = config.getBlock(MachineInfo.ELEMENT_MACHINE_KEY, MachineInfo.ELEMENT_MACHINE_DEFAULT).getInt();

		
		//element
		ElementInfo.ELEMENTFIRE_ID = config.getItem(ElementInfo.ELEMENTFIRE_KEY, ElementInfo.ELEMENTFIRE_DEFAULT).getInt() - 256;
		ElementInfo.ELEMENTWATER_ID = config.getItem(ElementInfo.ELEMENTWATER_KEY, ElementInfo.ELEMENTWATER_DEFAULT).getInt() - 256;
		ElementInfo.ELEMENTEARTH_ID = config.getItem(ElementInfo.ELEMENTEARTH_KEY, ElementInfo.ELEMENTEARTH_DEFAULT).getInt() - 256;
		ElementInfo.ELEMENTAIR_ID = config.getItem(ElementInfo.ELEMENTAIR_KEY, ElementInfo.ELEMENTAIR_DEFAULT).getInt() - 256;
		ElementInfo.ELEMENTICE_ID = config.getItem(ElementInfo.ELEMENTICE_KEY, ElementInfo.ELEMENTICE_DEFAULT).getInt() - 256;
		ElementInfo.ELEMENTLIGHT_ID = config.getItem(ElementInfo.ELEMENTLIGHT_KEY, ElementInfo.ELEMENTLIGHT_DEFAULT).getInt() - 256;
		ElementInfo.ELEMENTSHADOW_ID = config.getItem(ElementInfo.ELEMENTSHADOW_KEY, ElementInfo.ELEMENTSHADOW_DEFAULT).getInt() - 256;
		ElementInfo.ELEMENTSPIRIT_ID = config.getItem(ElementInfo.ELEMENTSPIRIT_KEY, ElementInfo.ELEMENTSPIRIT_DEFAULT).getInt() - 256;

		config.save();

	
	
}
}