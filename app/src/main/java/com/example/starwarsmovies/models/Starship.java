package com.example.starwarsmovies.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Starship {

    @SerializedName("name")
    public String name;

    @SerializedName("model")
    public String model;

    @SerializedName("manufacturer")
    public String manufacturer;

    @SerializedName("cost_in_credits")
    public String cost_in_credits;

    @SerializedName("length")
    public String length;

    @SerializedName("max_atmosphering_speed")
    public String max_atmosphering_speed;

    @SerializedName("crew")
    public String crew;

    @SerializedName("passengers")
    public String passengers;

    @SerializedName("cargo_capacity")
    public String cargo_capacity;

    @SerializedName("consumables")
    public String consumables;

    @SerializedName("hyperdrive_rating")
    public String hyperdrive_rating;

    @SerializedName("MGLT")
    public String MGLT;

    @SerializedName("starship_class")
    public String starship_class;

    @SerializedName("pilots")
    public ArrayList<String> pilots;

    @SerializedName("films")
    public ArrayList<String> films;

    @SerializedName("created")
    public String created;

    @SerializedName("edited")
    public String edited;

    @SerializedName("url")
    public String url;

    public Starship(String name, String model, String manufacturer, String cost_in_credits, String length, String max_atmosphering_speed, String crew, String passengers, String cargo_capacity, String consumables, String hyperdrive_rating, String MGLT, String starship_class, ArrayList<String> pilots, ArrayList<String> films, String created, String edited, String url) {
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.cost_in_credits = cost_in_credits;
        this.length = length;
        this.max_atmosphering_speed = max_atmosphering_speed;
        this.crew = crew;
        this.passengers = passengers;
        this.cargo_capacity = cargo_capacity;
        this.consumables = consumables;
        this.hyperdrive_rating = hyperdrive_rating;
        this.MGLT = MGLT;
        this.starship_class = starship_class;
        this.pilots = pilots;
        this.films = films;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCost_in_credits() {
        return cost_in_credits;
    }

    public void setCost_in_credits(String cost_in_credits) {
        this.cost_in_credits = cost_in_credits;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getMax_atmosphering_speed() {
        return max_atmosphering_speed;
    }

    public void setMax_atmosphering_speed(String max_atmosphering_speed) {
        this.max_atmosphering_speed = max_atmosphering_speed;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public String getCargo_capacity() {
        return cargo_capacity;
    }

    public void setCargo_capacity(String cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    public String getConsumables() {
        return consumables;
    }

    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    public String getHyperdrive_rating() {
        return hyperdrive_rating;
    }

    public void setHyperdrive_rating(String hyperdrive_rating) {
        this.hyperdrive_rating = hyperdrive_rating;
    }

    public String getMGLT() {
        return MGLT;
    }

    public void setMGLT(String MGLT) {
        this.MGLT = MGLT;
    }

    public String getStarship_class() {
        return starship_class;
    }

    public void setStarship_class(String starship_class) {
        this.starship_class = starship_class;
    }

    public ArrayList<String> getPilots() {
        return pilots;
    }

    public void setPilots(ArrayList<String> pilots) {
        this.pilots = pilots;
    }

    public ArrayList<String> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<String> films) {
        this.films = films;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Starship{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", cost_in_credits='" + cost_in_credits + '\'' +
                ", length='" + length + '\'' +
                ", max_atmosphering_speed='" + max_atmosphering_speed + '\'' +
                ", crew='" + crew + '\'' +
                ", passengers='" + passengers + '\'' +
                ", cargo_capacity='" + cargo_capacity + '\'' +
                ", consumables='" + consumables + '\'' +
                ", hyperdrive_rating='" + hyperdrive_rating + '\'' +
                ", MGLT='" + MGLT + '\'' +
                ", starship_class='" + starship_class + '\'' +
                ", pilots=" + pilots +
                ", films=" + films +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
