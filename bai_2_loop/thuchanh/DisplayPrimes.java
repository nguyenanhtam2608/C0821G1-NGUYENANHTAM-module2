package bai_2_loop.thuchanh;
import java.util.Scanner;

public class DisplayPrimes {// hiển thị số nguyên tố đầu tiên

    public static void main(String[] args) {
        int number;
        int count = 0;// nếu là số nguyên tố sẽ +1

        System.out.println("Nhập số lượng muôn in ra ");

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        for (int n = 2; count < number; n++) {
            boolean check = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.println(n);
            }
        }
    }
}

