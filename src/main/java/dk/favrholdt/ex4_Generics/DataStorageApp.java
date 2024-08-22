package dk.favrholdt.ex4_Generics;

public class DataStorageApp {
    public static void main(String[] args) {
        DataStorage<String> memoryStorage = new MemoryStorage<>();
        memoryStorage.store("Hello, world!");
        String retrievedString = memoryStorage.retrieve(null);

        DataStorage<Employee> fileStorage = new FileStorage<>();
        String filename = fileStorage.store(new Employee("Mads", 22));
        Employee retrievedInt = fileStorage.retrieve(filename);

        // Create and demonstrate DatabaseStorage
    }
}
