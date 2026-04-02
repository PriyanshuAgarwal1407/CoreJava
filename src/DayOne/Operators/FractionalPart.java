package Lecture1.Basic;

import java.util.Scanner;
public class FractionalPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double number = sc.nextDouble();

        // Extract integer part and calculate fractional part
        long whole = (long) number;
        double fractional = Math.abs(number - whole);

        System.out.printf("Fractional part: %.3f\n", fractional);

        sc.close();
    }
}