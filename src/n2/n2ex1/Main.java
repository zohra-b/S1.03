package n2.n2ex1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args){
    Restaurant rest1 = new Restaurant("Cool Burger", 4);
    Restaurant rest2 = new Restaurant("Cool Burger", 2);
    Restaurant rest3 = new Restaurant("Cool Burger", 4);

    HashSet<Restaurant> restaurants = new HashSet<>();

    restaurants.add(rest1);
    restaurants.add(rest2);
    restaurants.add(rest3);

    for (Restaurant r : restaurants){
        System.out.println(r.toString());
    }
    }
}
