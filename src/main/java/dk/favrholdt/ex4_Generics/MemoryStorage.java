package dk.favrholdt.ex4_Generics;

import java.util.HashMap;
import java.util.UUID;

public class MemoryStorage<T> implements DataStorage<T> {
    private HashMap<String, T> storage = new HashMap<>();

    @Override
    public String store(T data) {
        String id = UUID.randomUUID().toString();
        storage.put(id, data);
        return id;
    }

    @Override
    public T retrieve(String source) {
        return storage.get(source);
    }
}