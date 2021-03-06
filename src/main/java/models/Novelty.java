/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author michael
 */
public class Novelty {

    public static enum Type {
        CIERRE_VIAL("Cierre vial"), FALLA_MECANICA("Falla mecánica"),
        ACCIDENTE("Accidente"), OTRO("Otro");

        private final String type;

        private Type(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }

        @Override
        public String toString() {
            return this.getType();
        }

    }

    private int id;
    private String title;
    private Route route;
    private String type;
    private String description;

    public Novelty(String title, Route route, String type, String description) {
        this.title = title;
        this.route = route;
        this.type = type;
        this.description = description;
    }

    public Novelty(String title, String type, String description) {
        this.title = title;
        this.type = type;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.getTitle();
    }

}
