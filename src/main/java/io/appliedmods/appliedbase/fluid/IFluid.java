package io.appliedmods.appliedbase.fluid;

import java.awt.*;

/**
 * Creates a basic interface for game fluids
 */
public interface IFluid
{
    public String fluidName = "";
    public Color fluidColor = Color.BLACK;
    public float fluidDensity = 1.0f;
    public float fluidTemperture  = 20.0f;
    public float fluidBoilingPoint = 100.0f;
    public float fluidFreezingPoint = 0.0f;
    public float fluidMolarMass = 18.01528f;

    public String getFluidName();
    public Color getFluidColor();
    public float getFluidDensity();
    public float getFluidTemperture();
    public float getFluidBoilingPoint();
    public float getFluidFreezingPoint();
    public float getFluidMolarMass();

    public void setFluidName(String name);
    public void setFluidColor(Color color);
    public void setFluidDensity(float density);
    public void setFluidTemperture(float temperture);
    public void setFluidBoilingPoint(float boilingPoint);
    public void setFluidFreezingPoint(float freezingPoint);
    public void setFluidMolarMass(float molarMass);
}
