//package az.itbrains.codewars;
//
///*
//Write a function that takes an array of words and smashes them
//together into a sentence and returns the sentence. You can ignore
//any need to sanitize words or add punctuation, but you should
//add spaces between each word. Be careful, there shouldn't be a
//space at the beginning or the end of the sentence!
// */
//public class SentenceSmash {
//    public static String smash(String... words) {
//        StringBuilder builder = new StringBuilder();
//        if (words.length > 1) {
//            for (String word : words) {
//                if()
//                builder.append(word).append(" ");
//            }
//        } else {
//            for (String word : words) {
//                builder.append(word.trim());
//            }
//        }
//        return builder.toString();
//    }
//
//    public static void main(String[] args) {
//        System.out.println(smash(new String[]{"hello", "world"}));
//        System.out.println(smash(new String[]{"hello"}));
//    }
//}
