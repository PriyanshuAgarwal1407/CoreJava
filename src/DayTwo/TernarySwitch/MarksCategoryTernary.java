package DayTwo.TernarySwitch;

import java.util.Scanner;
class MarksCategoryTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();

        String category = (marks >= 80 && marks <= 100) ? "High" : (marks >= 50 && marks < 80) ? "Moderate" : (marks >= 0 && marks < 50) ? "Low" : "Invalid marks";
        System.out.println("The marks category is: " + category);
        sc.close();
    }
}
