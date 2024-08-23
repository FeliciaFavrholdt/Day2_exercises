/*
package dk.favrholdt.ex5_MethodReferences;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiFunction;

public class ConstructorMethodExample {
    public static void main(String[] args) {
        // Using constructor method reference to create instances
       */
/* Supplier<Person> personSupplier = Person::new; // no-arg constructor
        Person person = personSupplier.get();
        person.getName();

        Function<String, Person> personCreatorOne = Person::new; // one-arg constructor
        Person person = personCreatorOne.apply("Alice");

        BiFunction<String, String, Person> personCreatorTwo = Person::new; // two-arg constructor
        Person person = personCreatorTwo.apply("Alice", "Johnson");

        // Using constructor method reference to create a Person object directly
        PersonCreator creator = Person::new;
        Person person = creator.createPerson("Alice");
        System.out.println("Person Name: " + person.getName());
    }*//*


        @FunctionalInterface
        interface PersonCreator {
            Person createPerson(String name);
        }

        class Person {
            private String name;

            // 3 constructors:
            public Person() {
                this.name = "Unknown";
            }

            public Person(String name) {
                this.name = name;
            }

            public Person(String firstName, String lastName) {
                this.name = firstName + " " + lastName;
            }

            public String getName() {
                return name;
            }
        }
    }
}*/
