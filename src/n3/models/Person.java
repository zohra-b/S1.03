package n3.models;

import java.util.Comparator;

public class Person {
    String name;
    String surname;
    String id;

    public Person(String name, String surname, String id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurame(String surname) {
        this.surname = surname;
    }
    public void setId(String id) {
        this.id = id;
    }

    public static Comparator<Person> SORT_BY_NAME = new Comparator<Person>(){
        public int compare(Person one, Person other){
            return one.name.compareTo(other.name);
        }
    };

    public static Comparator<Person> SORT_BY_SURNAME = (one, other) -> one.surname.compareTo(other.surname);

    public static Comparator<Person> SORT_BY_ID = (one, other) -> one.id.compareTo(other.id);


    public String toString(){
        return this.name + " " + this.surname + " " + id + "\n";
    }
}
