package Lecture1.Basic;

import java.util.Scanner;
public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Before swap a = " + a + ", b = " + b);
        int temp;

        temp = a;
        a = b;
        b = temp;
        System.out.println("AFter swap a = " + a + ", b = " + b);
        sc.close();
    }
}
