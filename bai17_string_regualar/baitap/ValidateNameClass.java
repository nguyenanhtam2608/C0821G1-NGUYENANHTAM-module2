package bai17_string_regualar.baitap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {

    public static void main(String[] args) {

            try {
                while (true) {
                    final String FORMAT_NAME_CLASS = "^[A-Z&&[CAP]]{1}\\d{4}[A-Z&&[GHIKLM]]{1}$";
                    System.out.println("Nhập tên lớp học");
                    Scanner input = new Scanner(System.in);
                    String nameClass = input.nextLine();
                    // Tạo đối tượng Pattern thông qua method tĩnh.
                    Pattern pattern = Pattern.compile(FORMAT_NAME_CLASS);
                    // Lấy ra đối tượng Matcher
                    Matcher matcher = pattern.matcher(nameClass);
                    // Kiểm tra có khơp với regex không
                    boolean check = matcher.matches();
                    System.out.println(nameClass + ": " + check);
                    System.out.println();
                }
            } catch (Exception e) {
                System.err.println("Sai");
            }
    }
}
