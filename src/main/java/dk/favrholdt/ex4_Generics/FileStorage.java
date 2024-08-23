package dk.favrholdt.ex4_Generics;

import java.io.*;

public class FileStorage<T> implements DataStorage<T> {

    private final String filename;

    public FileStorage(String filename) {
        this.filename = filename;
    }

    @Override
    public String store(T data) {
        saveDataToFile(data);
        return filename;
    }

    @Override
    public T retrieve(String source) {
        return loadObjectFromFile(source);
    }

    // Save object to file
    public void saveDataToFile(T data) {
        try (final FileOutputStream fileOutputStream = new FileOutputStream(filename);
             final ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(data);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public T loadObjectFromFile(String fileName) {
        try (final FileInputStream fileInputStream = new FileInputStream(fileName);
             final ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (T) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}