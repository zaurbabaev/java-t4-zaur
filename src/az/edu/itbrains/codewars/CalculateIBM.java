package az.edu.itbrains.codewars;

/*
Write function bmi that calculates body mass index
(bmi = weight / height2).

if bmi <= 18.5 return "Underweight"

if bmi <= 25.0 return "Normal"

if bmi <= 30.0 return "Overweight"

if bmi > 30 return "Obese"
 */
public class CalculateIBM {

    public static String bmi(double weight, double height) {
        double result = weight / (height * height);
        if (result <= 18.5) return "Underweight";
        else if (result <= 25) {
            return "Normal";
        } else if (result <= 30) {
            return "Overweight";
        } else return "Obese";
    }

    public static void main(String[] args) {
        System.out.println(bmi(80, 1.8));
    }
}
