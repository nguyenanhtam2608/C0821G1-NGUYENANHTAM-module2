package bai_6_inheritance.baitap;

public class Point {
    private float x = 0f;
    private float y = 0f;

    Point() {//
    }

    Point(float x, float y) {
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

    public void setY(float y)    {
        this.y = y;
    }

    public void setXY() {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] array = new float[2];
        array[0] = getX();
        array[1] = getY();
        return array;
    }

    @Override
    public String toString() {
        return "Point[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }
}

