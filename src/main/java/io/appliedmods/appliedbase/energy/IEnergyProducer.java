package io.appliedmods.appliedbase.energy;

import net.minecraft.util.EnumFacing;

public interface IEnergyProducer
{
    public int getOutputBuffer();
    public void setOutputBuffer(int energy);
    public boolean ejectEnergy(EnumFacing dir, int energy);
}
