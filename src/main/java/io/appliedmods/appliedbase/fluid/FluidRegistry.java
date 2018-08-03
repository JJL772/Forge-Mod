package io.appliedmods.appliedbase.fluid;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Responsible for managing fluids
 */
public class FluidRegistry
{
    public ArrayList<IFluid> fluidList;

    public FluidRegistry()
    {
    }

    /**
     * Registers a fluid with the registry
     */
    public void registerFluid(IFluid fluid)
    {
        fluidList.add(fluid);
    }

    /**
     * Checks if a fluid is registered by object
     */
    public boolean fluidRegistered(IFluid fluid)
    {
        return fluidList.contains(fluid);
    }

    /**
     * Checks if a fluid is registered by name
     */
    public boolean fluidRegistered(String name)
    {
        Iterator it = fluidList.iterator();

        while(it.hasNext())
        {
            Object e = it.next();
            if(e instanceof IFluid)
            {
                IFluid f = (IFluid)e;
                if(f.getFluidName() == name)
                {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Removes a fluid from the fluid registry
     */
    public void removeFluid(String name)
    {
        if(fluidRegistered(name))
        {
            Iterator it = fluidList.iterator();
            while(it.hasNext())
            {
                Object e = it.next();
                if(e instanceof IFluid)
                {
                    if(((IFluid)e).getFluidName() == name)
                    {
                        fluidList.remove(e);
                    }
                }
            }
        }
    }

    /**
     * Gets the index of the specified fluid
     */
    public int getIndexOf(IFluid fluid)
    {
        return fluidList.indexOf(fluid);
    }
}
