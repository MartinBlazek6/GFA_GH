package Arithmetic_Assignment_Operators;

public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;
        int temp;
        System.out.println("Before");
        System.out.println(a);
        System.out.println(b);

        temp = a;
        a=b;
        b=temp;
        System.out.println("After");
        System.out.println(a);
        System.out.println(b);
    }
}
