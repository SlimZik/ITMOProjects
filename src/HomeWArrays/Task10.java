package HomeWArrays;

/* Task 10)
    Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на
экран в строку. Определите какой элемент встречается в массиве чаще всего и выведите об
этом сообщение на экран. Если два каких-то элемента встречаются одинаковое количество
раз, то не выводите ничего
*/

public class Task10 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int[] arr = new int[11];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * 3) - 1;
            System.out.print(arr[i] + " "); // вывод массива на экран

            if (arr[i] == -1) a++;          // Счетчик a
            else if (arr[i] == 0) b++;      // Счетчик b
            else c++;                       // Счетчик c
        }
        System.out.println();

        if (a > b && a > c)
            System.out.println("чаще всего встречается: " + a);
        else if (b > a && b > c)
            System.out.println("чаще всего встречается: " + b);
        else
            System.out.println("чаще всего встречается: " + c);
        }
    }
