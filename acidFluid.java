package com.chaoshunter.blocks;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class acidFluid extends Fluid{

    public acidFluid(String fluidName) {
		super(fluidName);
        // sets the density of the fluid
        setDensity(3);
        // sets how much resistance the fluid has to flowing
        setViscosity(600);
        // sets the luminoscity
        setLuminosity(5);
        // registers this class as a fluid
        FluidRegistry.registerFluid(this);
	}
}
