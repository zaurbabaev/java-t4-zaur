//package az.edu.itbrains.codewars;
//
///*
//Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.
//
//For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter; and month 11 (November), is part of the fourth quarter.
//
//Constraint:
//
//1 <= month <= 12
// */
//public class QuarterOfTheYear {
//
//    public static int quarterOf(int month) {
//        return switch (month) {
//            case 12, 1, 2 -> System.out.println("first quarter");
//            case 3, 4, 5 -> System.out.println("second quarter");
//            case 6, 7, 8 -> System.out.println("third quarter");
//            case 9, 10, 11 -> System.out.println("forth quarter");
//            default -> throw new IllegalStateException("Unexpected value: " + month);
//        };
//    }
//}
