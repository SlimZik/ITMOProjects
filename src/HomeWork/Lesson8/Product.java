package HomeWork.Lesson8;

/* Продукт */

public class Product {
    private int id;
    private static int curId = 1;
    private String name;
    private int price;
    private int qty;

    Product(String name, int price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.id = curId++;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }

    int getQty() {
        return qty;
    }

    void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return price == product.price && (name != null ? name.equals(product.name) : product.name == null);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return  "артикул: " + id +
                "  наименование: " + name +
                "   цена: " + price + "$ " +
                qty + " шт. ";
    }
}