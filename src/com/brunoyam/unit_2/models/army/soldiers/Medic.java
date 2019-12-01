package com.brunoyam.unit_2.models.army.soldiers;

import com.brunoyam.unit_2.models.army.Shootable;

public class Medic extends AbstractSoldiers implements Shootable {

    public Medic(int maxSpeed, int armorLvl, int healthPoint) {
        super(maxSpeed, armorLvl, healthPoint);
    }


    @Override
    public void getShot(int damage) {
        this.healthPoint = this.healthPoint - damage;
    }
}
