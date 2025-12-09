package sam.ecosystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DophinTest {
    Dolphin strong = new Dolphin("Forte",15,99,99,true,99,false,99);
    Dolphin weak = new Dolphin("Debole",15,1,1,true,1,false,1);

    @Test
    void testStrongHunt()
    {
        boolean ris = strong.hunt();
        Assertions.assertTrue(ris);
    }
    @Test
    void testWeakHunt()
    {
        boolean ris = weak.hunt();
        Assertions.assertFalse(ris);
    }
    @Test
    void testSound()
    {
        strong.makeSound();
    }
    @Test
    void testFacose()
    {
        strong.facose();
    }
    @Test
    void testEat()
    {
        weak.eat(5);
        Assertions.assertEquals(6 , weak.getEnergy());

    }
    @Test
    void testMove()
    {
        strong.move();
        Assertions.assertEquals( 97 , strong.getEnergy());
    }
}
