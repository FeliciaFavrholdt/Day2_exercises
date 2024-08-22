package dk.favrholdt.ex4_Generics;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseStorage<T> implements DataStorage<T> {

    private Connection connection;

    public DatabaseStorage(Connection connection) {
        this.connection = connection;
    }

    @Override
    public String store(T data) {
        return "";
    }

    @Override
    public T retrieve(String source) {
        return null;
    }

/*    @Override
    public String store(T data) {
        String id = UUID.randomUUID().toString();
        String query = "INSERT INTO storage (id, data) VALUES (?, ?)";

        try (PreparedStatement p = connection.prepareStatement(query)) {
            p.setString(1, id);
            p.setBytes(2, serialize(data));
            p.executeUpdate();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T retrieve(String source) {
        String query = "SELECT data FROM storage WHERE id = ?";
        T data = null;

        try (PreparedStatement p = connection.prepareStatement(query)) {
            p.setString(1, source);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                data = (T) deserialize(rs.getBytes("data"));
            }
        } catch (SQLException | IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }

    private byte[] serialize(T data) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(data);
        return bos.toByteArray();
    }

    private Object deserialize(byte[] bytes) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    } */
}