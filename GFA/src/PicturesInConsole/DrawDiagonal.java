package PicturesInConsole;

public class DrawDiagonal {
    public static void main(String[] args) {
        int lineCount = 5;
        String block = "%";
        String space = " ";
        int T = lineCount; // Rewriting to shorter to code faster
        int spaceL = 0; //Space before middle block
        int spaceR = T-3; //Space after middle block
        System.out.print(block.repeat(T) + "\n"); // Head
        for (int i = 0; i < T-2; i++) {
            System.out.print(block + space.repeat(spaceL) + block + space.repeat(spaceR) +block + "\n");//Body
            spaceL++;
            spaceR--;
        }
        System.out.print(block.repeat(T) + "\n");//Footer
    }
}
