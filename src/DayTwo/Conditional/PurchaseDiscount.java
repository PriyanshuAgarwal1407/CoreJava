package DayTwo.Conditional;

/*
If the purchase value is entered by the user, apply discount based on the amount:
     - 20% discount if purchase >= 5000
     - 15% discount if purchase >= 3500
     - 10% discount if purchase >= 1500
     - No discount otherwise
 */

import java.util.Scanner;
public class PurchaseDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");

        double purchaseAmount = sc.nextDouble();

        if (purchaseAmount < 0) {
            System.out.println("Invalid amount! Please enter a positive value.");
            return;
        }

        double discountRate = 0;

        // Determine discount rate
        if (purchaseAmount >= 5000) discountRate = 0.20;
        else if (purchaseAmount >= 3500) discountRate = 0.15;
        else if (purchaseAmount >= 1500) discountRate = 0.10;

        double discount = purchaseAmount * discountRate;
        double finalAmount = purchaseAmount - discount;

        System.out.println("Purchase Amount: ₹" + purchaseAmount);
        System.out.println("Final Amount: ₹" + String.format("%.2f", finalAmount));  // format in println using String.format()
        sc.close();
    }
}
