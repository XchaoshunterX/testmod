package com.chaoshunter.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import com.chaoshunter.Tabs.MODED_Tabs;
import com.chaoshunter.lib.RefStrings;

import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.*;


public class MODED_Blocks {

	
	public static void mainRegistry(){
		initializeBlock();
		RegisterBlock();
		
	}
	
	
	//dirt
	public static Block ComDirt;
	//element p
	public static Block Element_P;
	public static Block PBlock;
	public static Block PGrassDirt;
	public static Block PDirt;
	public static Block PStone;
	
	//purpium
	public static Block Purpium;
	public static Block Purpium_Tnt;
	public static Block Purpium_Block;
	

	//first step for acid block
	public static Fluid acidFluid = new Fluid("acidFluid");
	public static Block acidBlock;
	
	
	public static void initializeBlock(){
		//dirt
		ComDirt = new ComDirt(Material.ground).setBlockName("ComDirt").setCreativeTab(MODED_Tabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":ComDirt");
		//element p
		Element_P = new Element_p(Material.ground).setBlockName("Element_P").setCreativeTab(MODED_Tabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":Element_P").setLightLevel(20.0f).setHardness(50F);
		PBlock = new PBlock(Material.ground).setBlockName("PBlock").setCreativeTab(MODED_Tabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":PBlock");
		PGrassDirt = new PGrassDirt(Material.ground).setBlockName("PGrassDirt").setCreativeTab(MODED_Tabs.tabBlock);
		PDirt = new PDirt(Material.ground).setBlockName("PDirt").setCreativeTab(MODED_Tabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":PDirt");
		PStone = new PStone(Material.ground).setBlockName("PStone").setCreativeTab(MODED_Tabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":PStone");
		
		
		//purpium
		Purpium = new Purpium(Material.ground).setBlockName("Purpium").setCreativeTab(MODED_Tabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":Purpium").setHardness(30F);
		//Purpium_Tnt = new Purpium_Tnt(Material.tnt).setBlockName("Purpium_Tnt").setCreativeTab(MODED_Tabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":Purpium_Tnt");
		Purpium_Block = new Purpium_Block(Material.ground).setBlockName("Purpium_Block").setCreativeTab(MODED_Tabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":Purpium Block").setHardness(20F);
		
		//PWater = new PWater(null, Material.water).setBlockName("PWater").setCreativeTab(MODED_Tabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":PWater");
		
		 
		acidBlock = new acidBlock(acidFluid, Material.water).setBlockName("acidblock");
		
	}
	
	public static void RegisterBlock(){
		//dirt
		GameRegistry.registerBlock(ComDirt, ComDirt.getUnlocalizedName());
		//element p
		GameRegistry.registerBlock(Element_P, Element_P.getUnlocalizedName());
		GameRegistry.registerBlock(PBlock, PBlock.getUnlocalizedName());
		GameRegistry.registerBlock(PDirt, PDirt.getUnlocalizedName());
		GameRegistry.registerBlock(PGrassDirt, PGrassDirt.getUnlocalizedName());
		GameRegistry.registerBlock(PStone, PStone.getUnlocalizedName());
        
  
		
		//purpium
		GameRegistry.registerBlock(Purpium_Block, Purpium_Block.getUnlocalizedName());
		GameRegistry.registerBlock(Purpium, Purpium.getUnlocalizedName());
		//GameRegistry.registerBlock(Purpium_Tnt, Purpium_Tnt.getUnlocalizedName());
		
		//GameRegistry.registerBlock(PWater, PWater.getUnlocalizedName());
		
		//second step for acid
		//FluidRegistry.registerFluid(acidFluid);
		GameRegistry.registerBlock(acidBlock, RefStrings.MODID + "_" + acidBlock.getUnlocalizedName().substring(5));
		acidFluid.setUnlocalizedName(acidBlock.getUnlocalizedName());
	}
	
	
}

