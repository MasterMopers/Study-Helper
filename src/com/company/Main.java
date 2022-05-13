package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.random;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        //giving a small message to how the program works
        System.out.println("***\nHello, I am your very own study helper!\nTell me what terms you want to study and their definitions\nI'll randomly tell you to define certain terms to help you study!\nLet me know if you think of the correct answer or not and we'll study 'till you get all your terms correct!\n***");

        //PART 1: getting inputs on what terms the user wants to study and their definitions

        //defining term 1

        ArrayList<String> termslist = new ArrayList<>();
        ArrayList<String> actualtermslist = new ArrayList<>();

        ArrayList<String> deflist = new ArrayList();


        while (true) {
            Scanner myObj1 = new Scanner(System.in);  //Create a Scanner object
            System.out.println("Term #" + (termslist.size() + 1) + " (if done, enter 'done')"); //asking for input value of the first term
            String term = (myObj1.nextLine());  //defining the first term as a variable string
            if (term.equalsIgnoreCase("done")) {
                break;
            }

            termslist.add(term);

            //defining def 1
            Scanner myObj2 = new Scanner(System.in);  //Create a Scanner object
            System.out.println("Definition of Term #" + (deflist.size() + 1)); //asking for the input value for the defenition of the first term that the study helper will eventually repeat to you
            String def = (myObj2.nextLine());  //defining the first defenittion as a variable striong

            deflist.add(def);


        }
        actualtermslist.addAll(termslist); //adding the elements from termslist into actualtermslist
        //System.out.println("done" + termslist.size());
        //System.out.println(termslist.get(0));
        //System.out.println(deflist.get(0));



        //PART 3: Randomly printing out terms to the user
        //          and checking for comprehension
        //int randomIndex = (int)(random()*actualtermslist.size()); //i use actualtersmlist here in order to get a random number in ratio with how actualtersmlist is changing
        //System.out.println("Random Index = " + randomIndex);
        //***is this just printing a random indexing value in the list based on its size?
        //yes i think so. tested running the line a couple times
        //System.out.println(termslist.indexOf(randomIndex));
        //this line is used to give me a delay before processing the next line or just for printing?
        //Thread.sleep(7000);
        //System.out.println(termslist.get(randomIndex));
        //ok this works to print out a random element of the list
        //i need to make sure that it doesnt print out a repeat. there must be a better way than just saying that...
        //if randomIndex == (a term is has already printed), dont print, run the loop again until you dont equal.
        //I might have trouble defining the variable in parenthesis, cuz i would need data recollection. (store the items in a another fucking list and shit)

        //for the number of elements in a list, randomly print out that many terms. wait no, this has to include feedback
        //this loop will stop once it has looped the amount of the list (or prob better, until there can only be repeats)
        //inside the loop will be where it prints a random term and then asks for feedback with a delay
        //for


        //System.out.println(actualtermslist.size());


        System.out.print("Now comes the testing..!\n");
//        Thread.sleep(1000);
        for (int i = 0; i < (actualtermslist.size() + 1); i++) {
            int randomIndex = (int) (random() * actualtermslist.size()); //i use actualtersmlist here in order to get a random number in ratio with how actualtersmlist is changing
            System.out.println("What is..? " + actualtermslist.get(randomIndex)); //here I am asking the user if they know a random term / from the terms list that is updating according to the terms aleardy asked
            //System.out.println("\033[3mhello\033[1m"); //I can use this to print different settings of characters
            //I might want to convert all the letters in this string input to upper case
//            Thread.sleep(1000);
            Scanner myObj3 = new Scanner(System.in);
            System.out.println("Did you get it? (yes = 'y' / no = 'n')");
            String feedback = (myObj3.nextLine());
            //System.out.print(feedback);
            actualtermslist.remove(randomIndex); //here I am removing the asked term from the list of terms i will be randomly printing from so there are no repeats
            //randomIndex only changes after the loop is done running correct? That is why I am able to have the same value with randomIndex in here



            //FEEDBACK CHECKER
            if (feedback == "y") {
                //loop again? yes, I am just continuing on with the loop. in other words, I am restarting the loop to print the next random term. its not passing on to the else code
                //later I might want to put randomIndex term I say yes on in a new list for data collection or some other data manipulation, but for now its fine
                continue;
            } else {
                //this part is off. not sure y its printing "y[-1]" when i input a 'y'. why is it always -1?
                ArrayList<String> wrong_list = new ArrayList<>(); //creating a new list with the failed terms
                //what about creating a list that doesnt have the actual string values. but it has the index values that those string i want r in. And I can get the index value of the index list and apply it to the string list. dumb tho i think. when/where would it be smart
                //String next = termslist.get(randomIndex);
                wrong_list.add(termslist.get(randomIndex)); //adding the failed terms to the wrong_list
                //do i add the term from termslist or actualtermslist
                //System.out.println(wrong_list);


//                for (int p = 0; p < actualtermslist.size(); p++) {
//                    System.out.print(actualtermslist.get(p));
//                }

                continue;
            }


//        for (int p = 0; p < actualtermslist.size(); p++) {
//            System.out.print(actualtermslist.get(p));
            //so as of now, this is printing the term that is left to be studied in the actualtermslist
            //why is it not printing the last term if the last term is still in the list???
            //what are the possible things that this could mean?...
            //the components are: the list, the last element in the list not getting printed
            //the list is not indexing the last term properly
            //the element is not showing up
            //the term is in the list so assuming the for loop is printing everything in the list,
            //the third term should get printed (and not just end off with 2 outputs. could this have anythong to do with starting with 1/0)
            //does this not mean that the loop is incorrect (so i can go through the prorcces of the function with certain assuptins and if a part in the process doesnt work, i can identify the problem through that.

        }


        //PART 4: The Second round of testing - Repeating terms they said they didn't get (until they give the feedback that they get all of them)
        //To start I will define how many rounds to do this for. for now, I will make a set number of rounds to 3


    }
}