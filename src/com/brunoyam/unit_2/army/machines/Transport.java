package com.brunoyam.unit_2.army.machines;

public class Transport extends Machines {

    public Transport(int maxSpeed, int armorLvl, int shotPower, int fuelVolume) {
        super(maxSpeed, armorLvl, shotPower, fuelVolume);
    }

    Transport transport = new Transport(80, 50, 500, 120);
}
