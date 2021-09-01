/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import models.Route;
import models.User;

/**
 *
 * @author michael
 */
public class RouteJDBC {

    private static final String SQL_SELECT = "SELECT * FROM route WHERE user=?";

    private static final String SQL_INSERT = "INSERT INTO route(user, starting_location,"
            + " final_location, distance) "
            + "VALUES (?, ?, ?, ?)";

    private static final String SQL_UPDATE_END_TIME = "UPDATE route SET end=? WHERE id=?";
    
    private static final java.util.Calendar CALENDAR = Calendar.getInstance();

    public ArrayList<Route> getRoutes(User user) throws SQLException {
        java.sql.Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Route> routes = new ArrayList<>();

        conn = Connection.getConnection();
        stmt = conn.prepareStatement(SQL_SELECT);
        stmt.setString(1, user.getEmail());
        rs = stmt.executeQuery();

        while (rs.next()) {
            int routeId = rs.getInt("id");
            
            Timestamp start = rs.getTimestamp("start", CALENDAR);
            Timestamp end = rs.getTimestamp("end", CALENDAR);
            String startingLocation = rs.getString("starting_location");
            String finalLocation = rs.getString("final_location");
            double distance = rs.getDouble("distance");
            Route route = new Route(routeId, user, start, end,
                    startingLocation, finalLocation, distance);
            routes.add(route);
        }

        return routes;
    }

    public int insert(Route route) throws SQLException {
        java.sql.Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Connection.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, route.getUser().getEmail());
            stmt.setString(2, route.getStartingLocation());
            stmt.setString(3, route.getFinalLocation());
            stmt.setDouble(4, route.getDistance());
            rows = stmt.executeUpdate();
        } finally {
            Connection.close(stmt);
            Connection.close(conn);
        }

        return rows;
    }

    public int updateEndTime(Route route) throws SQLException {
        java.sql.Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;   
        try {
            conn = Connection.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE_END_TIME);
            stmt.setTimestamp(1, route.getEnd(), CALENDAR);
            stmt.setInt(2, route.getId());
            rows = stmt.executeUpdate();
        } finally {
            Connection.close(stmt);
            Connection.close(conn);
        }
        
        return rows;
    }

}
