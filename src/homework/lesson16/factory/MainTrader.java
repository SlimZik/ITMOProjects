package homework.lesson16.factory;

/**
 * Created by SLimZik on 21.04.2017.
 */
public class MainTrader {
    public static void main(String[] args) throws Exception{
        //Germany ger = (Germany) Germany.getFactory("Canada");  // Вылетит Exception: Вы ошиблись регионом
        Car car1 = CarFactory.getFactory("Germany").createCar();
        Car car2 = CarFactory.getFactory("Japan").createCar();


       // System.out.println(ger);
        System.out.println(car1);
        System.out.println(car2);
    }
}
