package bai19_design_pattern.baitap;

public class FactoryPatternDemo {
    public static void main(String[] args) {

        ShapeFactory shape = new ShapeFactory();
        Shape shape1 = shape.getShape("tron");
        System.out.println("shape1 " + shape1.darw());

        Shape shape2 = shape.getShape("vuong");
        System.out.println("shape2 " + shape2.darw());

        Shape shape3 = shape.getShape("chu nhat");
        System.out.println("shape3 " + shape3.darw());
    }
}
