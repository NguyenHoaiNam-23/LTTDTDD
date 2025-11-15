package com.example.bttl2;

public class Player {
    private String name;
    private String detail;
    private int image;

    public Player(String name, String detail, int image) {
        this.name = name;
        this.detail = detail;
        this.image = image;
    }

    public String getName() { return name; }
    public String getDetail() { return detail; }
    public int getImage() { return image; }
}