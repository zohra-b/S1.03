package n3.views;

import n3.models.Person;

import java.util.Scanner;

public class View {
    private static final Scanner SC = new Scanner(System.in);
    private static int option;

   public static void printMenu(){
      System.out.println("""
            1.- Introduir persona.
            2.- Mostrar les persones ordenades per nom (A-Z).
            3.- Mostrar les persones ordenades per nom (Z-A).
            4.- Mostrar les persones ordenades per cognoms (A-Z).
            5.- Mostrar les persones ordenades per cognoms (Z-A).
            6.- Mostrar les persones ordenades per DNI (1-9).
            7.- Mostrar les persones ordenades per DNI (9-1).
            0.- Sortir.""");
   }

   public static int getOption(){
       option = SC.nextInt();
       SC.nextLine();
       return option;
   }

   public static Person getPersonInput(){
        System.out.println("Introdueix el nom");
        String name = SC.nextLine();
        System.out.println("Introdueix els cognoms");
        String surname = SC.nextLine();
        System.out.println("Introdueix el dni");
        String id = SC.nextLine();
        return new Person(name, surname, id);
   }



}
