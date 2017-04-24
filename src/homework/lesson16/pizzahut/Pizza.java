package homework.lesson16.pizzahut;

import java.util.Collection;
import java.util.TreeSet;

/* Пиццерия */
/* Нам необходимо написать программу позволяющую собрать пиццу из нужных нам компонентов.
Для начала создаём сам класс Пицца и абстрактный класс Builder для её создания */
public class Pizza {
    private Chef.Dough dough = null;
    private Chef.Cheeze cheeze = null;
    private Chef.Souce souce = null;
    private Collection<String> components;

    public void setDough(Chef.Dough dough) {
        this.dough = dough;
    }

    public void setCheeze(Chef.Cheeze cheeze) {
        this.cheeze = cheeze;
    }

    public void setSouce(Chef.Souce souce) {
        this.souce = souce;
    }

    public void setComponents(Collection<String> components) {
        this.components = components;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough = " + dough +
                ", cheeze = " + cheeze +
                ", souce = " + souce +
                ", components = " + components +
                '}';
    }
}
abstract class PizzaBuilder{
    protected Pizza pizza;

    public Pizza getPizza(){
        return pizza;
    }
    public void createNewPizza(){
        pizza = new Pizza();
    }
    public abstract void buildCheeze();
    public abstract void buildSouce();
    public abstract void buildDough();
    public abstract void buildComponents();
}
/* Теперь нам нужно предоставить имплементацию построителя тобишь конкретный Builder */
class Cook extends PizzaBuilder{

    @Override
    public void buildCheeze() {
        pizza.setCheeze(Chef.Cheeze.PARMESAN);
    }

    @Override
    public void buildSouce() {
        pizza.setSouce(Chef.Souce.TERIYAKI);
    }

    @Override
    public void buildDough() {
        pizza.setDough(Chef.Dough.SLIM);
    }

    @Override
    public void buildComponents() {
        Collection<String> components = new TreeSet<>();
    }
}