package bai_6_inheritance.baitap;

public class Circle {
    private Double radius = 5.0;
    private String color = " Blue";

    Circle() {

    }

    Circle(Double radius, String color) {//contructor
        this.radius = radius;
        this.color = color;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    double area = 0;

    public Double getArea() {
        return area = (this.radius * this.radius * Math.PI);
    }

    public String toString() {
        return "Hình tròn : màu sắc  " + color + " Bán kính  " + radius + "Diện tích  " + area;
    }
}

