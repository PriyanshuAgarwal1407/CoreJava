package DayThree;

/*
static means the member belongs to the class itself, not to individual objects.
- one static method can only call other static method
- static method can only access static variables
- static method does not have access to this keyword
- constructor cant be static as Constructor belongs to object creation

Where can you use static?
    Variables, Methods, Blocks. Nested classes
 */

class StudentStatic{
    // Static Variable (Class Variable) -> Shared among all objects and Only one copy exists in memory
    static String college = "PIET";

    // Instance variable (unique per object)
    String name;

    // Static block (runs once when class is loaded)
    static {
        System.out.println("Static block executed");
    }

    // Constructor
    StudentStatic(String name) {
        this.name = name;
    }

    // Static method
    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    // Instance method
    void display() {
        System.out.println(name + " studies at " + college);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {

        // Calling static method without object
        StudentStatic.changeCollege("XYZ University");

        // Creating objects
        StudentStatic s1 = new StudentStatic("Priyanshu");
        StudentStatic s2 = new StudentStatic("Rahul");

        // Displaying data
        s1.display();
        s2.display();
    }
}


// 👉 main static in Java because the JVM needs to call main() without creating an object of the class.
// static removes the need for object creation during program startup