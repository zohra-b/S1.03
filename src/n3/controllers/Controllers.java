package n3.controllers;

import n3.models.Person;

import static n3.models.PersonsList.*;
import static n3.views.View.*;

public class Controllers {

    public static void run(){
        int option;
        readingInitialPersonsList();
        do {
            printMenu();
            option = getOption();
            runOption(option);
        } while (option !=0);
    }

    public static void runOption(int option) {
        switch (option) {
            case 1:
                Person newPerson = getPersonInput();
                persons.add(newPerson);
                writingNewPerson(newPerson);
                break;
            case 2:
                setSortByName();
                System.out.println(persons);
                break;
           case 3 :
               setReversedSortByName();
               System.out.println(persons);
                break;
           case 4 :
               setSortBySurname();
               System.out.println(persons);
               break;
           case 5 : setReversedSortBySurname();
               System.out.println(persons);
               break;
           case 6 : setSortById();
               System.out.println(persons);
               break;
           case 7 : setReversedSortById();
               System.out.println(persons);
               break;
           case 0 :
               System.out.println("Bye !");
               break;


        }
    }
}
