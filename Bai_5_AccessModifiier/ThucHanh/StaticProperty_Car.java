package Bai_5_AccessModifiier.ThucHanh;

public class StaticProperty_Car {
    private String name;
    private String engine;
        public static int numberOfCars;


    public StaticProperty_Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void setNumberOfCars(int numberOfCars) {
        StaticProperty_Car.numberOfCars = numberOfCars;
    }
}
