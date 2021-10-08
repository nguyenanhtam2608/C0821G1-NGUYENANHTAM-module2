package Bai_6_Inheritance.BaiTap;

import java.util.Date;

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