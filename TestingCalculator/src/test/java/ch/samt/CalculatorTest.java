package ch.samt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calc = new Calculator(2,3);

    @Test
    public void testAddition()
    {
        int res = calc.add(1, 1);
        Assertions.assertEquals(2,res);
    }
    @Test
    public void testDivision()
    {
        int res = calc.div(2, 1);
        Assertions.assertEquals(2,res);
    }

}
