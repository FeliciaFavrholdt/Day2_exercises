package dk.favrholdt.ex3_FunctionalInterfaces;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Examples {
    public static void main(String[] args) {

        //Examples of functional interfaces in Java 8 (see commented out code below)
        /*
        //Consumer - takes in a value and returns nothing
        Consumer<String> consumer = (x) -> System.out.println(x);
        consumer.accept("Hello World!");

        //Supplier - returns a value
        Supplier<String> supplier = () -> "Hello World!";
        System.out.println(supplier.get());

        //Function - takes in a value and returns a value
        Function<String, Integer> function = (x) -> x.length();
        System.out.println(function.apply("Hello World!"));

        //Predicate - returns true or false
        Predicate<String> predicate = (x) -> x.length() > 10;
        System.out.println(predicate.test("Hello World!"));
        */

        //3.2 Use predicate to filter a list of integers, so only those divisible by 7 remain
        List<Integer> numbers = Arrays.asList(14, 9661, 5, 40, 3544, 49, 500, 700);

        Predicate<Integer> isDivisibleBySeven = num -> num % 7 == 0;

        System.out.println("Numbers divisible by 7:" + numbers.stream()
                .filter(isDivisibleBySeven)
                .toList());

    }

    //3.3 Use Supplier to create a list of Employee objects based on a list of names like Arrays.asList("John", "Jane", "Jack", "Joe", "Jill").

    //3.4 Use Consumer to print the list of Employee objects

    //3.5 Use Function to convert a list of Employee objects to a list of names.

    //3.6 Use Predicateto check if a given employee is older than 18.





}