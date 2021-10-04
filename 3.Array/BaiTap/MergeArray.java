import java.util.Scanner;

public class MergeArray {// Gộp mảng
    public static void main(String[] args) {
        int[] arrayA = new int[5];
        int[] arrayB = new int[10];
        int[] arrayC = new int[10];
        Scanner input = new Scanner(System.in);


        System.out.println("Nhập phần từ mảng A :");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print("Phần tử thứ " + i + " \t");
            arrayA[i] = Integer.parseInt(input.nextLine());
            arrayC[i] = arrayA[i];
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arrayA[i] + "\t");
        }

        System.out.println(" ");
        System.out.println("Nhập phần từ mảng B:");
        for (int i = 5; i < arrayB.length; i++) {
            System.out.print("Phần tử thứ " + i + " \t");
            arrayB[i] = Integer.parseInt(input.nextLine());
            arrayC[i] = arrayB[i];
        }
        for (int i = 5; i < 10; i++) {
            System.out.print(arrayB[i] + "\t");
        }
        System.out.println(" ");
        System.out.println(" ");

        for (int i = 0; i < 10; i++) {
            System.out.print(arrayC[i] + "\t");

        }
    }
}
