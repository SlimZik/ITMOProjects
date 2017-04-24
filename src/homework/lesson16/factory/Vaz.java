package homework.lesson16.factory;

/**
 * Created by SLimZik on 21.04.2017.
 */
public class Vaz implements Car {
    @Override
    public boolean drive(int distance) {
        return false;
    }

    @Override
    public String toString() {
        return "Vaz - Управляй мечтой";
    }
}
