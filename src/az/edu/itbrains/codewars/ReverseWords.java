//package az.edu.itbrains.codewars;
//
///*
//Complete the function that accepts a string parameter,
//and reverses each word in the string. All spaces in the string
//should be retained.
//
//Examples
//"This is an example!" ==> "sihT si na !elpmaxe"
//"double  spaces"      ==> "elbuod  secaps"
// */
//public class ReverseWords {
//
//    public static String reverseWords(final String original) {
//        String[] strings = original.split(" ");
//        String[] newString = new String[strings.length];
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < strings.length; i++) {
//            newString[i] = strings[i].charAt(strings.length - i - 1);
//        }
//        return builder.toString();
//    }
//
//    public static void main(String[] args) {
//        System.out.println(reverseWords("This is an example!"));
//        System.out.println(reverseWords("double  spaces"));
//    }
//}
