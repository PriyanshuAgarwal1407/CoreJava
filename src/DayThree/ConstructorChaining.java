package DayThree;

/*
Constructor chaining is a technique in (OOP) where one constructor calls another
constructor within the same class or from a parent class.
This helps avoid code duplication and keeps initialization logic clean.
 */

/*
1. Within the Same Class → this()
    Used to call another constructor of the same class.
    Must be the first statement inside the constructor.
 */

public class ConstructorChaining {
    public static void main(String[] args) {
        StudentChain s1 = new StudentChain();
        StudentChain s2 = new StudentChain(102, "Ram");

        s1.display();
        s2.display();
    }
}

class StudentChain {
    int id;
    String name;

    // Default constructor
    StudentChain() {
        this(101, "Default"); // calls parameterized constructor
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    StudentChain(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}


// We can not call constructor manually