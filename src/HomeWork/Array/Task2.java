package HomeWork.Array;

/* Task 2)
    Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем
этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3
1).
*/

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Массив из всех нечётных чисел от 1 до 99:");
        int min = 1, max = 99, count = -1;
        int [] arr1 = new int[max%2==0 ? max/2 : max/2+1];

        String Sorted = "", Reversed = "";

        while(count < arr1.length-1)
        {
            arr1[++count] = min;
            Sorted += min +" ";
            Reversed = min +" "+ Reversed;
            min += 2;
        }
        System.out.println(Sorted);
        System.out.println(Reversed);
    }
}
