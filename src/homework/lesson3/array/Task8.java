package homework.lesson3.array;

/* Task 8)
    Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой
элемент является в этом массиве максимальным и сообщите индекс его последнего
вхождения в массив
*/

public class Task8 {
    public static void main(String[] args) {
        int [] arr = new int[12];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * 31) - 15;
            System.out.print(arr[i] + " ");

        }
        int max = arr[0], index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max ) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("\n" + "Самое большое число " + max + " и индекс его последнего вхождения " + index);
    }
}
