package org.fasttrackit;

public class Game {

    //String adopter;
    //String dog;
    //String veterinarian;

    private AnimalFood [] food = new AnimalFood[10];
    private RecreationalActivity [] activities = new RecreationalActivity[5];

    public void start () {
        System.out.println("Starting game");

        initializeFood ();
        displayFood();

        initializeActivity();
        displayActivities();
    }

    private void initializeFood(){
        AnimalFood food1 = new AnimalFood();
        food1.setName("Purina");

        food [0] = food1;

        AnimalFood food2 = new AnimalFood();
        food2.setName("Pedigree");

        food [1] = food2;
    }

    private void initializeActivity(){
        RecreationalActivity activity1 = new RecreationalActivity();
        activity1.setName("Playing Catch");

        activities [0] = activity1;

        RecreationalActivity activity2 = new RecreationalActivity();
        activity2.setName("Walking");

        activities [1] = activity2;
    }

    private void displayFood(){
        System.out.println("Available Foods");

        for (int i = 0; i < food.length; i++){
            if (food [i] != null){
                System.out.println((i + 1) + ". " + food[i].getName());
            }
        }
    }

    private void displayActivities(){
        System.out.println("Available activities");

        for (int i = 0; i < activities.length; i++){
            if (activities [i] != null){
                System.out.println((i + 1) + ". " + activities[i].getName());
            }
        }
    }

}
