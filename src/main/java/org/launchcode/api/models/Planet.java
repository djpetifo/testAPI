package org.launchcode.api.models;

public class Planet {
    private String name;
    private String diameter;
    private String star;
    private String distance;
    private String image;
    private int moons;

    public Planet(String name, String diameter, String star, String distance, String image, int moons) {
        this.name = name;
        this.diameter = diameter;
        this.star = star;
        this.distance = distance;
        this.image = image;
        this.moons = moons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getMoons() {
        return moons;
    }

    public void setMoons(int moons) {
        this.moons = moons;
    }
}
