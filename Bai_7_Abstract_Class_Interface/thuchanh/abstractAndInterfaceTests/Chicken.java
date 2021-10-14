package bai_7_abstract_class_interface.thuchanh.abstractAndInterfaceTests;

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