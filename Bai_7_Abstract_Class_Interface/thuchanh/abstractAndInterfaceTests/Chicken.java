package Bai_7_Abstract_Class_Interface.thuchanh.abstractAndInterfaceTests;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";

    }
}