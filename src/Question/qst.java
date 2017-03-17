package Question;

/* Task 9)
Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех
его цифр (заранее не известно сколько цифр будет в числе). */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class qst {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader  (new InputStreamReader(System.in));
        List<Integer> arrInt = new ArrayList<>();
        String line;
        System.out.println("Введите число: ");
        while (!(line = reader.readLine()).equals("- 1")){
            line = line.trim().replaceAll(" ", "");

            try {
                arrInt.add(Integer.parseInt(line));
            }catch (NumberFormatException e){
                System.out.println("\n Вводите только десятичные числа");
            }
            System.out.println("Введите число: ");
        }
        System.out.println(arrInt);

        int result = -1;
        for (int num : arrInt) {
            result += num;

        }
        System.out.println("Сумма чисел = " + result);
    }

}
