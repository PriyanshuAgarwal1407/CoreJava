package DayFour;

// Encapsulation is one of the four fundamental OOP concepts.
// Encapsulation is the mechanism of binding or wrapping the data (variables) and code acting on the data (methods) together as a single unit.
// Another way to think about encapsulation is, that it is a protective shield that prevents the data from being accessed by the code outside this shield.

// According to the principle of encapsulation, data members of a class should be private and can be accessed only through public methods of their current class.
// Method only can access these data members and these methods can be made public to provide controlled access to the data members.

/*
There are two steps to achieve or implement encapsulation in Java Program:
1. Declaring the instance variables of the class as private so that they cannot be accessed directly by anyone from outside the class.
2. Providing public setter and getter methods to set/modify and view the values of the variables/fields.
*/

class BankAccount{
    private double balance;

    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        balance -= amount;
    }

    // getters / setters
    public double getBalance(){
        return balance;
    }
}


class StudentEnc {
    private String name;
    private int age;
    private int rollNumber;
    private String college;

    StudentEnc(String name, int rollNumber, int age, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }
    // ✅ Getter
    public String getName(){
        return name;
    }

    // ✅ Setter
    public void setName(String name){
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(500);
        ba.withdraw(300);

        System.out.println(ba.getBalance());
    }
}
