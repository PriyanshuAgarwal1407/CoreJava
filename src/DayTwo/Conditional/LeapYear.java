package DayTwo.Conditional;

/*
A year is a leap year if:
    It is divisible by 4 and not divisible by 100, or
    It is divisible by 400.
*/

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 0) System.out.println("Year cannot be negative. Please enter a valid year.");
        else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) System.out.println(year + " is a leap year.");
        else System.out.println(year + " is not a leap year.");
        sc.close();
    }
}
