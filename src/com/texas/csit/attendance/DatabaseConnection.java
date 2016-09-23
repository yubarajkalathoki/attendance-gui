package com.texas.csit.attendance;

import java.sql.*;

/**
 *
 * @author Yuba Raj Kalathoki
 */
public class DatabaseConnection {

    public static Connection getConnection() {
        Connection cn = null;
        String con;

        String server = "jdbc:mysql://localhost:3306/attendance";
        String username = "root";
        String password = "";
        try {
            con = "com.mysql.jdbc.Driver";
            Class.forName(con);
            cn = DriverManager.getConnection(server, username, password);
            System.out.println("Database Connected!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cn;
    }

    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.getConnection();
    }
}
