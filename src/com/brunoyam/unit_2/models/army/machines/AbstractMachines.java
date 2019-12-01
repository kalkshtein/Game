package com.brunoyam.unit_2.models.army.machines;

import com.brunoyam.unit_2.models.army.AbstractGeneralCharacteristics;

public abstract class AbstractMachines extends AbstractGeneralCharacteristics {
    int fuelVolume;

    public AbstractMachines(int maxSpeed, int armorLvl, int fuelVolume) {
        super(maxSpeed, armorLvl);
        this.fuelVolume = fuelVolume;
    }
}
