package Arithmetic_Assignment_Operators;

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10
        while (a<=10){
            a++;
        }

        System.out.println(a);

        int b = 100;
        // make b smaller by 7
        b=b%7;

        System.out.println(b);

        int c = 44;
        // please double c's value
        c= c*2;
        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d = d/5;

        System.out.println(d);

        int e = 8;
        // please cube of e's value
        e = (int) Math.pow(e,3);
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        boolean compare = f1>f2;
        System.out.println(compare);
        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        boolean compare2 = g1>g2;
        System.out.println(compare2);

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        System.out.println(h % 11 == 0);

        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        int i2cu = (int) Math.pow(i2,2);
        int i2sq = (int) Math.pow(i2,3);
        boolean comparecu = i1 > i2cu;
        boolean comparesq = i1 > i2sq;
        System.out.println("Cubed bigger: "+comparecu +" Squared bigger: " + comparesq);


        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        boolean bool = (j % 3 == 0 || j % 5 == 0);
        if (bool=true){
            System.out.println("j is dividable by both or one of the numbers! ");
        } else System.out.println("j is not dividable by both or one of the numbers! ");
    }
}
