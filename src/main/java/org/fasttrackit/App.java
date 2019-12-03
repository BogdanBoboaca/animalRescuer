package org.fasttrackit;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App 
{
    public static void main( String[] args ) throws ParseException {
        System.out.println( "Welcome to Animal Rescuer World!" );

        Breed firstBreed = new Breed();
        firstBreed.typeOfBreed = "Siberian Husky";

        Dog firstAnimal = new Dog(firstBreed);
        firstAnimal.setName("Chaika");
        firstAnimal.setAge(2);
        firstAnimal.setHealthLevel(10);
        firstAnimal.setHungerLevel(10);
        firstAnimal.setSpiritLevel(10);
        firstAnimal.setFavoriteFood("Purina");
        firstAnimal.setFavoriteRecreationActivity("Playing Catch");

        Adopter firstAdopter = new Adopter("John");
        firstAdopter.availableMoney = 150.9;

        AnimalFood firstFood = new AnimalFood("Purina");
        firstFood.price = 2.99;
        firstFood.amount = 350;

        Adopter feeding = new Adopter("John");
        feeding.feedAnimal(firstAnimal,firstFood);

        RecreationalActivity firstActivity = new RecreationalActivity("Playing Catch");

        Adopter playing = new Adopter("John");
        playing.activity(firstAnimal,firstActivity);

        Veterinarian firstVeterinarian = new Veterinarian("Paul", "Canine");


        firstFood.expirationDate = new SimpleDateFormat( "dd/MM/yyyy HH:mm:ss").parse("27/07/2020 11:57:33");
        firstFood.remainingStock = 30;



        System.out.println("Dogs Name is: " + firstAnimal.getName());
        System.out.println("Dogs Age is: " + firstAnimal.getAge());
        System.out.println("Dogs Health is: " + firstAnimal.getHealthLevel());
        System.out.println("Dogs Hunger is: " + firstAnimal.getHungerLevel());
        System.out.println("Dogs Spirit is: " + firstAnimal.getSpiritLevel());
        System.out.println("Dogs Favorite Food is: " + firstAnimal.getFavoriteFood());
        System.out.println("Dogs Favourite Recreation Activity is: " + firstAnimal.getFavoriteRecreationActivity());


        System.out.println(firstAnimal.getName() + " Adopter is " + firstAdopter.name + " which has a budget of "
                + firstAdopter.availableMoney);
        System.out.println(firstAnimal.getName() + " Favourite Food is " + firstFood.name + " With a price of "
                + firstFood.price + "$" + " per " + firstFood.amount+ "g" + " Expiration Date "
                + firstFood.expirationDate + " Stock Available " + firstFood.remainingStock +"packages ");
        System.out.println(firstAnimal.getName() + " Favourite Activity is " + firstActivity.name);
        System.out.println(firstAnimal.getName() + " Veterinarian is " + firstVeterinarian.name
                + " with a specialization in " + firstVeterinarian.specialization);

    }
}
