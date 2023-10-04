package de.duckdestroyer.wss.entity;

public class Human {

    private String name;
    private int age;
    private char gender;
    private String clan;
    private int skillLevel;
    private boolean mature;

    public Human(String name, int age, char gender, String clan, int skillLevel, boolean mature) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.clan = clan;
        this.skillLevel = skillLevel;
        this.mature = mature;

    }

    public String getName() {

        return name;

    }

}
