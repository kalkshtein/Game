package com.brunoyam.unit_2.models.army.machines;

import com.brunoyam.unit_2.models.army.Shootable;
import com.brunoyam.unit_2.models.army.Shooter;

public class Tank extends AbstractMachines implements Shooter {

    private final static int POWER = 300;

    public Tank(int maxSpeed, int armorLvl, int fuelVolume) {
        super(maxSpeed, armorLvl, fuelVolume);
    }

    @Override
    public int getPower() {
        return POWER;
    }

}
