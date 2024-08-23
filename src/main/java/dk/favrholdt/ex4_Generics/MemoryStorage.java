package dk.favrholdt.ex4_Generics;

public class MemoryStorage<T> implements DataStorage<T> {
    private T data;

    public String store(T data) {
        this.data = data;
        return data.toString();
    }

    @Override
    public T retrieve(String source) {
        return null;
    }

    public T retrieve() {
        return data;
    }
}