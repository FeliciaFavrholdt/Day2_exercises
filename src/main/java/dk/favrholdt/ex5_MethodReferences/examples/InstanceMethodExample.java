package dk.favrholdt.ex5_MethodReferences.examples;

import java.util.ArrayList;
import java.util.List;

public class InstanceMethodExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Using instance method reference to print each element
        names.forEach(System.out::println);
    }
}