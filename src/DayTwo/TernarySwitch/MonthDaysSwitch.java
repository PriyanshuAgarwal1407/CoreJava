package DayTwo.TernarySwitch;

import java.util.Scanner;
public class MonthDaysSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int monthNumber = sc.nextInt();

        switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Total days: 31");
                break;
            case 4, 6, 9, 11:
                System.out.println("Total days: 30");
                break;
            case 2:
                System.out.println("Total days: 28 or 29 (leap year)");
                break;
            default:
                System.out.println("Please enter a valid month number between 1 and 12.");
        }
        sc.close();
    }
}