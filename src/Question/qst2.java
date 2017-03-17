package Question;

/* Task 9)
Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех
его цифр (заранее не известно сколько цифр будет в числе). */


import java.util.Scanner;

public class qst2 {
    public static void main(String[] args) throws Exception {
        int sum = 0;

        while (true){
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите натуральное число: ");
            int m = scn.nextInt();

            sum = sum + m;
            if (m == -1)
                break;
        }
        System.out.println("Сумма введенных чисел = " + sum);

    }

}
