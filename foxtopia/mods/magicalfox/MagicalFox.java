package foxtopia.mods.magicalfox;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;
import foxtopia.mods.magicalfox.blocks.Machines;
import foxtopia.mods.magicalfox.config.ConfigHandler;
import foxtopia.mods.magicalfox.elements.Elements;

import foxtopia.mods.magicalfox.networks.PacketHandler;
import foxtopia.mods.magicalfox.proxies.CommonProxy;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(channels = {ModInfo.CHANNEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)

public class MagicalFox {

	public static CreativeTabs tabMagicalFox = new CreativeTabs("tabMagicalFox")
	{
	public ItemStack getIconItemStack()
	{
	return new ItemStack(Item.book, 1, 0);
	}
	};
	
	
	

	@Instance(ModInfo.ID)
	public static MagicalFox instance;


	@SidedProxy(clientSide = "foxtopia.mods.magicalfox.proxies.ClientProxy", serverSide = "foxtopia.mods.magicalfox.proxies.CommonProxy")
	public static CommonProxy proxy;

	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {

		ConfigHandler.init(event.getSuggestedConfigurationFile());

		proxy.initSounds();
		proxy.initRenderers();
		
		Elements.init();
		
		
		Machines.init();
	
		


	}

	@EventHandler
	public static void load(FMLInitializationEvent event) {
   
     Machines.addNames();
     Elements.addNames();
     Elements.registerRecipes();
     

	}

	@EventHandler
	public static void modsLoaded(FMLPostInitializationEvent event) {

	}













}
