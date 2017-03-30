package HomeWork.Accumulator1;

/* Класс - Accumulator1 */

class Accumulator {                                              // Устанавливаем значения
    private double value;
    private Operation operation;

    Accumulator(double value, Operation operation) {             // Смотри класс Operation

        this.value = value;
        this.operation = operation;
    }

    int calculate(int a) {                                       // Метод calculate
        value = operation.apply(value, a);
        return (int) value;
    }

    double calculate(double a) {
        value = operation.apply(value, a);
        return value;
    }


    double getValue() {                                       // Вывод
        return value;
    }
}