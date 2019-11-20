package com.brunoyam.unit_2.army;

import src.com.brunoyam.unit_2.army.soldiers.Soldiers;

public class Trooper extends Soldiers {

    Soldiers trooper = new Soldiers(100) {
        @Override
        public int hit() {
            return 0;
        }

        @Override
        public void getShot() {

        }
    };
}



