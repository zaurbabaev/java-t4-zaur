package az.edu.itbrains.lesson8.hungman;

import java.util.Random;
import java.util.Scanner;

public class HungMan {

    public static void main(String[] args) {
        String[] words = {"Arsenal", "Garabagh", "Zire", "Kepez", "RealMadrid", "RealMardin", "HullCity",
                "Fenerbahce", "Neftchi", "InternBaku", "EskiSehirSpor"};

        Random random = new Random();
        String findWord = words[random.nextInt(0, words.length)].toLowerCase();
        String[] result = new String[findWord.length()];

        System.out.println(findWord.split("")[0]);
        String[] strArray = findWord.split("");


        int space = findSpace(findWord);
        int health = 6;
        int trueAnswer = result.length + 1 - space;

        while (health != 0) {

            draw(result);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Herf daxil edin");
            String symbol = scanner.next();

            if (findWord.contains(symbol.toLowerCase())) {
                for (String string : strArray) {
                    if (string.equals(symbol.toLowerCase())) {
                        result = addToData(result, symbol.toLowerCase(), findWord);
                        trueAnswer--;

                    }
                }
            } else {
                health--;
            }
            if (trueAnswer == 1) {
                draw(result);
                break;
            }
        }
    }


    private static int findSpace(String text) {
        int count = 0;
        String[] strings = text.split("");
        for (String string : strings) {
            if (string.equals(" ")) {
                count++;
            }
        }
        return count;

    }

    public static void draw(String[] data) {
        for (String datum : data) {
            if (datum == null) {
                System.out.print("_ ");
            } else {
                System.out.print(datum);
            }
        }
        System.out.println();
    }

    public static String[] addToData(String[] data, String word, String findWord) {
        String[] result = data;
        String[] myArray = findWord.split("");
        for (int i = 0; i < findWord.length(); i++) {
            if (myArray[i].equals(word)) {
                result[i] = word;
            }
        }

        return result;
    }
}
