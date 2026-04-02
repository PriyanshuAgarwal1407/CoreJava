package Lecture1.Basic;

import java.util.Scanner;
public class FlaotingProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();

        float c = a*b;
        System.out.println("Result of " + a + " * " + b + " = " + c);
        sc.close();
    }
}
