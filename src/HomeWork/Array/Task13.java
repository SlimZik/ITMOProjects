package HomeWork.Array;

/* Task 13)
    Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в
переменную n. Если пользователь ввёл не подходящее число, то программа должна просить
пользователя повторить ввод. Создать массив из n случайных целых чисел из отрезка [0;n] и
вывести его на экран. Создать второй массив только из чётных элементов первого массива,
если они там есть, и вывести его на экран.
 */

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите натуральное число большее 3: ");
        int x;
        do
        {
            x = scn.nextInt();
            System.out.println("--------------------------------");
            if (x < 4) System.out.println("Вы ввели число отличное от заданного! Попробуйте ещё раз.");
            else break;
        }
        while(x < 4);
        int a = 0;
        int[] arr = new int[x];

        System.out.println("Массив из случайных целых чисел: ");

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) Math.floor(Math.random() * (x + 1)); //
            System.out.print(" " + arr[i]);
            if ((arr[i] % 2) == 0)
            {
                a++;
            }
        }
        System.out.println("\n" + "Массив из четных чисел: ");
        int[] arr1;
        arr1 = new int[a];
        int b = 0;
        for (int anArr : arr) {
            if ((anArr % 2) == 0 && anArr != 0) {
                arr1[b++] = anArr;
                System.out.print(" " + anArr);
            }
        }
    }
}
