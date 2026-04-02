package DayTwo.Conditional;

import java.util.Scanner;
public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Convert to lowercase for easier comparison
        // char lowerCh = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("'" + ch + "' is a vowel.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("'" + ch + "' is a consonant.");
        } else {
            System.out.println("'" + ch + "' is not a letter.");
        }
        sc.close();
    }
}
