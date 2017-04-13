package othertask.thewarofrome;

/* This is SPARTAAAA */


import java.util.Random;

public class WarMain {
    public static void main(String[] args) {
        Soldier[] greeks = new Soldier[10];
        Soldier[] romans = new Soldier[10];

        for (int i = 0; i < 10; i++) {
            greeks[i] = new Spartan();
            romans[i] = new Praetorian();
        }

        fight(greeks, romans);

        int result = winner(greeks, romans);

        if (result == 0)
            System.out.println("Draw");
        else if (result > 0)
            System.out.println("Greeks won!");
        else
            System.out.printf("Romans won!");
    }

    // Определяем победителя, в зависимости от числа выживших.
    private static int winner(Soldier[] army1, Soldier[] army2) {
        int alive1 = 0;
        int alive2 = 0;

        for (int i = 0; i < 10; i++) {
            if (army1[i].isAlive())
                alive1++;

            if (army2[i].isAlive())
                alive2++;
        }

        return alive1 - alive2;
    }

    // Армии атакуют друг друга.
    private static void fight(Soldier[] army1, Soldier[] army2) {
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            if (rnd.nextBoolean())
                army1[i].attack(army2[i]);
            else
                army2[i].attack(army1[i]);
        }
    }
}
