package homework.Banking;

/* Банк */

public class Bank {
    private MailerThread mailer;
    private Thread mailerT;

    public Bank() {
        mailer = new MailerThread();
        mailerT = new Thread(mailer);
        mailerT.start();
    }

    public void mailerOff (){
        mailerT.interrupt();
    }

    public void transferMoney(Account acc1, Account acc2, int amount) {
        if (acc1.getUserId() > acc2.getUserId()) {
            synchronized (acc2) {
                if (acc1.getBalance() < amount) {

                    mailer.addToQueue("Не хватает денег");

                    return;
                }
                synchronized (acc1) {
                    acc1.setBalance(acc1.getBalance() - amount);
                    acc2.setBalance(acc2.getBalance() + amount);

                    mailer.addToQueue("Операция прошла успешно");
                }
            }
        } else {
            synchronized (acc1) {
                if (acc1.getBalance() < amount) {

                    mailer.addToQueue("Не хватает денег");
                    return;
                }
                synchronized (acc2) {

                    acc1.setBalance(acc1.getBalance() - amount);
                    acc2.setBalance(acc2.getBalance() + amount);

                    mailer.addToQueue("Операция прошла успешно");
                }
            }
        }
    }
}
