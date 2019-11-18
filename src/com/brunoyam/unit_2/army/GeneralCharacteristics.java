package src.com.brunoyam.unit_2.army;

public abstract class GeneralCharacteristics {
    private int maxSpeed;
    private int armorLvl;
    private int shotPower;

    public GeneralCharacteristics(int maxSpeed, int armorLvl, int shotPower) {
        this.maxSpeed = maxSpeed;
        this.armorLvl = armorLvl;
        this.shotPower = shotPower;
    }
}
