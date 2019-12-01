package com.brunoyam.unit_2.models.army;

public abstract class AbstractUnit {
    private int maxSpeed;
    private int armorLvl;

    public AbstractUnit(int maxSpeed, int armorLvl) {
        this.maxSpeed = maxSpeed;
        this.armorLvl = armorLvl;
    }

}
