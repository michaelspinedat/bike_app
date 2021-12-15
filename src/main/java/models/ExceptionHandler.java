/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.mysql.cj.jdbc.exceptions.CommunicationsException;
import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;
import java.awt.Component;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;
import models.exceptions.RouteDataTooLongException;
import models.exceptions.UserDataTooLongException;

/**
 *
 * @author michael
 */
public class ExceptionHandler {

    public static void showErrorMsg(Component component, Exception e) {
        System.out.println(e.getMessage());
        if (e instanceof CommunicationsException) {
            showMsg(component, "Error en la conexión con la base de datos/nIntenta más tarde");
        } else if (e instanceof MysqlDataTruncation) {
            showMsg(component, "Error en la información de un campo");
        } else if (e instanceof UserDataTooLongException) {
            showMsg(component, e.getMessage());
        } else if (e instanceof SQLIntegrityConstraintViolationException) {            
            showMsg(component, "Ya existe alguien registrado con ese correo");
        } else if (e instanceof RouteDataTooLongException) {
            showMsg(component, e.getMessage());
        }
    }

    private static void showMsg(Component component,
            String msg) {
        JOptionPane.showMessageDialog(component, msg);
    }

}
