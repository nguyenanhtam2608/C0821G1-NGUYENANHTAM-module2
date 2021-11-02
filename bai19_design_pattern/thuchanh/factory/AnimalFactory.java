package bai19_design_pattern.thuchanh.factory;

public class AnimalFactory {
    public Animal getAnimal(String type){
        if("canine".equals((type))){
            return new Dog();
        }else {
            return new Cat();
        }
    }
}
