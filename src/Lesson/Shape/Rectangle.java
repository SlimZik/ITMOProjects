package Lesson.Shape;

/*   */


public class Rectangle extends Shape{
    protected int a;
    protected int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getPerimeter (){
        return (a + b) * 2;
    }
    public int getArea (){
        return a+ b;
    }
}
