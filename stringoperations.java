public class StringOperations {
    public static void main(String[] args) {
        // create a string
        String str = "   Hello Java World   ";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // 3. charAt(index)
        System.out.println("Character at index 6: " + str.charAt(6));

        // 4. concat()
        String str2 = " - Programming";
        System.out.println("Concatenated: " + str.concat(str2));

        // 5. equals() and equalsIgnoreCase()
        String s1 = "Java";
        String s2 = "java";
        System.out.println("Equals: " + s1.equals(s2)); // false
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2)); // true

        // 6. substring()
        System.out.println("Substring(3, 8): " + str.substring(3, 8));

        // 7. replace()
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        // 8. trim()
        System.out.println("Before trim: [" + str + "]");
        System.out.println("After trim: [" + str.trim() + "]");

        // 9. split()
        String fruits = "Apple,Banana,Orange";
        String[] arr = fruits.split(","); // split by comma
        System.out.println("Split fruits:");
        for (String f : arr) {
            System.out.println(f);
        }
    }
}