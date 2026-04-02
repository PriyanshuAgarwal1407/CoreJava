package DayTwo.Conditional;

import java.util.Scanner;
public class IntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double doubleNum = sc.nextDouble();
        int intNum = (int)doubleNum;

        if(doubleNum - intNum > 0) System.out.println(doubleNum + " is not an integer");
        else System.out.println(intNum + " is an integer");
        sc.close();
    }
}
