package sam.ecosystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JellyfishTest {
    Jellyfish jellyfish = new Jellyfish("Armani",32,5,54,true);

    @Test
    void testSound()
    {
        jellyfish.makeSound();
    }
    @Test
    void testFacose()
    {
        jellyfish.facose();
    }
    @Test
    void testEat()
    {
        jellyfish.eat(5);
        Assertions.assertEquals(10 , jellyfish.getEnergy());
    }
    @Test
    void testMove()
    {
        jellyfish.move();
        Assertions.assertEquals(3 , jellyfish.getEnergy());
    }
}
