package User_input_scaner;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even
        System.out.print("Put here random real number and I will tell you if it is even or not: ");
        Scanner my_scan = new Scanner(System.in);
        int num =  my_scan.nextInt();
        int num1 = num;
        num = num%2;
        if(num==0){
            System.out.println("Your number '" + num1 + "' is even");
        }
        else {
            System.out.println("Your number '" + num1 + "' is not even");
        }

    }

}
