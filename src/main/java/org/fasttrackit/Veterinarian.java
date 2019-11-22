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
}
