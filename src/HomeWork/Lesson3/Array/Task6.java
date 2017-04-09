package HomeWork.Lesson3.Array;

/* Task 6)
    Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в
строку. Определить и вывести на экран сообщение о том, является ли массив строго
возрастающей последовательностью.
 */

public class Task6 {
    public static void main(String[] args) {
        int [] arr = new int [4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()* 90 + 10);
            System.out.print(arr[i] + " ");
        }

        boolean asc = true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                asc = false;
            }
        }
        System.out.println("\n" + "Массив является строго возрастающей последовательностью: " + asc);
    }
}
