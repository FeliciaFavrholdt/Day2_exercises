package dk.favrholdt.ex5_MethodReferences;

import java.util.Arrays;

public class StaticMethodExample {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        // Using static method reference to sort the array
        Arrays.sort(names, StaticMethodExample::compareNames);

        // Printing the sorted array
        for (String name : names) {
            System.out.println(name);
        }
    }

    // Static method for comparing names
    public static int compareNames(String a, String b) {
        return a.compareTo(b);
    }
}