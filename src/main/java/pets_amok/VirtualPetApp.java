package pets_amok;

import java.util.ArrayList;
import java.util.Scanner;

// -You did right by finishing the application instead of getting hung up on tests, but we want to see test coverage of this application
//  in order to get you familiar with junit. Ask your instructors or classmates if you are having trouble getting started

// -Instead of having one long main method in the VirtualPetApp, split portions out into their own methods within the class. For
//  example you could move the printlns for the user options down into their own method below main. There are a lot of reason
// for doing so that will become clear as we move forward. Ask us if you want clarification on this point

// -Your class structure for your VirtualPet and subclasses could be cleaned up. Instead of your Robotic pets overriding feed and water,
// you can set it up so those classes don't inherit feed and water at all. The goal with inheritance is to move all commonly shared
// fields and methods up into a shared parent class. Since the Robotic pets don't have the hunger and thirst fields, they should not be
// extend a class that has those fields. Consider Robotic and Organic parent classes that extend VirtualPet and are extended into
// their respective Cat and Dog classes. You're also missing the maintenance/oil level in your robot. Ask if you are hazy on this concept

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
            vps.gameLoopMenu();

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
                OrganicDog p1;
                RoboticDog p2;
                OrganicCat p3;
                RoboticCat p4;
                System.out.println("Whats the name of the pet you would like to drop off?");
                Scanner stringScanner = new Scanner(System.in);
                String getActionString = stringScanner.next();
                System.out.println("Whats the description of the pet you would like to drop off?");
                Scanner stringScanner2 = new Scanner(System.in);
                String getActionString2 = stringScanner2.nextLine();
                System.out.println("Whats is they type of Pet you are dropping off?");
                System.out.println("Please enter one of the following\n 1. Organic dog \n 2. Organic cat \n 3. Robotic dog \n 4. Robotic cat \n ");
                String getActionString3 = stringScanner2.nextLine();
                if (getActionString3.equalsIgnoreCase("Organic dog")) {
                    p1 = new OrganicDog(getActionString, getActionString2, 20, 20, 20, 20, 20);
                    vps.addPet(p1);
                } else if (getActionString3.equalsIgnoreCase("Organic cat")) {
                    p3 = new OrganicCat(getActionString, getActionString2, 20, 20, 20, 20, 20);
                    vps.addPet(p3);
                } else if (getActionString3.equalsIgnoreCase("Robotic dog")) {
                    p2 = new RoboticDog(getActionString, getActionString2, 20, 20);
                    vps.addPet(p2);
                } else if (getActionString3.equalsIgnoreCase("Robotic cat")) {
                    p4 = new RoboticCat(getActionString, getActionString2, 20, 20);
                    vps.addPet(p4);
                }
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

