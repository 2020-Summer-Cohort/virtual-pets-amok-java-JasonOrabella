package pets_amok;

public class RoboticDog extends VirtualPet implements Robotic{
    public RoboticDog(String name, String description, int boredom, int health) {
        super(name,description, boredom, health);
    }
    String hunger;
    String thirst;

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
