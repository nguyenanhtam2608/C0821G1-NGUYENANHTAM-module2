package case_study.models.person;

public class Customer extends Person {
    private String customerType;// loại khách hàng
    //Loại Customer bao gồm: (Diamond, Platinium, Gold, Silver, Member).
    private String address;// đại chỉ

    public Customer() {
    }

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(int id, String name, String birthday, String sex, String cnmd, String phone, String email, String customerType, String address) {
        super(id, name, birthday, sex, cnmd, phone, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + customerType +
                "," + address;

    }
}
