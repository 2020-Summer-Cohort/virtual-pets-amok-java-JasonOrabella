package pets_amok;

public class RoboticCat extends VirtualPet implements Robotic {
    public RoboticCat(String name, int hunger, int boredom, int happiness, int health,int thirst) {
        super(name, hunger, boredom, health,thirst);
    }

    @Override
    public void robotTickHealth() {
        health -=3;
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
