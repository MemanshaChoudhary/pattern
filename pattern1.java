public class pattern1 {
    static void printStar(int star) {
        if (star == 0) {
            return;
        }
        System.out.print("*");
        printStar(star - 1);

    }

    static void printLine(int row, int star) {
        if (row == 0) {
            return;
        }
        printStar(star);
        System.out.println();
        printLine(row - 1, star);
    }

    

 public static void main(String[] args) {
    printLine(5, 5);
}
}
