package Arithmetic_Assignment_Operators;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above

        int day = 86400; //secounds 24*60*60
        int intHR = currentHours*60*60;
        int intMI = currentMinutes*60;
        int together = intHR+intMI+currentSeconds;
        int secLeft = day - together;
        System.out.println("Thera are " + secLeft + " sec. left unit the midnight");
    }
}
