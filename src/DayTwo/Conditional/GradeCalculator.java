package DayTwo.Conditional;

import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        if (percentage < 0 || percentage > 100) System.out.println("Invalid percentage! Please enter a value between 0 and 100.");
        else if (percentage >= 90) System.out.println("Grade: A");
        else if (percentage >= 80) System.out.println("Grade: B");
        else if (percentage >= 70) System.out.println("Grade: C");
        else if (percentage >= 60) System.out.println("Grade: D");
        else if (percentage >= 50) System.out.println("Grade: E");
        else System.out.println("Grade: F");
        sc.close();
    }
}