package DayThree;

// this is a reference variable that refers to the current object
// (the object whose method or constructor is being executed).
// 👉 Resolve ambiguity between instance variables and parameters

class StudentThis{
    String name;
    int age;

    StudentThis(String name, int age) {
        this.name = name;  // this.name refers to instance variable
        this.age = age;    // name and age refer to parameters
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ThisReference {
    public static void main(String[] args) {
        StudentThis s = new StudentThis("Ram", 21);
        s.display();
    }
}
