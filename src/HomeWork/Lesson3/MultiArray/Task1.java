package HomeWork.Lesson3.MultiArray;

/* Task 1)
    Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел
из отрезка [10;99]. Вывести массив на экран.
*/


import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[][] MultiArr = new int[8][5];
        Random rnd = new Random();

        for (int i = 0; i < MultiArr.length; i++) {

            for (int j = 0; j < MultiArr[i].length; j++) {
                MultiArr[i][j] = rnd.nextInt(90) + 10;
                System.out.print(MultiArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

