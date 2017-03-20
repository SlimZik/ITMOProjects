package HomeWArrays;

/* Task 9)
    Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10
действительных чисел. Каждый элемент с i-ым индексом третьего массива должен равняться
отношению элемента из первого массива с i-ым индексом к элементу из второго массива с i-
ым индексом. Вывести все три массива на экран (каждый на отдельной строке), затем
вывести количество целых элементов в третьем массиве.
*/

import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int [] arr1 = new int[10];
        int [] arr2 = new int[10];
        double[] arr3 = new double[10];

        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            arr1[i] = rnd.nextInt(9) + 1;
            arr2[i] = rnd.nextInt(9) + 1;
            arr3[i] = (double) arr1[i] / arr2[i];
        }
        int x = 0;
        for (double anArr3 : arr3)
            if (anArr3 % 1 == 0)
                x++;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println("Количество целых элементов в третьем массиве: " + x);
    }
}
