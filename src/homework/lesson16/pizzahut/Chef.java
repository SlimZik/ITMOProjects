package homework.lesson16.pizzahut;

/* Важная часть программы - класс Директор здесь используется паттерн Strategy */

public class Chef {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void cookPizza() {
        pizzaBuilder.createNewPizza();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildCheeze();
        pizzaBuilder.buildSouce();
        pizzaBuilder.buildComponents();
    }
    public enum Cheeze{
        PARMESAN, DORBLUE
    }
    public enum Dough{
        SOLID, SLIM
    }
    public enum Souce{
        BBQ, TERIYAKI
    }
}
