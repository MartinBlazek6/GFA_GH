package HalloWorld;

public class HalloOthers {
    public static void main(String[] args) {
        // Greet 3 of your classmates with this program in three separate lines
        // like:
        //
        // Hello, Esther!
        // Hello, Mary!
        // Hello, Joe!
        String[] Name = {"Peter", "Statee", "Fabian"};
        int x = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello, " + Name[x] + " !" );
            x++;
        }

    }
}
