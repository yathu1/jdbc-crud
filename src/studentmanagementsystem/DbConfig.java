package studentmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConfig {
    private static DbConfig instance;

    private DbConfig() {
    }

    public static synchronized DbConfig getInstance() {
        if (instance == null) {
            instance = new DbConfig();
        }
        return instance;
    }

    public Connection dbConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/devAcademy","root","root");
        return con;
    }
}
