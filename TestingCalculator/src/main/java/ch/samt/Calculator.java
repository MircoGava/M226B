package ch.samt;

public class Calculator {
    private int a, b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(int a, int b)
    {
        return a + b;
    }
    public int div(int a, int b)
    {
        return a / b;
    }

}
