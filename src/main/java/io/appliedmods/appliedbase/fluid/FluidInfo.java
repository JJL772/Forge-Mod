package io.appliedmods.appliedbase.fluid;

/**
 * Represents fluid info. Identical to ItemStack, except it's used for fluids
 */
public class FluidInfo
{
    /**
     * The fluid in this object
     */
    IFluid fluid;

    /**
     * The volume of the fluid, measured in mB (cm^3)
     */
    int volume;
}
