/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.User;
import models.exceptions.UserDataTooLongException;

/**
 *
 * @author michael
 */
public class UserJDBC {

    private static final String SQL_SELECT = "SELECT email, name, phone, password FROM user WHERE email=?";
    private static final String SQL_INSERT = "INSERT INTO user (email, name, phone, password) "
            + "VALUES (?, ?, ?, ?)";

    public User select(String email) throws SQLException {
        User user = null;
        java.sql.Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Connection.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            stmt.setString(1, email);
            rs = stmt.executeQuery();
            if (rs.next()) {
                user = new User(rs.getString("email"), rs.getString("phone"),
                        rs.getString("name"), rs.getString("password"));
            }

        } catch (UserDataTooLongException ex) {
            System.out.println("Data errónea");
        } finally {
            Connection.close(rs);
            Connection.close(stmt);
            Connection.close(conn);
        }

        return user;
    }

    public int insert(User user) throws SQLException {
        java.sql.Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Connection.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, user.getEmail());
            stmt.setString(2, user.getName());
            stmt.setString(3, user.getPhone());
            stmt.setString(4, user.getPassword());
            rows = stmt.executeUpdate();
        } finally {
            Connection.close(stmt);
            Connection.close(conn);
        }

        return rows;
    }

    public User validateUser(User user) throws SQLException {

        User helperUser = select(user.getEmail());

        if (helperUser != null && user.getPassword().equals(helperUser.getPassword())) {
            return helperUser;
        }
        return null;
    }

}
