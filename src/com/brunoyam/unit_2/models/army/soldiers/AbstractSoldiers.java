package com.brunoyam.unit_2.models.army.soldiers;

import com.brunoyam.unit_2.models.army.AbstractGeneralCharacteristics;

public abstract class AbstractSoldiers extends AbstractGeneralCharacteristics {
    int healthPoint;

    public AbstractSoldiers(int maxSpeed, int armorLvl, int healthPoint) {
        super(maxSpeed, armorLvl);
        this.healthPoint = healthPoint;
    }
}
