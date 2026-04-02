package DayTwo.Conditional;

import java.util.Scanner;
public class LicenseEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Please enter a valid age.");
            sc.close();
            return;
        }

        System.out.print("Are you an Indian citizen? (Y/N): ");
        char citizenship = Character.toUpperCase(sc.next().charAt(0));

        if (citizenship != 'Y' && citizenship != 'N')
            System.out.println("Please enter a valid input for citizenship.");
        else if (age < 18 || age > 70)
            System.out.println("You must be between 18 and 70 years old to be eligible for a driving license.");
        else if (citizenship == 'N')
            System.out.println("You must be an Indian citizen to be eligible for a driving license.");
        else
            System.out.println("You are eligible for a driving license.");
        sc.close();
    }
}
