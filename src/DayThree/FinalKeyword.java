package DayThree;

/*
final means something cannot be changed.
variable, method, class, parameter can be final
 */


class RandomFinal {
    // final variable (constant)
    // final double PI = 3.14;
    final double PI;

    RandomFinal() {
        this.PI = 3.14;
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        RandomFinal r1 = new RandomFinal();
        System.out.println(r1.PI);
//        r1.PI = 3.15; // java: cannot assign a value to final variable PI
    }
}
