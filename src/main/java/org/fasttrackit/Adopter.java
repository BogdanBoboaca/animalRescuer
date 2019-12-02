package org.fasttrackit;

public class Adopter{

    String name;
    String sex;
    int age;
    String typeOfAccommodation; // House or Apartment
    String favouriteAnimal;
    double availableMoney;

    public Adopter(String name) {
        this.name = name;
    }

    public void feedAnimal (Animal animal, AnimalFood animalFood){

        System.out.println(name + " just gave some " + animalFood.getName() + " food to " + animal.getName() );

        animal.setHungerLevel(animal.getHungerLevel() -1);

        System.out.println(animal.getHungerLevel());

    }

    public void activity (Animal animal, RecreationalActivity recreationalActivity){
        System.out.println(name + " is " + recreationalActivity.getName() + " with " + animal.getName());

        animal.setSpiritLevel(animal.getSpiritLevel() -1);

        System.out.println(animal.getSpiritLevel());
    }


}
