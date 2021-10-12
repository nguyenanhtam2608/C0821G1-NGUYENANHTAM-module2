package Bai_6_Inheritance.BaiTap;

class Point3D extends Point2D {
    private float z = 0f;

    Point3D() {
    }

    protected Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.getX();
        this.getY();
        this.z = z;

    }

    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = getZ();
        return arr;
    }

    public String toString() {
        return "Point3D" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + getZ() +
                '}';

    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(1, 2, 3);
        System.out.println(point3D);
        Point2D point2D = new Point2D(1, 2);
        System.out.println(point2D);

    }
}
