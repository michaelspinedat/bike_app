/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import models.exceptions.UserDataTooLongException;

/**
 *
 * @author michael
 */
public class User {

    public static final int EMAIL_LENGTH = 60;
    public static final int PHONE_LENGTH = 10;
    public static final int NAME_LENGTH = 60;
    public static final int PASSWORD_LENGTH = 25;

    private String email;
    private String phone;
    private String name;
    private String password;

    public User(String email, String phone, String name, String password) throws UserDataTooLongException {
        this.setEmail(email);
        this.setPhone(phone);
        this.setName(name);
        this.setPassword(password);
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws UserDataTooLongException {
        if (email.length() <= EMAIL_LENGTH) {
            this.email = email;
        } else {
            throw new UserDataTooLongException("Email demasiado largo");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws UserDataTooLongException {
        if (phone.length() <= PHONE_LENGTH) {
            this.phone = phone;
        } else {
            throw new UserDataTooLongException("Teléfono demasiado largo");
        }
    }

    public String getName() {
        return name.toUpperCase();
    }

    public void setName(String name) throws UserDataTooLongException {
        if (name.length() <= NAME_LENGTH) {
            this.name = name;
        } else {
            throw new UserDataTooLongException("Nombre demasiado largo");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws UserDataTooLongException {
        if (password.length() <= PASSWORD_LENGTH) {
            this.password = password;
        } else {
            throw new UserDataTooLongException("Contraseña demasiado larga");
        }
    }

    @Override
    public String toString() {
        return String.format("email: %s, nombre: %s, phone: %s, password: %s",
                this.email, this.name, this.phone, this.password);
    }

}
