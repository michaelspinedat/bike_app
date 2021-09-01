/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import data.RouteJDBC;
import data.UserJDBC;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michael
 */
public class Main {
    
    public static void main(String[] args) {
                
        User user = new User("steven@gmail.com", "123");
        UserJDBC userJDBC = new UserJDBC();
        RouteJDBC routeJDBC = new RouteJDBC();
        
        try {
            User validatedUser = userJDBC.validateUser(user);
            if (validatedUser != null) {
                System.out.println("Datos correctos");
//                Route route = new Route(validatedUser, "Pereira", "Manizales", 95.7);
//                routeJDBC.insert(route);
                routeJDBC.getRoutes(validatedUser).forEach(r -> System.out.println(r));
            }
        } catch (SQLException ex) {
            System.out.println("Error");
        }
        
        
    }
}
