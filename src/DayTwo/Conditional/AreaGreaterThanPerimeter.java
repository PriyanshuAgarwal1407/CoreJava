package DayTwo.Conditional;

import java.util.Scanner;
public class AreaGreaterThanPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        if (area > perimeter) System.out.println("Area (" + area + ") is greater than Perimeter (" + perimeter + ")");
        else if (area < perimeter) System.out.println("Area (" + area + ") is less than Perimeter (" + perimeter + ")");
        else System.out.println("Area (" + area + ") is equal to Perimeter (" + perimeter + ")");
        sc.close();
    }
}

/*
Mathematical Insight:
The area is greater than the perimeter when:
length × breadth > 2 × (length + breadth)

This occurs for rectangles where both dimensions are sufficiently large (typically when both length and breadth are greater than 2).
*/