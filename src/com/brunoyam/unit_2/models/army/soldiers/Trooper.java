package com.brunoyam.unit_2.models.army.soldiers;

import com.brunoyam.unit_2.models.army.Shootable;
import com.brunoyam.unit_2.models.army.Shooter;

public class Trooper extends AbstractSoldiers implements Shooter,Shootable {

    private final static int POWER = 100;

    public Trooper(int maxSpeed, int armorLvl, int healthPoint) {
        super(maxSpeed, armorLvl, healthPoint);
    }

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public void getShot(int damage) {
        this.healthPoint = this.healthPoint - damage;
    }
}
