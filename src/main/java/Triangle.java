public class Triangle extends Shape {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    Triangle() {
   
    }

    Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double getSide1() {
        return this.side1;
    }

    double getSide2() {
        return this.side2;
    }

    double getSide3() {
        return this.side3;
    }

    double[] getSides() {
        double[] sidesArr = {getSide1(), getSide2(), getSide3()};
        return sidesArr;
    }

    void setSide1(double side) {
        this.side1 = side;
    }

    void setSide2(double side) {
        this.side2 = side;
    }

    void setSide3(double side) {
        this.side3 = side;
    }

    void setSides(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double getArea() {
        double P = (side1 + side2 + side3) / 2;
        double S = Math.pow((P * (P - side1) * (P - side2) * (P - side3)), 0.5);
        return S;
    }

    double getPerimeter() {
        double P = side1 + side2 + side3;
        return P;
    }

    @Override
    public String toString() {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            return "This is a triangle which is a subclass of "
                    + super.toString()
                    + "\n this triangle's area = "
                    + getArea()
                    + "\n and perimeter = "
                    + getPerimeter();
        } else {
            return "This is not a triangle!";
        }

    }
}


