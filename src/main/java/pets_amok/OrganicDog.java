package pets_amok;

//walk method increases happiness and lowers risk of soiling cages
//need waste maybe waste is a function
// walk all dog method
public class OrganicDog extends VirtualPet implements Organic{
   public int waste;
    public OrganicDog(String name, int hunger, int boredom, int happiness, int health,int thirst) {
        super(name, hunger, boredom, happiness, health,thirst);

    }



    public void dog(){
        boolean dog = true;
        boolean cat = false;
    }
public void cageCleanliness(){
        //something about waste
}

    @Override
    public void createWaste() {
        waste=+5;

    }

    @Override
    public void cleanCage() {
        waste-=20;
    }
}
// all of pets lose happiness if health drops to low
// put in loop that if happiness is low lose 5 health