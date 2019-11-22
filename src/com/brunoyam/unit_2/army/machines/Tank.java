package com.brunoyam.unit_2.army.machines;

import com.brunoyam.unit_2.army.GeneralCharacteristics;

public class Tank extends Machines {
    public Tank(int maxSpeed, int armorLvl, int shotPower, int fuelVolume) {
        super(maxSpeed, armorLvl, shotPower, fuelVolume);
    }

    Tank tank = new Tank(40, 1000, 300, 400);
}
