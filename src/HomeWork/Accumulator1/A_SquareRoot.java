package HomeWork.Accumulator1;

/* Операция - Квадратный корень */
public class A_SquareRoot implements A_Operation {             // Наследование

    @Override
    public int apply(int a, int b) {return (int) Math.sqrt(b);
    }

    @Override
    public double apply(double a, double b) {
        return Math.sqrt(b);
    }

    @Override
    public long apply(long a, long b) {return (long) Math.sqrt(b);
    }
}
