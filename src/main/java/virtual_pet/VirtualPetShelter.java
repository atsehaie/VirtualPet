package virtual_pet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    Map<String, Robotic> roboticPets = new HashMap<>();
    Map<String, Organic> organicPets = new HashMap<>();

    public VirtualPetShelter() {
        organicPets.put("Organic Cat", new OrganicCat("Fluffy", 5, 5, 5, 4));
        organicPets.put("Organic Dog", new OrganicDog("Leo", 2, 1, 4, 4));
        roboticPets.put("Robotic Dog", new RoboticDog("Champ", 1, 3));
        roboticPets.put("Robotic Cat", new RoboticCat("Snow", 6, 5));
    }

    Collection<Organic> getAllOrganic() {
        return organicPets.values();
    }

    Collection<Robotic> getAllRobotic() {
        return roboticPets.values();
    }

    public Organic getPet(String pet) {
        return organicPets.get(pet);
    }

    public void feedAllOrganic() {
        for (Organic pet : organicPets.values()) {
            pet.feed();
        }
    }

    public void napAllOrganic() {
        for (Organic pet : organicPets.values()) {
            pet.nap();
        }
    }

    public void walkAllRobotic() {
        for (Robotic pet : roboticPets.values()) {
            pet.walk();
        }
    }

    public void adopt(String petName) {
        roboticPets.remove(petName, new VirtualPet());
        organicPets.remove(petName, new VirtualPet());
    }

    public void admit(String petName) {
        roboticPets.put(petName, new Robotic(petName, 2, 2));
        organicPets.put(petName, new Organic(petName, 1, 2, 3, 4));
    }


    public void tick() {
        for (HashMap.Entry<String, Organic> entry : organicPets.entrySet()) {
            Organic pet = entry.getValue();
            pet.tick();
        }
        for (HashMap.Entry<String, Robotic> entry : roboticPets.entrySet()) {
            Robotic pet = entry.getValue();
            pet.tick();
        }
    }
}

