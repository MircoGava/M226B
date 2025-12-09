package sam.ecosystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HerbivorousFishTest {
    HerbivorousFish herbivorousFish = new HerbivorousFish("David",2,5,32,true);
    @Test
    void testSound()
    {
        herbivorousFish.makeSound();
    }
    @Test
    void testEat()
    {
        herbivorousFish.eat(5);
        Assertions.assertEquals(10 , herbivorousFish.getEnergy());
    }
    @Test
    void testMove()
    {
        herbivorousFish.move();
        Assertions.assertEquals(3 , herbivorousFish.getEnergy());
    }

}
