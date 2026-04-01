package DayOne;

public class DataTypeSize{
    public static void main(String[] args) {
        System.out.println("Size of byte   : " + Byte.BYTES + " bytes / " + Byte.SIZE + " bits");
        System.out.println("Size of short  : " + Short.BYTES + " bytes / " + Short.SIZE + " bits");
        System.out.println("Size of int    : " + Integer.BYTES + " bytes / " + Integer.SIZE + " bits");
        System.out.println("Size of long   : " + Long.BYTES + " bytes / " + Long.SIZE + " bits");
        System.out.println("Size of float  : " + Float.BYTES + " bytes / " + Float.SIZE + " bits");
        System.out.println("Size of double : " + Double.BYTES + " bytes / " + Double.SIZE + " bits");
        System.out.println("Size of char   : " + Character.BYTES + " bytes / " + Character.SIZE + " bits");
    }
}

/*
Size of byte    : 1 bytes / 8 bits
Size of short   : 2 bytes / 16 bits
Size of int     : 4 bytes / 32 bits
Size of long    : 8 bytes / 64 bits
Size of float   : 4 bytes / 32 bits
Size of double  : 8 bytes / 64 bits
Size of char    : 2 bytes / 16 bits
*/