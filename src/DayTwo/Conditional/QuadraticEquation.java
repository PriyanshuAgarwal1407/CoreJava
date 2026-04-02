package DayTwo.Conditional;

import java.util.Scanner;

// Quadratic Equation: ax^2 + bx + c = 0
public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a, b, c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == 0) {
            System.out.println("This is not a quadratic equation (a = 0)");
            sc.close();
            return;
        }

        System.out.println("\nEquation: " + a + "x^2 + " + b + "x + " + c + " = 0");

        double discriminant = (b * b) - (4.0 * a * c);
        System.out.println("Discriminant (D) = " + discriminant);

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);

            System.out.println("Nature: Two distinct real roots");
            System.out.printf("Root 1: x = %.4f%n", root1);
            System.out.printf("Root 2: x = %.4f%n", root2);
        }
        else if (discriminant == 0) {
            double root = -b / (2.0 * a);

            System.out.println("Nature: One real root (repeated)");
            System.out.printf("Root: x = %.4f%n", root);
        }
        else {
            double realPart = -b / (2.0 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2.0 * a);

            System.out.println("Nature: Two complex roots");
            System.out.printf("Root 1: x = %.4f + %.4fi%n", realPart, imaginaryPart);
            System.out.printf("Root 2: x = %.4f - %.4fi%n", realPart, imaginaryPart);
        }

        sc.close();
    }
}
