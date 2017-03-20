package HomeWArrays;

/* Task 11)
    Пользователь должен указать с клавиатуры чётное положительное число, а программа
должна создать массив указанного размера из случайных целых чисел из [-5;5] и вывести его
на экран в строку. После этого программа должна определить и сообщить пользователю о
том, сумма модулей какой половины массива больше: левой или правой, либо сообщить, что
эти суммы модулей равны. Если пользователь введёт неподходящее число, то программа
должна требовать повторного ввода до тех пор, пока не будет указано корректное значение.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {

        private static boolean Check(int a) {                          // Проверка ввода!
            return a % 2 == 0;
        }

    public static void main(String[] args) {
        int a; int b = 0, c = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Введите чётное положительное число: "); // Вводим число

            a = sc.nextInt();

        } while (!Check(a) || a < 0);

        int [] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 11) - 5.6);
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            if (i < arr.length / 2)
                b = b + Math.abs(arr[i]);
            else c = c + Math.abs(arr[i]);
        }

        System.out.println();
        if (b > c)
            System.out.println("Сумма модулей левой половины массива больше правой");
        else if (c > b)
            System.out.println("Сумма модулей правой половины массива больше левой");
        else
            System.out.println("Сумма модулей правой и левой половины массива равны");
    }
}
