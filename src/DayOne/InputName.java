package DayOne;

import java.util.Scanner;
public class InputName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Welcome " + name);
        sc.close();
    }
}
