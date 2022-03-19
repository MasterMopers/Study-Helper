package com.company;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //giving a small message to how the program works
        System.out.println("***\nHello, I am your very own study helper!\nTell me what terms you want to study and their definitions\nI'll randomly tell you to define certain terms to help you study!\nLet me know if you think of the correct answer or not and we'll study 'till you get all your terms correct!\n***");

        //PART 1: getting inputs on what terms the user wants to study and their definitions

        //defining term 1
        Scanner myObj1 = new Scanner(System.in);  //Create a Scanner object
        System.out.println("Term #1:"); //asking for input value of the first term
        String term_1 = (myObj1.nextLine());  //defining the first term as a variable string
        //defining def 1
        Scanner myObj2 = new Scanner(System.in);  //Create a Scanner object
        System.out.println("Definition of Term #1:"); //asking for the input value for the defenition of the first term that the study helper will eventually repeat to you
        String def_1 = (myObj2.nextLine());  //defining the first defenittion as a variable striong

        //defining term 2
        Scanner myObj3 = new Scanner(System.in);
        System.out.println("Term #2:");
        String term_2 = (myObj3.nextLine());
        //defining def 2
        Scanner myObj4 = new Scanner(System.in);
        System.out.println("Definition of Term #2:");
        String def_2 = (myObj4.nextLine());

        //defining term 3
        Scanner myObj5 = new Scanner(System.in);
        System.out.println("Term #3:");
        String term_3 = (myObj5.nextLine());
        //defining def 3
        Scanner myObj6 = new Scanner(System.in);
        System.out.println("Definition of Term #3:");
        String def_3 = (myObj6.nextLine());

        //PART 2: Organizing all variables into arrays
        String terms[] = {term_1,term_2,term_3};
        String definitions[] = {def_1, def_2, def_3};
        //System.out.println(terms[0]);
        //System.out.println(definitions[0]);



        //PART 3: Randomly printing out terms to the user
        //          and checking for comprehension
        int randomIndex = (int)(Math.random()*terms.length);
        //System.out.println("Random Index = " + randomIndex);

        String randomterm = terms[randomIndex];
        System.out.println("What is the...?\n" + randomterm);

        Scanner myObj7 = new Scanner(System.in);
        System.out.println("Got it...? (y for yes & n for no)");
        String answer = (myObj7.nextLine());

        if (answer == "n") {
            System.out.println("Study the definition\n" + def_1);
        } else {
            break;
        }




        //PART 4: Repeating terms they said they didn't get (until they give the feedback that they get all of them)






        // I obviously dont want to repeat this sequence of printing a random element and checking for it, I should use a loop



    }
}
