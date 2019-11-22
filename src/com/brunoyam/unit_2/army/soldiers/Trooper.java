package com.brunoyam.unit_2.army.soldiers;

import com.brunoyam.unit_2.army.Shootable;

public class Trooper extends Soldiers implements Shootable {
    public Trooper(int maxSpeed, int armorLvl, int shotPower, int healthPoint) {
        super(maxSpeed, armorLvl, shotPower, healthPoint);
    }

    @Override
    public void getShot() {
        int damageTrooper = this.getHealthPoint() - this.getShotPower();
        System.out.println(damageTrooper);
    }

}
