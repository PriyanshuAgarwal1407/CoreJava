package DayTwo.Conditional;

import java.util.Scanner;
public class AreaVsCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        if (area > circumference) System.out.printf("Area (%.4f) is greater than Circumference (%.4f)", area,circumference);
        else if (area < circumference) System.out.printf("Area (%.4f) is less than Circumference (%.4f)", area,circumference);
        else System.out.printf("Area (%.4f) is equal to Circumference (%.4f)", area,circumference);
        sc.close();
    }
}
