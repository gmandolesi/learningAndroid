package com.learning.a006_planetsapp;

public class Planet {
    /* Model class for the ListView: represents the data structure for each individual item in the list.
     * It defines the attributes and behaviors associated with each item.
     */

    // Attributes
    private String planetName, moonCount;
    private int planetImage;

    // Constructor
    public Planet(String planetName, String moonCount, int planetImage) {
        this.planetName = planetName;
        this.moonCount = moonCount;
        this.planetImage = planetImage;
    }

    // Getters & Setters
    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }
}
