package DayOne.Operators;

import java.util.Scanner;
public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Result of " + a + " + " + b + " = " + (a+b));
        System.out.println("Result of " + a + " - " + b + " = " + (a-b));
        System.out.println("Result of " + a + " * " + b + " = " + (a*b));
        System.out.println("Result of " + a + " / " + b + " = " + (a/b));
        System.out.println("Result of " + a + " % " + b + " = " + (a%b));
        sc.close();
    }
}
