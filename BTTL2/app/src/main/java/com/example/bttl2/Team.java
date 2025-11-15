package com.example.bttl2;

public class Team {
    private String name;
    private int logo;
    private String region;

    public Team(String name, int logo, String region) {
        this.name = name;
        this.logo = logo;
        this.region = region;
    }

    public String getName() { return name; }
    public int getLogo() { return logo; }
    public String getRegion() { return region; }
}