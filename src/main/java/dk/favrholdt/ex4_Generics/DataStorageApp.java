package dk.favrholdt.ex4_Generics;

import java.time.LocalDate;

public class DataStorageApp {
    public static void main(String[] args) {

        DataStorage<String> memoryStorage = new MemoryStorage<>();
        memoryStorage.store("Some data");
        String retrievedString = memoryStorage.retrieve("Some data");
        System.out.println(retrievedString);

        FileStorage<Employee> fileStorage = new FileStorage<>("employeeData.txt");
        fileStorage.store(new Employee("Mads", 22, LocalDate.now()));
        Employee retrieved = fileStorage.retrieve("employeeData.txt");
        System.out.println(retrieved);

        /*DatabaseStorage<Employee> databaseStorage = new DatabaseStorage<>("database");
        databaseStorage.store(new Employee("Mads", 22, LocalDate.now()));
        Employee retrievedFromDatabase = databaseStorage.retrieve("Mads");
        System.out.println(retrievedFromDatabase);*/
    }
}
