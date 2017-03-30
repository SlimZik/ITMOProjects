package HomeWork.Accumulator2;

/* Класс - Accumulator1 */

class Accumulator {                                                     // Устанавливаем значения в данном случае у нас будет массив

    private double[] value;
    private Operation[] operation;

    Accumulator(double[] value, Operation[] operation) {               // Смотри класс Operation

        this.value = value;
        this.operation = operation;
    }

    void calculate(double a) {
        for (int i = 0; i < value.length; i++) {
            value[i] = operation[i].apply(value[i], a);
        }
    }

    double[] getValue() {                                              // Вывод
        return value;
    }
}
