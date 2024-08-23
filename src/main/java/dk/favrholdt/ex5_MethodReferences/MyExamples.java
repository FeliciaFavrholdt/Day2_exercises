package dk.favrholdt.ex5_MethodReferences;

import java.util.Arrays;

public class MyExamples implements MyTransformingType, MyValidatingType {

    @Override
    public int transform(int value) {
        return 0;
    }

    @Override
    public boolean validate(int value) {
        return false;
    }

    //Map method: Applies the transformation operation
    public static int[] map(int[] a, MyTransformingType op) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = op.transform(a[i]);
        }
        return result;
    }

    //Filter method: filters the array based on the validation operation
    public static int[] filter(int[] a, MyValidatingType op) {
        return Arrays.stream(a)
                .filter(op::validate)
                .toArray();
    }

    public static void main(String[] args) {
        int[] numArray = {10, 2, 33, 4, 5, 69};

        //When running the above map and filter methods, you should provide them with an integer array and a lambda expression that performs the map or filter operation. For example, to double all the values in an array, you would call the map method like this: map(myArray, (x) -> x * 2);

        //Map to double all the values
        int[] doubledArray = map(numArray, (x) -> x * 2);
        System.out.println("Doubled Array: " + Arrays.toString(doubledArray));

        //Filter to keep only the values divisible by 3
        int[] filteredArray = filter(numArray, (x) -> x % 3 == 0);
        System.out.println("Filtered Array (divisible by 3): " + Arrays.toString(filteredArray));

        //add two to each element in the array
        int[] addToArray = map(numArray, (x) -> x + 2);
        System.out.println("Array with two added to each element: " + Arrays.toString(addToArray));
    }
}