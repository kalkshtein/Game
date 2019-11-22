package com.brunoyam.unit_2.army.soldiers;

import com.brunoyam.unit_2.army.GeneralCharacteristics;

public abstract class Soldiers extends GeneralCharacteristics {
    private int healthPoint;

    public Soldiers(int maxSpeed, int armorLvl, int healthLvl) {
        super(maxSpeed, armorLvl);
        this.healthPoint = healthLvl;
    }

    public Soldiers(int maxSpeed, int armorLvl, int shotPower, int healthLvl) {
        super(maxSpeed, armorLvl, shotPower);
        this.healthPoint = healthLvl;
    }
}
