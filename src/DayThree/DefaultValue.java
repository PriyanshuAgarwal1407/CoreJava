package DayThree;

public class DefaultValue {
    public static void main(String[] args){
        StudentClass s1 = new StudentClass();

        // Default values
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
    }
}

class StudentClass{
    // information/data/characteristics --> instance variables
    String name;
    int rollNumber;
    int age;
    String college;

    // behaviours --> functions --> instance methods
    void markAttendance(){
        System.out.println("Attendence marked by " + name);
    }
}

// Default values
/*
byte    -> 0
short   -> 0
int     -> 0
long    -> 0L
float   -> 0.0f
double  -> 0.0d
char    -> '\u0000' (null character)
boolean -> false
String  -> null
 */