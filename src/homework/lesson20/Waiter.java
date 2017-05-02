package homework.lesson20;

/* Ждун */

public class Waiter implements Runnable {
    private Order order;

    public Waiter(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        System.out.println("\nВаш заказ принят, присядьте");
        try {
            Thread.sleep(1000);
            order.setInProgress(true);

            synchronized (order) {
                order.notify();

                while (!order.isReady())
                    order.wait();

                Thread.sleep(1000);
                System.out.println("\nБариста: - " + order.positions + " Для Романа готов" );
            }
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}