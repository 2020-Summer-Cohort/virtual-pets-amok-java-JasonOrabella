package pets_amok;


public abstract class VirtualPet {
    String name;
    int hunger;
    int boredom;
    int happiness;
    int health;



    public VirtualPet(String name,  int hunger,int boredom,int happiness, int health) {
        this.name = name;
        this.hunger = hunger;
        this.boredom = boredom;
        this.happiness= happiness;
        this.health=health;

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
