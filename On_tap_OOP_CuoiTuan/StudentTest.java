package on_tap_oop_cuoituan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        System.out.println("Phần mền quản lí sinh viên");
        System.out.println("1 Thêm mới 1 sinh viên và Xem danh sách sinh viên");
        System.out.println("2 Sửa thông tin một sinh viên trong danh sách");
        System.out.println("3 Xóa sinh viên ra khỏi danh sách");
        System.out.println("4 Kiểm tra mã sinh viên");
        System.out.println("5 Hiển thị thông tin sinh viên");
        System.out.println("6 Sắp xếp sinh viên theo ");
        System.out.println("----Mời bạn chọn----");

        Scanner input = new Scanner(System.in);
        Student student = new Student(5, "Tâm", "quảng Nam", 8);
        Student student1 = new Student(4, "Hằng", "quảng Nam", 9);
        Student student2 = new Student(3, "Thuận", "quảng Nam", 10);


        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);


        int quantity;
        int index;
        int option;
        do {
            System.out.println("Enter option");
            option = Integer.parseInt(input.nextLine());
            switch (option) {

                case 1: {
                    do {
                        System.out.println("nhập số lượng phần tử muốn thêm");
                        quantity = Integer.parseInt(input.nextLine());
                        if (quantity > 0) {
                            for (int i = 0; i < quantity; i++) {
                                System.out.println("Enter id");
                                int id = Integer.parseInt(input.nextLine());
                                System.out.println("Enter name");
                                String name = input.nextLine();
                                System.out.println("Enter address");
                                String address = input.nextLine();
                                System.out.println("Enter point");
                                double point = Double.parseDouble(input.nextLine());
                                students.add(new Student(id, name, address, point));
                            }
                        }
                        System.out.println(students);
                    } while (quantity <= 0);
                    break;
                }
                case 2: {
                    do {

                        System.out.println("Enter index edit");
                        index = Integer.parseInt(input.nextLine());
                        if (index >= 0 && index <= students.size()) {
                            students.remove(index);
                            System.out.println("Enter the information you want to edit");
                            System.out.println("Enter id");
                            int id = Integer.parseInt(input.nextLine());
                            System.out.println("Enter name");
                            String name = input.nextLine();
                            System.out.println("Enter address");
                            String address = input.nextLine();
                            System.out.println("Enter point");
                            double point = Double.parseDouble(input.nextLine());
                            Student student3 = new Student(id, name, address, point);
                            students.add(index, student3);
                            System.out.println("Your information is changed to");
                            System.out.println(students);
                        }
                    } while (index < 0 || index > students.size());
                    break;
                }
                case 3: {
                    do {
                        System.out.println("Enter the location you want to delete ");
                        index = Integer.parseInt(input.nextLine());
                        if (index >= 0 && index <= students.size()) {
                            students.remove(index);
                            System.out.println(students);
                        }
                    } while (index < 0 || index > students.size());
                    break;
                }
                case 4: {
                    System.out.println("Enter the student code you want to check");
                    int idStudentTest = Integer.parseInt(input.nextLine());
                    for (int i = student.getIdStudent(); i <= student2.getIdStudent(); i++) {
                        if (idStudentTest == i) {
                            System.out.println("True");
                        } else {
                            System.out.println("False");
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("Enter the idstudent code you want to check");
                    int idStudentTest = Integer.parseInt(input.nextLine());
                    for (int i = student.getIdStudent(); i <= student2.getIdStudent(); i++) {
                        if (idStudentTest == i) {
                            System.out.println(students.get(i - 1));
                        } else {
                            throw new IllegalArgumentException("Error idStudent : " + idStudentTest);
                        }
                    }
                }
                case 6: {

                    System.out.println("Do you want to sort ascending or descending?");
                    int enter;
                    do {
                        System.out.println("Enter 1 for ascending sort");
                        System.out.println("Enter 2 for descending sort");
                        enter = input.nextInt();
                    } while (enter != 1 && enter != 2);

                    if (enter == 1) {
                        students.sort(Comparator.comparingDouble(Student::getPoint));// sắp xếp tắng dần
                        System.out.println(students);
                    }
                    if (enter == 2) {
                        students.sort(Comparator.comparing(Student::getPoint).reversed());// sắp xếp giảm dần = đảo ngược tăng dần
                        System.out.println(students);
                    }
                }
            }
        } while (option < 1 || option > 6);
    }
}


