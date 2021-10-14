package bai_6_inheritance.thuchanh;

class Circle extends Shape {// lớp hình tròn
    private double ridius = 1.0;

    public Circle() {
    }

    public Circle(double ridius) {
        this.ridius = ridius;
    }

    public Circle(double ridius, String color, boolean filled) {
        super(color, filled);//ké thừa thuộc tính color và filled của lớp cha;
        this.ridius = ridius;

    }

    public double getRidius() {
        return ridius;
    }

    public void setRidius(double ridius) {
        this.ridius = ridius;
    }

    public double getArea() {
        return ridius * ridius * Math.PI;
    }

    public double GetPerimeter() {
        return ridius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRidius()
                + ", which is a subclass of "
                + super.toString();
    }

}
