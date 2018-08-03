package io.appliedmods.appliedbase;

import io.appliedmods.appliedbase.fluid.FluidRegistry;
import io.appliedmods.appliedbase.gas.GasRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import io.appliedmods.appliedbase.dimensions.DimensionsManager;

@Mod(modid = AppliedBase.MODID, version = AppliedBase.VERSION)
public class AppliedBase
{
    public static final String MODID = "AppliedBase";
    public static final String VERSION = "0.0.1";
    public static final String PrintHeader = "[AppliedBase] ";
    public static final Log LogObject = LogFactory.getLog(AppliedBase.class);
    public DimensionsManager ModDimensionManager;

    /**
     * fluid Registry
     */
    public FluidRegistry fluidRegistry;

    /**
     * gas registry
     */
    public GasRegistry gasRegistry;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogObject.info(PrintHeader+"Loaded successfully!");

        /* Handle our mod initialization tasks here */
        ModDimensionManager = new DimensionsManager();
    }

    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    }

    @EventHandler
    public void shutdown(FMLModDisabledEvent event)
    {

    }

    @EventHandler
    public void disabled(FMLModDisabledEvent event)
    {
    }
}
