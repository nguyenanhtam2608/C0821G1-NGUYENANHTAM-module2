package bai_6_inheritance.baitap;

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

