package com.brunoyam.unit_2.models.army.machines;

import com.brunoyam.unit_2.models.army.Shootable;

public class Transport extends AbstractMachines implements Shootable {

    public Transport(int maxSpeed, int armorLvl, int fuelVolume) {
        super(maxSpeed, armorLvl, fuelVolume);
    }

    @Override
    public void getShot(int damage) {
        this.fuelVolume = this.fuelVolume - damage;
    }
}
