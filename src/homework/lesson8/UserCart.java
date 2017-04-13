package homework.lesson8;

/* Продуткция */

public class UserCart {
    private int id;
    private String pname;
    private int price;
    private int qty;

    UserCart(int id, String pname, int price, int qty) {
        this.pname = pname;
        this.price = price;
        this.qty = qty;
        this.id = id;
    }

    int getId() {
        return id;
    }

    String getName() {
        return pname;
    }

    int getPice() {
        return price;
    }

    int getPrice() {
        return price;
    }

    int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "артикул: " + id +
                " наименование: " + pname +
                "   цена: " + price + "$ " +
                qty + " шт.";
    }
}