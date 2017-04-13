package homework.lesson8;

/* Тело магазина */


import homework.lesson4.linkedlist.LinkedList;
import homework.lesson4.linkedlist.List;

public class Store {                                                                                                    // Магазин

    private List<Product> stock;
    private List<UserCart> cart;
    private List<Transactions> transaction;
    private int cartPrice;
    private int balance;

    public Store() {
        this.stock = new LinkedList<>();
        this.cart = new LinkedList<>();
        this.transaction = new LinkedList<>();
    }

    public void putToStore(String name, int price, int quantity) {                                                       //добавить товар в магазин
        Product o = new Product(name, price, quantity);
        if (stock.get(o) != null) {
            (stock.get(o)).setQty((stock.get(o).getQty() + quantity));
        }else
            stock.add(o);
    }

    public void putToCart(int id, int quantity) {                                                                       //добавить товар в корзину
        if (id < 0 || id > stock.size()) {
            System.out.println("Некорректный id!");

            return;
        }
        if (quantity < 1 || stock.get(id).getQty() < quantity) {
            System.out.println("Некорректный запрос кол-ва");

            return;
        }
        Product o = stock.get(id);

        if (getFromCart(id) != null) {
            if ((o.getQty() + quantity) > stock.get(o).getQty()) {
                System.out.println("Недоступное количество!");

                return;
            }
            o.setQty(o.getQty() + quantity);
            cartPrice += o.getPrice() * quantity;

            return;
        }
        cart.add(new UserCart(id, o.getName(), o.getPrice(), quantity));
        cartPrice += getFromCart(id).getPrice() * quantity;
        System.out.println("Товар добавлен в корзину");
    }

    public UserCart getFromCart(int id) {                                                                               //взять товар из корзины
        for (UserCart cp : cart) {
            if (cp.getId() == id) return cp;
        }
        return null;
    }

    public void remove(int id) {                                                                                        // Удаляем товар из корзины
        for (Object o : cart) {
            if (((Product) o).getId() == id) {
                cart.remove(id);
                cartPrice -= ((Product) o).getPrice();
                stock.add((Product) o);
                System.out.println("Товар удалён из корзины");
                return;
            }
        }
        System.out.println("Данного товара нет в вашей корзине");
    }


    void showCart() {                                                                                                   // Корзина с товарами (или нет...)
        System.out.println("***** Ваша Корзина *****");
        for (Object o : cart) {
            System.out.println(o);
        }
        System.out.println("---------------------------------------");
        System.out.println("Итого: " + cartPrice);
    }


    void buy(int userId, int price) {                                                                                   // Покупка товара
        if (price < cartPrice) {
            System.out.println("Недостаточно средств");

            return;
        }
        for (UserCart cp : cart) {
            stock.get(cp.getId()).setQty(stock.get(cp.getId()).getQty() - cp.getQty());
        }
        transaction.add(new Transactions(userId, cartPrice));
        balance += cartPrice;
        cartPrice = 0;
        cart = new LinkedList<>();
        System.out.println("Спасибо за покупку!");
    }

    List getTransaction() {
        return transaction;
    }

    List getCart() {
        return cart;
    }


    void show() {                                                                                                // Магазинчик дядюшки Хана Соло
        if (stock.size() == 0) {
            System.out.println("Магазин пуст, приходите позже");                                                        // если магазин пуст
            return;
        }
        for (Object o : stock)                                                                                          // если магазин имеет в наличии товары
            System.out.println(o);
    }

    static class User {                                                                                          // Покупатель

        private int id;
        private String UserName;

        User(String UserName) {
            this.UserName = UserName;
            this.id = Math.abs(UserName.hashCode());

            System.out.println("Ваш id: " + id);
        }
        int getUserID() {
            return id;
        }
    }
}