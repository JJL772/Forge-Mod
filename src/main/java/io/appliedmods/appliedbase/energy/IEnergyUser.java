package io.appliedmods.appliedbase.energy;

import net.minecraft.util.EnumFacing;

public interface IEnergyUser
{
    public int getInputBuffer();
    public void setInputBuffer(int ammt);
    public boolean acceptEnergy(EnumFacing dir, int ammt);
}
