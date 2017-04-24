package homework.lesson16.factory;

/**
 * Created by SLimZik on 21.04.2017.
 */
public class Japan extends CarFactory {
    private static Japan instance;

    private Japan(){
    }

    public static CarFactory getInstance(){
       if (instance == null)
           instance = new Japan();

       return instance;
    }

    @Override
    Car createCar() {
        return new Toyota();
    }
}
