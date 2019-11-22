package com.brunoyam.unit_2.army.soldiers;

public class Sniper extends Soldiers {

    public Sniper(int maxSpeed, int armorLvl, int shotPower, int healthPoint) {
        super(maxSpeed, armorLvl, shotPower, healthPoint);
    }

    Sniper sniper = new Sniper(15, 30, 200, 70);

}
