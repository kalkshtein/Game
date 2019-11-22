package com.brunoyam.unit_2.army.soldiers;

import com.brunoyam.unit_2.army.GeneralCharacteristics;

public abstract class Soldiers extends GeneralCharacteristics {
    private int healthPoint;

    public Soldiers(int maxSpeed, int armorLvl, int healthPoint) {
        super(maxSpeed, armorLvl);
        this.healthPoint = healthPoint;
    }

    public Soldiers(int maxSpeed, int armorLvl, int shotPower, int healthPoint) {
        super(maxSpeed, armorLvl, shotPower);
        this.healthPoint = healthPoint;
    }
    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
}
