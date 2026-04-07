package DayThree;

/*
Shallow Copy ->	Copies reference(s), not actual nested objects
Deep Copy -> Copies everything recursively (new memory for all objects)
 */

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person {
    String name;
    Address address;

    // Constructor
    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Deep Copy Constructor
    Person(Person other) {
        this.name = other.name;
        this.address = new Address(other.address.city); // new object
    }
}

public class DeepShallow {
    public static void main(String[] args) {

        Address addr = new Address("Delhi");

        Person p1 = new Person("John", addr);

        // Shallow Copy
        Person shallowCopy = p1;

        // Deep Copy
        Person deepCopy = new Person(p1);

        // Modify via shallow copy
        shallowCopy.address.city = "Mumbai";

        // Modify via deep copy
        deepCopy.address.city = "Bangalore";

        System.out.println("Original: " + p1.address.city);
        System.out.println("Shallow: " + shallowCopy.address.city);
        System.out.println("Deep: " + deepCopy.address.city);
    }
}