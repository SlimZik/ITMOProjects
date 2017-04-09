package HomeWork.Lesson5.Shape;

/*  */

public class Square extends Rectangle{

    public Square(int a, int b) {
        super(a, b);
        if(a != b) System.out.println("Это не квадрат!!!");
    }

    public  int getPerimeter(){
        return a * 4;
    }

    public int getArea(){
        return a * a;
    }
}