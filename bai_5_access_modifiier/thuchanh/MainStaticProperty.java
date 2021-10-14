package bai_5_access_modifiier.thuchanh;

public class MainStaticProperty {
    public static void main(String[] args) {
        StaticProperty_Car car1 = new StaticProperty_Car("Mazda 3", "Skyactiv 3");
        System.out.println(StaticProperty_Car.numberOfCars);
        StaticProperty_Car car2 = new StaticProperty_Car("Mazda 6","Skyactiv 6");
        System.out.println(StaticProperty_Car.numberOfCars);

    }
}
