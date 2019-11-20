package com.brunoyam.unit_2.army;

import src.com.brunoyam.unit_2.army.Shootable;
import src.com.brunoyam.unit_2.army.soldiers.Soldiers;

public class Medic extends Soldiers implements Shootable {

    Soldiers medic = new Soldiers (50);

    public Medic(int healthPoint) {
        super(healthPoint);
    }
}



