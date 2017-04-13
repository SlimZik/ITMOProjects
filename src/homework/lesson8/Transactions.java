package homework.lesson8;


/* Транзакция */

import java.util.Date;

public class Transactions {
    private int Id;                 // id Товара
    private String name;            // Продукция
    private int Total;              // Общая сумма по счёту
    private int userID;             // ID покупателя
    private Date date;              // Дата

    Transactions(int userId, int total) {
        this.Id = Math.abs(hashCode());
        this.name = name;
        this.Total = total;
        this.userID = userId;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "Id Транзакции = " + Id +
                ", Наименование продукции = '" + name + '\'' +
                ", Итого = " + Total +
                ", ID пользователя = " + userID +
                ", Дата = " + date +
                '}';
    }
}

