package bai_6_inheritance.baitap;

class Cylinder extends Circle {
    private double height = 10;

    Cylinder() {
    }

    Cylinder(double height) {
        this.height = height;
    }

    Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.area * this.height;
    }

    public String toString() {

        return "Hình trụ : màu sắc " + getColor() + " bán kính  " + getRadius() + " Chiều cao " + getHeight() + " Diện tích đáy  " + getArea() + " Thể tích " + getVolume() + "\n" +
                super.toString();

    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(40);
        System.out.println(cylinder);

    }
}