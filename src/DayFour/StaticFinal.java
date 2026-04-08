package DayFour;

/*
❗ Static Methods
    Cannot be overridden
    Only method hiding
    👉 Resolved at compile time

❗ Final Methods
    Cannot be overridden

❌ No (constructors are not inherited)
✅ Yes we can overload main method?
❌ No we cannot override private method?
❌ No interface do not have constructor?
 */


// Static keyword -- belong to class not object
// Private method can not be overridden
// Fields/Variable they cannot be polymorphic
// Final --> class ??? --> you cannot create child of that class

class A{
    static void fun(){
        System.out.println("Hello");
    }
}

class B extends A{
    static void fun(){
        System.out.println("Bye");
    }
}

public class StaticFinal {
    public static void main(String[] args) {
        A a = new B();
//        a.fun();  // static method cant be overridden
    }
}
