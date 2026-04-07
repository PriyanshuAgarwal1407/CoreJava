package DayFour.Packages;

public class PrivateKeyword {
    public static class Students{
        String name;
        private int rollNo;
        double cgpa;
    }

    public static void main(String[] args) {
        Students student = new Students();
        student.name = "John";
        // student.rollNo = 101; // Error: rollNo has private access in Students
        student.cgpa = 3.8;

        System.out.println("Name: " + student.name);
        // System.out.println("Roll No: " + student.rollNo); // Error: rollNo has private access in Students
        System.out.println("CGPA: " + student.cgpa);
    }
}
