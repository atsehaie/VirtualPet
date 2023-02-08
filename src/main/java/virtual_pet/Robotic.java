package virtual_pet;

public class Robotic extends VirtualPet {

    private int maintenanceNeeded = 0;
    private int oilNeeded = 0;

    public Robotic(String name, int oilNeeded, int maintenanceNeeded) {
        this.oilNeeded = oilNeeded;
        this.maintenanceNeeded = maintenanceNeeded;
    }

    public int getOilNeeded() {
        return oilNeeded;
    }

    public int getMaintenanceNeeded() {
        return maintenanceNeeded;
    }


    public void increaseOilNeeded() {
        oilNeeded++;
    }

    public void increaseMaintenanceNeeded() {
        maintenanceNeeded++;
    }

    public void walk() {
        increaseOilNeeded();
        increaseMaintenanceNeeded();
    }

    public void oilLevels(int i) {
        oilNeeded = i;
    }

    public int refillOil() {
        return oilNeeded = 0;
    }
}
