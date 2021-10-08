package Bai_6_Inheritance.ThucHanh;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {//display
        return " A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? " filles " : " not filled ");
    }
}

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
    public String toString(){
        return "A Circle with radius="
                + getRidius()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5,"indigo ", false);
        System.out.println(circle);
    }
}



