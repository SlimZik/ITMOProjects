package homework.lesson13;

import java.util.Scanner;

/* Злой калькулятор */

public class EvilCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        assert x <= 0 : "Invalid value";
    }
}