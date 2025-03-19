package n1.n1ex3;

import java.util.Scanner;

import static n1.n1ex3.classes.Game.*;

public class Main {
    public static void main(String[] args) {
        String player;
        int points;
        Scanner input = new Scanner(System.in);
        System.out.println(("Introduce tu nombre"));
        player = input.nextLine();

reader();
points = play();
writer(player, points);
    }
    }
