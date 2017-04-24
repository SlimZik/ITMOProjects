package homework.lesson16.factory;

/**
 * Created by SLimZik on 21.04.2017.
 */
public class Russia extends CarFactory {
    private static Russia instance;

    private Russia() {}

    public static CarFactory getInstance() {
        if (instance == null)
            instance = new Russia();

        return instance;
    }

    @Override
    Car createCar() {
        return new Vaz();
    }
}
