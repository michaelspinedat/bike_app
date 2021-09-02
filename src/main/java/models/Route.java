/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Timestamp;

/**
 *
 * @author michael
 */
public class Route {

    private int id;
    private User user;
    private Timestamp start;
    private Timestamp end;
    private String startingLocation;
    private String finalLocation;
    private double distance;
    private String duration;

    public Route(int id, Timestamp end) {
        this.id = id;
        this.end = end;
    }

    public Route(User user, String startingLocation,
            String finalLocation, double distance) {
        this.user = user;
        this.startingLocation = startingLocation;
        this.finalLocation = finalLocation;
        this.distance = distance;
    }

    public Route(int id, User user, Timestamp start, Timestamp end,
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

    public Timestamp getStart() {
        return start;
    }

    public void setStart(Timestamp start) {
        this.start = start;
    }

    public Timestamp getEnd() {
        return end;
    }

    public void setEnd(Timestamp end) {
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

    public String getDuration() {
        if (this.start == null || this.end == null)
            return "";
        
        long milliseconds = this.end.getTime() - this.start.getTime();
        int seconds = (int) milliseconds / 1000;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds = (seconds % 3600) % 60;
        
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return String.format("id: %s%n user: %s%n start: %s, end: %s, startingLocation: %s, finalLocation: %s, distance: %s",
                this.id, this.user, this.start, this.end, this.startingLocation, this.finalLocation,
                this.distance);
    }

}
