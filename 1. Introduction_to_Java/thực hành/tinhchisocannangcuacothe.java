import java.util.Scanner;

public class tinhchisocannangcuacothe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Hãy nhập cân nặng (in kilogram): ");
        weight = input.nextDouble();

        System.out.println("Hãy nhập chiều cao (in meter): ");
        height = input.nextDouble();

        bmi = weight / Math.pow(height, 2);


        if (bmi < 18.5) {
            System.out.printf("%-10.2f%s", bmi, " Underweight");
        } else if (bmi < 25.0) {
            System.out.printf("%-10.2f%s", bmi, " Normal ");
        } else if (bmi < 30) {
            System.out.printf("%-10.2f%s", bmi, " OverWeight");
        } else {
            System.out.printf("%-10.2f%s", bmi, " Obese ");
        }
    }
}
