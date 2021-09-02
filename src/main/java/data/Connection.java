/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author michael
 */
public class Connection {

    private static final String JDBC_URL = "jdbc:mysql://localhost/bike_app?useSSL=false&serverTimezone=UTC";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "";

    public static java.sql.Connection getConnection() throws SQLException {
        java.sql.Connection conn
                = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);

        return conn;
    }

    public static void close(PreparedStatement stmt) throws SQLException {
        if (stmt != null) {
            stmt.close();
        }
    }

    public static void close(java.sql.Connection conn) throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }

    public static void close(ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();
        }
    }
}
