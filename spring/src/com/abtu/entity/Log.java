package com.abtu.entity;

public class Log {
    String id;
    String name;
    double chinese;
    double math;
    double english;
    double physics;

    @Override
    public String toString() {
        return "Log{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                ", geography=" + geography +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public void setGeography(double geography) {
        this.geography = geography;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getChinese() {
        return chinese;
    }

    public double getMath() {
        return math;
    }

    public double getEnglish() {
        return english;
    }

    public double getPhysics() {
        return physics;
    }

    public double getChemistry() {
        return chemistry;
    }

    public double getGeography() {
        return geography;
    }

    double chemistry;
    double geography;
}
