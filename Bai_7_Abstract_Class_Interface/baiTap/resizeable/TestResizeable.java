package bai_7_abstract_class_interface.baiTap.resizeable;

public class TestResizeable {
    public static void main(String[] args) {
//        Circle[] circles = new Circle[2];
//        circles[0] = new Circle(5);
//        circles[1] = new Circle(10);
//
//        Rectangle[] rectangles = new Rectangle[2];
//        rectangles[0] = new Rectangle(3, 4);
//        rectangles[1] = new Rectangle(3, 5);
//        System.out.println("-----------Trước--------");
//
//        for (Circle circle : circles) {
//            System.out.println(circle);
//        }
//
//        for (Rectangle rectangle : rectangles) {
//            System.out.println(rectangle);
//        }
        System.out.println("-----------Trước--------");
        Circle circle = new Circle(5);
        Circle circle1 = new Circle(10);
        System.out.println("Diện tích Tròn");
        System.out.println("Radius: " + circle.getRadius() + " Area " + circle.getArea());
        System.out.println("Radius: " + circle1.getRadius() + " Area " + circle1.getArea());

        System.out.println("Diện tích Vuông");
        Rectangle rectangle = new Rectangle(3, 4);
        Rectangle rectangle1 = new Rectangle(3, 5);
        System.out.println("Width : " + rectangle.getWidth() + " Lenght : " + rectangle.getLength() + " Area " + rectangle.getArea());
        System.out.println("Width : " + rectangle1.getWidth() + " Lenght : " + rectangle1.getLength() + " Area " + rectangle1.getArea());

        System.out.println("-----------Sau------------");
        System.out.println("Diện tích tròn");
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(10);
        circle2.resize(10);
        circle3.resize(10);
        System.out.println("RadiusT: " + circle.getRadius() + " RadiusS " + circle2.getRadius() + " Area " + circle2.getArea());
        System.out.println("RadiusT: " + circle1.getRadius() + " RadiusS " + circle3.getRadius() + " Area " + circle3.getArea());

        System.out.println("Diện tích vuông");
        Rectangle rectangle2 =new Rectangle(3,4);
        Rectangle rectangle3 =new Rectangle(3,5);
        rectangle2.resize(10);
        rectangle3.resize(10);
        System.out.println("Width : " + rectangle2.getWidth() + " Lenght : " + rectangle2.getLength() + " Area " + rectangle2.getArea());
        System.out.println("Width : " + rectangle3.getWidth() + " Lenght : " + rectangle3.getLength() + " Area " + rectangle3.getArea());
    }

}
