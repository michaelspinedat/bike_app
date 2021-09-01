/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import data.UserJDBC;
import java.sql.SQLException;

/**
 *
 * @author michael
 */
public class Main {
    
    public static void main(String[] args) {
                
        UserJDBC userJDBC = new UserJDBC();

        try {                                    
            User user = new User("steven@gmail.com", "122");
            System.out.println(user);
            User validatedUser  = userJDBC.validateUser(user);
            if (validatedUser != null)
                System.out.println(validatedUser);
            else
                System.out.println("Credenciales incorrectas");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
