package User_input_scaner;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args)
    {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner my_scan = new Scanner(System.in);
        int count=1;
        int age;
        int ages=0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hi type "+count+". age please");
            count++;
            age =  my_scan.nextInt();
            ages =ages+age;
        }
        count--;
        int average = ages/count;
        System.out.println("Avarege age is: "+average);
    }
}
