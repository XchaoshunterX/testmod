package com.chaoshunter.blocks;

import com.chaoshunter.Tabs.MODED_Tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class acidBlock extends BlockFluidClassic{

	@SideOnly(Side.CLIENT)protected IIcon stillIcon;
	@SideOnly(Side.CLIENT)protected IIcon flowingIcon;
	
	
	public acidBlock(Fluid fluid, Material material) {
		super(fluid, material);
		setCreativeTab(MODED_Tabs.tabBlock);
		// TODO Auto-generated constructor stub
	}
	@Override public IIcon getIcon(int side, int meta){
		return (side == 0 || side == 1)? stillIcon : flowingIcon; 
	}

	@SideOnly(Side.CLIENT)
	@Override public void registerBlockIcons(IIconRegister register) { 
		stillIcon = register.registerIcon("testmod:fluidStill"); 
		flowingIcon = register.registerIcon("testmod:fluidFlowing"); 
		}
	@Override public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
		if (world.getBlock(x, y, z).getMaterial().isLiquid()) return false; 
		return super.canDisplace(world, x, y, z); 
		}

	@Override public boolean displaceIfPossible(World world, int x, int y, int z) { 
		if (world.getBlock(x, y, z).getMaterial().isLiquid()) return false; 
		return super.displaceIfPossible(world, x, y, z); 
		}

	}

