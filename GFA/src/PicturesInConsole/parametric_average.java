package PicturesInConsole;

import java.util.Scanner;

public class parametric_average {
    public static void main(String[] args){
        Scanner my_scan = new Scanner(System.in);
        int count=1;
        int data;
        int datas=0;
        int DataRate = 5;
        for (int i = 0; i <DataRate ; i++) {
            System.out.println("Hi type "+count+". number");
            count++;
            data =  my_scan.nextInt();
            datas =datas+data;
        }
        count--;
        int average = datas/count;
        System.out.println("Sum: " + datas + ", Average: " + average);
    }
}
