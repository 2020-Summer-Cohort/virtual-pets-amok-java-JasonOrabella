package pets_amok;

public class RoboticCat extends VirtualPet implements Robotic {
    public RoboticCat(String name, String description, int boredom, int health) {
        super(name , description, boredom, health);
    }

    @Override
    public void robotTickHealth() {
        health -=5;
        boredom+=5;
    }

    @Override
    public void oilAll() {
        health +=20;

    }

}
