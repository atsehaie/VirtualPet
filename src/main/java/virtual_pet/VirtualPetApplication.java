package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        VirtualPet pet = new VirtualPet();
        System.out.println("Hello, this is your new pet " + pet.getName() + "!");

        while (true) {
            System.out.println("Pick a number below ");
            System.out.println("Pick 1 if you want to feed " + pet.getName());
            System.out.println("Pick 2 if you want to play with " + pet.getName());
            System.out.println("Pick 3 if you want " + pet.getName() + " to take a nap");


            int userChoice = input.nextInt();
            if (userChoice == 1) {
                pet.feed();
                System.out.println("You just fed " + pet.getName() + "!");
            }
            else if(userChoice == 2) {
                pet.play();
                System.out.println("Play a game with " + pet.getName() + ".");
            }
            else if(userChoice == 3) {
                pet.nap();
                System.out.println("Let " + pet.getName() + "take a nap" + ".");
            }
            else if(userChoice == 4) {
                System.exit(0);

            } else {
                System.out.println("You picked the wrong number");
            }




            System.out.println("Status of Ginger's hunger " + pet.getHungerLevel());
            System.out.println("Status of Ginger's boredom " + pet.getBoredom());
            System.out.println("Status of Ginger's fatigue " + pet.getFatigue());
            System.out.println();
            pet.tick();
        }

    }

}


