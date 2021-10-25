package bai_14_xception.baitap;

import java.util.Scanner;

public class Triangle {
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{//constructor tạo ném IllegalTriangleException
        if(side1+side2<side3) // nếu tổng của 2 bên nhỏ hơn bên thứ ba thì ném ngoại lệ
            throw new IllegalTriangleException("Không thuân theo Qui Tắc tam giác.");  //    ném được sử dụng để tạo một ngoại lệ mới và ném nó.

        else
            System.out.println("Tuân theo quy tắc tam Giác.");// nếu không có ngoại lệ nào xảy ra
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập canh 1");
        double side1 = Double.parseDouble(input.nextLine());
        System.out.println("Nhập canh 2");
        double side2 = Double.parseDouble(input.nextLine());
        System.out.println("Nhập canh 3");
        double side3 = Double.parseDouble(input.nextLine());

        try{

            Triangle obj = new Triangle(side1,side2,side3);/// đối tượng của lớp Triangle và gọi hàm khởi tạo
        }catch(Exception m){
            System.out.println("Exception occured: "+m);/// nếu ngoại lệ là catught thì hiển thị thông tin
        }
    }
}
class IllegalTriangleException extends Exception{// lớp ngoại lệ kế thừa lớp Ngoại lệ
    IllegalTriangleException(String s){
        super(s);  // Gọi hàm tạo của ngoại lệ cha
    }
}

