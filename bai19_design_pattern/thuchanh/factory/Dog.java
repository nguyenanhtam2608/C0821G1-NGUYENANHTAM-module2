package bai19_design_pattern.thuchanh.factory;

import bai19_design_pattern.thuchanh.factory.Animal;

public class Dog extends Animal {

    @Override
    public String makeSound() {
        return "Woof";
    }
}
