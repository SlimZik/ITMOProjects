package homework.lesson3.array;

/* Task 5)
    Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите
массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов
каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо
сообщите, что их средние арифметические равны)
 */
public class Task5 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 5; i++) {
            arr1[i] = (int) Math.round(Math.random() * 5);
            System.out.print(arr1[i] + " ");
        }
        System.out.println("Вывод на экран массива № 1");
        for (int anArr1 : arr1) {
            sum1 += anArr1;
        }
        System.out.println("Сумма элементов массива №1: " + sum1);
        int[] arr2 = new int[5];

        for (int i = 0; i < 5; i++) {
            arr2[i] = (int) Math.round(Math.random() * 5);
            System.out.print(arr2[i] + " ");
        }
        System.out.println("Вывод на экран массива № 2");
        for (int anArr2 : arr2) {
            sum2 += anArr2;
        }
        System.out.println("Сумма элементов массива №2: " + sum2 + "\n");

        if (sum1 < sum2) System.out.println("Сумма элементов массива №2 больше чем сумма элементов массива №1");

        if (sum1 == sum2) System.out.println("Сумма элементов массива №2 равна сумме элементов массива №1");

        if (sum1 > sum2) System.out.println("Сумма элементов массива №2 меньше чем сумма элементов массива №1");
    }

}
