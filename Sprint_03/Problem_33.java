package Patterns_Problems_B;

public class Problem_33 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= 5; i++) {

            if (i == 1 || i == 5) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("*");
                }
            }

            else {
                System.out.print("*");
                for (int j = 1; j <= n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();


        }
    }
}