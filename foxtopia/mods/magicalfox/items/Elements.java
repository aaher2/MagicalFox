package foxtopia.mods.magicalfox.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Elements {
	
	public static Item Element;

	
	public static void init() {
	
		Element = new ItemElement(ElementInfo.ELEMENT_ID);
		
		
	}
	
	
	public static void addNames() {
		
		//elements
		for (int i = 0; i < ElementInfo.ELEMENT_NAMES.length; i++) {
			LanguageRegistry.addName(new ItemStack(Element,  1, i), ElementInfo.ELEMENT_NAMES[i]);
		}
		
		
		
	}
	

	
	
	

}
