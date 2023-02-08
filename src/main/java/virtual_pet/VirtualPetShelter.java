package virtual_pet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    Map<String, Robotic> roboticPets = new HashMap<>();
    Map<String, Organic> organicPets = new HashMap<>();

    public VirtualPetShelter() {
        organicPets.put("Organic Cat", new OrganicCat("Fluffy", 5, 5, 5));
        organicPets.put("Organic Dog", new OrganicDog("Leo", 2, 1, 4));
        roboticPets.put("Robotic Dog", new RoboticDog("Champ", 1, 3));
        roboticPets.put("Robotic Cat", new RoboticCat("Snow", 6, 5));
    }

    Collection<Organic> getAllOrganic() {
        return organicPets.values();
    }

    Collection<Robotic> getAllRobotic() {
        return roboticPets.values();
    }

    public VirtualPet getPet(String pet) {
        return organicPets.get(pet);
    }

    public void feedAllOrganic() {
        for (VirtualPet pet : organicPets.values()) {
            pet.feed();
        }
    }

    public void napAllOrganic() {
        for (VirtualPet pet : organicPets.values()) {
            pet.nap();
        }
    }

    public void playAllRobotic() {
        for (VirtualPet pet : roboticPets.values()) {
            pet.play();
        }
    }


    public void tick() {
        for (HashMap.Entry<String, Organic> entry : organicPets.entrySet()) {
            VirtualPet pet = entry.getValue();
            pet.tick();
        }
    }
}

