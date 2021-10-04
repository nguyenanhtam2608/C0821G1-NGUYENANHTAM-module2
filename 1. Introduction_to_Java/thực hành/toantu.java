import java.util.Scanner;

public class toantu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhập width : ");
        width = input.nextFloat();
        System.out.println("Hãy nhập Height : ");
        height = input.nextFloat();
        float area = width * height;
        System.out.println("Area ís : " +area);
    }
}
