import java.util.Scanner;
public class october {
    public static void main(String[] args)
    {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        System.out.print("Hi farmer let me know your name: ");
        Scanner my_scan = new Scanner(System.in);
        String my_str = my_scan.nextLine();
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
