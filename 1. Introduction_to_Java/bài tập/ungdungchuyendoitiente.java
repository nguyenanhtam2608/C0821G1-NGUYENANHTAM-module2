import java.util.Scanner;

public class ungdungchuyendoitiente {
    public static void main(String[] args) {
        System.out.println("Nhập số tiền muốn chuyển đổi Từ USD sang VDN");
        Scanner input = new Scanner(System.in);
        int tien = input.nextInt();
        int a = 23000;
        int result = (tien * a);
        System.out.println("Result : " + result + "VND");
    }
}
