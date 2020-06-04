package pets_amok;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.ArrayList;

public class VirtualPetShelterTest {
    @Test
    public void tickTest(){
        RoboticDog undertest = new RoboticDog("Sad","Gear",20,20);
        VirtualPetShelter vps =new VirtualPetShelter();
        vps.list.add(undertest);
        vps.tick();
        assertEquals(25,undertest.getBoredom());
        assertEquals(15,undertest.getHealth());

    }

    @Test
    public void feedAllOrganicTest() {
        OrganicDog feed = new OrganicDog("Sad", "Gear", 20, 20, 20, 20, 20);
        VirtualPetShelter vps = new VirtualPetShelter();
        vps.list.add(feed);
        vps.feedAll();
        assertEquals(0, feed.getHunger());

    }
}

