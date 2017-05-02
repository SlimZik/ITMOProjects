package homework.lesson20;

/* Кафешка Starbucks */

public class Starbucks {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Добрый день, что будете заказывать?");

        Order order = new Order();

        Thread waiter = new Thread(new Waiter(order));
        waiter.start();

        Thread barista = new Thread(new Barista(order));
        barista.start();

        waiter.join(2500);
    }
}