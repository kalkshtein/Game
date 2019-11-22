package com.brunoyam.unit_2.army;

public abstract class GeneralCharacteristics {
    private int maxSpeed;
    private int armorLvl;
    private int shotPower;

    public GeneralCharacteristics(int maxSpeed, int armorLvl) {
        this.maxSpeed = maxSpeed;
        this.armorLvl = armorLvl;
    }

    public GeneralCharacteristics(int maxSpeed, int armorLvl, int shotPower) {
        this.maxSpeed = maxSpeed;
        this.armorLvl = armorLvl;
        this.shotPower = shotPower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getArmorLvl() {
        return armorLvl;
    }

    public void setArmorLvl(int armorLvl) {
        this.armorLvl = armorLvl;
    }

    public int getShotPower() {
        return shotPower;
    }

    public void setShotPower(int shotPower) {
        this.shotPower = shotPower;
    }
}
