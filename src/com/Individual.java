package com;

public class Individual {
    private int id;
    private SexEnum gender;
    private int age;
    private String intro;
    private String [] habits;
    private Coord coord;
    private StrategyType strategyType;



    public Individual(int id, SexEnum gender, int age, String intro, String[] habits, Coord coord, StrategyType strategyType) {
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.intro = intro;
        this.habits = habits;
        this.coord = coord;
        this.strategyType=strategyType;
    }



    public void match(Individual individual2,Individual individual3){
        strategyType.strategy(this,individual2,individual3);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SexEnum getGender() {
        return gender;
    }

    public void setGender(SexEnum gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }
}
