package com.brunoyam.unit_2.models.army.soldiers;

import com.brunoyam.unit_2.models.army.Shootable;
import com.brunoyam.unit_2.models.army.Shooter;

public class Sniper extends AbstractSoldiers implements Shooter,Shootable {

    private final static int POWER = 200;

    public Sniper(int maxSpeed, int armorLvl, int healthPoint) {
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
