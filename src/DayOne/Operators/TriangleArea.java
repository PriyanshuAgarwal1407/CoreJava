package DayOne.Operators;

import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        // Area of triangle = ½*B*H
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of triangle: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        double area = (1.0/2.0) * b * h;
        System.out.println("Area of triangle is: " + area);
        sc.close();
    }
}
