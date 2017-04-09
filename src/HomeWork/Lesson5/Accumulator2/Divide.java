package HomeWork.Lesson5.Accumulator2;

/* Операция - Деление */
public class Divide implements Operation {             // Наследование

    /*@Override
    public int apply(int a, int b) {
        return a / b;
    }
*/
    @Override
    public double apply(double a, double b) {
        return a / b;
    }

    /*@Override
    public long apply(long a, long b) {
        return a / b;
    }*/
}
