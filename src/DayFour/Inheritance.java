package DayFour;

// Java Inheritance:
// Inheritance is one of the key features of OOP that allows us to create a new class from an existing class.
// The new class that is created is known as subclass (child or derived class) and the existing class from where the child class is derived is known as superclass (parent or base class).
// It support polymorphism

class StudentInherit{
    String name;
    int age;

    protected void markAttendence(){
        System.out.println("Attedance marked");
    }
}

class EngineeringStudent extends StudentInherit{
    void attendLab(){
        System.out.println("Lab attended");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.markAttendence();
        es.attendLab();

        StudentInherit s1 = new StudentInherit();
        s1.markAttendence();
//        s1.attendLab();  // wrong
    }
}

/*
Types of Inheritance in Java
1. Single/Simple Inheritance  // A → B
2. Multilevel Inheritance     // A → B → C
3. Hierarchical Inheritance
         A
       /   \
      B     C
4. Multiple Inheritance (NOT SUPPORTED IN JAVA)
     A    B
     \    /
        C

--> TO SUPPOT MULTIPLE INHERITANCE USE INTERFACES
 */
