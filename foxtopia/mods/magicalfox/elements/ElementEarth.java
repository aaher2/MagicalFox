package foxtopia.mods.magicalfox.elements;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ElementEarth extends Item {

	public ElementEarth(int id) {
		super(id);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName(ElementInfo.ELEMENTEARTH_UNLOCALIZED_NAME);
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ElementInfo.TEXTURE_LOCATION + ":" + ElementInfo.ELEMENTEARTH_ICON);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInfo) {
		info.add("The Elements contain unique abilities");
		
		}
}
