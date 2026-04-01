package DayOne.Operators;

import java.util.Scanner;
public class FahrenheitCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // °C = (°F - 32) × 5/9

        System.out.print("Enter Temperature in Fahrenheit: ");
        double f = sc.nextDouble();

        double c = (f-32)*5/9;
        double c1 = (f-32)*(5.0/9.0);

        System.out.println("Temperature in celsius is: " + c);
        System.out.printf("Temperature in celsius is: %.2f\n ", c1);
    }
}