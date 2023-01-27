package virtual_pet;

public class VirtualPet {
    private String name;
    private int hungerLevel;
    private int boredom;
    private int fatigue;


    public VirtualPet() {
        this.name = "Ginger";
        this.hungerLevel = 2;
        this.boredom = 4;
        this.fatigue = 1;
    }

    public VirtualPet( String name, int hungerLevel, int boredom, int fatigue) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.boredom = boredom;
        this.fatigue = fatigue;
    }

    public String getName() {
        return name;
    }
    public int getHungerLevel() {
        return hungerLevel;
    }
    public int getBoredom() {
        return boredom;
    }
    public int getFatigue() {
        return fatigue;
    }

    public void feed() {
        hungerLevel= hungerLevel-3;
        if(hungerLevel < 0) {
            hungerLevel = 0;
        }
    }
    public void play() {
        boredom = boredom-2;
        if(boredom < 0) {
            boredom = 0;
        }
    }
    public void nap() {
        fatigue = fatigue-1;
        if(fatigue < 0) {
            fatigue = 0;
        }
    }


    public void tick() {
        this.hungerLevel ++;
        this.boredom ++;
        this.fatigue ++;
    }
}
