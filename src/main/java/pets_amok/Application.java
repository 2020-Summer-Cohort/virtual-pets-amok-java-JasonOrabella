package pets_amok;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter vps = new VirtualPetShelter();
        System.out.println("Welcome to the Virtual Pet Shelter, now inclusive of Robotic animals");
        int run = 1;
        while (run ==1){
            if (vps.list.size() != 0)
            System.out.println("Pet Status:");
            System.out.println("Name | Boredom | Hunger | Happiness | Health | Thirst ");
            for (int i = 0; i < vps.list.size(); i++) {
                System.out.println(vps.list.get(i).getName() + "\t" + "\t" + vps.list.get(i).getBoredom() +
                        "\t" + "\t" + vps.list.get(i).getHunger() + "\t" + "\t" + vps.list.get(i).getHappiness()+
                        "\t"+"\t"+vps.list.get(i).getHealth());

//        if else(){
        }
            System.out.println("What would you like to do next?");
            System.out.println("1.Feed the Pets");
            System.out.println("2.Water the Pets");
            System.out.println("3.Play with a Pet");
            System.out.println("4. Adopt a New Pet");
            System.out.println("5. Admit a New Pet");
            System.out.println("6. Maintain the robotic pets");
            System.out.println("7. Clean the pets cages");
            System.out.println("8. Quit");
            System.out.println("Please enter 1- for your choice");
    }
        int getActionNumber = input.nextInt();

        if (getActionNumber == 1) {
//            vps.feedAll();
//            vps.tick organic();
//            tick tick robotic
            System.out.println("You feed all your Pets");
        } else if (getActionNumber == 8) {
            run = 0;
        }
    }}

