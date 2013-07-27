package foxtopia.mods.magicalfox.elements;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import foxtopia.mods.magicalfox.blocks.MachineInfo;
import foxtopia.mods.magicalfox.blocks.Machines;

public class Elements {
	
	public static Item ElementFire;
	public static Item ElementWater;
	public static Item ElementEarth;
	public static Item ElementAir;
	public static Item ElementIce;
	public static Item ElementLight;
	public static Item ElementShadow;
	public static Item ElementSpirit;

	
	public static void init() {
	
		ElementFire = new ElementFire(ElementInfo.ELEMENTFIRE_ID);
		ElementWater = new ElementWater(ElementInfo.ELEMENTWATER_ID);
		ElementEarth = new ElementEarth(ElementInfo.ELEMENTEARTH_ID);
		ElementAir = new ElementAir(ElementInfo.ELEMENTAIR_ID);
		ElementIce = new ElementIce(ElementInfo.ELEMENTICE_ID);
		ElementLight = new ElementLight(ElementInfo.ELEMENTLIGHT_ID);
		ElementShadow = new ElementShadow(ElementInfo.ELEMENTSHADOW_ID);
		ElementSpirit = new ElementSpirit(ElementInfo.ELEMENTSPIRIT_ID);
		
	}
	
	
	public static void addNames() {
		
		LanguageRegistry.addName(ElementFire, ElementInfo.ELEMENTFIRE_NAME);
		LanguageRegistry.addName(ElementWater, ElementInfo.ELEMENTWATER_NAME);
		LanguageRegistry.addName(ElementEarth, ElementInfo.ELEMENTEARTH_NAME);
		LanguageRegistry.addName(ElementAir, ElementInfo.ELEMENTAIR_NAME);
		LanguageRegistry.addName(ElementIce, ElementInfo.ELEMENTICE_NAME);
		LanguageRegistry.addName(ElementLight, ElementInfo.ELEMENTLIGHT_NAME);
		LanguageRegistry.addName(ElementShadow, ElementInfo.ELEMENTSHADOW_NAME);
		LanguageRegistry.addName(ElementSpirit, ElementInfo.ELEMENTSPIRIT_NAME);
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabMagicalFox", "en_US", "Magical Fox");
		
		}
		
		
		
	
	

	
	public static void registerRecipes() {
		GameRegistry.addRecipe(new ItemStack(Item.book, 1),
			new Object[] { 	"  X",
							" / ",
							"/  ",
							
							'X', Machines.elementmachine,
							'/', Item.stick
						 });						 
	}
	

}
