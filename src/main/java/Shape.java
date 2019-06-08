public class Shape {
    String color;
    boolean filled;

    Shape() {
        this.color = "black";
        this.filled = true;
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    String getColor() {
        return this.color;
    }

    boolean isFilled() {
        return this.filled;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape with color: "
                + getColor()
                + " and"
                + (isFilled() ? " filled" : " not filled")
                ;
    }
}
