package bai_3_array_method.baitap;
import java.util.Scanner;

public class ValueMinInArray { // BT Min
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng phần từ trong mảng");
            size = input.nextInt();
            if (size > 20 || size <= 0) {
                System.out.println("Nhập lại !!!");
            }
        } while (size > 20);//Lớn hơn 20 thì nhập lại

        int[] arrayNumber = new int[size];

        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + "\t");
            arrayNumber[i] = input.nextInt();
        }
        int min = arrayNumber[0];
        for( int i = 0 ; i < arrayNumber.length; i++){
            if(arrayNumber[i] < min){
                min = arrayNumber[i];
            }
        }
        System.out.println("Min = " +min );
    }
}
