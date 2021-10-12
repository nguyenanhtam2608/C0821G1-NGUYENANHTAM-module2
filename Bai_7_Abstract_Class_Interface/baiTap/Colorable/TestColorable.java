package Bai_7_Abstract_Class_Interface.baiTap.Colorable;

public class TestColorable {
    public static void main(String[] args) {
        Square square = new Square(6);
        Square square1 = new Square(7);
        Square square2 = new Square(8);

        Square[] squares = new Square[3];
        squares[0] = new Square(square.getArea());
        squares[1] = new Square(square1.getArea());
        squares[2] = new Square(square2.getArea());

        for (Square square3 : squares) {
            System.out.println(square3);
        }
        if (square instanceof Colorable) {
            square.howToColor();
        }
    }
}

