package homework.lesson20;

/* Заказ */

import java.util.Scanner;

public class Order {
    Scanner scn = new Scanner(System.in);

    String positions;
    private boolean ready;
    private boolean inProgress;

    public Order() {
        positions = scn.nextLine();
        System.out.println("Ваш заказ: " + positions);
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public boolean isInProgress() {
        return inProgress;
    }

    public void setInProgress(boolean inProgress) {
        this.inProgress = inProgress;
    }
}