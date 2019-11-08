package com.example.starwarsmovies.unused;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Species {

    @SerializedName("name")
    public String name;

    @SerializedName("classification")
    public String classification;

    @SerializedName("designation")
    public String designation;

    @SerializedName("average_height")
    public String average_height;

    @SerializedName("skin_colors")
    public String skin_colors;

    @SerializedName("hair_colors")
    public String hair_colors;

    @SerializedName("eye_colors")
    public String eye_colors;

    @SerializedName("average_lifespan")
    public String average_lifespan;

    @SerializedName("homeworld")
    public String homeworld;

    @SerializedName("language")
    public String language;

    @SerializedName("people")
    public ArrayList<String>people;

    @SerializedName("films")
    public ArrayList<String>films;

    @SerializedName("created")
    public String created;

    @SerializedName("edited")
    public String edited;

    @SerializedName("url")
    public String url;

    public Species(String name, String classification, String designation, String average_height, String skin_colors, String hair_colors, String eye_colors, String average_lifespan, String homeworld, String language, ArrayList<String> people, ArrayList<String> films, String created, String edited, String url) {
        this.name = name;
        this.classification = classification;
        this.designation = designation;
        this.average_height = average_height;
        this.skin_colors = skin_colors;
        this.hair_colors = hair_colors;
        this.eye_colors = eye_colors;
        this.average_lifespan = average_lifespan;
        this.homeworld = homeworld;
        this.language = language;
        this.people = people;
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

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAverage_height() {
        return average_height;
    }

    public void setAverage_height(String average_height) {
        this.average_height = average_height;
    }

    public String getSkin_colors() {
        return skin_colors;
    }

    public void setSkin_colors(String skin_colors) {
        this.skin_colors = skin_colors;
    }

    public String getHair_colors() {
        return hair_colors;
    }

    public void setHair_colors(String hair_colors) {
        this.hair_colors = hair_colors;
    }

    public String getEye_colors() {
        return eye_colors;
    }

    public void setEye_colors(String eye_colors) {
        this.eye_colors = eye_colors;
    }

    public String getAverage_lifespan() {
        return average_lifespan;
    }

    public void setAverage_lifespan(String average_lifespan) {
        this.average_lifespan = average_lifespan;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ArrayList<String> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<String> people) {
        this.people = people;
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
        return "Species{" +
                "name='" + name + '\'' +
                ", classification='" + classification + '\'' +
                ", designation='" + designation + '\'' +
                ", average_height='" + average_height + '\'' +
                ", skin_colors='" + skin_colors + '\'' +
                ", hair_colors='" + hair_colors + '\'' +
                ", eye_colors='" + eye_colors + '\'' +
                ", average_lifespan='" + average_lifespan + '\'' +
                ", homeworld='" + homeworld + '\'' +
                ", language='" + language + '\'' +
                ", people=" + people +
                ", films=" + films +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
