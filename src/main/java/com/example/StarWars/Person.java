package com.example.StarWars;

import java.time.LocalTime;

public class Person
{
    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeworld;
    private String[] films;
    private String[] species;
    private String[] vehicles;
    private String[] starships;
    private LocalTime created;
    private LocalTime edited;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setHeight(String newheight) {
        this.height = newheight;
    }

    public String getHeight() {
        return height;
    }

    public void setMass(String newMass) {
        this.mass = newMass;
    }

    public String getMass() {
        return mass;
    }

    public void setHair_color(String newHair) {
        this.hair_color = newHair;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setSkin_color(String newSkinColor) {
        this.skin_color = newSkinColor;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getEye_color() {
        return eye_color;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setFilms(String[] films) {
        this.films = films;
    }

    // Getter
    public String[] getFilms() {
        return films;
    }

    public void setSpecies(String[] species) {
        this.species = species;
    }

    public String[] getSpecies() {
        return species;
    }

    public void setVehicles(String[] vehicles) {
        this.vehicles = vehicles;
    }

    public String[] getVehicles() {
        return vehicles;
    }

    public void setStarships(String[] starships) {
        this.starships = starships;
    }

    public String[] getStarships() {
        return starships;
    }

    public void setCreated(LocalTime created) {
        this.created = created;
    }

    public LocalTime getCreated() {
        return created;
    }

    public void setEdited(LocalTime edited) {
        this.edited = edited;
    }

    public LocalTime getEdited() {
        return edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
