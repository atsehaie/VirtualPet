package virtual_pet;

public class Organic extends VirtualPet {
    private int hungerLevel;
    private int boredom;

    private int cleanliness;


    public Organic(String name, int hungerLevel, int boredom, int cleanliness) {
        super(name, boredom, 5);
        this.boredom = boredom;
        this.hungerLevel = hungerLevel;
        this.cleanliness = cleanliness;
    }

    public void walk() {
        this.boredom--;
        this.cleanliness++;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public void feed() {
        this.hungerLevel--;
    }
}

