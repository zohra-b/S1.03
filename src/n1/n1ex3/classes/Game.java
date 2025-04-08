package n1.n1ex3.classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Game {
    static HashMap<String, String> countries = new HashMap<>();

    public static void reader() {
        Path filePath = Paths.get("src", "n1", "n1ex3", "assets", "countries.txt");
        try (
                  BufferedReader bReader = new BufferedReader(new FileReader(filePath.toFile()))){
            String line;
            while ((line = bReader.readLine()) != null) {
                String[] keyValue = line.split(" ");
                if (keyValue.length == 2) {
                    countries.put(keyValue[0], keyValue[1]);
                } else {
                    System.out.println("Error en la linea " + line + " del archivo");
                }
            }
        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo  ");
        }

    }

    public static void writer(String player, int points) {
        Path filePath = Paths.get("src", "n1", "n1ex3", "assets", "classification.txt");
        try (FileWriter writer = new FileWriter(filePath.toFile(), true)) {
            writer.write(player + " : " + points + " puntos; \n");

        } catch (IOException e) {
            System.out.println("No se pudieron escribir los puntos");
        }

    }

    public static String getRandomCountry() {
        ArrayList<String> countriesList = new ArrayList<>(countries.keySet());
        Random random = new Random();

        return countriesList.get(random.nextInt(countriesList.size()));
    }

    public static int play() {
        String randomCountry;
        String answer;
        int points = 0;
        Scanner input = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            randomCountry = getRandomCountry();
            System.out.println("Cuál es la capital de " + randomCountry + "?");
            answer = input.nextLine();
            if (answer.equalsIgnoreCase(countries.get(randomCountry))) {
                points++;
                System.out.println("Bravo ! Has ganado un punto ! Tienes " + points + " puntos.");

            } else {
                System.out.println("No, la capital de " + randomCountry + " es " + countries.get(randomCountry) + ".");
            }
        }

        System.out.println("Se acabó el juego. Has conseguido " + points + " puntos.");
        return points;
    }


}
