package bai_16_binary_file.baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //phương thức writeToFile trong hàm main để ghi danh sách thông tin sản phẩm trên ra file có tên là product.txt;
    public static void writeToFile(String path, List<Product> productList) {
        try {
            //Java FileOutputStream là một output stream được sử dụng để ghi dữ liệu vào một file theo định dạng byte (byte stream).
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            //Lớp ObjectOutputStream trong java được sử dụng để ghi các kiểu dữ liệu nguyên thuỷ và các đối tượng Java vào một OutputStream.
            // Chỉ có các đối tượng implements giao tiếp java.io.Serializable mới có thể được ghi vào stream.
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);// ghi theo kiểu đối tượng
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //hương thức readDataFromFile(String path) trong lớp Main để lấy ra danh sách Thông tin sản phẩm  đang có trong file product.txt
    public static List<Product> readToFile(String path) {
        List<Product> productList = new ArrayList<>();

        try {
            //Lớp FileInputStream trong java đọc được các byte từ một input file.
            // Nó được sử dụng để đọc dữ liệu theo định dạng byte (các byte stream)
            FileInputStream fileInputStream = new FileInputStream(path);
            //Lớp ObjectInputStream trong java được sử dụng để đọc các đối tượng
            // và dữ liệu nguyên thủy mà được ghi bằng việc sử dụng lớp ObjectOutputStream.
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();// ép sáng kiểu List<Product>
            fileInputStream.close();// đóng file
            objectInputStream.close();// đóng file
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return productList;
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Bánh", "CoSy", 10000));
        productList.add(new Product(2, "kẹo", "Dừa", 12000));
        productList.add(new Product(3, "nước ngọt", "CoCaCoLa", 14000));
        productList.add(new Product(4, "sữa", "Vinamilk", 16000));
        productList.add(new Product(5, "cà phê", "Trung Nguyên", 18000));
        // ghi vào trong file product.txt bởi productList
        writeToFile("D:\\Inteillj_idea\\Module__2\\src\\bai_16_binary_file\\baitap\\product.txt", productList);
        List<Product> productListOne = readToFile("D:\\Inteillj_idea\\Module__2\\src\\bai_16_binary_file\\baitap\\product.txt");
        // đọc file product.txt
        for (Product product : productListOne) {
            System.out.println(product);
        }
        System.out.println("Nhập Tên sản phẩm bạn muốn tìm kiếm");
        Scanner input = new Scanner(System.in);
        String nameProducts = input.nextLine();
        for (int i =0;i< productList.size();i++){
            if(nameProducts.equals(productList.get(i).getNameProduct())){
                System.out.println(productList.get(i));
            }
        }

    }
}
