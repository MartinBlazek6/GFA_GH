// Write a program that prints the numbers from 1 to 100
// but for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.
package PicturesInConsole;

public class fizzBuzz {
    public static void main(String[] args){
        // write your code here for Gradescope testing
        int min = 1;
        int max = 100;
        while (min<=max){
        if (min % 3==0 && min % 5 == 0) {
            System.out.println("FizzBuzz");
            min ++;
        }
        else if (min % 3 == 0) {
            System.out.println("Fizz");
            min ++;
        }else if (min % 5 == 0) {
            System.out.println("Buzz");
            min ++;
        }else
            System.out.println(min);
            min ++;

        }
    }
}
