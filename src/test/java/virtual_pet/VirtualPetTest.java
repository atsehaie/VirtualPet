package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetTest {


    @Test
    public void setNameTest() {
        VirtualPet virtualPetUnderTest = new VirtualPet("Ginger", 2, 1);
        String result = virtualPetUnderTest.getName();
        assertEquals("Ginger", result);
    }

    @Test
    public void getFatigueTest() {
        VirtualPet virtualPetUnderTest = new VirtualPet("Ginger", 4, 1);
        int result = virtualPetUnderTest.getFatigue();
        assertEquals(1, result);
    }

    @Test
    public void getFatigueAfterNapTest() {
        VirtualPet virtualPetUnderTest = new VirtualPet("Ginger", 4, 1);
        virtualPetUnderTest.nap();
        int result = virtualPetUnderTest.getFatigue();
        assertEquals(0, result);
    }

}


