package sam.ecosystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SharkTest {
    Shark strongShark = new Shark("Forte",15,99,99,true,99,false);
    Shark weakShark = new Shark("Debole",15,1,1,true,1,false);

    @Test
    void testStrongHunt()
    {
        boolean ris = strongShark.hunt();
        Assertions.assertTrue(ris);
    }
    @Test
    void testWeakHunt()
    {
        boolean ris = weakShark.hunt();
        Assertions.assertFalse(ris);
    }
    @Test
    void testSound()
    {
        strongShark.makeSound();
    }

    @Test
    void testEat()
    {
        weakShark.eat(5);
        Assertions.assertEquals( 6 , weakShark.getEnergy());
    }
    @Test
    void testMove()
    {
        strongShark.move();
        Assertions.assertEquals(97 , strongShark.getEnergy());
    }
}
