// Parent class
class Person {
    String name;

    // Parent class constructor
    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called");
    }
}

// Child class
class Student extends Person {
    int rollNo;

    // Child class constructor
    Student(String name, int rollNo) {
        super(name); // parent constructor call
        this.rollNo = rollNo;
        System.out.println("Student constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ali", 101);
        s1.display();
    }
}