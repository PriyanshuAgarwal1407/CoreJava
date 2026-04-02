package DayTwo.Conditional;

import java.util.Scanner;
public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) System.out.println("'" + ch + "' is an alphabet.");
        else System.out.println("'" + ch + "' is not an alphabet.");
        sc.close();
    }
}

// Using ASCII value ranges
// int ascii = (int)ch;
// (ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)