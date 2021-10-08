package Bai_6_Inheritance.BaiTap;

import java.util.Arrays;

public class Point2D {
    private float x = 3f;
    private float y = 1f;

    Point2D() {
    }

    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;

    }


    public float[] getXY() {// khai báo mảng
        float[] arr = new float[2];
      arr[0] = getX();
      arr[1] = getY();
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}

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

    public float [] getXYZ() {
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
        Point3D point3D = new Point3D(1,2,3);
        System.out.println(point3D);
        Point2D point2D = new Point2D(1,2);
        System.out.println(point2D);

    }
}
