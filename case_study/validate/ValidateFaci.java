package case_study.validate;

import java.util.Scanner;

public class ValidateFaci {
    static Scanner input = new Scanner(System.in);

    public static String name() {
        String name = null;
        do {
            System.out.println("Nhập tên dịch vụ ");
            System.out.println(" dịch vụ bao gồm : villa , house, room");
            name = input.nextLine();
        } while (!name.equals("Villa") && !name.equals("Room") && !name.equals("House"));
        return name;
    }

    public static double area() {
        double area = 0;
        do {
            System.out.println("Nhập diện tích sử dụng (>30 mét vuông) ");
            area = Double.parseDouble(input.nextLine());
        } while (area <= 30);
        return area;
    }

    public static double costToRent() {
        double costToRent = 0;
        do {
            System.out.println("Nhập chi phí thuê");
            costToRent = Double.parseDouble(input.nextLine());
        } while (costToRent <= 0);
        return costToRent;
    }

    public static int maxPerson() {
        int max = 0;
        do {
            System.out.println("Nhập số người (>0 && <20)");
            max = Integer.parseInt(input.nextLine());
        } while (max < 0 || max > 20);
        return max;
    }

    public static String rentStyle() {
        String rentStype = null;
        do {
            System.out.println("Nhập kiểu thuê( (bao gồm thuê theo năm, tháng, ngày, giờ)");
            rentStype = input.nextLine().toLowerCase();
        } while (!rentStype.equals("giờ") && !rentStype.equals("ngày") && !rentStype.equals("tháng") && !rentStype.equals("năm"));
        return rentStype;
    }

    public static String roomStandard() {
        String roomStandard = null;
        do {
            System.out.println("Nhập tiêu chuẩn phòng( 3* - 4* -5*)");
            roomStandard = input.nextLine();
        } while (!roomStandard.equals("3*") && !roomStandard.equals("4*") && !roomStandard.equals("5*"));
        return roomStandard;
    }

    public static double poolArea() {
        double poolArea = 0;
        do {
            System.out.println("Nhập diện tích hồ bơi (>30 mét vuông)");
            poolArea = Double.parseDouble(input.nextLine());
        } while (poolArea <= 30);
        return poolArea;
    }

    public static int numberOfFloors() {
        int numberOfFloors = 0;
        do {
            System.out.println("Nhập số tầng ");
            numberOfFloors = Integer.parseInt(input.nextLine());
        } while (numberOfFloors <= 0);
        return numberOfFloors;
    }
    public static String serviceFree(){
        String serviceFree = null;
        do {
            System.out.println("Nhập dịch vụ miễn phí (Dịch vụ free : chỗ để xe )");
            serviceFree = input.nextLine().toLowerCase();
        }while (!serviceFree.equals("chổ đễ xe"));
        return serviceFree;
    }
}