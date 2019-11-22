package com.brunoyam.unit_2.army.soldiers;

import com.brunoyam.unit_2.army.Shootable;

public class Sniper extends Soldiers implements Shootable {

    public Sniper(int maxSpeed, int armorLvl, int shotPower, int healthPoint) {
        super(maxSpeed, armorLvl, shotPower, healthPoint);
    }


    @Override
    public void getShot() {
        int damageSniper = this.getHealthPoint() - this.getShotPower();
        System.out.println(damageSniper);
    }
}
