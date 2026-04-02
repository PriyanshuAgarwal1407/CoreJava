package DayTwo.TernarySwitch;

import java.util.Scanner;
public class MonthDaysModernSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int monthNumber = sc.nextInt();

        int days;
        switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
            case 2 -> days = 28; // or 29 for leap year
            default -> {
                System.out.println("Please enter a valid month number between 1 and 12.");
                return;
            }
        }
        System.out.println("Total days in a month : " + days);
        sc.close();
    }
}
