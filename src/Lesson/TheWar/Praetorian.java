package Lesson.TheWar;

/* Преторианцы */

public class Praetorian extends Soldier {

    Praetorian() {
        // Обязательный вызов конструктора
        // суперкласса.
        super(150, 200);
    }

    // Реализуется абстрактный метод
    // суперкласса.
    @Override
    public void attack(Soldier enemy) {
        enemy.health -= attackScore;

        if (enemy.isAlive())
            health -= enemy.attackScore;
    }
}
