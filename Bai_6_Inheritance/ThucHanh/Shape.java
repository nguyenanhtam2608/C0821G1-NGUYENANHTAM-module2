package bai_6_inheritance.thuchanh;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {//display
        return " A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? " filles " : " not filled ");
    }
}



