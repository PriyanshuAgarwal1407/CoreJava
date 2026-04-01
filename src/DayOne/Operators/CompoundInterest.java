package DayOne.Operators;

import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Compound Interest = P(1 + R/100)t

        System.out.print("Enter Principle amount: ");
        double p = sc.nextDouble();

        System.out.print("Enter Interest Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        double ci = p * Math.pow((1 + r/100), t) - p;

        System.out.println("Compound Interest = " + ci);
        sc.close();
    }
}
