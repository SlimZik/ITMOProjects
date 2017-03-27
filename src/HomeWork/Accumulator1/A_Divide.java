package HomeWork.Accumulator1;

/* Операция - Деление */
public class A_Divide implements A_Operation {             // Наследование

    @Override
    public int apply(int a, int b) {
        return a / b;
    }

    @Override
    public double apply(double a, double b) {
        return a / b;
    }

    @Override
    public long apply(long a, long b) {
        return a / b;
    }
}
