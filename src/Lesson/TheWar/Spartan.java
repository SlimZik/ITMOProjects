package Lesson.TheWar;

/* Спартанцы */


public class Spartan extends Soldier {

    Spartan() {
        // Обязательный вызов конструктора
        // суперкласса.
        super(200, 150);
    }

    // Реализуется абстрактный метод
    // суперкласса.
    @Override
    public void attack(Soldier enemy) {
        enemy.health -= attackScore * 2;

        if (enemy.isAlive())
            health -= enemy.attackScore / 2;
    }
}