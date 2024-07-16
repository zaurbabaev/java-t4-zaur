//package az.edu.itbrains.codewars;
//
///*
//The objective of Duck, duck, goose is to walk in a circle, tapping on each player's
//head until one is chosen.
//
//Task: Given an array of Player objects (an array of associative arrays in PHP)
//and an index (1-based), return the name of the chosen Player(name is a property
//of Player objects, e.g Player.name)
// */
//public class DuckDuckGoose {
//
//    public static String duckDuckGoose(Player[] players, int goose) {
//        // Note: Player objects have a String field called 'name'.
//        String result = "";
//        for (int i = 0; i < players.length; i++) {
//            if (i == goose) {
//                result = players[i].name;
//            }
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        String string = duckDuckGoose(new Player[]{"a", "b", "c", "d", "c", "e", "f", "g", "h", "z"}, 7);
//    }
//}
//
//class Player {
//    public String name;
//}
