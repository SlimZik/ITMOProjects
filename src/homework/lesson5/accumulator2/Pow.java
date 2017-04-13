package homework.lesson5.accumulator2;

/* перация - Возведение в степень */
public class Pow implements Operation {             // Наследование

    /*@Override
    public int apply(int a, int b) {return (int)Math.pow(a, b);
    }*/

    @Override
    public double apply(double a, double b) {return Math.pow(a, b);
    }

    /*@Override
    public long apply(long a, long b) {
        return (long) Math.pow(a, b);
    }*/
}
