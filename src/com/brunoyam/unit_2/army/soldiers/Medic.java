package com.brunoyam.unit_2.army.soldiers;

public class Medic extends Soldiers {

    public Medic(int maxSpeed, int armorLvl, int healthPoint) {
        super(maxSpeed, armorLvl, healthPoint);
    }

    Medic medic = new Medic(15, 10, 120);
}
