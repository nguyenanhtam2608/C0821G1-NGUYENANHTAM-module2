import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        System.out.println("Nhập số tiền muốn chuyển đổi Từ USD sang VDN");
        Scanner input = new Scanner(System.in);
        int tien = input.nextInt();
        int tiGia = 23000;
        int result = (tien * tiGia);
        System.out.println("Result : " + result + "VND");
    }
}
