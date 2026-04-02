package DayTwo.Conditional;

import java.util.Scanner;
public class PurchaseDiscountAlternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        if (amount < 0) System.out.println("Invalid amount!");
        else if (amount >= 5000) System.out.println("Final amount: " + (amount * 0.80));  // 20% off
        else if (amount >= 3500) System.out.println("Final amount: " + (amount * 0.85));  // 15% off
        else if (amount >= 1500) System.out.println("Final amount: " + (amount * 0.90));  // 10% off
        else System.out.println("Final amount: " + amount);  // No discount
        sc.close();
    }
}
