package DayOne.Operators;

import java.util.Scanner;
public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        double radius = sc.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);   // 4.0 / 3.0 to ensure floating-point division

        // Using Math.pow() for the cube calculation

        System.out.printf("Volume of the sphere with radius %.2f is: %.5f\n", radius,volume);
    }
}