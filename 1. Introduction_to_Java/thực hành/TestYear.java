import java.util.Scanner;

public class TestYear { // kiểm tra năm nhuận
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.println("Hãy nhập năm bạn muốn kiểm tra ");
        year = input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Năm  " + year + " là  năm nhuận");
                } else {
                    System.out.println("Năm " + year + "Không phải năm nhuận");
                }
            }
            System.out.println("Năm " + year + "là  năm nhuận");
        } else {
            System.out.println("Năm " + year + "Không phải năm nhuận");
        }
    }
}
