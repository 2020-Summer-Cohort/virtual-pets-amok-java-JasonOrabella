package pets_amok;

import java.util.ArrayList;

public class VirtualPetShelter extends VirtualPet{
    public VirtualPetShelter(String name, int hunger, int boredom, int happiness, int health, int thirst) {
        super(name, hunger, boredom, happiness, health,thirst);
    }
    ArrayList<VirtualPet> vps = new ArrayList<VirtualPet>();

    OrganicDog p1;

    VirtualPetShelter() {
        ArrayList<VirtualPet> list;


        p1 = (OrganicDog) new VirtualPet("dude",20,20,20,20,20);
        vps.add(p1);
}
}


//public void tick() {
//        for({
//        VirtualPet  = getPet
//        if(hungryPet instanceof Organic){
//        //pet waste
//        //hunger
//        //water
//        }else if (hungryPet instanceof Robitic){
//        //will need to get deterioate
//        }



