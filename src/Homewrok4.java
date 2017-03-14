//Задание 4

public class Homewrok4 {
    public static void main (String [] args){
       int a = 125;
       int b = 0;
       int c = a;

       while (c != 0){
           b += c%10;
           c /= 10;
       }
        System.out.println("Сумма цифр в числе " + a + " = " + b);
    }

}
