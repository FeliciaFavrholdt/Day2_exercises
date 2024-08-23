package dk.favrholdt.ex5_MethodReferences;

//2.2 - Functional programming

//Functional interface for validating integer values
@FunctionalInterface
interface MyValidatingType {
    boolean validate(int value);
}