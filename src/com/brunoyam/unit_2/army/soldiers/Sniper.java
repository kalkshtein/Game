package com.brunoyam.unit_2.army;

import src.com.brunoyam.unit_2.army.soldiers.Soldiers;

public class Sniper extends Soldiers{

    Soldiers sniper = new Soldiers(80);

    public Sniper(int healthPoint) {
        super(healthPoint);
    }
}

