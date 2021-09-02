/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.exceptions;

/**
 *
 * @author michael
 */
public class UserDataTooLongException extends Exception{

    public UserDataTooLongException(String message) {
        super(message);
    }
    
}
