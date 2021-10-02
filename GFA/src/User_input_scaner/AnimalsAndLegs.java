package User_input_scaner;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args)
    {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        System.out.print("Hi farmer let me know your name: ");
        Scanner my_scan = new Scanner(System.in);
        String my_str = my_scan.nextLine();
        System.out.println("Hi "+my_str+" How many pigs do you have?");
        int pigs = my_scan.nextInt();
        System.out.println("Ok "+my_str+" And how many chickens do you have?");
        int chick = my_scan.nextInt();
        int legs = (pigs*4)+(chick*2);
        System.out.println("So "+my_str+" I think you have "+legs+" animal legs on your farm");
        System.out.println(legs+2+"If i count yours too :)");
    }
}
