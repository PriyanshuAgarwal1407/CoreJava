package DayThree;

class StudentUser{
    String name;
    int rollNo;
    double cgpa;

    void print(){
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", CGPA: " + cgpa);
    }
}

public class UserDefinedDataType {
    public static void main(String[] args) {
        // Object Instantiation
        StudentUser s1 = new StudentUser(); // Creating an object of Student class
        s1.name = "Mohit";
        s1.rollNo = 156;
        s1.cgpa = 9.5;

        StudentUser s2 = new StudentUser(); // Creating another object of Student class
        s2.name = "Ankit";
        s2.rollNo = 157;
        s2.cgpa = 9.1;


        // System.out.println(s1); // Prints the reference of the object
        System.out.println("Student 1: " + s1.name + ", Roll No: " + s1.rollNo + ", CGPA: " + s1.cgpa);
        System.out.println("Student 2: " + s2.name + ", Roll No: " + s2.rollNo + ", CGPA: " + s2.cgpa);

        s2.cgpa = 8.2;
        System.out.println("Updated Student 2 CGPA: " + s2.cgpa);

        s1.print();
        s2.print();
    }
}
