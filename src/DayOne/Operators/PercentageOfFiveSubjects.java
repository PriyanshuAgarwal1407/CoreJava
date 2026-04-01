package DayOne.Operators;

import java.util.Scanner;
public class PercentageOfFiveSubjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subject1, subject2, subject3, subject4, subject5;

        System.out.print("Enter marks for Subject 1: ");
        subject1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        subject2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        subject3 = sc.nextInt();

        System.out.print("Enter marks for Subject 4: ");
        subject4 = sc.nextInt();

        System.out.print("Enter marks for Subject 5: ");
        subject5 = sc.nextInt();

        // Calculate total marks
        int total = subject1 + subject2 + subject3 + subject4 + subject5;

        // Assuming each subject is out of 100, so total max marks = 500
        double percentage = (total / 500.0) * 100;

        System.out.println("\nTotal Marks = " + total + " out of 500");
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}