package DayThree;

/*
A Copy Constructor is a constructor that creates a new object by copying values from another object of the same class.

👉 Java doesn’t provide it by default (unlike C++), so we define it manually.
 */

class StudentCopy {
    int rollNo;
    String name;

    // Parameterized Constructor
    StudentCopy(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Copy Constructor
    StudentCopy(StudentCopy s) {
        this.rollNo = s.rollNo;
        this.name = s.name;
    }

    void display() {
        System.out.println(rollNo + " " + name);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        StudentCopy s1 = new StudentCopy(101, "Priyanshu");

        // Copying object
        StudentCopy s2 = new StudentCopy(s1);

        s1.display();
        s2.display();
    }
}

