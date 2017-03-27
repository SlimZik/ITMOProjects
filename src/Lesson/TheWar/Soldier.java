package Lesson.TheWar;

// Класс объявлен абстрактным при помощи
// ключевого слова abstract.
public abstract class Soldier {
    // Поля, которые доступны наследникам.
    int health;
    int attackScore;

    // Конструктор, который обязаны вызвать
    // наследники.
    Soldier(int health, int attackScore) {
        this.health = health;
        this.attackScore = attackScore;
    }

    boolean isAlive() {
        return health > 0;
    }

    // Абстрактный метод объявлен при помощи
    // ключевого слова abstract.
    public abstract void attack(Soldier enemy);
}
