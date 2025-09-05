class Student {
    String name;

    // constructor using 'this'
    Student(String name) {
        this.name = name;  // 'this' refers to current object's variable
    }

    void display() {
        System.out.println("Name: " + this.name);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Student s1 = new Student("Ali");
        s1.display();  // Output: Name: Ali
    }
}