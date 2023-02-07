package virtual_pet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualAmokShelter {
    Map<String, VirtualPet> pets = new HashMap<>();

    public VirtualAmokShelter() {
        for (Map.Entry pet : pets.entrySet()) {
            System.out.println(pet);
        }
    }

    Collection<VirtualPet> getAllVirtualPets() {

        return pets.values();
    }

    public VirtualPet getPet(String pet) {

        return pets.get(pet);
    }

    public void feedAllOrganic() {
        for (VirtualPet pet : pets.values()) {
            pet.feed();
        }
    }


    public void walkAllDogs() {
        for (VirtualPet pet : pets.values()) {
            pet.walk();
        }
    }
}
