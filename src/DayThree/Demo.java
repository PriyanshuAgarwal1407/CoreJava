package DayThree;

public class Demo {
    public static void main(String[] args){
        // Creating an object of Student class
        Student s1 = new Student();
        Student s2 = new Student();

        // Setting attributes of the object
        s1.name = "Priyanshu";
        s1.rollNumber = 21;
        s1.college = "PIET";

        s2.name = "Ram";
        s2.rollNumber = 20;
        s2.college = "PIET";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();
    }
}

class Student{
    // instance variables
    String name;
    int rollNumber;
    String college;

    // instance methods
    void markAttendance(){
        System.out.println("Attendence marked by " + name);
    }

    // Method to display student details
    void print(){
        System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", College:" + college);
    }
}