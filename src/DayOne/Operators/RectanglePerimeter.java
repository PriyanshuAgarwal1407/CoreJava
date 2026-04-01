package DayOne.Operators;

import java.util.Scanner;
public class RectanglePerimeter {
    public static void main(String[] args) {
        // Perimeter of rectangle ABCD = A+B+C+D
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of recatangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.print("Perimeter of rectangle is: " + (a+b+c+d));
        sc.close();
    }
}
