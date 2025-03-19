package n2.n2ex2;

import java.util.TreeSet;

public class Main {
    public static void main(String[] arg){
        Restaurant rest1 = new Restaurant("B", 4);
        Restaurant rest2 = new Restaurant("C", 6);
        Restaurant rest3 = new Restaurant("C", 4);
        Restaurant rest4 = new Restaurant("A", 5);

        TreeSet<Restaurant> restaurants = new TreeSet<>();

        restaurants.add(rest1);
        restaurants.add(rest2);
        restaurants.add(rest3);
        restaurants.add(rest4);

        for (Restaurant r : restaurants){
            System.out.println(r.toString());
        }
    }
}
