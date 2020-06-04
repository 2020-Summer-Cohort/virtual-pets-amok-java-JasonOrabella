package pets_amok;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboticCatTest {
    @Test

    public void RoboticCatTest(){
        RoboticCat undertest = new RoboticCat("RoboCat","description",20,20);
    }
    @Test
    public void assertCatsHunger(){
        RoboticCat undertest = new RoboticCat("RoboCat2","description",20,20);
        int testcase = undertest.getBoredom();
        assertEquals(20,testcase);
    }
}
