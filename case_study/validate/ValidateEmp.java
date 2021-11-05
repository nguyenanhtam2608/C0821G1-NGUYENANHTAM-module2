package case_study.validate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmp {
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

    public static String level() {
        String level = null;
        do {

            System.out.println("Nhập trình độ ");
            System.out.println("Trung cấp, Cao đẳng, Đại học và sau đại học");
            level = input.nextLine().toLowerCase();

        } while (!level.equals("trung cấp") && !level.equals("cao đẳng") && !level.equals("đại học") && !level.equals("sau đại học"));

        return level;
    }
    public static String location(){
        String location = null;
        do {
            System.out.println("Nhập vị trí ");
            System.out.println("Vị trí sẽ bao gồm: Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc");
            location= input.nextLine().toLowerCase();
        }while (!location.equals("lễ tân") && !location.equals("phục vụ") && !location.equals("chuyên viên") && !location.equals("giám sát") && !location.equals("quản lý") && !location.equals("giám đốc"));
        return location;
    }
    public static double wage(){
        double wage = 0;
        do {
            System.out.println("Nhấp số lương của bạn (Đơn vị : Triệu)");
            wage = Double.parseDouble(input.nextLine());
        }while (wage <= 0);
        return wage;
    }
}
