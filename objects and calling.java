// Class (blueprint)
class Car {
    // property (variable)
    String color;

    // method (function inside class)
    void drive() {
        System.out.println("Car is driving...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Car class
        Car myCar = new Car();   // 'myCar' is an object

        // Assign value to the object's variable
        myCar.color = "Red";

        // Call the object's method
        myCar.drive();

        // Print the object's variable
        System.out.println("Car color: " + myCar.color);
    }
}