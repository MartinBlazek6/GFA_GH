package PicturesInConsole;

public class Diamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

        //creating pyramid
        var block = "*";
        var space = " ";
        int repeater = 1;
        int lineCount = 4;
        int floor = lineCount + 1;
        for (int i = 0; i < floor; i ++) {
            System.out.print(space.repeat(lineCount) + block.repeat(repeater) + "\n");
            repeater=repeater + 2;
            lineCount --;
        }
        //Mirroring the pyramid
        lineCount = 1;
        repeater=repeater - 4;
        for (int i = 1; i < floor; floor --) {
            System.out.print(space.repeat(lineCount) + block.repeat(repeater) + "\n");
            repeater=repeater - 2;
            lineCount ++;

        }

    }
}
