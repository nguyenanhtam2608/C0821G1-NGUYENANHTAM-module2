import java.util.Scanner;

public class DisplayImage {// hiển thị hình ảnh

    public static void main(String[] args) {
        int row;
//      int col;
        int i;
        int j;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập dòng ");
        row = input.nextInt();
//
//        System.out.println("Nhập cột ");
//        col = input.nextInt();
        // hình chữ nhật
//        for ( i = 0; i < row ; i++){//số dòng
//            System.out.print("*");
//            for (  j = 0; j < col ;j++){//số cột
//                System.out.print("*");
//            }
//            System.out.print("\n"); // xuống dòng khi kết thúc 1 cột
//        }

        // tam giác vuông, có cạnh góc vuông ở botton-left
//        for (i = 0; i < row; i++) {// số dòng
//            System.out.print("*");
//            for (j = 0; j < i; j++) {//j<i
//                System.out.print("*");
//            }
//            System.out.print("\n"); //xuống dòng
//        }


        //tam giác vuông, có cạnh góc vuông ở top-left
//        for (i = 0; i <= row; i++) {
//            System.out.print("*");
//            for (j = row; j > i; j--) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }


        // in hình tam giác cân
        for (i = 0; i < row; i++) {
            for (j = row; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
