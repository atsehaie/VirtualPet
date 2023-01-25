public class VirtualPet {
    private String name;
    private int age;
    private int hungerLevel;
    private int energyLevel;

//getter methods below
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getHungerLevel() {
        return hungerLevel;
    }
    public int getEnergyLevel() {
        return energyLevel;
    }

    //setter method
    public void setAge(int a) {
        age = a;
    }
    public void setHungerLevel(int h) {
        hungerLevel = h;
    }
    public void setEnergyLevel(int e) {
        energyLevel = e;
    }
}
//create a tick() method that represents the passage of time
