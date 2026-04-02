package DayTwo.Conditional;

import java.util.Scanner;
public class PosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float num = sc.nextFloat();

        if(num==0) System.out.print(num + " is zero.");
        else if(num > 0) System.out.print(num + " is positive.");
        else System.out.print(num + " is negative.");
        sc.close();
    }
}
