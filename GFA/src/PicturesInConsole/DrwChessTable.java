package PicturesInConsole;
// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
public class DrwChessTable {
    public static void main(String[] args){
        String block = "% ";
        int fields = 4;
        for (int i = 0; i < fields; i++) {
            System.out.println(block.repeat(fields));
            System.out.println(" " + block.repeat(fields));
        }
    }
}
