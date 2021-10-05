package PicturesInConsole;
import java.util.Scanner;

public class GeussTheNumber {
    public static void main(String[] args){
        int min = 1;
        int max = 10;
        boolean win = false;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("This is radom Number " + random_int); //printing this to prove it works.
        for (int i = 0; i < 5; i++) {
            System.out.print("\n");//This should "Hide" number
        }
        while (win==false) {
            System.out.print("Geuss the number from 1-10 : \n");
            Scanner my_scan = new Scanner(System.in);
            int option = my_scan.nextInt();
            if (option > max || option < min) {
                System.out.print("Number is between 1 and 10 :)\n");
            } else if (option == random_int) {
                System.out.print("You found the number: " + option);
                win = true;
            } else if (option > random_int) {
                System.out.print("The stored number is lower\n");
            } else if (option < random_int) {
                System.out.print("The stored number is higher\n");
            }
        }
    }
}
