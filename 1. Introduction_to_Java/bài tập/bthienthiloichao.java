import java.util.Scanner;

public class bthienthiloichao {
    public static void main(String[] args) {
        String name ;
        System.out.println("Hãy nhập tên của bạn : " );
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("Hello "+ name);
    }
}
