package pets_amok;

//walk method increases happiness and lowers risk of soiling cages
//need waste maybe waste is a function
// walk all dog method
public abstract class Dog extends VirtualPet{
    public Dog(String name, int hunger, int boredom, int happiness, int health) {
        super(name, hunger, boredom, happiness, health);
    }
    public void dog(){
        boolean dog = true;
        boolean cat = false;
    }


}
// all of pets lose happiness if health drops to low
// put in loop that if happiness is low lose 5 health