package Classes;

public class ObjectsEx {
    public static void main(String[] args) {
        Drawer drawer = new Drawer(30, 20);

        drawer.draw(new Point2D(2, 3), new Point2D(16, 7));

        Line line = new Line(new Point2D(2, 3), new Point2D(16, 7));

        drawer.draw(line);

        drawer.draw(new Triangle(
                new Point2D(2, 2),
                new Point2D(2, 17),
                new Point2D(28, 17)
        ));
    }
}
