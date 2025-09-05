// Class with constructors
class Student {
    String name;
    int age;

    // Simple (default) constructor
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Simple constructor called");
    }

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized constructor called");
    }

    // Method to display data
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using simple constructor
        Student s1 = new Student();
        s1.display();

        // Using parameterized constructor
        Student s2 = new Student("Ali", 20);
        s2.display();
    }
}