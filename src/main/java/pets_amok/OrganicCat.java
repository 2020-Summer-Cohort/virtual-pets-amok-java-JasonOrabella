package pets_amok;

public class OrganicCat extends VirtualPet implements Organic{
    private int waste;
    public OrganicCat(String name, String description, int hunger, int boredom, int happiness, int health, int thirst) {
        super(name, description, hunger, boredom, health,thirst);
    }
    public void cat(){
        boolean cat = true;
        boolean dog = false;
    }

    @Override
    public void createWaste() {
        waste=+5;
    }

    @Override
    public void organicTick() {
        hunger-=5;
        boredom-=5;
        thirst-=5;
    }

    @Override
    public void cleanCage() {

    }

    public int getWaste() {
        return waste;
    }
}
