package homework.lesson16.factory;

/**
 * Created by SLimZik on 21.04.2017.
 */
public class Germany extends CarFactory {
    private static Germany instance;

    private Germany() {
    }

    public static CarFactory getInstance() {
        if (instance == null)
            instance = new Germany();

        return instance;
    }

    @Override
    Car createCar() {
        return new BMW();
    }
}