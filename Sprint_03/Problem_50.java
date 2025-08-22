package Patterns_Problems_B;

public class Problem_50 {
    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 1 && j == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}
