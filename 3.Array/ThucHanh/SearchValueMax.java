import java.util.Scanner;

public class SearchValueMax {
    public static void main(String[] args) {
        int sizeArray;
        int[] array;// chưa khởi tạo giá trị thì giá trị sẽ là null;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập vào kích thước của mảng");
            sizeArray = input.nextInt();
            if (sizeArray > 20) {
                System.out.println("Nhập lại kích thước !!!");
            }
        } while (sizeArray > 20);// điều kiện dừng lại;
        array = new int[sizeArray];
        int i = 0;// khai báo i = 0 để dùng trong while;
        while (i < array.length) {
            System.out.println("Nhập phần tử " + (i + 1) + " : ");// Display " Nhập phần tử từ i = 1 đên phần tử cuối "
            array[i] = input.nextInt();// nhập phần tử vào vào mảng 'array'
            i++;
        }
        System.out.print("Danh sách các phần tử trong mảng : ");

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");// in ra các phần tử trong mảng array va "\t" Tạo 1 kí tự trống(khoảng trắng);
        }
        int max = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;// vị trí lớn nhất sẽ bằng "index + 1 "
            }
        }
        System.out.println(" ");
        System.out.println("Giá trị lớn nhất trong mảng là: " + max+ " Có vị trí là : " + index );
    }
}
