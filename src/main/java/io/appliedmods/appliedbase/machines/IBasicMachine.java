package io.appliedmods.appliedbase.machines;

import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;

/**
 * Extremely basic machine, just handles accepting and emitting items, gasses and fluids..
 */
public interface IBasicMachine
{
    /**
     * Accepts items from a side of the machine
     */
    public boolean acceptItems(EnumFacing direction, ItemStack items);

    /**
     * Ejects items from a side of the machine
     */
    public boolean ejectItems(EnumFacing dir, ItemStack items);

    boolean acceptGas(EnumFacing direction);

    boolean ejectGas(EnumFacing direction);

    boolean acceptLiquid(EnumFacing direction);

    boolean ejectLiquid(EnumFacing direction);

}
