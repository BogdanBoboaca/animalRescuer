package org.fasttrackit;

import java.util.Date;

public class Veterinarian {

    String name;
    String specialization;
    int experience;
    String field; // If he travels to owners home or just at his office
    Date timetable;
    double price;

    public Veterinarian(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Date getTimetable() {
        return timetable;
    }

    public void setTimetable(Date timetable) {
        this.timetable = timetable;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", experience=" + experience +
                ", field='" + field + '\'' +
                ", timetable=" + timetable +
                ", price=" + price +
                '}';
    }
}
