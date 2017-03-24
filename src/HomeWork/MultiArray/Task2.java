package HomeWork.MultiArray;

/* Task 2)
    Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел
из отрезка [-99;99]. Вывести массив на экран. После на отдельной строке вывести на экран
значение максимального элемента этого массива (его индекс не имеет значения).
*/

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int x = 0;
        int[][] MultiArr = new int[5][8];
        Random rnd = new Random();

        for (int i = 0; i < MultiArr.length; i++) {

            for (int j = 0; j < MultiArr[i].length; j++) {
                MultiArr[i][j] = rnd.nextInt(199) - 99;
                System.out.print(MultiArr[i][j] + " ");
                if(MultiArr[i][j] > x) x = MultiArr[i][j];
            }
            System.out.println();
        }
        System.out.println("Значение максимального элемента: " + x);
    }
}
