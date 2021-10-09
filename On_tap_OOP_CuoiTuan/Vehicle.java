package On_tap_OOP_CuoiTuan;

import java.util.Scanner;

public class Vehicle {
    private String nameCar;// tên xe
    private String companyCar; // hãng xe
    private int yearManufacture; // năm sản xuất
    private float capacity;// dung tích
    private float valueCar;// giá trị

    public Vehicle(String nameCar, String companyCar, int yearManufacture, float capacity, float valueCar) {
        this.nameCar = nameCar;
        this.companyCar = companyCar;
        this.yearManufacture = yearManufacture;
        this.capacity = capacity;
        this.valueCar = valueCar;
    }

    public Vehicle() {

    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getCompanyCar() {
        return companyCar;
    }

    public void setCompanyCar(String companyCar) {
        this.companyCar = companyCar;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public float getValueCar() {
        return valueCar;
    }

    public void setValueCar(float valueCar) {
        this.valueCar = valueCar;
    }


    @Override
    public String toString() {
        return "Vehicle : [" +
                "nameCar='" + nameCar + '\'' +
                ", companyCar='" + companyCar + '\'' +
                ", yearManufacture=" + yearManufacture +
                ", capacity=" + capacity +
                ", valueCar=" + valueCar +
                ']';
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Chọn công việc của bạn : ");
        System.out.println(" 1. Tạo các đối tượng xe và nhập thông tin ");
        System.out.println(" 2. Xuất bảng kê khai tiền thuế của các xe. ");
        System.out.println(" 3. Thoát ");

        System.out.println("Selection ");
        int selection = Integer.parseInt(input.nextLine());

        switch (selection) {
            case 1: {

                System.out.println("Nhập tên xe ");
                String inputName = input.nextLine();

                System.out.println("Nhập hãng xe");
                String inputComapny = input.nextLine();

                System.out.println("Nhập năm sản xuất");
                int inputYear = input.nextInt();

                System.out.println("Dung tích");
                int inputCapacity = input.nextInt();

                System.out.println("Giá trị của xe");
                float inputValue = input.nextFloat();

                Vehicle vehicle = new Vehicle(inputName, inputComapny, inputYear, inputCapacity, inputValue);
                System.out.println(vehicle);
                break;
            }
            case 2: {
                System.out.println("Nhập dung tích của xe để tính thuế ");
                int inputCapacity = Integer.parseInt(input.nextLine());

                System.out.println("Nhập giá trị của xe ");
                float inputValue = input.nextFloat();

                double carTax;
                if (inputCapacity < 100 && inputCapacity > 0) {
                    carTax = 0.1 * inputValue;
                    System.out.println("Thuế cần phải đóng : " + carTax);

                } else if (inputCapacity < 200) {
                    carTax = 0.3 * inputValue;
                    System.out.println("Thuế cần phải đóng : " + carTax);

                } else {
                    carTax = 0.5 * inputValue;
                    System.out.println("Thuế cần phải đóng : " + carTax);
                }
                break;
            }
            case 3: {
                System.out.println("Bạn đã thoát khỏi chương trình");
                break;
            }
        }

    }
}
