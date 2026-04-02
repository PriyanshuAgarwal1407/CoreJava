package DayTwo.Conditional;

import java.util.Scanner;
public class TriangleValidityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sides of triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) System.out.println("All sides must be positive");
        else {
            if ((a + b > c) && (a + c > b) && (b + c > a)) System.out.println("Yes, these sides can form a triangle.");
            else System.out.println("No, these sides cannot form a triangle.");
        }
        sc.close();
    }
}
