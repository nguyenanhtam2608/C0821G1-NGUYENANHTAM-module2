package bai_5_access_modifiier.baitap;

public class Circle {
   private double radius = 1.0;
   private String color ="red";

    Circle (){// hàm khỏi tạo không tham số
   }

   Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() { // u
        return radius;
    }
    double area = 0;
      public double getArea(){
        return area;
    }
}
