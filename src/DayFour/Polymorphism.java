package DayFour;

// MethodOverriding:
// If subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.
// Method overriding is also known as runtime polymorphism. Hence, we can achieve Polymorphism in Java with the help of inheritance.

/*
Polymorphism = Many forms
Same method name → different behavior

# Types of Polymorphism

1. Static Polymorphism (Method Overloading)
    Same method name
    Different parameters
    Decided at compile time
    Also called Compile-Time Polymorphism
    Depends on method signature

2. Dynamic Polymorphism (Method Overriding)
    Parent reference → child object
    Method resolved at runtime
    Also called Runtime Polymorphism
    Uses Inheritance + Method Overriding
 */

class Animal {
    void speak(){
        System.out.println("I'm a Animal");
    }
}

class Dog extends Animal {
    void speak(){
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void speak(){
        System.out.println("Meow");
    }
}

class Lion  extends Animal {
    void speak(){
        System.out.println("Roar");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Lion();
        a1.speak();
        a2.speak();
        a3.speak();
    }
}