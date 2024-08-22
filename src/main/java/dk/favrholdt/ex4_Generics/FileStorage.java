package dk.favrholdt.ex4_Generics;

import java.io.*;
import java.util.UUID;

public class FileStorage<T> implements DataStorage<T> {

    @Override
    public String store(T data) {
        String filename = UUID.randomUUID().toString() + "filestorage.dat";
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filename;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T retrieve(String source) {
        T data = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(source))) {
            data = (T) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }
}
