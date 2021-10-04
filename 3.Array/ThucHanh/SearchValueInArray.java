import java.util.Scanner;

public class SearchValueInArray {
    public static void main(String[] args) {

        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên học sinh ");

        String input_name = input.nextLine();// Tạo một biến mới tên là input_name có giá trị người dùng nhập vào;

        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí sinh viên trong danh sách " + input_name + " là : " + i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy " + input_name + " Trong danh sách ");
        }
    }
}
