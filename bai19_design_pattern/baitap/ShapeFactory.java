package bai19_design_pattern.baitap;

public class ShapeFactory {
    public Shape getShape(String type) {
        if ("tron".equals(type)) {
            return new Circle();
        } else if ("vuong".equals(type)) {
            return new Square();
        } else {
            return new Rectangle();
        }
    }
}
