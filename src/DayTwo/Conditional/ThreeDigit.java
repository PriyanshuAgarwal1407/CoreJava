package DayTwo.Conditional;

import java.util.Scanner;
public class ThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) System.out.println("Please enter a positive integer!");
        else{
            if (number >= 100 && number <= 999) System.out.println(number + " is a three-digit number.");
            else System.out.println(number + " is not a three-digit number.");
        }
        sc.close();
    }
}
