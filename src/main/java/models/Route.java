/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Timestamp;
import java.util.Date;
import models.exceptions.RouteDataTooLongException;

/**
 *
 * @author michael
 */
public class Route {

    public static final int STARTING_LOCATION_LENGTH = 60;
    public static final int FINAL_LOCATION_LENGTH = 60;
    public static final double DISTANCE_MAX_VALUE = Double.MAX_VALUE;
    public static final double DISTANCE_MIN_VALUE = 0d;
    
    public static final Date LIMIT_DATE = new Date("2021/09/22");

    private int id;
    private User user;
    private Timestamp start;
    private Timestamp end;
    private String startingLocation;
    private String finalLocation;
    private double distance;
    private String duration;

    public Route(User user, String startingLocation, Timestamp start) throws RouteDataTooLongException {
        this.setUser(user);
        this.setStartingLocation(startingLocation);
        this.setStart(start);
    }

    public Route(int id, String startingLocation, Timestamp start) throws RouteDataTooLongException {
        this.setId(id);
        this.setStartingLocation(startingLocation);
        this.setStart(start);
    }

    public Route(int id, Timestamp end, String finalLocation, double distance) throws RouteDataTooLongException {
        this.id = id;
        this.setEnd(end);
        this.setFinalLocation(finalLocation);
        this.setDistance(distance);
    }

    public Route(User user, String startingLocation) throws RouteDataTooLongException {
        this.user = user;
        this.setStartingLocation(startingLocation);
    }

    public Route(User user, String startingLocation,
            String finalLocation, double distance) throws RouteDataTooLongException {
        this.user = user;
        this.setStartingLocation(startingLocation);
        this.setFinalLocation(finalLocation);
        this.setDistance(distance);
    }
    
    public Route (int id) {
        this.setId(id);
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

    public void setStartingLocation(String startingLocation) throws RouteDataTooLongException {
        if (startingLocation.length() <= STARTING_LOCATION_LENGTH) {
            this.startingLocation = startingLocation;
        } else {
            throw new RouteDataTooLongException(
                    "Nombre de ubicaci??n inicial demasiado largo");
        }
    }

    public String getFinalLocation() {
        return finalLocation;
    }

    public void setFinalLocation(String finalLocation) throws RouteDataTooLongException {
        if (finalLocation.length() <= FINAL_LOCATION_LENGTH) {
            this.finalLocation = finalLocation;
        } else {
            throw new RouteDataTooLongException(
                    "Nombre de ubicaci??n final demasiado largo");
        }
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) throws RouteDataTooLongException {
        if (distance > DISTANCE_MIN_VALUE && distance <= DISTANCE_MAX_VALUE) {
            this.distance = distance;
        } else {
            throw new RouteDataTooLongException(
                    "Distancia incorrecta");
        }
    }

    public String getDuration() {
        if (this.start == null || this.end == null) {
            return "";
        }

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
