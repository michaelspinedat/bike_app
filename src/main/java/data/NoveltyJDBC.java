/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.Novelty;

/**
 *
 * @author michael
 */
public class NoveltyJDBC {
    
    private static final String SQL_INSERT = "INSERT INTO novelty (route, type, description) "
            + "VALUES (?, ?, ?)";
    
    public int insert (Novelty novelty) throws SQLException {
        java.sql.Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Connection.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, novelty.getRoute().getId());
            stmt.setString(2, novelty.getType());
            stmt.setString(3, novelty.getDescription());
            rows = stmt.executeUpdate();
        } finally {
            Connection.close(stmt);
            Connection.close(conn);
        }

        return rows;        
    }
}
