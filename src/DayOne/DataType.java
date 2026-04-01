package DayOne;

public class DataType {
    public static void main(String[] args) {

        // Integer Types
        byte a = 25;
        byte t = -10;
        System.out.println("Age: " + a);
        System.out.println("Temperature: " + t);

        short num = 1000;
        short temp = -200;
        System.out.println("Number of Students: " + num);
        System.out.println("Temperature: " + temp);

        int p = 2000000;
        int d = 150000000;
        int money = 10_00_00_000;
        System.out.println("Population: " + p);
        System.out.println("Distance: " + d);
        System.out.println("Money: " + money);

        long w = 7800000000L;
        long l = 9460730472580800L;  // Suffix 'L' is mandatory for long literals
        System.out.println("World Population: " + w);
        System.out.println("Light Year Distance: " + l);

        // Floating-Point Types
        float pi = 3.14f;
        float g = 9.81f;  // Suffix 'f' is mandatory for float literals
        System.out.println("Value of Pi: " + pi);
        System.out.println("Gravity: " + g);

        double piDouble = 3.141592653589793;
        double avogadro = 6.02214076e23D;  // Suffix 'D' is optional for double
        System.out.println("Value of Pi: " + piDouble);
        System.out.println("Avogadro's Number: " + avogadro);

        // Character Type
        char grade = 'A';
        char symbol = '$';
        System.out.println("Grade: " + grade);
        System.out.println("Symbol: " + symbol);

        // Boolean Type
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);
    }
}
