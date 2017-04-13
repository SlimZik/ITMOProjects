package homework.lesson8;

/* */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();


                                /* ------------------- продукты -------------------*/

        store.putToStore("iPhone9+", 900, 5);
        store.putToStore("iPhone8s", 650, 5);
        store.putToStore("iPhone10", 1200, 5);

                                /* ----------------- Наш покупатель -----------------*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String s = scan.nextLine();
        Store.User user = new Store.User(s);


        System.out.println("\nНаши товары:");
        store.show();

        StringBuilder builder = new StringBuilder();
        builder.append("\nСписок команд:\n" +
                "Показать товары           посмотреть доступные товары\n" +
                "Добавить в корзину        добавить в корзину\n" +
                "Корзина                   просмотр корзины\n" +
                "Удалить товар             удалить товар из корзины\n" +
                "Купить                    совершить покупку\n" +
                "Выход                     выход\n");

        System.out.println(builder);

                                                         //Консоль//
        while (true) {
            String x = scan.nextLine();

            switch (x) {
                case "Показать товары":
                    store.show();
                    break;

                case "Добавить в корзину":
                    System.out.println("введите id товара: ");
                    int id = scan.nextInt();
                    System.out.println("введите кол-во: ");
                    int qty = scan.nextInt();
                    store.putToCart(id, qty);
                    break;

                case "Корзина":
                    store.showCart();
                    break;

                case "Купить":
                    if (store.getCart().size() == 0) {
                        System.out.println("Ваша корзина пуста!");
                    } else {
                        System.out.println("Введите сумму: ");
                        int sum = scan.nextInt();
                        store.buy(user.getUserID(), sum);
                    }
                    break;

                case "Показать транзакции магазина":
                    for (Object o : store.getTransaction()) {
                        System.out.println(o);}
                    break;

                case "Удалить товар":
                    if (store.getCart().size() == 0) {
                        System.out.println("Ваша корзина пуста!");
                    } else {
                        System.out.println("Введите id товара: ");
                        int prevId = scan.nextInt();
                        store.remove(prevId);
                    }
                    break;

                case "Выход": return;
            }
        }
    }
}