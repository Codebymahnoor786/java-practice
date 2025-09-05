// final variable example
class Circle {
    final double PI = 3.14; // constant value

    double area(int r) {
        return PI * r * r;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Area: " + c.area(5)); // Output: Area: 78.5
    }
}