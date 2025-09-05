class Counter {
    static int count = 0; // static variable (shared by all objects)

    Counter() {
        count++;
        System.out.println("Object created, count = " + count);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        // count increases for all objects (shared)
    }
}