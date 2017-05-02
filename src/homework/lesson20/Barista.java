package homework.lesson20;

/* Бариста */

public class Barista extends Thread implements Runnable {
    private Order order;

    public Barista(Order order) {
        this.order = order;
    }

    @Override
    public void run() {

        synchronized (order) {
            try {
                while (!order.isInProgress())
                    order.wait();

                System.out.println("Бариста принял ваш заказ");

                Thread.sleep(2000);
                order.setReady(true);

                order.notifyAll();
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}