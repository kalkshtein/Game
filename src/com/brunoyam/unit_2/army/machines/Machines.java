package com.brunoyam.unit_2.army.machines;

import com.brunoyam.unit_2.army.GeneralCharacteristics;

public abstract class Machines extends GeneralCharacteristics {
    private int fuelVolume;


    public Machines(int maxSpeed, int armorLvl, int shotPower, int fuelVolume) {
        super(maxSpeed, armorLvl, shotPower);
        this.fuelVolume = fuelVolume;
    }
}
