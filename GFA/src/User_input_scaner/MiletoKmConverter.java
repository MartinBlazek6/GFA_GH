package User_input_scaner;

import java.util.Objects;
import java.util.Scanner;

public class MiletoKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
            float optionkm;
            double convertor = 0.621371192;
            double converted;
        System.out.print("Hi type what do you want to convert (km/mile): ");
        Scanner my_scan = new Scanner(System.in);

        String option = my_scan.nextLine();
        if(Objects.equals(option, "km")){
            System.out.print("Type number of km: ");
            Scanner my_scam = new Scanner(System.in);
            optionkm = my_scam.nextFloat();
            converted = optionkm * convertor;
            System.out.print(optionkm + "km is ");
            System.out.printf("%.2f",converted);
            System.out.print(" miles");
        }
        else if(Objects.equals(option, "mile")){
            System.out.print("Type number of mile: ");
            Scanner my_scam = new Scanner(System.in);
            optionkm = my_scam.nextFloat();
            converted = optionkm / convertor;
            System.out.print(optionkm + "miles is ");
            System.out.printf("%.2f",converted);
            System.out.print(" km");
        }
        else
        {System.out.println("Sorry i dont know what it is :(");}

    }
}
