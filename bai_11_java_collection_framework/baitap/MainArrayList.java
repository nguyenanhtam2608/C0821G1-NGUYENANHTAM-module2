package bai_11_java_collection_framework.baitap;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainArrayList {

    public static void main(String[] args) {
        System.out.println("Hệ thống quản lí bán hàng");
        System.out.println(
                "1-Thêm sản phẩm\n" +
                        "2-Sửa thông tin sản phẩm theo id\n" +
                        "3-Xoá sản phẩm theo id\n" +
                        "4-Hiển thị danh sách sản phẩm\n" +
                        "5-Tìm kiếm sản phẩm theo tên\n" +
                        "6-Sắp xếp sản phẩm tăng dần, giảm dần theo giá");


        ArrayList arrayList = new ArrayList();
        Scanner input = new Scanner(System.in);
        arrayList.addProduct(new Product(1, "cafe", 10000));
        arrayList.addProduct(new Product(2, "trái cây", 20000));
        arrayList.addProduct(new Product(3, "bánh", 15000));


        int option;

        do {
            System.out.println("-------------Enter option---------------");
            option = Integer.parseInt(input.nextLine());
            switch (option) {
                case 1: {
                    System.out.println("Nhập Id");
                    int id = Integer.parseInt(input.nextLine());
                    System.out.println("Nhập tên");
                    String name = input.nextLine();
                    System.out.println("Nhập Giá trị ");
                    double value = Double.parseDouble(input.nextLine());
                    arrayList.addProduct(new Product(id, name, value));
                    for (Product product : arrayList.getProduct()) {
                        System.out.println(product);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Nhập Id");
                    int id = Integer.parseInt(input.nextLine());
                    System.out.println("Nhập tên");
                    String name = input.nextLine();
                    System.out.println("Nhập Giá trị ");
                    double value = Double.parseDouble(input.nextLine());
                    arrayList.updateProduct(new Product(id, name, value));
                    for (Product product : arrayList.getProduct()) {
                        System.out.println(product);
                    }
                    break;
//                    //Sửa thông tin sản phẩm theo id
//                    public void updateProduct(Product product) {
//                        // kiểm tra xem xem product có tồn tại trong list hay chưa?
//                        int index = products.indexOf(product);muốn ử dụng indexOf phải cài đặt equals;
//                        //indexOf sẽ trả về -1 nếu có không trong list
//
//                        if (index == -1) {// nếu không có trong list thì sẽ thêm vào list
//                            products.add(product);
//                        } else {// nếu có sẽ tiền hành chỉnh sửa list thông qua phương thức set
//                            products.set(index, product);
//                        }
                }
                case 3: {
                    System.out.println("Nhập Id");
                    int id = Integer.parseInt(input.nextLine());
                    System.out.println("Nhập tên");
                    String name = input.nextLine();
                    System.out.println("Nhập Giá trị ");
                    double value = Double.parseDouble(input.nextLine());
                    arrayList.deleteProduct(new Product(id, name, value));
                    for (Product product : arrayList.getProduct()) {
                        System.out.println(product);
                    }
                    break;
                }
                case 4: {
                    for (Product product : arrayList.getProduct()) {
                        System.out.println(product);
                    }
                    break;
                }
                case 5: {
                    System.out.println("Nhập Id");
                    int id = Integer.parseInt(input.nextLine());
                    System.out.println("Nhập tên");
                    String name = input.nextLine();
                    System.out.println("Nhập Giá trị ");
                    double value = Double.parseDouble(input.nextLine());

                    System.out.println(arrayList.searchProduct(new Product(id, name, value)));
                    break;
                }
                case 6: {
                    System.out.println("Sắp xếp tăng dần theo giá trị ");
                    Collections.sort(arrayList.getProduct(), new SortArrayListAscending());
                    for (Product product : arrayList.getProduct()) {
                        System.out.println(product);
                    }
                    System.out.println("Sắp xếp theo thứ tự giảm dần");
                    Collections.sort(arrayList.getProduct(), new SortArrayListDecrease());
                    for (Product product : arrayList.getProduct()) {
                        System.out.println(product);
                    }

                }
            }
        }
        while (option < 0 || option > 6);
    }
}



