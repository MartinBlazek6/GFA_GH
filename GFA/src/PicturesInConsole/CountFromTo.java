package PicturesInConsole;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

        System.out.print("Put here random real number plz: ");
        Scanner my_scan = new Scanner(System.in);
        int num1 = my_scan.nextInt();
        System.out.print("Put here 2nd. number: ");
        new Scanner(System.in);
        int num2 =  my_scan.nextInt();
        if (num1 > num2){
            System.out.println("The second number should be bigger");
        } else if (num1 < num2){
            while (num1 <= num2) {
                System.out.println(num1);
                num1 ++;
            }
        }

    }
}
