package User_input_scaner;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even
        Scanner my_scan = new Scanner(System.in);
        int age =  my_scan.nextInt();
        try {
            System.out.println(age);
        }
        catch (Exception e){
            System.out.println("Something went wrong.");
        }
    }

}
