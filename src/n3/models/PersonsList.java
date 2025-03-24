package n3.models;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class PersonsList {
    public static ArrayList<Person> persons = new ArrayList<Person>();

    public static void readingInitialPersonsList() {
        try(BufferedReader bReader = new BufferedReader(new FileReader("src/n3/assets/persons.csv"))){
            String actualLine;

            bReader.readLine();

            while((actualLine= bReader.readLine()) != null){
                String[] splittedLine = actualLine.split(",");
                String name = splittedLine[0];
                String surname = splittedLine[1];
                String id = splittedLine[2];

                persons.add(new Person(name, surname, id));
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writingNewPerson(Person person) {
        String name = person.getName();
        String surname = person.getSurname();
        String id = person.getId();
        try (FileWriter writer = new FileWriter("src/n3/assets/persons.csv", true)) {
            writer.write(name + "," + surname + ";" + id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void setSortByName(){
        Collections.sort(persons, Person.SORT_BY_NAME);
    }
    public static void setReversedSortByName(){
        Collections.sort(persons, Collections.reverseOrder(Person.SORT_BY_NAME));
    }

    public static void setSortBySurname(){
        Collections.sort(persons, Person.SORT_BY_SURNAME);
    }
    public static void setReversedSortBySurname(){
        Collections.sort(persons, Collections.reverseOrder(Person.SORT_BY_SURNAME));
    }
    public static void setSortById(){
        Collections.sort(persons, Person.SORT_BY_ID);
    }
    public static void setReversedSortById(){
        Collections.sort(persons, Collections.reverseOrder(Person.SORT_BY_ID));
    }
}
