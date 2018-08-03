package io.appliedmods.appliedbase.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Author: Jeremy L.
 * 9-30-2017
 * Adds a uranium ore block with a random ammount of
 * uranium 235 and 238 in it.
 */
public class UraniumOreBlock extends Block
{
    public static final float Hardness = 10.0f;
    public static final float Resistance = 10.0f;
    public static final String UnlocalizedName = "ore.AppliedEngineering.UraniumOre";
    public static float U235Content = 0.7f;
    public static float U238Content = 99.3f;

    public UraniumOreBlock(String unlocalizedName, Material material, float hardness, float resistance)
    {
        super(material);
    }

    public UraniumOreBlock(String unlocalizedName, float hardness, float resistance)
    {
        this(unlocalizedName, Material.ROCK, hardness, resistance);
    }

    public UraniumOreBlock(String unlocalizedName)
    {
        this(unlocalizedName, Material.ROCK, Hardness, Resistance);
    }


}
