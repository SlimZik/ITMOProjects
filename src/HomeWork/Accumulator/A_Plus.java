package HomeWork.Accumulator;

/* Операция - Сложение */

public class A_Plus extends A_Operation {            // Наследование

    @Override
    public int apply(int a, int b) {
        return a + b;
    }

    @Override
    public double apply(double a, double b) {
        return a + b;
    }

    @Override
    public long apply(long a, long b) {
        return a + b;
    }
}