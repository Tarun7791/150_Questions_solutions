package Patterns_Problems_B;

public class Problem_47 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {

                for (int j = 1; j <= 3; j++) {
                    System.out.print(j);
                }
                for (int j = 2; j >= 1; j--) {
                    System.out.print(j);
                }
            } else {

                for (int j = 0; j <= 2; j++) {
                    System.out.print(j);
                }
                for (int j = 1; j >= 0; j--) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }
}
