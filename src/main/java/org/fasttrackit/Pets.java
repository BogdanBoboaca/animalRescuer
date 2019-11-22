package org.fasttrackit;

public class Pets extends Animal {

        Breed breed;

    public Pets(Breed breed) {
        this.breed = breed;
        System.out.println(" Creating a breed of animal ");
    }
}
