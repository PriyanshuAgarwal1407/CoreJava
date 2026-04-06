package DayThree;

/*
A constructor is a special method in Java used to initialize objects when they are created.
👉 It is automatically called when you create an object using new.
👉 Same name as class and has no return type
👉 It can also be overloaded
 */

public class Constructor {
    public static void main(String[] args) {
        StudentNew obj = new StudentNew();
        obj.display();
    }
}

class StudentNew{
    String name;
    int rollNo;

    // Constructor
    StudentNew() {
        name = "Priyanshu";
        rollNo = 156;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

/*
1. Default Constructor
    Provided by Java if you don’t write any constructor
    Initializes variables with default values

👉 If you write any constructor, Java will not provide default constructor
 */