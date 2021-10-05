package PicturesInConsole;

public class DrawSquare {

    // Write a program that draws a square like this:
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as lineCount is
    public static void main(String[] args) {
        int lineCount = 6;
        String block = "%";
        String space = " ";
        int T = lineCount; // Rewriting to shorter to code faster
        System.out.print(block.repeat(T) + "\n"); // Head
        for (int i = 0; i < T-2; i++) {
            System.out.print(block + space.repeat(T-2) + block + "\n");//Body
        }
        System.out.print(block.repeat(T) + "\n");//Footer
    }
}
