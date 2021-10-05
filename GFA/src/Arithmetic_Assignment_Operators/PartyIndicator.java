package Arithmetic_Assignment_Operators;

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second represents the number of boys
        System.out.print("How many girls are comming to the party?: ");
        Scanner my_scan = new Scanner(System.in);
        int girl =  my_scan.nextInt();
        System.out.print("Ok, and what about boys: ");
        new Scanner(System.in);
        int boy =  my_scan.nextInt();
        //
        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        // it should print: The party is excellent!
        if (girl==boy){
            System.out.println("The party is excellent!");
        }
        //
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        // it should print: Quite a cool party!
        int ppl = girl+boy;
        if (ppl>=20 && (boy!=girl)){
            System.out.println("Quite a cool party!");
        }
        //
        // If there are less people coming than 20
        // it should print: Average party...
        if (ppl<20){
            System.out.println("Average party...");
        }
        //
        // If no girls are coming, regardless the count of the people
        // it should print: Sausage party
        if (girl==0){ //But if there are no boys there is no party
            System.out.println("Sausage party...");
        }
    }
}
