package bai19_design_pattern.thuchanh.factory;

import bai19_design_pattern.thuchanh.factory.Animal;
import bai19_design_pattern.thuchanh.factory.AnimalFactory;

public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal a1 = animalFactory.getAnimal("feline");
        System.out.println("a1 sound: " + a1.makeSound());

        Animal a2 = animalFactory.getAnimal("canine");
        System.out.println("a2 sound: " + a2.makeSound());
    }
}
