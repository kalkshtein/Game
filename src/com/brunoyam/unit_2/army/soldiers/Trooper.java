package com.brunoyam.unit_2.army.soldiers;

import com.brunoyam.unit_2.army.Shootable;

public class Trooper extends Soldiers {
    public Trooper(int maxSpeed, int armorLvl, int shotPower, int healthLvl) {
        super(maxSpeed, armorLvl, shotPower, healthLvl);
    }

    Trooper trooper = new Trooper(10, 50, 100, 100);

}
