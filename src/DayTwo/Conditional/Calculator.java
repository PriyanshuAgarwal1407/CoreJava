package DayTwo.Conditional;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        if (operator == '+') System.out.printf("Result: %.2f + %.2f = %.2f\n", num1, num2, num1 + num2);
        else if (operator == '-') System.out.printf("Result: %.2f - %.2f = %.2f\n", num1, num2, num1 - num2);
        else if (operator == '*') System.out.printf("Result: %.2f * %.2f = %.2f\n", num1, num2, num1 * num2);
        else if (operator == '/') {
            if (num2 == 0) System.out.println("Error: Cannot divide by zero!");
            else System.out.printf("Result: %.2f / %.2f = %.2f\n", num1, num2, num1 / num2);
        }
        else System.out.println("Invalid operator! Please use one of: +, -, *, /");
        sc.close();
    }
}
