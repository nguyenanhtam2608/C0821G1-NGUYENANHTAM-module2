package case_study.services;

public interface ContactService extends Service{

    @Override
    void returnMainMenu();

    void displayListCustomersUseService();// Hiển thị danh sách khách hàng sử dụng dịch vụ

    void displayListCustomersgetvoucher();// Hiển thị danh sách khách hàng nhận được voucher

}
