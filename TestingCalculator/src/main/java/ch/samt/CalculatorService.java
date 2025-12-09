package ch.samt;

public class CalculatorService {
    private Calculator calculator;




    public int addAndMultiplyByTwo(int a, int b)
    {
//        calculator = new Calculator(a,b);
        return (calculator.add(a,b) * 2);

    }

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }
}
