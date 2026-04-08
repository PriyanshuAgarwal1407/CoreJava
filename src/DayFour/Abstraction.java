package DayFour;

// Abstraction is one of the four fundamental OOP concepts.
// It is the process of hiding the implementation details and showing only functionality and essential attributes to the user.
// In Java, abstraction is achieved using abstract classes and interfaces.
// Low level abstraction (Hiding implementation detail)
// High level abstraction (Separate WHAT from HOW)
/*
✅ In Java, abstraction is achieved using:
    Abstract Classes
    Interfaces
 */

/*
Abstract Classes
Declared using abstract
Can have:
    Abstract methods (no body)
    Concrete methods (with body)
Cannot be instantiated
 */

abstract class Car{
    void start(){
        System.out.println("Car start");
    }
    abstract void accelerate();
    abstract void brake();
}

class FuelCar extends Car{
    @Override
    void accelerate(){
        System.out.println("Fuel accelerate");
    }

    @Override
    void brake(){
        System.out.println("Fuel brake");
    }
}

class ElectricCar extends Car{
    @Override
    void accelerate(){
        System.out.println("Electrical accelerate");
    }

    @Override
    void brake(){
        System.out.println("Electrical brake");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();
        car.start();
        car.accelerate();
        car.brake();

        System.out.println();

        FuelCar fuel = new FuelCar();
        fuel.start();
        fuel.accelerate();
        fuel.brake();
    }
}