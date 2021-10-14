package bai_6_inheritance.baitap;

class MoveablePoint extends Point {
    private float xSpeed = 0f;
    private float ySpeed = 0f;

    MoveablePoint() {
        super(); //gọi lại contructor không tham số của lớp cha
    }

    MoveablePoint(float xSpeed, float ySpeed) {
        super();// gọi lại contructor không tham số của lớp cha
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

    public void setXSpeed() {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
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
        this.setX(super.getX() + getxSpeed());//cập nhật giá trị của setX
        this.setY(super.getY() + getySpeed());
        return this;// trả về đối tượng của lớp move();
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
