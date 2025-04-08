package n1.n1ex1.Controllers;

import n1.n1ex1.Models.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Controller {
    private static ArrayList<Month> months = new ArrayList<>();

    public static void run() {
        initializeMonths();
        printMonths();
        insertAugust();
        HashSet<Month> hashThroughConstructor = convertToHashSet();
        addJanuary(hashThroughConstructor);
        iterateHashSet(hashThroughConstructor);

    }

    public static List<Month> initializeMonths() {
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

        return months;
    }

    public static void printMonths() {
        for (Month m : months) {
            System.out.println(m);
        }
    }

    public static void insertAugust() {
        months.add(7, new Month("August"));
    }


    public static HashSet<Month> convertToHashSet() {
        System.out.println("\nHASH SET CREATED USING CONSTRUCTOR : ");
        HashSet<Month> HashThroughConstructor = new HashSet<>(months);
        for (Month m : HashThroughConstructor) {
            System.out.println(m);
        }
        return HashThroughConstructor;
    }

    public static void addJanuary(HashSet<Month> HashThroughConstructor) {
        System.out.println("\nHash set adding january : ");
        HashThroughConstructor.add(new Month("January"));
        for (Month m : HashThroughConstructor) {
            System.out.println(m);
        }
    }

    public static void iterateHashSet(HashSet<Month> HashThroughConstructor) {
        System.out.println("\nUSING ITERATOR : ");
        Iterator<Month> iterator = HashThroughConstructor.iterator();
        while (iterator.hasNext()) {
            Month month = iterator.next();
            System.out.println(month);
        }
    }

}


