package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static String DB_URL = "jdbc:mysql://localhost:3306/workshop2";
    private static String DB_USER = "#####";
    private static String DB_PASS = "######";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
    }
}
