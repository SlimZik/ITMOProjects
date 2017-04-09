package Lesson.Classes;

/* Ещё наследование */

public class Point4D extends Point3D {
    private long time;

    public Point4D() {
    }

    public Point4D(int x, int y, int z, long time) {
        super(x, y, z);
        this.time = time;
    }
}
