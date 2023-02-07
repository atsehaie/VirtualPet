package virtual_pet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    Map<String, VirtualPet> pets = new HashMap<>();

    public  VirtualPetShelter() {
        pets.put("Cat", new VirtualPet());
        pets.put("Dog", new VirtualPet("Fluffy", 3, 2, 5));
        pets.put("Horse", new VirtualPet("Speedy", 2, 6, 1));
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

    public void feedAll() {
        for (VirtualPet pet : pets.values()) {
            pet.feed();
        }
    }

    public void napAll() {
        for (VirtualPet pet : pets.values()) {
            pet.nap();
        }
    }

    public void playAll() {
        for (VirtualPet pet : pets.values()) {
            pet.play();
        }
    }


    public void adopt(String petName) {
        pets.remove(petName, new VirtualPet());
    }

    public void admit(String petName) {
        pets.put(petName, new VirtualPet());
    }


    public void tick() {
        for (HashMap.Entry<String, VirtualPet> entry : pets.entrySet()) {
            VirtualPet pet = entry.getValue();
            pet.tick();
        }
    }
}
