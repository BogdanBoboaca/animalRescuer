package org.fasttrackit;

import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException {
        System.out.println( "Welcome to Animal Rescuer World!" );

        Animal firstAnimal = new Animal();
        firstAnimal.name = "Rex";
        firstAnimal.age = 2;
        firstAnimal.healthLevel = 10;
        firstAnimal.hungerLevel = 10;
        firstAnimal.spiritLevel = 10;
        firstAnimal.favoriteFood = "Pedigree";
        firstAnimal.favoriteRecreationActivity = "Playing Catch";

        Adopter firstAdopter = new Adopter();
        firstAdopter.name = "Robin";
        firstAdopter.availableMoney = 150.9;

        AnimalFood firstFood = new AnimalFood();
        firstFood.name = "Pedigree";
        firstFood.price = 2.99;
        firstFood.amount = 350;

        firstFood.expirationDate = new SimpleDateFormat( "dd/MM/yyyy HH:mm:ss").parse("27/07/2020 11:57:33");
        firstFood.remainingStock = 30;

        RecreationalActivity firstActivity = new RecreationalActivity();
        firstActivity.name = "Playing Catch";

        Veterinarian firstVeterinarian = new Veterinarian();
        firstVeterinarian.name = "Paul";
        firstVeterinarian.specialization = "Canine";

        System.out.println("Dogs Name is: " + firstAnimal.name);
        System.out.println("Dogs Age is: " + firstAnimal.age);
        System.out.println("Dogs Health is: " + firstAnimal.healthLevel);
        System.out.println("Dogs Hunger is: " + firstAnimal.hungerLevel);
        System.out.println("Dogs Spirit is: " + firstAnimal.spiritLevel);
        System.out.println("Dogs Favorite Food is: " + firstAnimal.favoriteFood);
        System.out.println("Dogs Favourite Recreation Activity is: " + firstAnimal.favoriteRecreationActivity);


        System.out.println(firstAnimal.name + " Adopter is " + firstAdopter.name + " which has a budget of "
                + firstAdopter.availableMoney);
        System.out.println(firstAnimal.name + " Favourite Food is " + firstFood.name + " With a price of "
                + firstFood.price + "$" + " per " + firstFood.amount+ "g" + " Expiration Date "
                + firstFood.expirationDate + " Stock Available " + firstFood.remainingStock +"packages ");
        System.out.println(firstAnimal.name + " Favourite Activity is " + firstActivity.name);
        System.out.println(firstAnimal.name + " Veterinarian is " + firstVeterinarian.name + " with a specialization in " + firstVeterinarian.specialization);

    }
}
