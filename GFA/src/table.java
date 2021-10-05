public class table {
    // Create a program
// that prints the multiplication table with number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150
    public static void main(String[] args) {

    int main = 15;
    int current = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(current + " * " +  main + " = " + current*main + "\n");
            current++;
        }
        System.out.print("Pyramide section\n");
        var block = "*";
        var space = " ";
        int r = 1;
        int r2 = 4; //this can set size of pyramide
        int floor = r2+1;
        for (int i = 0; i < floor; i++) {
            System.out.print(space.repeat(r2) + block.repeat(r) + "\n");
            r=r+2;
            r2--;
        }
    }
}
