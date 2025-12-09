package ch.samt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class CalculatorServiceTest {
    Calculator calculator = new Calculator(2, 1);




    @Test
    void test() {
        CalculatorService calcService = new CalculatorService(calculator);
        int res = calcService.addAndMultiplyByTwo(2, 1);
        Assertions.assertEquals(6, res);
    }

    @Test
    void mockTest() {
        Calculator calc = Mockito.mock(Calculator.class);
        when(calc.add(2, 1)).thenReturn(3);

        CalculatorService calcService = new CalculatorService(calc);

        int res = calcService.addAndMultiplyByTwo(2, 1);
        Assertions.assertEquals(6, res);
        verify(calc).add(2, 1);
    }


}
