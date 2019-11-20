package src.com.brunoyam.unit_2.army.soldiers;

import src.com.brunoyam.unit_2.army.Shootable;

public abstract class Soldiers implements Shootable {
    private int healthPoint;

    public Soldiers(int healthPoint) {
        this.healthPoint = healthPoint;
    }
}
