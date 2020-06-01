package pets_amok;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter vps = new VirtualPetShelter();
        ArrayList<VirtualPet> l1 = new ArrayList<VirtualPet>();
        System.out.println("Welcome to the Virtual Pet Shelter, now inclusive of Robotic animals");
        int run = 1;
        while (run == 1) {

            System.out.println("Pet Status:");
            System.out.println("Name | Boredom | Hunger | Thirst| Health | Happiness | ");
            for (int i = 0; i < vps.list.size(); i++) {
                System.out.println(vps.list.get(i).getName() + "\t" + "\t" + vps.list.get(i).getBoredom() +
                        "\t" + "\t" + vps.list.get(i).getHunger() + "\t" + "\t" + vps.list.get(i).getThirst() +
                        "\t" + "\t" + vps.list.get(i).getHealth() + "\t" + "\t" + vps.list.get(i).getHappiness());


            }
            System.out.println("What would you like to do next?");
            System.out.println("1.Feed the Pets");
            System.out.println("2.Water the Pets");
            System.out.println("3.Play with a Pet");
            System.out.println("4. Adopt a New Pet");
            System.out.println("5. Admit a New Pet");
            System.out.println("6. Maintain the robotic pets");
            System.out.println("7. Clean the pets cages");
            System.out.println("8.Ignore your pets and watch tv");
            System.out.println("9. Quit");
            System.out.println("Please enter 1-9 for your choice");

            int getActionNumber = input.nextInt();

            if (getActionNumber == 1) {
                vps.feedAll();
                vps.tick();
                System.out.println("You feed all your Pets");
            } else if (getActionNumber == 2) {
                vps.tick();
                vps.waterAll();
                System.out.println("You water all your pets");
            } else if (getActionNumber == 3) {
                for (int i = 0; i < vps.list.size(); i++) {
                    System.out.println(vps.list.get(i).getName() + "\t"
                            + vps.list.get(i).getDescription());
                }
                System.out.println("Would you like to play with a specific pet or walk all dogs?");
                System.out.println("1. To play with a specific pet.");
                System.out.println("2. To walk all dogs. ");
                Scanner playScanner = new Scanner(System.in);
                int playInput = playScanner.nextInt();
                if (playInput == 1) {
                    System.out.println("What pet do you wanna play with?");
                    Scanner stringScanner = new Scanner(System.in);
                    String getActionString = stringScanner.next();
                    for (int i = 0; i < vps.list.size(); i++) {
                        if (getActionString.equalsIgnoreCase(vps.list.get(i).name)) {
                            vps.playWithPet(getActionString);
                            System.out.println("You played with" + " " + (vps.list.get(i).name));
                        }
                    }

                } else if (playInput == 2) {
                    vps.walkAllDogs();
                    System.out.println("You walked all the dogs");

                }
                vps.tick();
            } else if (getActionNumber == 4) {
                vps.tick();
                if (vps.list.size() >= 1) {
                    for (int i = 0; i < vps.list.size(); i++) {
                        System.out.println(vps.list.get(i).getName() + "\t"
                                + vps.list.get(i).getDescription());
                    }
                    System.out.println("Pet you would like to Adopt ?");
                    Scanner stringScanner = new Scanner(System.in);
                    String getActionString = stringScanner.next();
                    for (int i = 0; i < vps.list.size(); i++) {
                        if (getActionString.equalsIgnoreCase(vps.list.get(i).name)) {
                            l1 = vps.removePet(getActionString);
                        }
                    }
                    System.out.println("The Pets now in the shelter are");
                    for (int i = 0; i < l1.size(); i++) {
                        System.out.println(l1.get(i).name);
                    }
                } else {
                    System.out.println("No more pets available for adoption");
                }

            } else if (getActionNumber == 5) {
                System.out.println("Whats the name of the pet you would like to drop off?");
                Scanner stringScanner = new Scanner(System.in);
                String getActionString = stringScanner.next();
                System.out.println("Whats the description of the pet you would like to drop off?");
                Scanner stringScanner2 = new Scanner(System.in);
                String getActionString2 = stringScanner.next();
                VirtualPet userPetNew = new VirtualPet(getActionString, getActionString2, 25, 25, 25, 25);
                vps.addPet(userPetNew);
                System.out.println("The Pets now in the shelter are");
                for (int i = 0; i < vps.list.size(); i++) {
                    System.out.println(vps.list.get(i).name);
                }
                vps.tick();
            } else if (getActionNumber == 6) {
                vps.tick();
                vps.oil();
                System.out.println("You oil all your pets");
            } else if (getActionNumber == 7) {
                vps.tick();
                vps.wasteMethod();
                System.out.println("you clean your dogs cages");
            } else if (getActionNumber == 8) {
                System.out.println("You watch 2 episodes of Avatar the Last Airbender");
                System.out.println("You notice similarities between America and the Fire Nation");
                vps.tick();
            } else if (getActionNumber == 9) {
                System.out.println("buh bye");
                run = 0;
            }
        }
    }

}

