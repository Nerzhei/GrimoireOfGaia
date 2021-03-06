package gaia.items;

import java.util.List;
import java.util.Random;

import gaia.Gaia;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBoxGold extends Item {
	String texture;

	public ItemBoxGold(String texture) {
		this.texture = texture;
		this.maxStackSize = 1;
		this.setUnlocalizedName("GrimoireOfGaia.BoxGold");
		this.setCreativeTab(Gaia.tabGaia);
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.RARE;
	}

	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add(StatCollector.translateToLocal("text.GrimoireOfGaia.RightClickUse.desc"));
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		world.playSoundAtEntity(entityplayer, "grimoireofgaia:bag_open", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
		
		Random random = new Random();
		int i = random.nextInt(11);
		switch(i) {
		case 0:
			return new ItemStack(Items.gold_ingot);
		case 1:
			return new ItemStack(Items.golden_axe);
		case 2:
			return new ItemStack(Items.golden_pickaxe);
		case 3:
			return new ItemStack(Items.golden_shovel);
		case 4:
			return new ItemStack(Items.golden_sword);
		case 5:
			return new ItemStack(Items.golden_helmet);
		case 6:
			return new ItemStack(Items.golden_chestplate);
		case 7:
			return new ItemStack(Items.golden_leggings);
		case 8:
			return new ItemStack(Items.golden_boots);
		case 9:
			return new ItemStack(Blocks.gold_block);
		case 10:
			return new ItemStack(Items.golden_horse_armor);
		default:
			return itemstack;
		}
	}
}
