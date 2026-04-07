package DayFour;

/*
 super Keyword in Java:
 super is a special keyword in Java that is used to refer to the instance of the immediate parent class.
 Uses of super Keyword in Java
    It is used to refer to an instance variable of the immediate parent class.
    It is used to invoke a method of the immediate parent class.
    It is used to invoke a constructor of immediate parent class.
 */

class Vehicle {
    int wheelsCount;
    String model;

    void start(){
        System.out.println("Vehicle is starting");
    }
}

public class Super extends Vehicle {
    String color;
    void start() {
        super.start();      // parent method
        System.out.println("Color: " + color);
        System.out.println(this.model + "Car is starting");
    }

    public static void main(String[] args) {
        Super obj = new Super();

        obj.wheelsCount = 4;
        obj.model = "BMW";
        obj.color = "red";

        obj.start();
    }
}

