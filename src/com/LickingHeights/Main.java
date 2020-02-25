package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //phase 1: DECLARING THE VARIABLES.
        String descriptiveWord;
        String famousPerson;
        String anyPlace;
        String anySeason;
        String prevSeason;
        String anotherFamousPerson;
        String actionWordInPastTense;
        String projectileNoun;
        String majorEvent;
        String mythicalCreature;
        String firstReoccurrenceOfFamPersOne;
        String prevDiscrWord;
        String firstReoccurrenceOfFamPersTwo;
        String fooditem;
        String activity;
        String material;
        String prevActivity;
        String anotherFoodItem;
        String anotherFavoriteActivityPastTense;
        String negativeWordToDescrActivity;


        //phase 2: FILLING THE VARIABLES WITH USER INPUT.
      Scanner userInput = new Scanner (System.in);

        System.out.println("Name a descriptive word.");
        descriptiveWord = userInput.nextLine();
        System.out.println("Name a famous person.");
        famousPerson = userInput.nextLine();
        System.out.println("Name any place in the world.");
        anyPlace = userInput.nextLine();
        System.out.println("What season were you born in?");
        anySeason = userInput.nextLine();
        System.out.println("Can you say that again please?");
        prevSeason = userInput.nextLine();
        System.out.println("Name another famous person, different than the last.");
        anotherFamousPerson = userInput.nextLine();
        System.out.println("Name an action word.(In past tense please)");
        actionWordInPastTense = userInput.nextLine();
        System.out.println("Name something you would throw.");
        projectileNoun = userInput.nextLine();
        System.out.println("Name any major event.(Like a type of celebration)");
        majorEvent = userInput.nextLine();
        System.out.println("What is your favorite mythical creature?");
        mythicalCreature = userInput.nextLine();
        System.out.println("Sorry, can you remind me who your 1st famous person was?");
        firstReoccurrenceOfFamPersOne = userInput.nextLine();
        System.out.println("Hold on, can you repeat what your descriptive word was? Sorry...");
        prevDiscrWord = userInput.nextLine();
        System.out.println("Man, I forget stuff easily. What was your 2nd famous person?");
        firstReoccurrenceOfFamPersTwo = userInput.nextLine();
        System.out.println("What is a food item that you eat a lot?");
        fooditem = userInput.nextLine();
        System.out.println("Name an activity of yours; something you like to do.");
        activity = userInput.nextLine();
        System.out.println("Name a type of material.(Ex.)Cloth, metal, etc.");
        material = userInput.nextLine();
        System.out.println("Okay, this is the last time, I promise. What was your favorite activity?");
        prevActivity = userInput.nextLine();
        System.out.println("Name another food item; different than the last.");
        anotherFoodItem = userInput.nextLine();
        System.out.println("Name another favorite activity of yours; different than the last.");
        anotherFavoriteActivityPastTense = userInput.nextLine();
        System.out.println("What is a negative word to describe your activity?");
        negativeWordToDescrActivity = userInput.nextLine();


        //phase 3: INSERTING THE VARIABLES INTO THE STORY.

        System.out.println(" "+anyPlace+" is "+descriptiveWord+" during the "+anySeason+".");
        System.out.println(" In fact it's so "+prevDiscrWord+", that even "+famousPerson+" spends their "
                           +prevSeason+" there.");
        System.out.println(" One day, "+anotherFamousPerson+" saw "+firstReoccurrenceOfFamPersOne+" and "
                           +actionWordInPastTense+" to them.");
        System.out.println(" Then, "+famousPerson+" threw a(n) "+projectileNoun+" at "+firstReoccurrenceOfFamPersTwo+
                           "!");
        System.out.println(" The "+majorEvent+" occurred and then a "+mythicalCreature+" jumped on all of the "+fooditem+
                           ".");
        System.out.println(" The "+material+" tablecloth was ruined!");
        System.out.println(" Now the only thing they could do was play "+activity+".");
        System.out.println(" They thought "+prevActivity+" was very "+negativeWordToDescrActivity+" ,so they instead played " +
           anotherFavoriteActivityPastTense+" and ate "+anotherFoodItem);








    }
}
