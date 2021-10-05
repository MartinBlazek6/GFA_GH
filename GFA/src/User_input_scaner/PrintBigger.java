package User_input_scaner;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        System.out.print("Put here random real number and I will tell you if it is bigger or not: ");
        Scanner my_scan = new Scanner(System.in);
        int num1 =  my_scan.nextInt();
        System.out.print("Put here number you want compare with: ");
        new Scanner(System.in);
        int num2 =  my_scan.nextInt();

        if (num1>num2){
            System.out.println("Your number '" + num1 + "' is bigger then '" + num2 + "'");
        }
        else if(num1==num2){
            System.out.println("Your number are equal");
        }
        else {
            System.out.println("Your number '" + num1 + "' is smaller then '" + num2 + "'");
        }


    }
}
