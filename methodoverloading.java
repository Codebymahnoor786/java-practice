class MathOperation {
    // same method name, different parameters
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();

        System.out.println(obj.add(5, 10));        // int version call
        System.out.println(obj.add(2.5, 3.7));    // double version call
    }
}