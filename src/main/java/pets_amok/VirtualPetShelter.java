package pets_amok;

import java.util.ArrayList;
import java.util.Iterator;


public class VirtualPetShelter {

    //    ArrayList<VirtualPet> list;
    ArrayList<VirtualPet> list;
    //    ArrayList<VirtualPet> list = new ArrayList<VirtualPet>();
    OrganicDog p1;
    RoboticDog p2;
    Iterator itr;

    VirtualPetShelter() {
//        ArrayList<VirtualPet> list;

        list = new ArrayList<VirtualPet>();
        p1 = new OrganicDog("dude", 20, 20, 20, 20);
        list.add(p1);
        p2 = new RoboticDog("New", 0, 20, 20, 0);
        list.add(p2);


    }
}


    public void tick() {
        itr = list.iterator();
        VirtualPet p = (VirtualPet) itr.next();


            if (p instanceof Organic) {

            }


        if (p instanceof Robotic) {
            ((Robotic) p).robotTickHealth();
        }

        }}

        public void waterAll(){

            itr = list.iterator();
            while (itr.hasNext()) {
                VirtualPet p = (VirtualPet) itr.next();
                p.thirst -= 20;
            }
        }


    }