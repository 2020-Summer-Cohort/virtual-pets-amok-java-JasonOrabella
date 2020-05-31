package pets_amok;


public class VirtualPet {
    String name;
    int hunger;
    int boredom;
    int health;
    int happiness;
    int thirst;
//    int happiness= (500-(boredom+hunger)+health);




    public VirtualPet(String name,  int hunger,int boredom,int happiness, int health, int thirst) {
        this.name = name;
        this.hunger = hunger;
        this.boredom = boredom;
        this.health=health;
        this.thirst=thirst;
        this.happiness= (500-(boredom+hunger+thirst)+health);

    }


    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getBoredom() {
        return boredom;
    }

}
