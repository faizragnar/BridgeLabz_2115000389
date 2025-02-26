import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Record {
    public String name;
    public int age;

    public Record(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class DatabaseToJsonReport {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT name, age FROM users");

        List<Record> records = new ArrayList<>();
        while (rs.next()) {
            records.add(new Record(rs.getString("name"), rs.getInt("age")));
        }

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(records);
        System.out.println(json);

        rs.close();
        stmt.close();
        conn.close();
    }
}
