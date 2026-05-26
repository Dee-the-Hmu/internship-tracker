package com.dee.internshiptracker.util;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBconnection {
    private static final String USER = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/internshiptracker";
    private static final String PASSWORD = "CS157DeeAein"; 

    public static Connection getConnection() throws SQLException {

        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        return connection;
    }
}
