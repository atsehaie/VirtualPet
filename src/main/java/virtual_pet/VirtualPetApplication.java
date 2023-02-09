package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter shelter = new VirtualPetShelter();


        System.out.println("Thank you for visiting the new Virtual Pet Shelter in town " + "! ");

        while (true) {
            System.out.println("Pick 1 if you want to retrieve all organic pets in the shelter ");
            System.out.println("Pick 2 if you want to retrieve all robotic pets in the shelter ");
            System.out.println("Pick 3 if you want to feed organic cat and dog ");
            System.out.println("Pick 4 if you want to walk all robotic pets in the shelter ");
            System.out.println("Pick 5 if you want to exit the game ");


            int userChoice = input.nextInt();

            if (userChoice == 1) {
                System.out.println("You have just retrieved all organic pets ");
                for (VirtualPet organicPet : shelter.getAllOrganic()) {
                    System.out.println(organicPet.getName());
                }
            } else if (userChoice == 2) {
                System.out.println("You have just retrieved all robotic pets ");
                for (VirtualPet roboticPet : shelter.getAllRobotic()) {
                    System.out.println(roboticPet.getName());
                }
            } else if (userChoice == 3) {
                shelter.feedAllOrganic();
                System.out.println("You have just fed organic cat and dog ");
            } else if (userChoice == 4) {
                shelter.walkAllRobotic();
                System.out.println("You have just walked with all robotic pets ");
            } else if (userChoice == 5) {
                System.exit(0);

            } else {
                System.out.println("You picked the wrong number");
            }


            System.out.println();
            System.out.println("Status of all pets in the shelter ");
            for (VirtualPet vPet : shelter.getAllOrganic()) {
                System.out.println("Status of " + vPet.getName() + " hunger " + vPet.getHungerLevel());
                System.out.println("Status of " + vPet.getName() + " boredom " + vPet.getBoredom());
            }
            for (Robotic vPet : shelter.getAllRobotic()) {
                System.out.println("Status of " + vPet.getName() + " oil levels " + vPet.getOilNeeded());
                System.out.println("Status of " + vPet.getName() + " maintenance " + vPet.getMaintenanceNeeded());
            }
            shelter.tick();
        }
    }
}



