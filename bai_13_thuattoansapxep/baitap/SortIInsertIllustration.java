package bai_13_thuattoansapxep.baitap;

import java.util.Scanner;

public class SortIInsertIllustration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng");
        int size = scanner.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < list.length; i++) {
            System.out.println("Nhập " + i + ":");
            list[i] = scanner.nextInt();
        }
        System.out.print("Danh sách trước");
        disPlay(list);
        System.out.println("Danh sách sau khi sắp xếp");
        insertionSortByStep(list);
    }

    public static void disPlay(int arr[]) {
        int i;
        System.out.print("[");

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]\n");
    }

    public static void insertionSortByStep(int arr[]) {
        int i;
        for (i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
//                 Đổi list[j] với list[j + 1]
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        disPlay(arr);
    }
}
