package HomeWork.Lesson3.Array;

/* Task 12)
    Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10]
таким образом, чтобы отрицательных и положительных элементов там было поровну и не
было нулей. При этом порядок следования элементов должен быть случаен (т. е. не подходит
вариант, когда в массиве постоянно выпадает сначала 6 положительных, а потом 6
отрицательных чисел или же когда элементы постоянно чередуются через один и пр.).
Вывести полученный массив на экран*/

import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        int a, b;
        int [] arr = new int[12];
        Random rnd = new Random();
        System.out.println("Заполнение массива: ");

        do {
            a = 0;
            b = 0;
            for (int i = 0; i <= arr.length-1;i++){
                arr[i] = rnd.nextInt(22) - 11;
                while (arr[i] == 0){
                    arr[i] = rnd.nextInt(22) - 11;
                }
                if (arr[i] < 0){
                    a++;
                } else {
                    b++;
                }
            }
        }while (a != b);
        for (int i = 0;i <= arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        }
    }
