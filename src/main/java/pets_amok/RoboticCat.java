package pets_amok;

public class RoboticCat extends VirtualPet implements Robotic {
    public RoboticCat(String name, String description,int hunger, int boredom, int health, int thirst) {
        super(name , description,hunger, boredom, health, thirst);
    }

    @Override
    public void robotTickHealth() {
        health -=3;
        boredom+=3;
    }

    @Override
    public void oilAll() {
        health +=20;

    }

    @Override
    public void robotOverrideFeed() {
        hunger = Integer.parseInt(null);

    }

    @Override
    public void robotOverrideWater() {
            thirst= Integer.parseInt(null);
    }
}
