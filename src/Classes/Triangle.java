package Classes;

public class Triangle {
    Point2D point1;
    Point2D point2;
    Point2D point3;

    public Triangle() {
    }

    public Triangle(Point2D point1, Point2D point2, Point2D point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public void draw() {
        System.out.printf("Drawing triangle on %s %s, %s %s and %s %s\n", point1.x, point1.y, point2.x, point2.y, point3.x, point3.y);
    }

    public String getName() {
        return "Triangle";
    }
}
