package com.example.pract12;

public class State {

    private String name; // название
    private String class_of_gun;  // столица
    private int gunResource; // ресурс флага
    private String textt;

    public State(String name, String class_vint, int gun, String textt){

        this.name=name;
        this.class_of_gun = class_vint;
        this.gunResource =gun;
        this.textt =textt;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass_of_gun() {
        return this.class_of_gun;
    }

    public void setClass_of_gun(String class_of_gun) {
        this.class_of_gun = class_of_gun;
    }

    public int getGunResource() {
        return this.gunResource;
    }

    public void setGunResource(int gunResource) {
        this.gunResource = gunResource;
    }
    public String getTextt() {
        return this.textt;
    }

    public void setTextt(String textt) {
        this.textt = textt;
    }
}