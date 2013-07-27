package foxtopia.mods.magicalfox.elements;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import foxtopia.mods.magicalfox.MagicalFox;

public class ElementSpirit extends Item {

	public ElementSpirit(int id) {
		super(id);
		setCreativeTab(MagicalFox.tabMagicalFox);
		setUnlocalizedName(ElementInfo.ELEMENTSPIRIT_UNLOCALIZED_NAME);
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ElementInfo.TEXTURE_LOCATION + ":" + ElementInfo.ELEMENTSPIRIT_ICON);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInfo) {
		info.add("The Element Of Spirit");
		
		}
}
