package DayTwo.Conditional;

import java.util.Scanner;
public class DivisibleBy15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) System.out.println("Please enter a positive integer!");
        else {
            if (number % 15 == 0) System.out.println(number + " is divisible by 15 (both 3 and 5).");
            else if (number % 5 == 0) System.out.println(number + " is divisible by 5 only.");
            else if (number % 3 == 0) System.out.println(number + " is divisible by 3 only.");
            else System.out.println(number + " is not divisible by 3, 5, or 15.");
        }
        sc.close();
    }
}
