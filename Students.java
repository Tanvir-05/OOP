
class student {
//properties

    int id;
    String name;
    int age;
    String department;

//constructor
    student() {
    }

    student(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

//methods
    void study() {
        System.out.println(name + " is studying");
    }

    void attend() {
        System.out.println(name + " is attending class");
    }

    void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Department: " + department);
    }
}

public class Students {

    public static void main(String[] args) {

        //creating object of student class
        student s1 = new student();
        s1.id = 101;
        s1.name = "John Doe";
        s1.age = 20;
        s1.department = "Computer Science";

        student s2 = new student(102, "Jane Smith", 21, "Mathematics");

        //calling methods
        s1.displayInfo();
        s1.study();
        s1.attend();

        System.out.println();

        s2.displayInfo();
        s2.study();
        s2.attend();

    }
}
