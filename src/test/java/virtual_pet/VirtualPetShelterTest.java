package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    @Test
    public void shouldWalkDog() {
        OrganicDog test = new OrganicDog("test", 10, 10, 10);
        test.walk();
        assertEquals(9, test.getBoredom());
    }

    @Test
    public void shouldOilRoboticDog() {
        RoboticDog test = new RoboticDog("test", 5, 5);
        test.oilLevels(10);
        test.refillOil();
        assertEquals(0, test.getOilNeeded());
    }

    @Test
    public void shouldCheckMaintenanceRoboticCat() {
        RoboticCat test = new RoboticCat("test", 2, 5);
        test.increaseMaintenanceNeeded();
        assertEquals(5, 4);
    }
}
