package pets_amok;


public class VirtualPet {
    String name;
    String description;
    int hunger;
    int boredom;
    int health;
    int happiness;
    int thirst;
    int waste;




    public VirtualPet(String name, String description, int hunger, int boredom, int health, int thirst) {
        this.name = name;
        this.description= description;
        this.hunger = hunger;
        this.boredom = boredom;
        this.health=health;
        this.thirst=thirst;
        this.happiness= (500-(boredom+hunger+thirst)+health);

    }

    public VirtualPet(String name, String description, int hunger, int boredom, int health, int thirst, int waste) {
        this.name = name;
        this.description= description;
        this.hunger = hunger;
        this.boredom = boredom;
        this.health=health;
        this.thirst=thirst;
        this.waste = waste;
        this.happiness= (500-(boredom+hunger+thirst+waste)+health);

    }
    public VirtualPet(String name, String description, int boredom, int health) {
        this.name = name;
        this.description= description;
        this.boredom = boredom;
        this.health=health;
        this.happiness= (450-(boredom)+health);

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

    public int getHappiness() {
        return happiness;
    }

    public int getHealth() {
        return health;
    }

    public int getThirst() {
        return thirst;
    }
    public String getDescription() {
        return description;
    }
}
