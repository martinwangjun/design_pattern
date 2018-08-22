package factory;

import org.junit.Test;

public class ArsenalTest {
    @Test
    public void manufactoryTest() {
        Arsenal f1 = new AK47Arsenal();
        Arsenal f2 = new M16Arsenal();
        Weapon w1 = f1.manufacture();
        Weapon w2 = f2.manufacture();
        
        w1.shoot();
        w2.shoot();
        
        Arsenal f3 = new RPGArsenal();
        Weapon w3 = f3.manufacture();
        w3.shoot();        
    }
}
