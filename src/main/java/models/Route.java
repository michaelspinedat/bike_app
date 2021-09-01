/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;


/**
 *
 * @author michael
 */
public class Route {

    private int id;
    private User user;
    private Date start;
    private Date end;
    private String startingLocation;
    private String finalLocation;
    private double distance;

    public Route(User user, String startingLocation,
            String finalLocation, double distance) {
        this.user = user;        
        this.startingLocation = startingLocation;
        this.finalLocation = finalLocation;
        this.distance = distance;
    }

    public Route(int id, User user, Date start, Date end,
            String startingLocation, String finalLocation, double distance) {
        this.id = id;
        this.user = user;
        this.start = start;
        this.end = end;
        this.startingLocation = startingLocation;
        this.finalLocation = finalLocation;
        this.distance = distance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getStartingLocation() {
        return startingLocation;
    }

    public void setStartingLocation(String startingLocation) {
        this.startingLocation = startingLocation;
    }

    public String getFinalLocation() {
        return finalLocation;
    }

    public void setFinalLocation(String finalLocation) {
        this.finalLocation = finalLocation;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return String.format("id: %s%n user: %s%n start: %s, end: %s, startingLocation: %s, finalLocation: %s, distance: %s", 
                this.id, this.user, this.start, this.end, this.startingLocation, this.finalLocation,
                this.distance);
    }

    
    
}
