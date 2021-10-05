package PicturesInConsole;

public class drawPyramid {
    public static void main(String[] args) {
        int lineCount = 4;

// Write a program that draws a pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
        // write your code here for Gradescope testing
        var block = "*";
        var space = " ";
        int r = 1;
        int floor = lineCount+1;
        for (int i = 0; i < floor; i ++) {
            System.out.print(space.repeat(lineCount) + block.repeat(r) + "\n");
            r = r + 2;
            lineCount --;
        }
    }

}
