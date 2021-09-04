/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Novelty;

/**
 *
 * @author michael
 */
public class NoveltyJDBC {

    private static final String SQL_SELECT = "SELECT title, type, description FROM novelty WHERE route=?";

    private static final String SQL_INSERT = "INSERT INTO novelty (title, route, type, description) "
            + "VALUES (?, ?, ?, ?)";

    public ArrayList<Novelty> select(int routeId) throws SQLException {
        ArrayList<Novelty> novelties = new ArrayList<>();
        java.sql.Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Connection.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            stmt.setInt(1, routeId);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String title = rs.getString("title");
                String type = rs.getString("type");
                String description = rs.getString("description");

                Novelty novelty = new Novelty(title, type, description);
                novelties.add(novelty);
            }
        } finally {
            Connection.close(rs);
            Connection.close(stmt);
            Connection.close(conn);
        }

        return novelties;
    }

    public int insert(Novelty novelty) throws SQLException {
        java.sql.Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Connection.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, novelty.getTitle());
            stmt.setInt(2, novelty.getRoute().getId());
            stmt.setString(3, novelty.getType());
            stmt.setString(4, novelty.getDescription());
            rows = stmt.executeUpdate();
        } finally {
            Connection.close(stmt);
            Connection.close(conn);
        }

        return rows;
    }
}
