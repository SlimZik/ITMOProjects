package HomeWork.Accumulator;

/* Класс - Accumulator */

class Accumulator {                                           // Устанавливаем значения
    private double value;
    private A_Operation operation;

    Accumulator(int value, A_Operation operation) {           // Смотри класс Operation

        this.value = value;
        this.operation = operation;
    }

    int calculate(int a) {                                    // Метод calculate
        value = operation.apply(value, a);
        return (int) value;
    }

    double calculate(double a) {
        value = operation.apply(value, a);
        return value;
    }

    /*public long calculate(long a) {
        value = operation.apply(value, a);
        return (long) value;
    }*/

    double getValue() {                                       // Вывод
        return value;
    }
}