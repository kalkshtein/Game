package com.brunoyam.unit_2;

import com.brunoyam.unit_2.army.Shootable;
import com.brunoyam.unit_2.army.machines.Tank;
import com.brunoyam.unit_2.army.machines.Transport;
import com.brunoyam.unit_2.army.soldiers.Medic;
import com.brunoyam.unit_2.army.soldiers.Sniper;
import com.brunoyam.unit_2.army.soldiers.Trooper;

public class Application {

    public static void main(String[] args) {
        //Trooper trooper = new Trooper(10, 50, 100, 100);
        Sniper sniper = new Sniper(15, 30, 200, 70);
        Medic medic = new Medic(15, 10, 120);
        Tank tank = new Tank(40, 1000, 300, 400);
        Transport transport = new Transport(80, 50, 500, 120);
        Shootable trooper = new Trooper(10, 50, 100, 100);
        trooper.getShot();

    }

}
