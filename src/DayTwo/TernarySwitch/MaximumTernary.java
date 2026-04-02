package DayTwo.TernarySwitch;

import java.util.Scanner;
class MaximumTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max = (num1 > num2) ? num1 : num2;
        // int max = Math.max(num1, num2);

        System.out.println("The maximum number is: " + max);
        sc.close();
    }
}

// For three numbers
// int max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);