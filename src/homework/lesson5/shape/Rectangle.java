package homework.lesson5.shape;

/*   */


public class Rectangle implements Shape{
    protected int a;
    protected int b;

    Rectangle(int a, int b) {
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