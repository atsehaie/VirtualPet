package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet pet = new VirtualPet();
        VirtualPetShelter shelter = new VirtualPetShelter();


        System.out.println("Thank you for visiting the new Virtual Pet Shelter in town " + "! ");

        System.out.println("Pick 1 if you want to retrieve all organic pets in the shelter ");
        System.out.println("Pick 2 if you want to retrieve all robotic pets in the shelter ");
        System.out.println("Pick 3 if you want to feed organic cat and dog ");
        System.out.println("Pick 4 if you want to play with all robotic pets in the shelter ");
        System.out.println("Pick 5 if you want to exit the game ");


        int userChoice = input.nextInt();

        if (userChoice == 1) {
            shelter.getAllOrganic();
            System.out.println("You have just retrieved all organic pets ");
        } else if (userChoice == 2) {
            shelter.getAllRobotic();
            System.out.println("You have just retrieved all robotic pets");
        } else if (userChoice == 3) {
            shelter.feedAllOrganic();
            System.out.println("You have just fed organic cat and dog ");
        } else if (userChoice == 4) {
            shelter.playAllRobotic();
            System.out.println("You have just played with all robotic pets ");
        } else if (userChoice == 5) {
            System.exit(0);

        } else {
            System.out.println("You picked the wrong number");
        }


        System.out.println();
        System.out.println("Status of all pets in the shelter ");
        for (VirtualPet vPet : shelter.getAllOrganic()) {
            System.out.println("Status of " + vPet.getName() + " hunger " + pet.getHungerLevel());
            System.out.println("Status of " + vPet.getBoredom() + " boredom " + pet.getBoredom());
            System.out.println("Status of " + vPet.getFatigue() + "  " + pet.getFatigue());
        }
        shelter.tick();
    }
}



