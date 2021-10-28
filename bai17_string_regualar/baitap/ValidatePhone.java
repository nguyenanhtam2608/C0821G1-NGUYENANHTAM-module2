package bai17_string_regualar.baitap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    public static void main(String[] args) {
        try {
            while (true) {
                final String PHONE = "^\\d{2}[.-]{1}[0-9&&[0]]{1}\\d{9}$";
                Scanner input = new Scanner(System.in);
                System.out.println("Nhập số điện thoại muốn kiểm tra");
                String phone = input.nextLine();
                Pattern pattern = Pattern.compile(PHONE);
                Matcher matcher = pattern.matcher(phone);
                boolean check = matcher.matches();
                System.out.println(phone + ": " + check);
            }
        }catch (Exception e){
            System.out.println("Nhập Sai");
        }
    }
}
