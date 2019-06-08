import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle("blue", false, 4.5, 5.5, 6.5);
        System.out.println(triangle);

        System.out.println("Now let's make a triangle, shall we?");
        System.out.println("Choose color: ");
        String color = input.next();
        System.out.println("is it filled?");
        boolean filled = input.nextBoolean();
        System.out.println("Enter side1: ");
        double side1 = input.nextDouble();
        System.out.println("Enter side2: ");
        double side2 = input.nextDouble();
        System.out.println("Enter side3: ");
        double side3 = input.nextDouble();
        Triangle cTriangle = new Triangle(color, filled, side1, side2, side3);
        System.out.println(cTriangle);
    }
}
