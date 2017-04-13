package othertask.classes;

/* Наследование */

class Point3D extends Point2D {
        private int z;

        Point3D() {
        }

        Point3D(int x, int y, int z) {
            super(x, y);
            this.z = z;
        }
    }
