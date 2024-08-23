package dk.favrholdt.ex5_MethodReferences;

//2.1 - Functional programming

//Functional interface for transforming integer values
@FunctionalInterface
interface MyTransformingType {
    int transform(int value);
}