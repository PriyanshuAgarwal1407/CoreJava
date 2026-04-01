package DayOne.Operators;

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Simple Interest = (P x T x R)/100
        System.out.print("Enter principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter time(in years): ");
        double t = sc.nextDouble();

        double simpleInterest = (p*r*t)/100;
        double totalAmount = p + simpleInterest;

        System.out.println("Simple Interest: " + simpleInterest);
//        System.out.printf("Simple Interest: %.2f\n", simpleInterest);
        System.out.printf("Total Amount: %.2f\n", totalAmount);
        sc.close();
    }
}
