package DayFour;

/*
What is an Interface?
An interface is a blueprint of a class that contains:
    Abstract methods (by default)
    Constants (public static final)
    Supports 100% abstraction (conceptually)
*/


/*
Key Rules (IMPORTANT)
    Methods are public abstract by default
    Variables are public static final
    A class can implement multiple interfaces
    Supports multiple inheritance (important advantage)


| Feature          | Abstract Class                       | Interface                         |
| ---------------- | ------------------------------------ | --------------------------------- |
| Methods          | Abstract + Concrete                  | Abstract (default/static allowed) |
| Variables        | Any type                             | Only `public static final`        |
| Constructors     | ✅ Yes                               | ❌ No                            |
| Inheritance      | Single                               | Multiple                          |
| Access Modifiers | Any                                  | Methods → public only             |
| Use Case         | "is-a" relationship with shared code | Pure abstraction / contract       |
 */

//interface Animal{
//    void sound();  // implicitly public abstract
//}
//
//class Dog implements Animal {
//    public void sound() {
//        System.out.println("Bark");
//    }
//}
//
//public class Interfaces {
//    public static void main(String[] args) {
//        Animal animal = new Dog();
//        animal.sound();
//    }
//}

interface Cars {
    void start();
    void accelerate();
    void brake();
}

class FuelCars implements Cars {
    @Override
    public void start(){
        System.out.println("Fuel car is started");
    }
    @Override
    public void accelerate(){
        System.out.println("Fuel car is accelerating");
    }
    @Override
    public void brake(){
        System.out.println("Fuel car is braking");
    }
}

class ElectricCars implements Cars {
    @Override
    public void start(){
        System.out.println("Electric car is started");
    }
    @Override
    public void accelerate(){
        System.out.println("Electric car is accelerating");
    }
    @Override
    public void brake(){
        System.out.println("Electric car is braking");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Cars car = new FuelCars();
        car.start();
        car.accelerate();
        car.brake();

        Cars car2 = new ElectricCars();
        car2.start();
        car2.accelerate();
        car2.brake();
    }
}