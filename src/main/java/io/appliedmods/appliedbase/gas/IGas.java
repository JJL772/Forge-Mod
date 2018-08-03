package io.appliedmods.appliedbase.gas;

import java.awt.*;

/**
 * Represents a gas
 */
public interface IGas
{
    String gasName = "";
    String printName = "";
    Color gasColor = Color.BLACK;
    float gasDensity = 0.0f;
    float gasTemperture = 0.0f;
    float gasBoilingPoint = 100.0f;
    float gasFreezingPoint = 0.0f;
    float gasMolarMass = 100.0f;
}
