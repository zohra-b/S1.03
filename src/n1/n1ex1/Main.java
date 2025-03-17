package n1.n1ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<>();
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        months.add(7, new Month("August"));

        for (Month m : months) {
            System.out.println(m);
        }

        System.out.println("\nHASH SET CREATED USING CONSTRUCTOR : ");
        HashSet<Month> HashThroughConstructor = new HashSet<>(months);
        for (Month m : HashThroughConstructor) {
            System.out.println(m);
        }

        System.out.println("\nHash set adding january : ");
        HashThroughConstructor.add(new Month("January"));
        for (Month m : HashThroughConstructor) {
            System.out.println(m);
        }

        System.out.println("\nUSING ITERATOR : ");
        Iterator<Month> iterator = HashThroughConstructor.iterator();
        while (iterator.hasNext()){
            Month month = iterator.next();
            System.out.println(month);
        }




    }
}
