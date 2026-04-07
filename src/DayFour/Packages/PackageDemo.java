package DayFour.Packages;

//import DayFour.Packages.College.Student;
//import DayFour.Packages.School.Student;

public class PackageDemo {
    public static void main(String[] args) {
        DayFour.Packages.College.Student s1 = new DayFour.Packages.College.Student();
        s1.print();

        DayFour.Packages.School.Student s2 = new DayFour.Packages.School.Student();
        s2.print();
    }
}
