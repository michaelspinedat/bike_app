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
        
        User user1 = new User("steven@gmail.com", "3148000279", "steven", "123");
        UserJDBC userJDBC = new UserJDBC();
        
        try {
            userJDBC.insert(user1);
        } catch (SQLException ex) {
            System.out.println("Cédula duplicada");
        }
    }
}
