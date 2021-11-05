package case_study.validate;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateCus {

    private static final String BIRTH_DAY = "^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$";
    private static final String PHONE = "^[0-9&&[0]]{1}\\d{9}$";
    private static final String EMAIL = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
    private static final String CMND = "^[0-9]{9}$";
    static Scanner input = new Scanner(System.in);

    public static String birthday() {
        String birth = null;
        try {
            System.out.println("Nhập ngày tháng năm sinh theo định dạng dd-mm-yyyy hoặc dd/mm/yyyy");
            birth = input.nextLine();
            while (!Pattern.matches(BIRTH_DAY, birth)) {
                System.out.println("Nhập ngày tháng năm sinh theo định dạng dd-mm-yyyy hoặc dd/mm/yyyy");
                birth = input.nextLine();
            }
        } catch (Exception e) {
            System.err.println("Định dạng sai");
        }
        return birth;
    }

    public static String phone() {
        String phone = null;
        try {
            System.out.println("Nhập số điện thoại");
            phone = input.nextLine();
            while (!Pattern.matches(PHONE, phone)) {
                System.out.println("Nhập số điện thoại");
                phone = input.nextLine();
            }
        } catch (Exception e) {
            System.err.println("Sai Format");
        }
        return phone;
    }
    public static String cmnd(){
        String cmnd = null;
        try {
            System.out.println("Nhập cmnd");
            cmnd = input.nextLine();
            while (!Pattern.matches(CMND,cmnd)){
                System.out.println("Nhập cmnd");
                cmnd = input.nextLine();
            }
        }catch (Exception e){
            System.err.println("Lỗi format ");
        }
        return cmnd;
    }

    public static String email() {
        String email = null;
        try {
            System.out.println("Nhập email của bạn");
            email = input.nextLine();
            while (!Pattern.matches(EMAIL, email)) {
                System.out.println("Nhập email của bạn");
                email = input.nextLine();
            }
        } catch (Exception e) {
            System.err.println("Sai Format !!");
        }
        return email;
    }

    public static String customerType() {
        String type = null;
        do {
            System.out.println("Nhập loại khách hàng");
            System.out.println("Loại Customer bao gồm: (Diamond, Platinium, Gold, Silver, Member");
            type = input.nextLine().toLowerCase();
        } while (!type.equals("diamond") && !type.equals("latinium") && !type.equals("gold") && !type.equals("silver") && !type.equals("member"));
        return type;
    }
}