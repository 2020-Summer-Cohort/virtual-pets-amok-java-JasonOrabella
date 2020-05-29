package pets_amok;


public abstract class VirtualPet {
    String name;
    boolean isLiving = true;
    int hunger;
    int water;
    int boredom;
    int waste;
    int health=(500-(hunger+water+waste));
    int happiness = (health*4-(boredom*2));


    public VirtualPet(String name, boolean isLiving, int hunger, int water, int boredom, int waste, int happiness, int health) {
        this.name = name;
        this.isLiving = isLiving;
        this.hunger = hunger;
        this.water = water;
        this.boredom = boredom;
        this.waste = waste;
        this.happiness = happiness;
        this.health = health;

    }

    public void die() {
        isLiving = false;
        System.out.println("This animal has died.");
    }

    public String getName() {
        return name;
    }

    public boolean isLiving() {
        return isLiving;
    }

    public int getHunger() {
        return hunger;
    }

    public int getWater() {
        return water;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getWaste() {
        return waste;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getHealth() {
        return health;
    }
}
