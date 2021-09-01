/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import data.RouteJDBC;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michael
 */
public class Main {
    
    public static void main(String[] args) {

        User user = new User("steven@gmail.com", "123");
        RouteJDBC routeJDBC = new RouteJDBC();
        
        Timestamp end = new Timestamp(new Date().getTime());
        
        Route route = new Route(2, end);
        try {
            routeJDBC.updateEndTime(route);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
