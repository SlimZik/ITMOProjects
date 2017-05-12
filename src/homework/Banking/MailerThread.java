package homework.Banking;

/* Оповещатель */

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MailerThread implements Runnable {
    private BlockingQueue<String> block = new LinkedBlockingQueue<>();

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            try {
                System.out.println(block.take());

            } catch (InterruptedException e) {
                Thread.currentThread().isInterrupted();
            }
        }
    }
    public void addToQueue (String command) {
        block.offer(command);
    }
}