package case_study.validate_readwritefile.validate;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateBooking {
    private static final String DAY = "\\b(0?[1-9]|[12]\\d|3[01])[\\/\\-.](0?[1-9]|[12]\\d|3[01])[\\/\\-.](\\d{2}|200[5-9]|202[0-1])\\b";
    static Scanner input = new Scanner(System.in);

    public static int idBooking() {
        int id = 0;
        do {
            System.out.println("Nhập id Booking");
            id = Integer.parseInt(input.nextLine());
        } while (id <= 0);
        return id;
    }

    public static String startDay() {
        String startDay = null;
        System.out.println("Nhập ngày  bắt đầu");
        startDay = input.nextLine();
        while (!Pattern.matches(DAY, startDay)) {
            System.out.println("Nhập ngày  bắt đầu");
            startDay = input.nextLine();
        }
        return startDay;
    }

    public static String endDay() {
        String endDay = null;
        System.out.println("Nhập ngày kết thúc");
        endDay = input.nextLine();
        while (!Pattern.matches(DAY, endDay)) {
            System.out.println("Nhập ngày kết thúc");
            endDay = input.nextLine();
        }
        return endDay;
    }

    public static String idCus() {
        String id = null;

        System.out.println("Nhập id khách hàng");
        id = input.nextLine();
        while (!Pattern.matches("^[0-9]+$", id)) {
            System.out.println("Nhập id khách hàng");
            id = input.nextLine();
        }
        return id;
    }

    public static String nameSercive() {
        String name = null;
        do {
            System.out.println("Nhập tên dịch vụ ");
            System.out.println(" dịch vụ bao gồm : villa , house, room");
            name = input.nextLine();
        } while (!name.equals("Villa") && !name.equals("Room") && !name.equals("House"));
        return name;
    }

}
