package bai_4_OOP.Baitap;


import java.util.Scanner;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed = SLOW;
    boolean on = true;
    double radius = 5;
    String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {// khởi tạo đối tượng không tham số
    }

    public String toString() {
        if (this.on == true) {
            System.out.println("Tốc độ " + speed);
            System.out.println("Color " + color);
            System.out.println("Radius " + radius);
            System.out.println("Fan is On ");
        } else {
            System.out.println("Color : " + color);
            System.out.println("Radius : " + radius);
            System.out.println("Fan is off ");
        }
        return " ";
    }
    public static void main(String[] args) {
        System.out.println("Các thông tin của Fan :");

        Fan fan = new Fan();
        fan.toString();

    }
}
