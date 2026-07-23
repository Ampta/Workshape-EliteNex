package July.jul23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CsvToDatabase {
    private static final String url = "jdbc:mysql://localhost:3306/csv";
    private static final String user = "root";
    private static final String password = "root";

    public static Connection getConn() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }


    public static void main(String[] args) throws IOException, SQLException {
        List<String> lines = Files.readAllLines(Path.of("src/orders.csv"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        int count = 0;
        for(String line : lines){
            String[] data = line.split(",");
            int id = Integer.parseInt(data[0]);
            String product = data[1];
            double amount = Double.parseDouble(data[2]);
            String status = data[3];
            LocalDateTime createdAt = LocalDateTime.parse(data[4], formatter);

            String query = "insert into orders (id, product, amount, status, created_at) values (?, ?, ?, ?, ?)";

            try(Connection con = getConn();
                PreparedStatement statement = con.prepareStatement(query)
            ) {
                statement.setInt(1,id);
                statement.setString(2, product);
                statement.setDouble(3, amount);
                statement.setString(4,status);
                statement.setObject(5,createdAt);

                int result = statement.executeUpdate();
                if(result > 0){
                    count++;
                }
            }
        }

        if(count > 0){
            System.out.println("Number of row changed: " + count);
        }else {
            System.out.println("Failed to add items");
        }

    }
}
