package DayOne.Operators;

import java.util.Scanner;
public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Bitwise AND of " + a + ", " + b + " : " + (a&b));
        System.out.println("Bitwise OR of " + a + ", " + b + " : " + (a|b));
        System.out.println("Bitwise XOR of " + a + ", " + b + " : " + (a^b));
        System.out.println("Bitwise compliment of " + a + " : " + (~a));
        System.out.println("Bitwise compliment of " + b + " : " + (~b));
        System.out.println("Bitwise left shift of " + a + ", " + b + " : " + (a<<b));
        System.out.println("Bitwise right shift of " + a + ", " + b + " : " + (a>>b));
    }
}