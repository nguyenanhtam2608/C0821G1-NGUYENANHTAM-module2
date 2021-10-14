package bai_3_array_method.thuchanh;

import java.util.Scanner;

public class ConvertTemperature {//Chuyển đổi nhiệt độ

    public static double celsiusToFahrenheit(double celsius) {// chuyển đổi độ c sang f
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double fahrenheit;// độ F
        double celsius;// Đô C;
        int choice;// lựa chọn F hoặc C;
        do { // Hiển thị Mênu phía dưới l
            System.out.println("Menu .");
            System.out.println("1. F => C ");
            System.out.println("2. C => F ");
            System.out.println("0. thoát");
            System.out.println("Nhập lựa chọn của bạn ");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Nhập độ F");
                    fahrenheit = input.nextDouble();
                    System.out.println("Relust F => C : " + fahrenheitToCelsius(fahrenheit));// kết quả đưuọc tính ở phần đầu trên 'main'
                    break;
                }
                case 2: {
                    System.out.println("Nhập độ C");
                    celsius = input.nextDouble();
                    System.out.println("Result C => F : " + celsiusToFahrenheit(celsius));
                    break;
                }
//                case 0: {
//                    System.exit(0);// thoát khỏi chương trình không làm bất cứ việc gì nữa;
//                }
            }

        } while (choice != 0);//Nếu choise bằng 0 sẽ thoát, fasle sẽ thoát ;
        // nếu choise khác 0 sẽ lặp tiếp, true sẽ lặp
    }
}