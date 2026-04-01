package DayOne;

// A. Automatic Type Conversion (Widening - Implicit)
//public class TypeCastingConversion {
//    public static void main(String[] args) {
//        // Implicit casting hierarchy: byte -> short -> int -> long -> float -> double
//
//        byte byteValue = 10;
//        short shortValue = byteValue;      // byte to short
//        int intValue = shortValue;          // short to int
//        long longValue = intValue;          // int to long
//        float floatValue = longValue;       // long to float
//        double doubleValue = floatValue;    // float to double
//
//        System.out.println("Byte Value: " + byteValue);
//        System.out.println("Short Value: " + shortValue);
//        System.out.println("Int Value: " + intValue);
//        System.out.println("Long Value: " + longValue);
//        System.out.println("Float Value: " + floatValue);
//        System.out.println("Double Value: " + doubleValue);
//    }
//}


// B. Explicit Type Casting (Narrowing)
public class TypeCastingConversion {
    public static void main(String[] args) {
        // Explicit casting hierarchy: double -> float -> long -> int -> short -> byte

        double doubleValue = 9.78;
        float floatValue = (float) doubleValue;    // double to float
        long longValue = (long) floatValue;        // float to long
        int intValue = (int) longValue;            // long to int
        short shortValue = (short) intValue;       // int to short
        byte byteValue = (byte) shortValue;        // short to byte

        System.out.println("Double Value: " + doubleValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Byte Value: " + byteValue);
    }
}