package com.learning.a006_planetsapp;

public class Country {
    /* Model class for the ListView: represents the data structure for each individual item in the list.
     * It defines the attributes and behaviors associated with each item.
     */

    // Attributes
    private String countryName, wins;
    private int flagImg;

    // Constructor
    public Country(String countryName, String wins, int flagImg) {
        this.countryName = countryName;
        this.wins = wins;
        this.flagImg = flagImg;
    }

    // Getters & Setters
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWins() {
        return wins;
    }

    public void setWins(String wins) {
        this.wins = wins;
    }

    public int getFlagImg() {
        return flagImg;
    }

    public void setFlagImg(int flagImg) {
        this.flagImg = flagImg;
    }
}
