package bai_3_ArrayMethod.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Nhập kích thước mảng ");
            size = input.nextInt();

        } while (size < 0);

        int[] array = new int[size];
        System.out.println("Nhập phần tử cho mảng : ");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Phần tử thứ " + i + " : " + "\t");
            array[i] = input.nextInt();
        }
        System.out.println("Nhập số cần thêm vào mảng");
        int addNumberX = input.nextInt();

        System.out.println("Nhập vị trí cần chèn giá trị X");
        int index = input.nextInt();

        if (index < 0 || index > array.length  ) {
            System.out.println("Không chèn được!!");
        }

        int sizeNew = size + 1;// tạo 1 size mới bằng size của mảng cũ +1;
        int[] arrayNew = new int[sizeNew]; // tạo mảng mới có kích thước size +1

        for (int i = 0; i <= array.length; i++) {// duyệt mảng array[i] để
            arrayNew[i] = array[i]; // gán giá trị mảng array[i] cho mảng arrayNew[i]
            if (i == index) { // i(index mảng array) = index arrayNew thì
                arrayNew[i] = addNumberX;// gán giá trị tại vị trí i trong mảng arrayNew cho phần tử X nhập vào ;
                break;
            }
        }
        for(int i = index+1;i<array.length;i++){// duyệt mảng từ vị trí phía sau phần tử mới đc thêm vào đến cuối mảng
            // để in ra các phần tử còn lại phía sau mảng
            arrayNew[i]=array[i -1]; // in ra các phần tử còn lại phía sau mảng
        }
        for( int i = 0 ; i<arrayNew.length;i++){// duyệt mảng để in ra các phần tử trong mảng mới
            System.out.print(arrayNew[i] + "\t");
        }
    }
}
