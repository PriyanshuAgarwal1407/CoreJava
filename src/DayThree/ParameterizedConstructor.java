package DayThree;

// Parameterized Constructor --> Takes input values to initialize object

public class ParameterizedConstructor {
    public static void main(String[] args) {
        StudentParam s1 = new StudentParam(101, "Priyanshu");
        StudentParam s2 = new StudentParam(102, "Krishna");
        s1.display();
        s2.display();
    }
}

class StudentParam{
    int rollNo;
    String studName;

    // Parameterized Constructor
    StudentParam(int no, String name) {
        rollNo = no;
        studName = name;
    }
    void display() {
        System.out.println(rollNo + " " + studName);
    }
}