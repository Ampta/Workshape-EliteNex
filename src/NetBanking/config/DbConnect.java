package NetBanking.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    private static final String url = "jdbc:mysql://localhost:3306/bank_db";
    private static final String user = "root";
    private static final String password = "root";

    public static Connection getConn() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
