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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTypeOfAccommodation() {
        return typeOfAccommodation;
    }

    public void setTypeOfAccommodation(String typeOfAccommodation) {
        this.typeOfAccommodation = typeOfAccommodation;
    }

    public String getFavouriteAnimal() {
        return favouriteAnimal;
    }

    public void setFavouriteAnimal(String favouriteAnimal) {
        this.favouriteAnimal = favouriteAnimal;
    }

    public double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    @Override
    public String toString() {
        return "Adopter{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", typeOfAccommodation='" + typeOfAccommodation + '\'' +
                ", favouriteAnimal='" + favouriteAnimal + '\'' +
                ", availableMoney=" + availableMoney +
                '}';
    }
}
