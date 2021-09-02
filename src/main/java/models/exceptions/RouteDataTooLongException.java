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
public class RouteDataTooLongException extends Exception{

    public RouteDataTooLongException(String message) {
        super(message);
    }        
}
