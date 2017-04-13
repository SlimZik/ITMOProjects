package homework.lesson5.shape;

/**/

public class Circle implements Shape {
    private int r;
    public Circle(int r){
        this.r = r;
    }

    public int getPerimeter(){
        return (int)(2 * Math.PI * r);
    }

    public int getArea (){
        return (int)(Math.PI * (r * r));
    }
}