package HomeWork.Array;

/* Task 7)
    Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем,
что первый и второй члены последовательности равны единицам, а каждый следующий —
сумме двух предыдущих.
*/

public class Task7 {
    public static void main(String[] args) {
        int fbn = 1, a = 1, b;
        System.out.print(fbn + " " + a + " ");

        for(int i = 0; i < 18; i++){
            b = fbn + a;
            System.out.print(b + " ");
            fbn = a;
            a = b;
        }
        System.out.println();
        }
    }
