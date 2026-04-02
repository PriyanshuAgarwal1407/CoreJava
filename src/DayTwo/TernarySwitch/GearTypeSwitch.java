package DayTwo.TernarySwitch;

import java.util.Scanner;
public class GearTypeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gear (N, 1, 2, 3, R): ");
        char gear = sc.next().charAt(0);

        switch (gear) {
            case 'N':
            case 'n':
                System.out.println("Neutral Gear: Vehicle is stationary.");
                break;
            case '1':
                System.out.println("First Gear: Suitable for starting and low speeds.");
                break;
            case '2':
                System.out.println("Second Gear: Suitable for moderate speeds.");
                break;
            case '3':
                System.out.println("Third Gear: Suitable for higher speeds.");
                break;
            case 'R':
            case 'r':
                System.out.println("Reverse Gear: Vehicle moves backward.");
                break;
            default:
                System.out.println("Invalid gear input. Please enter N, 1, 2, 3, or R.");
        }
        sc.close();
    }
}