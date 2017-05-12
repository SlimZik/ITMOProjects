package homework.Banking;



public class Main {
    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        Account account1 = new Account("Roma", 1000);
        Account account2 = new Account("Dima", 1000);

        Thread thread = new Thread(new transferThread(bank, account1, account2, 1000));
        Thread.sleep(1000);


        thread.start();
        thread.join();
        bank.mailerOff();

        System.out.println("\n" + account1.toString());
        System.out.println(account2.toString());

    }

    static class transferThread implements Runnable {
        private Account acc1;
        private Account acc2;
        private int amount;
        private Bank bank;

        public transferThread(Bank bank, Account acc1, Account acc2, int amount) {
            this.bank = bank;
            this.acc1 = acc1;
            this.acc2 = acc2;
            this.amount = amount;
        }

        @Override
        public void run() {
            bank.transferMoney(acc1, acc2, amount);
        }
    }
}
