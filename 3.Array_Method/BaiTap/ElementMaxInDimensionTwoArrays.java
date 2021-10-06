package bai_3_ArrayMethod.baitap;

import java.util.Scanner;

public class ElementMaxInDimensionTwoArrays {// phần tử max trong mảng 2 chiều

    public static void main(String[] args) {
        // khai báo số dòng và số cột của ma trận
        int row = 0;
        int col = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số dòng của ma trận ");
        row = input.nextInt();

        System.out.println("Nhập số cột của ma trận ");
        col = input.nextInt();
        // khai báo ma trận A có row dòng, col cột
        int array[][] = new int[row][col];
        System.out.println("Nhập các phần tử trong mảng ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                array[i][j] = input.nextInt();
            }
        }
        // tìm phần tử có giá trị lớn nhất trong ma trận
        // giả sử phần tử tại vị trí (0,0) là phần tử lớn nhấ
        int max = array[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("max : " + max);
    }
}