package DayThree;

/*
Constructor Overloading means having multiple constructors in the same class with different parameter lists (different number or type of arguments).
👉 It follows compile-time polymorphism.

🔹 Why Use It?
    Initialize objects in different ways
    Provide flexibility while creating objects
    Improves readability & design
 */

public class ConstructorOverloading {
    public static void main(String[] args) {
        StudentOver s1 = new StudentOver();
        StudentOver s2 = new StudentOver(101);
        StudentOver s3 = new StudentOver(102, "Priyanshu");

        s1.display();
        s2.display();
        s3.display();
    }
}

class StudentOver {
    int rollNo;
    String name;

    // Default Constructor
    StudentOver() {
        rollNo = 0;
        name = "Unknown";
    }

    // Parameterized Constructor (1 parameter)
    StudentOver(int rollNo) {
        this.rollNo = rollNo;
        this.name = "Not Assigned";
    }

    // Parameterized Constructor (2 parameters)
    StudentOver(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println(rollNo + " " + name);
    }
}