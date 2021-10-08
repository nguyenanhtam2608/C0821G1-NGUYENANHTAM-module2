package Bai_6_Inheritance.BaiTap;

public class Point {
    private float x = 0f;
    private float y = 0f;

    Point() {
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

    public void setY(float y) {
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

class MoveablePoint extends Point {
    private float xSpeed = 0f;
    private float ySpeed = 0f;

    MoveablePoint() {
    }

    MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed() {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] array = new float[2];
        array[0] = getxSpeed();
        array[1] = getySpeed();
        return array;
    }

    @Override
    public String toString() {

        return super.toString() + "\t" +
                "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public MoveablePoint move() {
        this.setX(super.getX() + getxSpeed());
        this.setY(super.getY() + getySpeed());
        return this;
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);


        point = new Point(5, 6);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(6, 6, 8, 9);
        System.out.println(moveablePoint);

        System.out.println("Move :  " + moveablePoint.move());


    }
}