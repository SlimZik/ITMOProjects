package homework.lesson17.listener;

/* Ядерный реактор Убежища "13" с исправным водяным чипом */

import java.util.ArrayList;
import java.util.List;

public class NuclearStation {
    public static void main(String[] args) {
        TemperatureSensor tempData = new TemperatureSensor();

        NuclearReactor reactor = new NuclearReactor(tempData);

        tempData.setCurrentTemp((float) Math.round(80f + (Math.random() * 250)));
    }
}

interface Sensor {                                                                                                      // Интерфейс Observer
    void update (float temperature);
}

interface Observable {                                                                                                  // Интерфейс Observable
    void registerObserver(Sensor o);
    void removeObserver(Sensor o);
    void notifyObservers();
}

class TemperatureSensor implements Observable {                                                                         // Температурный сенсор
    private List<Sensor> observers;
    private float temperature;

    public TemperatureSensor() {
        observers = new ArrayList<>();

    }

    @Override
    public void registerObserver(Sensor o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Sensor o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Sensor observer : observers)
            observer.update(temperature);
    }

    public void setCurrentTemp(float temperature) {
        this.temperature = temperature;

        notifyObservers();
    }
}

class NuclearReactor implements Sensor {                                                                                // Реактор
    private float temperature;
    private TemperatureSensor temperatureSensor;

    public NuclearReactor(TemperatureSensor weatherData) {
        this.temperatureSensor = temperatureSensor;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature) {                                                                             /* Изменение информации с последующим
                                                                                                                        выводом в консоль*/
        this.temperature = temperature;
                if (temperature < 100)
            System.out.printf("Значение температуры реактора: %.1f градусов цельсия. Реактор стабилен!\n", temperature);
        if (temperature >= 100 && temperature < 150)
            System.out.printf("Внимание персоналу!!! Значение температуры реактора: %.1f градусов цельсия! Уровень тревоги "
                    + (char)27 + "[32m\"ЗЕЛЁНЫЙ\"\n", temperature);
        if (temperature >= 150 && temperature < 200)
            System.out.printf("Внимание персоналу!!! Значение температуры реактора: %.1f градусов цельсия! Уровень тревоги "
                    + (char)27 + "[33m\"ЖЕЛТЫЙ\"\n", temperature);
        if (temperature >= 200)
            System.err.printf("Внимание персоналу!!! Значение температуры реактора: %.1f градусов цельсия! Уровень тревоги "
                    + (char)27 + "[31m\"КРАСНЫЙ\" Инициализация протокола эвакуации...!!!\n", temperature);
    }
}