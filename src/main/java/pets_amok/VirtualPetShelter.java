package pets_amok;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Iterator;


public class VirtualPetShelter {

    //    ArrayList<VirtualPet> list;
    ArrayList<VirtualPet> list;
    //    ArrayList<VirtualPet> list = new ArrayList<VirtualPet>();
    OrganicDog p1;
    RoboticDog p2;
    OrganicDog p3;
    OrganicCat p4;
    RoboticCat p5;
    Iterator itr;

    VirtualPetShelter() {
//        ArrayList<VirtualPet> list;

        list = new ArrayList<VirtualPet>();
        p1 = new OrganicDog("Fido", "Organic Dog", 20, 20, 20, 20,20);
        list.add(p1);
        p2 = new RoboticDog("Dave", "robotic dog", 0, 20, 20, 0);
        list.add(p2);
        p3 = new OrganicDog("Frank", "Organic", 20, 20, 20, 20,20);
        list.add(p3);
        p4 = new OrganicCat("Floof","Sad Organic kitty",20,40,20,20,20);
        list.add(p4);
        p5 = new RoboticCat("Gearo","Sassy Robotic cat",20,23,0,20);
        list.add(p5);
    }

    public void tick() {
        itr = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            VirtualPet p = (VirtualPet) itr.next();
            if (p instanceof Organic) {
                ((Organic) p).organicTick();
            }
            if (p instanceof Robotic) {
                ((Robotic) p).robotTickHealth();
            }
        }
    }


    public void waterAll() {
        itr = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            VirtualPet p = (VirtualPet) itr.next();


            if (p instanceof Organic) {
                p.thirst -= 20;
            }


            if (p instanceof Robotic) {
            }
        }
    }

    public void feedAll() {
        itr = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            VirtualPet p = (VirtualPet) itr.next();


            if (p instanceof Organic) {
                p.hunger -= 20;
            }


            if (p instanceof Robotic) {
            }
        }
    }

    public ArrayList<VirtualPet> removePet(String Pet) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equalsIgnoreCase(Pet)) {
                System.out.println("You adopted" + " " + (list.get(i).name));
                list.remove(i);
            }
        }
        return list;
    }

    public void addPet(VirtualPet Pet) {
        list.add(Pet);
    }

    public void playWithPet(String getActionString) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equalsIgnoreCase(getActionString)) {
                list.get(i).boredom -= 25;
            }
        }
    }

    public void oil() {
        itr = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            VirtualPet p = (VirtualPet) itr.next();
            if (p instanceof Organic) {
            }
            if (p instanceof Robotic) {
                ((Robotic) p).oilAll();
            }
        }
    }

    public void wasteMethod() {
        itr = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            VirtualPet p = (VirtualPet) itr.next();
            if (p instanceof OrganicDog) {
                System.out.println("The Organic dogs are:");
                for (int d = 0; d < list.size(); d++)
                    System.out.println(list.get(d).name);
                System.out.println("Their waste level is:");
//             /   ();
            }
            if (p instanceof Robotic) {
            }
        }
    }

    public void walkAllDogs() {
        itr = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            VirtualPet p = (VirtualPet) itr.next();
            if (p instanceof OrganicDog) {
                list.get(i).boredom-=15;
            }
            if (p instanceof OrganicDog) {
                list.get(i).boredom-=15;
            }
                if (p instanceof RoboticCat) {

                }
        }
    }
}

