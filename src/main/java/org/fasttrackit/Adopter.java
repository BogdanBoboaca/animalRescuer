package org.fasttrackit;

import java.sql.SQLOutput;

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

        if (animalFood.getName() == animal.getFavoriteFood()){

            System.out.println("This is " + animal.getName() + " favourite food.");

            animal.setSpiritLevel(animal.getSpiritLevel() - 1);

            System.out.println(animal.getName() + " is really happy with his favourite food, so his spirit level now is: " + animal.getSpiritLevel());

        } else {
            System.out.println(animal.getName() + " didn't get his favourite food ");
        }

    }

    public void activity (Animal animal, RecreationalActivity recreationalActivity){
        System.out.println(name + " is " + recreationalActivity.getName() + " with " + animal.getName());

        if (recreationalActivity.getName() == animal.getFavoriteRecreationActivity()){
            System.out.println("This is " + animal.getName() + " favourite activity.");

            animal.setSpiritLevel(animal.getSpiritLevel() - 2);

            System.out.println(animal.getName() + " is really happy with his activity, so his spirit level now is: " + animal.getSpiritLevel());


        }else{
            System.out.println(animal.getName() + " has not played his favorite activity " );

            animal.setSpiritLevel(animal.getSpiritLevel() -1);
        }


        System.out.println("After this activity " + animal.getName() + "got really exited and his spirit level now is : " + animal.getSpiritLevel());
    }



}
