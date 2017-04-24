package homework.lesson16.factory;

/**
 * Created by SLimZik on 21.04.2017.
 */
public abstract class CarFactory {                                                                                      // Абстрактный класс

    abstract Car createCar();

    public static CarFactory getFactory(String region) throws Exception {
        switch (region) {
            case "Russia":
                return Russia.getInstance();
            case "Germany":
                return Germany.getInstance();
            case "Japan":
                return Japan.getInstance();
        }
        throw new Exception("Вы ошиблись регионом!");
    }
}