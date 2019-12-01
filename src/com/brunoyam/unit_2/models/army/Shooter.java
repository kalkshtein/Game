package com.brunoyam.unit_2.models.army;

public interface Shooter {
    int getPower();
    default public void shoot(Shootable target){
        System.out.println("ФАААААЯЯЯЯЯЯЯЯЯЯ");
        int power = getPower();
        target.getShot(power);
    }
}
