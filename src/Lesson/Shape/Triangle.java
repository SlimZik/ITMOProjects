package Lesson.Shape;

/* Наследование */

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle() {
        if (a + b > c && a + c > b && b + c > a) {
            this.a = a;
            this.b = b;
            this.c = c;
        }else System.out.println("Такой треугольник не возможен");
    }

    public int getPerimeter() {
        return (a + b + c);
    }

    public int getArea() {
        return (int) (Math.sqrt(3) / 4 * (a * a));
    }
}


