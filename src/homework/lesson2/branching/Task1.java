package homework.lesson2.branching;
/* Task 1)
Создать программу, которая будет проверять попало ли случайно выбранное из отрезка
[5;155] целое число в интервал (25;100) и сообщать результат на экран.Примеры работы
программы:
Число 113 не содержится в интервале (25,100) Число 72 содержится в интервале (25,100) 
Число 25 не содержится в интервале (25,100) Число 155 не содержится в интервале (25,100)
*/

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        Random  rn = new Random();
        int a = rn.nextInt(150) + 5;
        if (25 < a && a < 100)
            System.out.println("Число " + a + " содержится в диапазоне от 25 до 100");
        else
            System.out.println("Число " + a + " не содержится в диапазоне от 25 до 100");
    }

}
