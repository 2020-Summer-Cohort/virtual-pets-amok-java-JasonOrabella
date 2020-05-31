package pets_amok;

public class OrganicCat extends VirtualPet implements Organic{
    private int waste;
    public OrganicCat(String name, int hunger, int boredom, int happiness, int health, int thirst) {
        super(name, hunger, boredom, happiness, health,thirst);
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
    public void cleanCage() {

    }

    public int getWaste() {
        return waste;
    }
}
