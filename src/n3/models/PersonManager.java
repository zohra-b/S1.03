package n3.models;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;


public class PersonManager {
    public static ArrayList<Person> persons = new ArrayList<Person>();
    private PersonManager(){}

    public static void getPersonsList() {
        Path filePath = Paths.get("src","n3", "assets", "persons.csv");
        try (BufferedReader bReader = new BufferedReader(new FileReader(filePath.toFile()))) {
            String actualLine;

            bReader.readLine();

            while ((actualLine = bReader.readLine()) != null) {
                String[] splittedLine = actualLine.split(",");
                String name = splittedLine[0];
                String surname = splittedLine[1];
                String id = splittedLine[2];

                persons.add(new Person(name, surname, id));
            }
        } catch (IOException e) {
            System.out.println("Error al llegir el archiu" + e.getMessage());
        }
    }

    public static void writingNewPerson(Person person) {
        String name = person.getName();
        String surname = person.getSurname();
        String id = person.getId();
        Path filePath = Paths.get("src","n3", "assets", "persons.csv");
        try (FileWriter writer = new FileWriter(filePath.toFile(), true)) {
            writer.write(name + "," + surname + "," + id + "\n");
        } catch (IOException e) {
            System.out.println("Error al modificar el archiu" + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("El format de dades no es vàlid" + e.getMessage());
        }

    }


    public static void setSortByName() {
        persons.sort(Person.SORT_BY_NAME);
    }

    public static void setReversedSortByName() {
        persons.sort(Collections.reverseOrder(Person.SORT_BY_NAME));
    }

    public static void setSortBySurname() {
        persons.sort(Person.SORT_BY_SURNAME);
    }

    public static void setReversedSortBySurname() {
        persons.sort(Collections.reverseOrder(Person.SORT_BY_SURNAME));
    }

    public static void setSortById() {
        persons.sort(Person.SORT_BY_ID);
    }

    public static void setReversedSortById() {
        persons.sort(Collections.reverseOrder(Person.SORT_BY_ID));
    }
}
