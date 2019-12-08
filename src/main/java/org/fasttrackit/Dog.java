package org.fasttrackit;


public class Dog extends Pets {

    String typeOfDog;


    public Dog(Breed breed) {
        super(breed);
    }

    // Constructor overloading
    public Dog (){
        this (new Breed());
    }
}
