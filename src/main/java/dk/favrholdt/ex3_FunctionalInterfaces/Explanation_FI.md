## EXPLANATION OF FUNCTIONAL INTERFACES
    
### What is a functional interface?
A functional interface is an interface that has exactly one abstract method. It can have multiple default methods or static methods. It can also have methods from the Object class (like equals() and hashCode()).

EXAMPLE:
```java
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}
```

### Why do we need functional interfaces?
Functional interfaces provide target types for lambda expressions and method references. They enable us to treat functionality as a method argument, or code as data. This is useful for passing behavior to methods, like in the Stream API.

EXAMPLE:
```java
public void doSomething(MyFunctionalInterface myFunctionalInterface) {
    myFunctionalInterface.myMethod();
}
```

### What is the @FunctionalInterface annotation?
The @FunctionalInterface annotation is used to ensure that an interface is a functional interface. It is not required, but it is good practice to use it. If the interface is not a functional interface, the compiler will throw an error.

EXAMPLE:
```java
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}
```

### Predicate<T>:
Predicate is a functional interface that represents a condition (boolean-valued function) that takes one argument of type T and returns true or false.
Example: You might use a Predicate<Integer> to check if an integer is even, where the predicate returns true if the number is even and false otherwise.

Example:

```java
Predicate<T> something = (T t) -> {
    // Do something with t
    return boolean;
};

Predicate<Integer> isEven = (n) -> n % 2 == 0;
System.out.println(isEven.test(4)); // Output: true
```

### Consumer<T>:
Consumer is a functional interface that represents an operation that takes a single input of type T and performs some action on it but does not return any result.
Example: You might use a Consumer<String> to print out each string in a list.

Example:
```java
function<T> something = (T t) -> {
    // Do something with t
};

Consumer<String> printString = (s) -> System.out.println(s);
printString.accept("Hej ven!"); // Output: Hej ven!
```

### Supplier<T>:
Supplier is a functional interface that represents a supplier of results. It does not take any arguments but returns a result of type T.
Example: You might use a Supplier<LocalDateTime> to get the current date and time.

Example:

```java
Supplier<T> something = () -> {
    // Do something
    return T;
};

Supplier<LocalDateTime> getCurrentDateTime = () -> LocalDateTime.now();
System.out.println(getCurrentDateTime.get()); // Output: Current date and time
```

### Function<T, R>:
Function is a functional interface that represents a function that takes an argument of type T and produces a result of type R.
Example: You might use a Function<String, Integer> to convert a string representing a number into an integer.

Example:

```java
Function<T, R> something = (T t) -> {
    // Do something with t
    return R;
};

Function<String, Integer> stringToInt = (s) -> Integer.parseInt(s);
System.out.println(stringToInt.apply("42")); // Output: 42
```