package virtual_pet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetShelterTest {
    @Test
    public void shouldFeedAllPets() {
        VirtualPetShelter VirtualPetShelterUnderTest = new VirtualPetShelter();
        VirtualPetShelterUnderTest.feedAll();
        VirtualPet cat = VirtualPetShelterUnderTest.getPet("Cat");
        int catHungerLevel = cat.getHungerLevel();
        assertEquals(1, catHungerLevel);
        VirtualPet dog = VirtualPetShelterUnderTest.getPet("Dog");
        int dogHungerLevel = dog.getHungerLevel();
        assertEquals(2, dogHungerLevel);
        VirtualPet horse = VirtualPetShelterUnderTest.getPet("Horse");
        int horseHungerLevel = horse.getHungerLevel();
        assertEquals(1, horseHungerLevel);
    }

    @Test
    public void shouldNapAllPets() {
        VirtualPetShelter VirtualPetShelterUnderTest = new VirtualPetShelter();
        VirtualPetShelterUnderTest.napAll();
        VirtualPet cat = VirtualPetShelterUnderTest.getPet("Cat");
        int catFatigueLevel = cat.getFatigue();
        assertEquals(0, catFatigueLevel);
        VirtualPet dog = VirtualPetShelterUnderTest.getPet("Dog");
        int dogFatigueLevel = dog.getFatigue();
        assertEquals(4, dogFatigueLevel);
        VirtualPet horse = VirtualPetShelterUnderTest.getPet("Horse");
        int horseFatigueLevel = horse.getFatigue();
        assertEquals(0, horseFatigueLevel);
    }

    @Test
    public void shouldPlayAllPets() {
        VirtualPetShelter VirtualPetShelterUnderTest = new VirtualPetShelter( );
        VirtualPetShelterUnderTest.playAll();
        VirtualPet cat = VirtualPetShelterUnderTest.getPet("Cat");
        int catBoredomLevel = cat.getBoredom();
        assertEquals(3, catBoredomLevel);
        VirtualPet dog = VirtualPetShelterUnderTest.getPet("Dog");
        int dogBoredomLevel = dog.getBoredom();
        assertEquals(1, dogBoredomLevel);
        VirtualPet horse = VirtualPetShelterUnderTest.getPet("Horse");
        int horseBoredomLevel = horse.getBoredom();
        assertEquals(5, horseBoredomLevel);
    }
}
