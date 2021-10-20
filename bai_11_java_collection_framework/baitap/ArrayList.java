package bai_11_java_collection_framework.baitap;

import java.util.List;

public class ArrayList {
    private List<Product> products; // tạo 1 List tên là product;

    public ArrayList() {// contructor không tham số dùng dể khởi tạo 1 ArrayList
        products = new java.util.ArrayList<>();
    }

    public ArrayList(List<Product> products) {// contructor có tham số;
        this.products = products;
    }
    //getter và setter

    public List<Product> getProduct() {
        return products;
    }

    public void setProduct(List<Product> products) {
        this.products = products;
    }
    // các phương thức cần triển khai:
    //Thêm sản phẩm
    //Sửa thông tin sản phẩm theo id
    //Xoá sản phẩm theo id
    //Hiển thị danh sách sản phẩm
    //Tìm kiếm sản phẩm theo tên
    //Sắp xếp sản phẩm tăng dần, giảm dần theo giá

    //Thêm sản phẩm
    public void addProduct(Product product) {// bên trong tham số tạo một đối dượng sellingManager để thêm vào linkedlist
        products.add(product);
    }

    //Sửa thông tin sản phẩm theo id
    public void updateProduct(Product product) {
        // kiểm tra xem xem product có tồn tại trong list hay chưa?
        int index = products.indexOf(product);
        //indexOf sẽ trả về -1 nếu có không trong list, muốn ử dụng indexOf phải cài đặt equals;

        if (index == -1) {// nếu không có trong list thì sẽ thêm vào list
            products.add(product);
        } else {// nếu có sẽ tiền hành chỉnh sửa list thông qua phương thức set
            products.set(index, product);
        }
    }

    //Xoá sản phẩm theo id
    public void deleteProduct(Product product) {
        // kiểm tra xem xem product có tồn tại trong list hay chưa?
        int index = products.indexOf(product);
        //indexOf sẽ trả về -1 nếu có không trong list
        if (index == -1) {// không có sẽ thông báo lỗi
            throw new IllegalArgumentException(" ErrorDELETE" + index);
        } else {// có sẽ tiến hành xóa
            products.remove(index);

        }
    }

    //Tìm kiếm sản phẩm theo tên
    public boolean searchProduct(Product product) {
        boolean check = products.contains(product);// tạo một biến check để kiểm tra
        // phương thức contains để tìm kiếm 1 phần tử có trong list ahy không
        if (check) { // check == true thì có nghĩa là đã tìm thấy
            System.out.println("Có trong List");
        } else {// check == false có nghĩa k tìm thấy
            System.out.println("Không có trong List");
        }
        return check ; // trả về giá trị cho check
    }


}
