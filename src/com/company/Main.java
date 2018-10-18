package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<PersonalHab>myPreson = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String addperson = "";

        do {

            System.out.println("Enter name ");
            String name = input.nextLine();
            System.out.println("Does this person like French fries (true or false");
            boolean frenchfries = input.nextBoolean();
            System.out.println("Does this person like to sleep (true or false");
            boolean sleep = input.nextBoolean();
            System.out.println("Is this person adventurous");
            boolean adventure = input.nextBoolean();
//         public PersonalHab(String name, boolean frenchfrices, boolean sleep, boolean adventurous)
            myPreson.add(new PersonalHab(name, frenchfries, sleep, adventure));
            System.out.println("Do you want to add another person: yes or no");
            addperson = input.next();
            input.nextLine();
        }while (!addperson.equalsIgnoreCase("no"));

   for (PersonalHab name: myPreson){
       System.out.println("name " + name.getName());
       System.out.println("Likes French fries " + name.isFrenchfrices());
       System.out.println("like sleeping " + name.isSleep());
       System.out.println("is adventurous" + name.isAdventurous());
   }
        System.out.println("all the people who like French fries: ");
   for (PersonalHab name : myPreson){
       if (name.isFrenchfrices() == true){
           System.out.println(name.getName());
       }
   }
    }

}
