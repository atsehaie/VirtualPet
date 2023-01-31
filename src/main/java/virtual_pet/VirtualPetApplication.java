package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        VirtualPet pet = new VirtualPet();
//        System.out.println("Hello, this is your new pet " + pet.getName() + "!");


        VirtualPetShelter shelter = new VirtualPetShelter();
        System.out.println("Thank you for visiting the new Virtual Pet Shelter in town " + "! ");


        while (true) {
//            System.out.println("Pick a number below ");
//            System.out.println("Pick 1 if you want to feed " + pet.getName());
//            System.out.println("Pick 2 if you want to play with " + pet.getName());
//            System.out.println("Pick 3 if you want " + pet.getName() + " to take a nap ");

            System.out.println("Pick 4 if you want to adopt a cat from the shelter ");
            System.out.println("Pick 5 if you want to admit a cat into the shelter ");
            System.out.println("Pick 6 if you want to feed all pets in the shelter ");
            System.out.println("Pick 7 if you want to play with all pets in the shelter ");
            System.out.println("Pick 8 if you want all pets to take a nap ");
            System.out.println("Pick 9 if you want to exit the game ");


            int userChoice = input.nextInt();
//            if (userChoice == 1) {
//                pet.feed();
//                System.out.println("You just fed " + pet.getName() + "!");
//            } else if (userChoice == 2) {
//                pet.play();
//                System.out.println("Play a game with " + pet.getName() + ".");
//            } else if (userChoice == 3) {
//                pet.nap();
//                System.out.println("Let " + pet.getName() + "take a nap" + ".");
            //} else

            if (userChoice == 4) {
                shelter.adopt("Cat");
                System.out.println("You have just adopted a cat from the shelter ");
            } else if (userChoice == 5) {
                shelter.admit("Cat");
                System.out.println("You have just admitted a cat into the shelter ");
            } else if (userChoice == 6) {
                shelter.feedAll();
                System.out.println("You just fed all the pets in the shelter ");
            } else if (userChoice == 7) {
                shelter.playAll();
                System.out.println("Play a game with all the pets in the shelter ");
            } else if (userChoice == 8) {
                shelter.napAll();
                System.out.println("Let all the pets in the shelter take a nap ");
            } else if (userChoice == 9) {
                System.exit(0);

            } else {
                System.out.println("You picked the wrong number");
            }


//            System.out.println("Status of Ginger's hunger " + pet.getHungerLevel());
//            System.out.println("Status of Ginger's boredom " + pet.getBoredom());
//            System.out.println("Status of Ginger's fatigue " + pet.getFatigue());
//            System.out.println();
//            pet.tick();


            System.out.println();
            System.out.println("Status of all pets in the shelter ");
            for (VirtualPet vPet : shelter.getAllVirtualPets()) {
                System.out.println("Status of " + vPet.getName() + " hunger " + pet.getHungerLevel());
                System.out.println("Status of " + vPet.getBoredom() + " boredom " + pet.getBoredom());
                System.out.println("Status of " + vPet.getFatigue() + " fatigue " + pet.getFatigue());
            }
            shelter.tick();
        }

    }

}


