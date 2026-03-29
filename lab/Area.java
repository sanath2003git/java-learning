import java.util.Scanner;

class Area {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        // Rectangle calculations
        double rectArea = l * b;
        double rectPerimeter = 2 * (l + b);

        // Circle calculations
        double circleArea = 3.14 * r * r;
        double circumference = 2 * 3.14 * r;

        // Output
        System.out.println("\n--- Results ---");
        System.out.println("Rectangle Area: " + rectArea);
        System.out.println("Rectangle Perimeter: " + rectPerimeter);
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Circumference: " + circumference);
        sc.close();
    }
}