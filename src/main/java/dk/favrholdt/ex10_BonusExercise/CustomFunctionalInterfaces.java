package dk.favrholdt.ex10_BonusExercise;

public class CustomFunctionalInterfaces {

    //Define custom functional interfaces to represent various operations. For example, you could define an interface for filtering employees based on a certain condition.
    @FunctionalInterface
    interface EmployeeFilter {
        boolean filter(Employee employee);
    }

    @FunctionalInterface
    interface EmployeeComparator {
        int compare(Employee employee1, Employee employee2);
    }

    @FunctionalInterface
    interface EmployeeMapper {
        double map(Employee employee);
    }


}