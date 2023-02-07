package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    @Test
    public void shouldFeedAllPets() {
        VirtualPetShelter VirtualPetShelterUnderTest = new VirtualPetShelter();
        VirtualPetShelterUnderTest.feedAll();

        VirtualPet cat = VirtualPetShelterUnderTest.getPet("Cat");
        assertEquals(1, cat.getHungerLevel());

        VirtualPet dog = VirtualPetShelterUnderTest.getPet("Dog");
        assertEquals(2, dog.getHungerLevel());

        VirtualPet horse = VirtualPetShelterUnderTest.getPet("Horse");
        assertEquals(1, horse.getHungerLevel());

    }

    @Test
    public void shouldNapAllPets() {
        VirtualPetShelter VirtualPetShelterUnderTest = new VirtualPetShelter();
        VirtualPetShelterUnderTest.napAll();

        VirtualPet cat = VirtualPetShelterUnderTest.getPet("Cat");
        assertEquals(0, cat.getFatigue());

        VirtualPet dog = VirtualPetShelterUnderTest.getPet("Dog");
        assertEquals(4, dog.getFatigue());

        VirtualPet horse = VirtualPetShelterUnderTest.getPet("Horse");
        assertEquals(0, horse.getFatigue());

    }

    @Test
    public void shouldPlayAllPets() {
        VirtualPetShelter VirtualPetShelterUnderTest = new VirtualPetShelter();
        VirtualPetShelterUnderTest.playAll();

        VirtualPet cat = VirtualPetShelterUnderTest.getPet("Cat");
        assertEquals(3, cat.getBoredom());

        VirtualPet dog = VirtualPetShelterUnderTest.getPet("Dog");
        assertEquals(1, dog.getBoredom());

        VirtualPet horse = VirtualPetShelterUnderTest.getPet("Horse");
        assertEquals(5, horse.getBoredom());

    }
}
