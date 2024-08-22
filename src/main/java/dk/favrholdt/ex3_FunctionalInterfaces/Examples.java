package dk.favrholdt.ex3_FunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
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

        //3.3 Use Supplier to create a list of Employee objects based on a list of names like Arrays.asList("John", "Jane", "Jack", "Joe", "Jill")
        Supplier<List<Employee>> createEmployees = getListSupplier();

        //3.4 Use Consumer to print the list of Employee objects
        Consumer<Employee> printEmployee = System.out::println;
        printEmployee.accept(createEmployees.get().get(0)); // Output: Employee{name='John', age=45}

        //3.5 Use Function to convert a list of Employee objects to a list of names
        Function<List<Employee>, List<String>> convertToNames = convertObjectsToListOfNames();
        System.out.println("Names: " + convertToNames.apply(createEmployees.get()));

        //3.6 Use Predicate to check if a given employee is older than 18
        Predicate<Employee> isOlderThan = (employee) -> employee.getAge() > 18;
        System.out.println("Is the employee older than 18? " + isOlderThan.test(createEmployees.get().get(0))); // Output: true


    }

    private static Supplier<List<Employee>> getListSupplier() {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Joe", "Jill");

        Supplier<List<Employee>> createEmployees = () -> {
            List<Employee> employees = new ArrayList<>();
            for (String name : names) {
                employees.add(new Employee(name, new Random().nextInt(80)));
            }
            return employees;
        };
        return createEmployees;
    }

    private static Function<List<Employee>, List<String>> convertObjectsToListOfNames() {
        List<Employee> employees = getListSupplier().get();
        Function<Employee, String> getNameFunction = Employee::getName;

        List<String> names = employees.stream()
                .map(getNameFunction)
                .toList();

        return (list) -> names;
    }
}