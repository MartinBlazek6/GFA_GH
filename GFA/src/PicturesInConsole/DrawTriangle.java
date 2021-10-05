package PicturesInConsole;

public class DrawTriangle {
    public static void main(String[] args){
// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
        var block = "*";
        int r = 1;
        int lineCount = 3;
        int floor = lineCount+1;
        for (int i = 0; i < floor; i ++) {
            System.out.print(block.repeat(r) + "\n");
            r ++;
            lineCount --;
        }
    }
}
