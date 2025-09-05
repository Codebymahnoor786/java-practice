// Interface (like a blueprint/contract)
interface Animal {
    // abstract method (no body here)
    void sound();
}

// Class implementing interface
class Dog implements Animal {
    // Providing body of the method
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Another class implementing interface
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // We can use interface reference for objects
        Animal a1 = new Dog();  // Dog object
        Animal a2 = new Cat();  // Cat object

        // Calling methods (actual class method will run)
        a1.sound();  // Output: Dog barks
        a2.sound();  // Output: Cat meows
    }
}